package com.secretscribe;

import com.secretscribe.Codes.ReverseMessage;
import org.junit.Assert;
import org.junit.Test;

public class ReverseMessageTest {

    @Test
    public void reverse_hello_world() {
        String str = "Hello world!";
        String expected = "!dlrow olleH";

        ReverseMessage sut = new ReverseMessage();

        String code = sut.reverseMessage(str);

        Assert.assertEquals(expected, code);
    }

    @Test
    public void reverse_dlrow_olleh() {
        String str = "!dlrow olleH";
        String expected = "Hello world!";

        ReverseMessage sut = new ReverseMessage();

        String code = sut.reverseMessage(str);

        Assert.assertEquals(expected, code);
    }
}
