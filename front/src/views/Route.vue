<template>
  <div v-if="id">
    <GLoader v-if="!ready" />
    <GStatus
      v-if="route"
      :infos="infos"
      :statuses="statuses"
      :status="route.status"
    />
    <GError
      v-if="!route && ready"
    />
    <GButton
      v-if="ready"
      @click="back"
      class="route-back"
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
      label="Código da rota"
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
      qid: '',
      ready: false,
      route: null,
    }
  },
  computed: {
    id() {
      return this.$route.params.id
    },
    infos() {
      return {
        'Código da rota': this.route.id,
      //  'Motorista': this.route.driver,
      //  'Localização atual': this.route.currentLocation,
      //  'Origem': this.route.origin,
      //  'Destino': this.route.destination,
      }
    },
    statuses() {
      return status.route
    },
    valid() {
      return this.qid.length > 0
    },
  },
  methods: {
    back() {
      this.$router.push('/rota')
    },
    query() {
      this.$router.push({
        name: 'Rota',
        params: { id: this.qid },
      })
    },
  },
  async mounted() {
    if (!this.id) return

    try {
      this.route = await api.status.route(this.id)
    } catch (error) {
      console.error(error)
    } finally {
      this.ready = true
    }
  },
}
</script>

<style>
.route-back {
  margin-top: 60px;
}
</style>
