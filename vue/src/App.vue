<script setup>
import { RouterView } from 'vue-router'
</script>

<template>
  <nav class="container">
    <router-link v-bind:to="{ name: 'home' }">Home</router-link>
    &nbsp;&nbsp;|&nbsp;&nbsp;
    <router-link v-bind:to="{ name: 'about' }">About</router-link>
    &nbsp;&nbsp;|&nbsp;&nbsp;
    <router-link v-bind:to="{ name: 'secretMessage' }">Encode Messages</router-link>
  </nav>

  <RouterView />
</template>

<style scoped>
.container {
  margin-top: 15px;
  margin-bottom: 30px;
}
</style>