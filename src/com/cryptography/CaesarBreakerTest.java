package com.cryptography;

public class CaesarBreakerTest {

    public void breakCipher() {
        String plainText = CaesarBreaker.breakCipher("Cfopq Ibdflkbbb");
        assert plainText.equals("First Legioneee");
    }

}
