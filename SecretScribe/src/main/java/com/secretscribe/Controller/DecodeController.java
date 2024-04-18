package com.secretscribe.Controller;

import com.secretscribe.Interfaces.CaesarCipherable;
import com.secretscribe.Interfaces.MorseCodeable;
import com.secretscribe.Interfaces.PigLatinable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class DecodeController {
    private final CaesarCipherable caeserCipherable;
    private final MorseCodeable morseCodeable;
    private final PigLatinable pigLatinable;

    public DecodeController(CaesarCipherable caeserCipherable, MorseCodeable morseCodeable, PigLatinable pigLatinable) {
        this.caeserCipherable = caeserCipherable;
        this.morseCodeable = morseCodeable;
        this.pigLatinable = pigLatinable;
    }

    @GetMapping("/decode/caesarcipher")
    public String decodeCaesarCipher(String message) {
        return caeserCipherable.decodeCaesarCipher(message);
    }

    @GetMapping("/decode/morsecode")
    public String decodeMorseCode (String message) {
        return morseCodeable.decodeMorseCode(message);
    }

    @GetMapping("/decode/piglatin")
    public String decodePigLatin(String message) {
        return pigLatinable.decodePigLatin(message);
    }
}
