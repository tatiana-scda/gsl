<template>
  <div class="logo">
    <router-link
      to="/"
      class="logo-main"
    >
      GSL
    </router-link>
    <div class="logo-text">
      Sistema de Gestão de Logística
    </div>
  </div>
</template>

<style>
.logo {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.logo-main {
  color: inherit;
  display: flex;
  font-family: 'Demode Capitals';
  font-size: 60px;
  gap: 5px;
  text-decoration: none;
}
</style>
