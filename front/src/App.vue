<template>
  <div id="app">
    <GHeader />
    <h1
      class="route-name"
    >
      {{ $route.name }}
    </h1>
    <router-view
      class="route-view"
    />
  </div>
</template>

<script>
import GHeader from '@/components/header/'

export default {
  components: {
    GHeader,
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

.route-view {
  max-width: 850px;
  margin: 0 auto;
}
</style>
