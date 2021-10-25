<template>
  <div
    class="input"
    :class="{
      'input--focus': focus,
    }"
  >
    <label
      class="input-label"
      :class="{
        'input-label--big': !focus && !value,
        'input-label--focus': focus,
      }"
    >
      {{ label }}
    </label>
    <input
      v-bind="$attrs"
      v-on="$listeners"
      :value="value"
      @blur="focus = false"
      @focus="focus = true"
      @input="$emit('model', $event.target.value)"
      class="input-element"
    >
  </div>
</template>

<script>
export default {
  name: 'GInput',
  model: {
    event: 'model',
  },
  props: {
    label: {
      required: true,
    },
    value: {
      required: true,
    },
  },
  data() {
    return {
      focus: false,
    }
  },
}
</script>

<style>
.input {
  display: flex;
  flex-direction: column;
  border: 1px solid grey;
  border-radius: 5px;
  padding: 11px 5px 0;
  position: relative;
  transition: .5s all;
  width: 300px;
}

.input--focus {
  border-color: black;
}

.input-label {
  color: grey;
  display: inline-block;
  font-size: 11px;
  position: absolute;
  text-align: left;
  top: 4px;
  transition: .5s all;
  width: 60px;
  z-index: 0;
}

.input-label--big {
  font-size: 16px;
  top: 15px;
}

.input-label--focus {
  color: black;
}

.input-element {
  background-color: transparent;
  border-color: transparent;
  padding: 5px 0;
  z-index: 1;
}

.input-element:focus {
  outline: none;
}
</style>
