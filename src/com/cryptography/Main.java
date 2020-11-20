package com.cryptography;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CaesarBreakerTest test = new CaesarBreakerTest();
        test.breakCipher();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the ciphertext: ");
        String cipherText = scanner.nextLine();

        String plainText = CaesarBreaker.breakCipher(cipherText);
        System.out.println("The decrypted ciphertext is: " + plainText);

    }
}
