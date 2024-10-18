<template>
  <div id="app">
    <HomePage />
  </div>
</template>

<script lang="ts">
import HomePage from './components/HomePage.vue';

export default {
  components: {
    HomePage,
  },
};
</script>

<style>
#app {
  display: flex;
  flex-direction: column;
  height: 100%;
  width: 100%;
  margin: 0;
}
</style>