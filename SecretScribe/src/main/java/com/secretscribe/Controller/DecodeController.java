package com.secretscribe.Controller;

import com.secretscribe.Codes.CaesarCipher;
import com.secretscribe.Codes.MorseCode;
import com.secretscribe.Codes.PigLatin;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class DecodeController {
    private final CaesarCipher CaeserCipherable;
    private final MorseCode MorseCodeable;
    private final PigLatin PigLatinable;

    public DecodeController(CaesarCipher caeserCipherable, MorseCode morseCodeable, PigLatin pigLatinable) {
        CaeserCipherable = caeserCipherable;
        MorseCodeable = morseCodeable;
        PigLatinable = pigLatinable;
    }

}
