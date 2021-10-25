<template>
  <div class="loader">
    <img
      src="~@/assets/images/truck.png"
      class="loader-image"
      alt=""
    >
  </div>
</template>

<script>
export default {
  name: 'GLoader',
}
</script>

<style>
.loader {
  --loader-size: 60px;
  height: var(--loader-size);
  overflow: hidden;
  position: relative;
}

.loader-image {
  animation: ride 4s linear 0s infinite, truck .5s linear 0s infinite;
  height: var(--loader-size);
  width: var(--loader-size);
  position: absolute;
  bottom: 0;
  left: calc(0px - var(--loader-size));
}

@keyframes ride {
  100% { left: 100%; }
}

@keyframes truck {
  20% {
    bottom: 3px;
  }

  40% {
    height: var(--loader-size);
    bottom: 0;
  }

  80% {
    height: calc(0.95 * var(--loader-size));
  }
}
</style>
