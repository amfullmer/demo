package Test;

import Codes.PigLatin;
import org.junit.Assert;
import org.junit.Test;

public class PigLatinTest {
    @Test
    public void encodePigLatin_hello_world() {
        //Arrange
        String str = "Hello world";
        String expected = "ellohay orldway";
        PigLatin sut = new PigLatin();

        //Act
        String code = sut.encodePigLatin(str);

        //Assert
        Assert.assertEquals(expected, code);
    }

    @Test
    public void decodePigLatin_hello_world() {
        String str = "ellohay orldway";
        String expected = "hello world";

        PigLatin sut = new PigLatin();

        String decode = sut.decodePigLatin(str);

        Assert.assertEquals(expected, decode);
    }

}
