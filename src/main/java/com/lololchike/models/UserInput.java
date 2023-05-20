package com.lololchike.models;

public class UserInput {
    private static String operation;
    private static String message;
    private static int key;

    public static String getOperation() {
        return operation;
    }

    public static void setOperation(String operation) {
        UserInput.operation = operation;
    }

    public static String getMessage() {
        return message;
    }

    public static void setMessage(String message) {
        UserInput.message = message;
    }

    public static int getKey() {
        return key;
    }

    public static void setKey(int key) {
        UserInput.key = key;
    }

    @Override
    public String toString() {
        return "UserInput{}"+getOperation()+","+getMessage()+","+getKey();
    }
};
