package com.lololchike;
import com.lololchike.Models.userInput;
import com.lololchike.Service.Ceasarcipher;
import com.lololchike.Service.GetUserInput;



public class Main {
    public static void main(String[] args) {
        boolean userInputIsValid = GetUserInput.getUserInput();
        GetUserInput.getUserInput();

            if (userInputIsValid ) {
                    UserInput userInput = GetUserInput.input;
                Ceasarcipher ceasarcipher = new Ceasarcipher();
                    if (userInput.getOperation().equalsIgnoreCase(anotherString:"encode")){
                  String cipherText =  Ceasarcipher.encode(userInput.getMessage(), userInput.getKey());
                    System.out.println("your cipher text is: " + cipherText);
                } else  (userInput.getOperation().equalsIgnoreCase(anotherString: "decode")){
                    String plainText =  Ceasarcipher.decode(userInput.getMessage(), userInput.getKey())
                    System.out.println("your plain text is: " + plainText);

                    }
            }else{
                System.out.println("do not proceed");
            }

        }
    };