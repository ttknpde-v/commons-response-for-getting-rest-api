package com.ttknpdev.commonsresponsettknpdev.exception.handler;

public class NotAllowedMethod extends RuntimeException {
    private String currentCause;

    public NotAllowedMethod(String message) {
        super(message);
        this.currentCause = message;
    }

    public String getCurrentCause() {
        return currentCause;
    }
}
