<template>
    <div class="container">
        <div class="field">
            <label class="label">Enter your message...</label>
            <div class="control">
                <textarea class="textarea" placeholder="e.g. Hello world" v-model="userText"></textarea>
            </div>
        </div>
        <div>
            {{ message }}
        </div>
        <div class="field">
            <div class="control">
                <div class="select">
                    <select v-model="codeType">
                        <option>Select dropdown</option>
                        <option value="caesar">Caesar Cipher</option>
                        <option value="morse">Morse Code</option>
                        <!-- <option value="piglatin">Pig Latin</option> -->
                    </select>
                </div>
            </div>
        </div>

        <div class="field is-grouped">
            <div class="control">
                <button class="button is-dark" @click="encodeMessage">Encode message</button>
            </div>
            <div class="control">
                <button class="button is-dark" @click="decodeMessage">Decode message</button>
            </div>
        </div>
    </div>
</template>

<script>
import encodeService from '../services/EncodeService.js';
import decodeService from '../services/DecodeService.js';

export default {
    data() {
        return {
            codeType: '',
            userText: '',
            message: ''
        }
    },

    methods: {
        encodeMessage() {
            if (this.codeType === 'caesar') {
                encodeService.encodeCaesarCipher(this.userText)
                    .then(response => {
                        this.message = response.data;
                    })
                    .catch(error => {
                        console.error("Error encoding message:", error);
                    });
            } else if (this.codeType === 'morse') {
                encodeService.encodeMorseCode(this.userText)
                    .then(response => {
                        this.message = response.data;
                    })
                    .catch(error => {
                        console.error("Error encoding message:", error);
                    });
            }
        },

        decodeMessage() {
            if (this.codeType === 'caesar') {
                decodeService.decodeCaesarCipher(this.userText)
                    .then(response => {
                        this.message = response.data;
                    })
                    .catch(error => {
                        console.error("Error encoding message:", error);
                    });
            } else if (this.codeType === 'morse') {
                decodeService.decodeMorseCode(this.userText)
                    .then(response => {
                        this.message = response.data;
                    })
                    .catch(error => {
                        console.error("Error encoding message:", error);
                    });
            }

        }
    }
}
</script>
