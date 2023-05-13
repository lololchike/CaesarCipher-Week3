package com.lololchike.Util;

public class Validator {
    public  boolean isValid(UserInput userInput){
      boolean oIsValid =operationValidator(userInput.getOperation());
        boolean mIsValid =operationValidator(userInput.getMessage());
        boolean kIsValid =operationValidator(userInput.getKey());

        return oIsValid && mIsValid && kIsValid;
    }
    private boolean operationValidator(String operation) {
        // two operations -> encode,decode

        return operation.equalsIgnoreCase(anotherString:'encode')||
        operation.equalsIgnoreCase(anotherString:'decode');
    }

    private boolean messageValidator(String message) {
        //boolean isBlankOrEmpty =message.isBlank()&& message.isEmpty();
        return !(message.isBlank() && message.isEmpty());
    }

    private boolean keyValidator(int key) {
        // if (key >=1 && key <= 25);{
        //    return true;
        return (key >= 1) && (key <= 25);
    }
}

