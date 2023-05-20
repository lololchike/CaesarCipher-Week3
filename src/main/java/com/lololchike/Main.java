package com.lololchike;

import com.lololchike.models.UserInput;
import com.lololchike.service.CaesarCipher;
import com.lololchike.service.GetUserInput;


public class Main {
    public static void main(String[] args) {
        boolean userInputIsValid = GetUserInput.getUserInput();

        UserInput userInput = GetUserInput.input;
        if (userInputIsValid ) {
            CaesarCipher ceasarcipher = new CaesarCipher();
            if (userInput.getOperation().equalsIgnoreCase("encode")){
                String cipherText =  CaesarCipher.encode(userInput.getMessage(),userInput.getKey());
                System.out.println("your cipher text is: " + cipherText);
            } else if (userInput.getOperation().equalsIgnoreCase( "decode")){
                String plainText =  CaesarCipher.decode(userInput.getMessage(), userInput.getKey());
                System.out.println("your plain text is: " + plainText);
            }
        }else{
            System.out.println("do not proceed");
        }
    }
};
