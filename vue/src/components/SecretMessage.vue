<template>
    <div class="container">
        <div class="columns">
            <div class="column is-half">
                <div class="field">
                    <label class="label">Enter your message...</label>
                    <div class="control">
                        <textarea class="textarea" placeholder="e.g. Hello world" v-model="userText"></textarea>
                    </div>
                </div>
            </div>
            <div class="column is-half">
                <div class="field">
                    <label class="label">And receive a new message:</label>
                    <div class="message-box">{{ message }}</div>
                </div>
            </div>
        </div>
        <div class="field">
            <!-- <label class="label">Select Code</label> -->
            <div class="control">
                <div class="select">
                    <select v-model="codeType">
                        <option disabled value="">Select Code</option>
                        <option value="caesar">Caesar Cipher</option>
                        <option value="morse">Morse Code</option>
                        <option value="piglatin">Pig Latin</option>
                        <option value="reversemessage">Reverse message</option>
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
            } else if (this.codeType === 'piglatin') {
                encodeService.encodePigLatin(this.userText)
                    .then(response => {
                        this.message = response.data;
                    })
                    .catch(error => {
                        console.error("Error encoding message:", error);
                    });
            } else if (this.codeType === 'reversemessage') {
                decodeService.reverseMessage(this.userText)
                .then(response => {
                    this.message = response.data;
                })
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
            } else if (this.codeType === 'piglatin') {
                decodeService.decodePigLatin(this.userText)
                    .then(response => {
                        this.message = response.data;
                    })
                    .catch(error => {
                        console.error("Error encoding message:", error);
                    });
            } else if (this.codeType === 'reversemessage') {
                decodeService.reverseMessage(this.userText)
                .then(response => {
                    this.message = response.data;
                })
            }

        }
    }
}
</script>

<style scoped>
.message-box {
    border: .1px solid #ccc;
    border-radius: 5px;
    padding: 10px;
    font-size: 1rem; 
    line-height: 1.5; 
    resize: vertical; 
    min-height: 125px; 
}
</style>