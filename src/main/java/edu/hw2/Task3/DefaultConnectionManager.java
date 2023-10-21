package edu.hw2.Task3;

public class DefaultConnectionManager implements ConnectionManager {
    private static final int COMPARE_BOARDER = 8;
    private static final int SCALE = 10;

    @Override
    public Connection getConnection() {
        return Math.random() * SCALE > COMPARE_BOARDER ? new FaultyConnection() : new StableConnection();
    }
}
