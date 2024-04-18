import axios from 'axios';

export default {
    
    decodeCaesarCipher(message) {
        return axios.get(`/decode/caesarcipher`, message);
    },

    decodeMorseCode(message) {
        return axios.get(`/decode/morsecode`, message);
    },

    decodePigLatin(message) {
        return axios.get(`/decode/piglatin`, message);
    }

}