package com.secretscribe.Controller;

import com.secretscribe.Interfaces.CaesarCipherable;
import com.secretscribe.Interfaces.MorseCodeable;
import com.secretscribe.Interfaces.PigLatinable;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/decode/caesarcipher")
    public String decodeCaesarCipher(@RequestBody String message) {
        return caeserCipherable.decodeCaesarCipher(message);
    }

    @PostMapping("/decode/morsecode")
    public String decodeMorseCode(@RequestBody String message) {
        return morseCodeable.decodeMorseCode(message);
    }

    @PostMapping("/decode/piglatin")
    public String decodePigLatin(@RequestBody String message) {
        return pigLatinable.decodePigLatin(message);
    }
}
