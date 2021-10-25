<template>
  <GForm
    :disabled="!valid"
    button="Entrar"
    class="login"
  >
    <GInput
      v-model="username"
      label="Usuário"
			required
    />
    <GInput
      v-model="password"
      label="Senha"
      type="password"
			required
    />
  </GForm>
</template>

<script>
import GInput from '@/components/input/'
import GForm from '@/components/form/'

export default {
  components: {
    GForm,
    GInput,
  },
  data() {
    return {
      username: '',
      password: '',
    }
  },
  computed: {
    valid() {
      return this.username.length > 0 &&
        this.password.length > 6
    },
  },
}
</script>
