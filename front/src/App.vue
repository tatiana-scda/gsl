<template>
  <div id="app">
    <GHeader />
    <h1
      class="route-name"
    >
      {{ $route.name }}
    </h1>
    <transition name="route-view--slide">
      <router-view
        :key="$route.path"
        class="route-view"
      />
    </transition>
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

#app * {
  box-sizing: border-box;
}

.route-name {
  text-transform: uppercase;
  color: var(--g-red);
  font-size: 30px;
  font-weight: 600;
  margin: 30px 0 50px;
}

.route-view {
  --transition: .5s;
  max-width: 850px;
  margin: 0 auto;
}

.route-view--slide-enter {
  opacity: 0;
  transform: translateX(-100px);
  transition: all var(--transition);
}

.route-view--slide-enter-active {
  overflow-y: hidden;
}

.route-view--slide-enter-to {
  overflow-x: hidden;
  transition: all var(--transition);
}

.route-view--slide-leave-active {
  display: none;
}
</style>
