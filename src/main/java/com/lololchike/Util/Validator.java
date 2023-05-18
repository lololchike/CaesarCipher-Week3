package com.lololchike.Util;
import com.lololchike.Models.userInput;


public class Validator {
    public  boolean isValid( userInput UseInput){
      boolean oIsValid =operationValidator(userInput.getOperation());
        boolean mIsValid =messageValidator(userInput.message());
        boolean kIsValid =keyValidator(userInput.getKey());

        return oIsValid && mIsValid && kIsValid;
    }
    private boolean operationValidator(String operation) {
      return operation.equalsIgnoreCase(anotherString:"encode") ||
        operation.equalsIgnoreCase(anotherString:"decode");

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

