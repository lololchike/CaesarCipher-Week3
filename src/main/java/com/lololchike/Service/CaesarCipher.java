package com.lololchike.Service;

public class CaesarCipher {
    Private final String ALPHABETS ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    Public String; encode (String message, int key){

    }

    public String decode() {
        return "";
    }
    Private char shiftChar( char c , int k){
        int oldIndex = ALPHABETS.indexOf(c);
        int newIndex = (oldIndex + k) % 26;

        int pos;
        char cipherChar;
        if (newIndex > 25)
        {
            pos = newIndex - 26;
            cipherChar = ALPHABETS.charAt(pos);
        } else if (newIndex < 0) {
            pos = newIndex + 26;
            cipherChar = ALPHABETS.charAt(pos);


        } else {
            pos = newIndex;
            cipherChar = ALPHABETS.charAt(pos);
        }

        return cipherChar;
    }
}


