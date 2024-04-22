package com.secretscribe.Controller;

import com.secretscribe.Interfaces.CaesarCipherable;
import com.secretscribe.Interfaces.MorseCodeable;
import com.secretscribe.Interfaces.PigLatinable;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/encode/caesarcipher")
    public String encodeCaesarCipher(@RequestBody String message) {
        return caeserCipherable.encodeCaesarCipher(message);
    }

    @PostMapping("/encode/morsecode")
    public String encodeMorseCode(@RequestBody String message) {
        return morseCodeable.encodeMorseCode(message);
    }

    @PostMapping("/encode/piglatin")
    public String encodePigLatin(@RequestBody String message) {
        return pigLatinable.encodePigLatin(message);
    }
}

