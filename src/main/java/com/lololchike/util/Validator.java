package com.lololchike.util;
import com.lololchike.models.UserInput;


public class Validator {
    public  boolean isValid( UserInput UseInput){
      boolean oIsValid =operationValidator(UserInput.getOperation());
        boolean mIsValid =messageValidator(UserInput.getMessage());
        boolean kIsValid =keyValidator(UserInput.getKey());

        return oIsValid && mIsValid && kIsValid;
    }
    private boolean operationValidator(String operation) {
      return operation.equalsIgnoreCase("encode") ||
        operation.equalsIgnoreCase("decode");

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

