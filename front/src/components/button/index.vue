<template>
  <button
    v-bind="$attrs"
    v-on="$listeners"
    class="button"
  >
    <slot name="default" />
  </button>
</template>

<script>
export default {
  name: 'GButton',
}
</script>

<style>
.button {
  border-radius: 5px;
  font-weight: 600;
  text-transform: uppercase;
  height: 50px;
  width: 200px;
}

.button:not(:disabled) {
  background-color: #329632;
  border-color: black;
  cursor: pointer;
}
</style>
