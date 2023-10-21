package edu.hw2.Task3;

public final class PopularCommandExecutor {
    private final ConnectionManager manager;
    private final int maxAttempts;

    public PopularCommandExecutor(ConnectionManager manager, int maxAttempts) {
        this.manager = manager;
        this.maxAttempts = maxAttempts;
    }

    public void updatePackages() {
        tryExecute("apt update && apt upgrade -y");
    }

    public void tryExecute(String command) throws ConnectionException {
        Connection connection = manager.getConnection();
        ConnectionException exception = null;
        boolean correctExecution = false;
        for (int i = 0; i < maxAttempts; i++) {
            try {
                connection.execute(command);
                correctExecution = true;
                break;
            } catch (ConnectionException e) {
                exception = e;
            }
        }
        if (!correctExecution) {
            throw new ConnectionException(exception);
        }
    }
}
