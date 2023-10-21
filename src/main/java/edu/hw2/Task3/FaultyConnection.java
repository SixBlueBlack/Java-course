package edu.hw2.Task3;

public class FaultyConnection implements Connection {
    private static final int COMPARE_BOARDER = 8;
    private static final int SCALE = 10;

    @Override
    public void execute(String command) throws ConnectionException {
        if (Math.random() * SCALE > COMPARE_BOARDER) {
            throw new ConnectionException();
        }
    }

    @Override
    public void close() {
    }
}
