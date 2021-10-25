<template>
  <div id="app">
    <GHeader />
    <h1
      v-if="showTitle"
      class="route-name"
    >
      {{ $route.name }}
    </h1>
    <router-view/>
  </div>
</template>

<script>
import GHeader from './components/header/'

export default {
  components: {
    GHeader,
  },
  computed: {
    showTitle() {
      return this.$route.path !== '/'
    },
  },
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

.route-name {
  text-transform: uppercase;
  color: var(--g-red);
  font-size: 30px;
  font-weight: 600;
  margin: 30px 0;
}
</style>
