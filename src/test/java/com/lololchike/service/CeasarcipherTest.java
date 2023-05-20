package com.lololchike.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarcipherTest {

    @Test
    void testCipherEncodingReturnCorrectCipherText_True() {
        String plainText = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String cipherText = "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";
        int key = 23;


       CaesarCipher ceasarcipher = new CaesarCipher();
       String output = ceasarcipher.encode(plainText, key);
        System.out.println("Test output:" + output);
       assertEquals(cipherText,output);
    }


    @Test
    void testCipherDecodingReturnCorrectPlainText_True() {
        String cipherText = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String plainText = "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";
        int key = 23;


        CaesarCipher ceasarcipher = new CaesarCipher();
        String output = ceasarcipher.decode(cipherText, key);
        System.out.println("Test output:" + output);
        assertEquals(plainText,output);
    }
    }

