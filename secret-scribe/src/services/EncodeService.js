import axios from 'axios';

export default {

    encodeCaesarCipher(message) {
        return axios.get(`/encode/caesarcipher`, message);
    },

    encodeMorseCode(message) {
        return axios.get(`/encode/morsecode`, message);
    },
    
    encodePigLatin(message) {
        return axios.get(`/encode/piglatin`, message);
    }
    
}