<template>
  <div class="container">
    <div class="content has-text-centered flex-container"> 
      <p class="is-size-3">Welcome to Secret Scribe</p> 
      <br>
      <router-link v-bind:to="{ name: 'secretMessage' }" class="button is-dark">Enter</router-link>
    </div>
  </div>
</template>

<script>
export default {
}
</script>

<style scoped>
.container {
  padding: 20px;
}

.flex-container {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  height: 100%;
}

.button {
  margin-top: 20px;
}
</style>
