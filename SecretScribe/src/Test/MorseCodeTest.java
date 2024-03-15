package Test;

import Codes.MorseCode;
import org.junit.Assert;
import org.junit.Test;

public class MorseCodeTest {
    @Test
    public void encodeMorseCode_hello_world() {
        String str = "Hello world!";
        String expected = ".... . .-.. .-.. --- / .-- --- .-. .-.. -.. !";

        MorseCode sut = new MorseCode();

        String code = sut.encodeMorseCode(str);

        Assert.assertEquals(expected, code);
    }

    @Test
    public void decodeMorseCode_hello_world() {
        String str = ".... . .-.. .-.. --- / .-- --- .-. .-.. -.. !";
        String expected = "Hello world!";

        MorseCode sut = new MorseCode();

        String decode = sut.decodeMorseCode(str);

        Assert.assertEquals(expected, decode);
    }
}
