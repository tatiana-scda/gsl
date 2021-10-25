<template>
  <form
    @submit.prevent="$emit('submit')"
    class="form"
  >
    <slot name="default" />
    <GButton
      class="form-button"
      :disabled="disabled"
    >
      {{ button }}
    </GButton>
  </form>
</template>

<script>
import GButton from '@/components/button/'

export default {
  components: {
    GButton,
  },
  props: {
    button: {
      required: true,
    },
    disabled: {
      default: false,
    },
  },
}
</script>

<style>
.form {
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 10px;
}

.form-button {
  margin-top: 20px;
}
</style>
