<template>
  <div>
    <GInfos
      :infos="infos"
    />
    <GStatuses
      :status="status"
      :statuses="statuses"
    />
  </div>
</template>

<script>
import GInfos from './infos.vue'
import GStatuses from './statuses.vue'

export default {
  name: 'GStatus',
  components: {
    GInfos,
    GStatuses,
  },
  props: {
    infos: {
      required: true,
    },
    status: {
      required: true,
    },
    statuses: {
      required: true,
    },
  },
}
</script>
