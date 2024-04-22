import axios from 'axios';

export default {
    
    decodeCaesarCipher(message) {
        return axios.post(`/decode/caesarcipher`, message);
    },

    decodeMorseCode(message) {
        return axios.post(`/decode/morsecode`, message);
    },

    decodePigLatin(message) {
        return axios.post(`/decode/piglatin`, message);
    }

}