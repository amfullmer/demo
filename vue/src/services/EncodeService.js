import axios from 'axios';

export default {

    encodeCaesarCipher(message) {
        return axios.post(`/encode/caesarcipher`, message, {
            headers: {
                'Content-Type': 'application/json'
            }
        });
    },

    encodeMorseCode(message) {
        return axios.post(`/encode/morsecode`, message, {
            headers: {
                'Content-Type': 'application/json'
            }
        });
    },

    encodePigLatin(message) {
        return axios.post(`/encode/piglatin`, message, {
            headers: {
                'Content-Type': 'application/json'
            }

        });
    }
}
