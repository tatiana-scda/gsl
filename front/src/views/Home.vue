<template>
  <div class="home">
    <div class="home-text">
      <p>
        A GSL quer te ajudar a ter melhor controle sobre sua entrega. Somos uma empresa
        focada em entregar a melhor experiência em logística. A tecnologia e a inovação
        são parte importante do nosso dia a dia, por isso nos orgulhamos da nossa plataforma,
        que busca facilitar seu acesso ao estado do seu pacote.
      </p>
      <img
        src="~@/assets/images/software.png"
        alt=""
        class="home-image"
      >
    </div>
    <div class="home-text">
      <img
        src="~@/assets/images/person-computer.png"
        alt=""
        class="home-image"
      >
      <p>
        Temos as mais completas soluções em logística, com condições de oferecê-las de forma
        integrada e customizada para cada cliente. Nos destacamos pela integração à cadeia de
        suprimentos e de distribuição dos clientes, possuímos sólido histórico de renovação
        dos contratos, além da atuação no transporte de cargas por fretamento.
      </p>
    </div>
  </div>
</template>

<script>

export default {
  name: 'Home',
}
</script>

<style>
.home-text {
  display: flex;
  align-items: center;
  gap: 30px;
  line-height: 20px;
  margin-top: 40px;
  text-align: left;
}

.home-image {
  width: 450px;
}
</style>
