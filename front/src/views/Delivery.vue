<template>
  <div v-if="id">

  </div>
  <GForm
    v-else
    :disabled="!valid"
    button="Consultar"
  >
    <GInput
      v-model="delivery"
      label="Código da rota"
    />
  </GForm>
</template>

<script>
import GForm from '@/components/form/'
import GInput from '@/components/input/'

export default {
  components: {
    GForm,
    GInput,
  },
  data() {
    return {
      delivery: '',
    }
  },
  computed: {
    id() {
      return this.$route.params.id
    },
    valid() {
      return this.delivery.length > 0
    },
  },
}
</script>
