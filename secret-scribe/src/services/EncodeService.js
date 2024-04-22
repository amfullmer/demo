import axios from 'axios';

export default {

    encodeCaesarCipher(message) {
        return axios.post(`/encode/caesarcipher`, message);
    },

    encodeMorseCode(message) {
        return axios.post(`/encode/morsecode`, message);
    },
    
    encodePigLatin(message) {
        return axios.post(`/encode/piglatin`, message);
    }
    
}