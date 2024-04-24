import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import axios from 'axios'
import 'bulma/css/bulma.css'
import './main.css'

axios.defaults.baseURL = import.meta.env.VITE_REMOTE_API;

const app = createApp(App)

app.use(router)

app.mount('#app')
