package com.lololchike.util;

import com.lololchike.models.UserInput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void testInValidMessage_validatorReturnFalse() {
        Validator validator = new Validator();
        UserInput userInput = new UserInput();
        userInput.setOperation("encode");
        userInput.setMessage("");
        userInput.setKey(1);
       assertFalse(validator.isValid(userInput));
    }
    @Test
    void testInValidKey_validatorReturnFalse() {
        Validator validator = new Validator();
        UserInput userInput = new UserInput();
        userInput.setOperation("encode");
        userInput.setMessage("message");
        userInput.setKey(26);
        assertFalse(validator.isValid(userInput));
    }
    @Test
    void testInValidOperation_validatorReturnTrue() {
        Validator validator = new Validator();
        UserInput userInput = new UserInput();
        userInput.setOperation("hello");
        userInput.setMessage("message");
        userInput.setKey(1);
        assertFalse(validator.isValid(userInput));


        }
    }
