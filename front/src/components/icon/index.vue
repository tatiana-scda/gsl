<template>
  <component
    :is="iconLoader"
    class="icon"
  />
</template>

<script>
export default {
  name: 'GIcon',
  props: {
    name: {
      required: true,
    },
  },
  computed: {
    iconLoader() {
      return () => import(`@/assets/icons/${this.name}.svg?inline`)
    },
  },
}
</script>
