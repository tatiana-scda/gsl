<template>
  <header class="header">
    <HeaderLogo />
    <nav class="header-nav">
      <router-link
        v-for="link in links"
        :key="link.title"
        :to="link.url"
        class="header-link"
      >
        {{ link.title }}
      </router-link>
    </nav>
  </header>
</template>

<script>
import HeaderLogo from './logo.vue'

export default {
  name: 'GHeader',
  components: {
    HeaderLogo,
  },
  computed: {
    links() {
      return [
        {
          title: 'Login',
          url: '/login',
        },
        {
          title: 'Cadastro',
          url: '/cadastro',
        },
        {
          title: 'Entrega',
          url: '/entrega',
        },
        {
          title: 'Rota',
          url: '/rota',
        },
      ]
    },
  },
}
</script>

<style>
.header {
  background-color: var(--g-red);
  color: white;
  display: flex;
  justify-content: space-between;
  padding: 15px 30px;
}

.header-nav {
  align-self: flex-end;
}

.header-link, .header-link:visited {
  color: inherit;
  text-decoration: none;
}

.header-link:not(:first-child) {
  margin-left: 30px;
}
</style>
