<template>
  <div class="error">
    <img
      src="~@/assets/images/error.png"
      class="error-image"
      alt=""
    >
    <p class="error-title">Ops!</p>
    <p class="error-message">
      Não conseguimos encontrar o que você procura
    </p>
  </div>
</template>

<script>
export default {
  name: 'GError',
}
</script>

<style>
.error-image {
  margin-top: 20px;
  width: 250px;
}

.error-title {
  font-size: 24px;
  font-weight: 600;
  margin: 10px 0 5px;
}

.error-message {
  font-size: 14px;
  line-height: 24px;
}
</style>
