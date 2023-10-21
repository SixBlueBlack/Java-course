package edu.hw2;

import edu.hw2.Task3.ConnectionException;
import edu.hw2.Task3.ConnectionManager;
import edu.hw2.Task3.DefaultConnectionManager;
import edu.hw2.Task3.FaultyConnection;
import edu.hw2.Task3.FaultyConnectionManager;
import edu.hw2.Task3.PopularCommandExecutor;
import edu.hw2.Task3.StableConnection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task3Test {

    static Arguments[] connectionManagers() {
        return new Arguments[] {
            Arguments.of(new FaultyConnectionManager()),
            Arguments.of(new DefaultConnectionManager())
        };
    }

    @ParameterizedTest
    @MethodSource("connectionManagers")
    void testConnectionManagers(ConnectionManager connectionManager) {
        int maxAttempts = 1;
        var commandExecutor = new PopularCommandExecutor(connectionManager, maxAttempts);
        boolean exceptionPresence = false;
        boolean correctExecutionPresence = false;
        for (int i = 0; i < 100; i++) {
            try {
                commandExecutor.tryExecute("a");
                correctExecutionPresence = true;
            } catch (ConnectionException e) {
                exceptionPresence = true;
            }
            if (correctExecutionPresence && exceptionPresence) {
                break;
            }
        }
        assertThat(correctExecutionPresence && exceptionPresence).isTrue();
    }

    @Test
    @DisplayName("exception has cause")
    void exceptionHasCause() {
        int maxAttempts = 1;
        var connectionManager = new FaultyConnectionManager();
        var commandExecutor = new PopularCommandExecutor(connectionManager, maxAttempts);
        ConnectionException exception = null;
        for (int i = 0; i < 100; i++) {
            try {
                commandExecutor.tryExecute("a");
            } catch (ConnectionException e) {
                exception = e;
                break;
            }
        }
        assertThat(exception.getCause()).isNotNull();
    }

    @Test
    @DisplayName("stable connection doesn't throw connection exception")
    void stableConnectionDoesNotThrowConnectionException() {
        var stableConnection = new StableConnection();
        Assertions.assertDoesNotThrow(() -> stableConnection.execute("a"));
        stableConnection.close();
    }

    @Test
    @DisplayName("faulty connection throws connection exception only sometimes")
    void faultyConnectionSometimesThrowsConnectionException() {
        boolean exceptionPresence = false;
        boolean correctExecutionPresence = false;
        var faultyConnection = new FaultyConnection();
        for (int i = 0; i < 100; i++) {
            try {
                faultyConnection.execute("a");
                correctExecutionPresence = true;
            } catch (ConnectionException e) {
                exceptionPresence = true;
            }
            if (correctExecutionPresence && exceptionPresence) {
                break;
            }
        }
        assertThat(correctExecutionPresence && exceptionPresence).isTrue();
        faultyConnection.close();
    }

    @Test
    @DisplayName("faulty connection manager returns faulty connection")
    void faultyConnectionManagerReturnsFaultyConnection() {
        var stableConnection = new FaultyConnectionManager();
        Assertions.assertInstanceOf(FaultyConnection.class, stableConnection.getConnection());
    }

    @Test
    @DisplayName("default connection manager returns faulty connection only sometimes")
    void defaultConnectionManagerSometimesReturnsFaultyConnection() {
        boolean stableConnectionPresence = false;
        boolean faultyConnectionPresence = false;
        for (int i = 0; i < 100; i++) {
            var connection = new DefaultConnectionManager().getConnection();
            if (connection instanceof FaultyConnection) {
                faultyConnectionPresence = true;
            } else if (connection instanceof StableConnection) {
                stableConnectionPresence = true;
            }
            if (faultyConnectionPresence && stableConnectionPresence) {
                break;
            }
        }
        assertThat(faultyConnectionPresence && stableConnectionPresence).isTrue();
    }
}
