package com.cryptography.test;

import com.cryptography.main.CaesarBreaker;

/**
 * @brief class for testing CaesarBreaker class
 * @author [Rachit Bhalla](https://github.com/rachitbhalla)
 */
public class CaesarBreakerTest {

    /**
     * @brief test breakCipher method of CaesarBreaker
     */
    public void breakCipher() {
        String plainText = CaesarBreaker.breakCipher("Cfopq Ibdflkbbb");
        assert plainText.equals("First Legioneee");
    }

}
