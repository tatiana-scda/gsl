<template>
	<ul class="infos">
		<li
			v-for="(value, key) in infos"
			:key="value"
		>
			<span>{{ key }}: </span>
			<span>{{ value }}</span>
		</li>
	</ul>
</template>

<script>
export default {
  props: {
    infos: {
      required: true,
    },
  },
}
</script>

<style>
.infos {
  font-size: 20px;
  font-weight: 600;
  line-height: 30px;
  margin-bottom: 50px;
}
</style>
