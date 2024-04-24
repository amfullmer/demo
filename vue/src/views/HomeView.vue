<template>
  <div class="container">
    <div class="content has-text-centered flex-container"> 
      <p class="is-size-2">Welcome to Secret Scribe</p> 
      <i class="fas fa-user-secret is-size-2"></i>
      <br>
      <p class="is-size-5">Your one stop shop for crafting clandestine communications.</p>
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
