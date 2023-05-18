package com.lololchike.Service;

import com.lololchike.Models.userInput;
import com.lololchike.Util.Validator;

import java.util.Scanner;
public class GetUserInput {
    public static userInput input;
    Public statickk GetUserInput input;

    public static boolean getUserInput(){
        Scanner scanner =new Scanner(System.in);

        String operation;
        String message;
        int key;
        UserInput userInput=new UserInput();
        Validator validator= new Validator();
        System.out.println("choose operation(*encode* or *decode*)");
        operation=scanner.nextLine();
        System.out.println("");

        System.out.print("enter your message:");
        message=scanner.nextLine();
        System.out.println("");

        System.out.print("enter your secret key");
        key=scanner.nextInt();
        System.out.println("");

        userInput.setKey(key);
        userInput.setMessage(message);
        userInput.setOperation(operation);

        input = userInput;

        scanner.close();

        return validator.isValid(userInput);
    }
}
