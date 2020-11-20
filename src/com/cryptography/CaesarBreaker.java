package com.cryptography;

// import the CaesarCipher class from Caesar Cipher repository (https://github.com/rachitbhalla/Caesar-Cipher)
import com.cryptography.main.CaesarCipher;

/**
 * @brief class for breaking the Caesar Cipher technique
 * @author [Rachit Bhalla](https://github.com/rachitbhalla)
 */
public class CaesarBreaker {

    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
     * @brief count the letters in a text
     * @param text
     * @return array of count of each letter in the text
     */
    private static int[] countLetters(String text){
        int[] letterCounts = new int[26];
        for(int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            if(Character.isAlphabetic(ch)){
                int index = ALPHABET.indexOf(Character.toUpperCase(ch));
                letterCounts[index] += 1;
            }
        }
        return letterCounts;
    }

    /**
     * @brief find the index of maximum value in array of values
     * @param values array of integer values
     * @return index of maximum value
     */
    private static int indexOfMax(int[] values){
        int indexOfMaxValue = 0;
        for(int i=1; i<values.length; i++){
            if(values[i]>values[indexOfMaxValue]){
                indexOfMaxValue = i;
            }
        }
        return indexOfMaxValue;
    }

    /**
     * @brief break the ciphertext to get the original plaintext value
     * @param cipherText the encrypted plaintext
     * @return plaintext
     */
    public static String breakCipher(String cipherText){
        int indexOfMostFrequentLetter = indexOfMax(countLetters(cipherText));
        char mostFrequentEnglishLetter = 'E';
        int key = indexOfMostFrequentLetter - ALPHABET.indexOf(mostFrequentEnglishLetter);
        return CaesarCipher.decrypt(cipherText, key);
    }

}
