<template>
  <div v-if="id">
    <GLoader v-if="!ready" />
    <GStatus
      v-if="delivery"
      :infos="infos"
      :statuses="statuses"
      :status="delivery.status"
    />
    <GError
      v-if="!delivery && ready"
    />
    <GButton
      v-if="ready"
      @click="back"
      class="delivery-back"
    >
      Voltar
    </GButton>
  </div>
  <GForm
    v-else
    :disabled="!valid"
    @submit="query"
    button="Consultar"
  >
    <GInput
      v-model="qid"
      label="Código da entrega"
    />
  </GForm>
</template>

<script>
import GButton from '@/components/button/'
import GError from '@/components/error/'
import GForm from '@/components/form/'
import GInput from '@/components/input/'
import GLoader from '@/components/loader/'
import GStatus from '@/components/status/'

import api from '@/api'
import status from '@/assets/utils/status'

export default {
  components: {
    GButton,
    GError,
    GForm,
    GInput,
    GLoader,
    GStatus,
  },
  data() {
    return {
      delivery: null,
      qid: '',
      ready: false,
    }
  },
  computed: {
    id() {
      return this.$route.params.id
    },
    infos() {
      return {
        'Código de entrega': this.delivery.id,
        'Produto': this.delivery.productDescription,
      }
    },
    statuses() {
      return status.delivery
    },
    valid() {
      return this.qid.length > 0
    },
  },
  methods: {
    back() {
      this.$router.push('/entrega')
    },
    query() {
      this.$router.push({
        name: 'Entrega',
        params: { id: this.qid },
      })
    },
  },
  async mounted() {
    if (!this.id) return

    try {
      this.delivery = await api.status.delivery(this.id)
    } catch (error) {
      console.error(error)
    } finally {
      this.ready = true
    }
  },
}
</script>

<style>
.delivery-back {
  margin-top: 60px;
}
</style>
