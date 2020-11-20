package com.cryptography;

import java.util.Scanner;

/**
 * @author [Rachit Bhalla](https://github.com/rachitbhalla)
 */
public class Main {

    public static void main(String[] args) {

        // execute the tests
        CaesarBreakerTest test = new CaesarBreakerTest();
        test.breakCipher();

        // get the value of ciphertext using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the ciphertext: ");
        String cipherText = scanner.nextLine();

        // call the function CaesarBreaker.breakCipher() and break the ciphertext to get the original plaintext
        String plainText = CaesarBreaker.breakCipher(cipherText);
        System.out.println("The decrypted ciphertext is: " + plainText);

    }
}
