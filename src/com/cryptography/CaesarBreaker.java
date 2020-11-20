package com.cryptography;

import com.cryptography.main.CaesarCipher;

public class CaesarBreaker {

    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static int[] countLetters(String cipherText){
        int[] letterCounts = new int[26];
        for(int i=0; i<cipherText.length(); i++){
            char ch = cipherText.charAt(i);
            if(Character.isAlphabetic(ch)){
                int index = ALPHABET.indexOf(Character.toUpperCase(ch));
                letterCounts[index] += 1;
            }
        }
        return letterCounts;
    }

    private static int indexOfMax(int[] values){
        int indexOfMaxValue = 0;
        for(int i=1; i<values.length; i++){
            if(values[i]>values[indexOfMaxValue]){
                indexOfMaxValue = i;
            }
        }
        return indexOfMaxValue;
    }

    public static String breakCipher(String cipherText){
        int indexOfMostFrequentLetter = indexOfMax(countLetters(cipherText));
        char mostFrequentEnglishLetter = 'E';
        int key = indexOfMostFrequentLetter - ALPHABET.indexOf(mostFrequentEnglishLetter);
        return CaesarCipher.decrypt(cipherText, key);
    }

}
