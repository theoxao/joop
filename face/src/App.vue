<template>
  <div id="app">
    <img src="./assets/logo.png">
    <router-view/>
  </div>
  <keep-alive>
    <router-view class="main"></router-view>
  </keep-alive>
</template>

<script>
  export default {
    name: 'App'
  }
</script>

<style>
  #app {
    font-family: 'Avenir', Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
    margin-top: 60px;
  }
</style>
