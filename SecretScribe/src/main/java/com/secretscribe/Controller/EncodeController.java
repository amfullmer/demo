package com.secretscribe.Controller;

import com.secretscribe.Interfaces.CaesarCipherable;
import com.secretscribe.Interfaces.MorseCodeable;
import com.secretscribe.Interfaces.PigLatinable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class EncodeController {
    private final CaesarCipherable caeserCipherable;
    private final MorseCodeable morseCodeable;
    private final PigLatinable pigLatinable;

    public EncodeController(CaesarCipherable caeserCipherable, MorseCodeable morseCodeable, PigLatinable pigLatinable) {
        this.caeserCipherable = caeserCipherable;
        this.morseCodeable = morseCodeable;
        this.pigLatinable = pigLatinable;
    }

    @GetMapping("/encode/caesarcipher")
    public String encodeCaesarCipher(String message) {
        return caeserCipherable.encodeCaesarCipher(message);
    }

    @GetMapping("/encode/morsecode")
    public String encodeMorseCode(String message) {
        return morseCodeable.encodeMorseCode(message);
    }

    @GetMapping("/encode/piglatin")
    public String encodePigLatin(String message) {
        return pigLatinable.encodePigLatin(message);
    }
}
