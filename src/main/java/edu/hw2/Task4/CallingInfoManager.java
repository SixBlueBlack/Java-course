package edu.hw2.Task4;

public class CallingInfoManager {
    private CallingInfoManager() {
    }

    public static CallingInfo callingInfo() {
        StackTraceElement[] stackTrace = (new Throwable()).getStackTrace();
        StackTraceElement stackTraceElement = stackTrace[1];
        return new CallingInfo(stackTraceElement.getClassName(), stackTraceElement.getMethodName());
    }

    public record CallingInfo(String className, String methodName) {
    }
}
