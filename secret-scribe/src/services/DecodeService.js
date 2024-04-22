import axios from 'axios';

export default {
    decodeCaesarCipher(message) {
        return axios.post(`/decode/caesarcipher`, message, {
            headers: {
                'Content-Type': 'application/json'
            }
        });
    },

    decodeMorseCode(message) {
        return axios.post(`/decode/morsecode`, message, {
            headers: {
                'Content-Type': 'application/json'
            }
        });
    },

    decodePigLatin(message) {
        return axios.post(`/decode/piglatin`, message, {
            headers: {
                'Content-Type': 'application/json'
            }
        });
    }
}
