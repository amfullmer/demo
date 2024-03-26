package com.secretscribe;

import com.secretscribe.Codes.CaesarCipher;
import org.junit.Assert;
import org.junit.Test;

public class CaesarCipherTest {
    @Test
    public void encodeCaesarCipherTest_hello_world() {
        String str = "Hello world!";
        String expected = "Khoor zruog!";

        CaesarCipher sut = new CaesarCipher();

        String code = sut.encodeCaesarCipher(str);

        Assert.assertEquals(expected, code);
    }

    @Test
    public void decodeCaesarCipher_hello_world() {
        String str = "KHOOR ZRUOG!";
        String expected = "Hello world!";

        CaesarCipher sut = new CaesarCipher();

        String decode = sut.decodeCaesarCipher(str);

        Assert.assertEquals(expected, decode);
    }
}
