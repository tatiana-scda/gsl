<template>
  <div>
    <ul class="infos">
      <li
        v-for="(value, key) in infos"
        :key="value"
      >
        <span>{{ key }}: </span>
        <span>{{ value }}</span>
      </li>
    </ul>
    <ul class="statuses">
      <li
        v-for="(title, key, index) in statuses"
        :key="key"
        class="status"
      >
        <div
          class="status-ball"
        />
        <div
          :data-title="title"
          class="status-title"
        />
        <div
          v-if="!last(index)"
          class="status-divisor"
          :style="style"
        />
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: 'GStatus',
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
  data() {
    return {
      style: {},
    }
  },
  computed: {
    sindex() {
      return Object.keys(this.statuses).indexOf(this.status)
    },
    size() {
      return Object.keys(this.statuses).length
    },
  },
  methods: {
    animate() {
      const sballs = this.$el.querySelectorAll('.status-ball')
      const stitles = this.$el.querySelectorAll('.status-title')
      const sdivisors = this.$el.querySelectorAll('.status-divisor')

      const balls = [ ...sballs ].slice(0, this.sindex + 1)
      const titles = [ ...stitles ].slice(0, this.sindex + 1)
      const divisors = [ ...sdivisors ].slice(0, this.sindex)

      const anim = (el) => el.classList.add(`${el.className}--highlight`)

      balls.forEach((ball, index) => {
        setTimeout(() => {
          anim(ball)
          anim(titles[index])
        }, 1000 * index)

        if (index < divisors.length) {
          setTimeout(() => {
            anim(divisors[index])
          }, 1000 * index + 500)
        }
      })
    },
    last(index) {
      return index === this.size - 1
    },
  },
  mounted() {
    const width = (this.$el.offsetWidth - this.size * 70 ) / ( this.size - 1)
    this.style = { width: `${width}px` }

    this.animate()
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

.statuses {
  display: flex;
  justify-content: space-between;
}

.status {
  --ball-size: 70px;
  --color-highlight: #b63b3b;
  display: flex;
  flex-direction: column;
  align-items: center;
  font-weight: 600;
  position: relative;
  width: var(--ball-size);
  white-space: nowrap;
}

.status-ball {
  background: linear-gradient(90deg, lightgray 50%, var(--color-highlight) 50%);
  background-position: 0% 0%;
  background-size: 200% 100%;
  border-radius: 50%;
  content: '';
  margin-bottom: 10px;
  display: block;
  height: var(--ball-size);
  width: var(--ball-size);
  z-index: 1;
}

.status-title {
  color: lightgray;
  position: relative;
  font-size: 14px; 
}

.status-title::before {
  content: attr(data-title);
}

.status-title::after {
  content: attr(data-title);
  position: absolute;
  color: var(--color-highlight);
  left: 0;
  width: 0;
  transition: width .7s;
  overflow: hidden;
  white-space: nowrap;
}

.status-divisor {
  background: linear-gradient(90deg, lightgray 50%, var(--color-highlight) 50%);
  background-position: 0% 0%;
  background-size: 200% 100%;
  content: '';
  display: block;
  height: 8px;
  position: absolute;
  left: calc(50% + var(--ball-size) / 2);
  top: calc(var(--ball-size) / 2 - 4px);
  width: 212px;
  z-index: 0;
}

.status-ball--highlight,
.status-divisor--highlight {
  animation: fill .5s linear 0s 1;
  background-position: -100% 0%;
}

.status-title--highlight::after {
  width: 100%;
}

@keyframes fill {
  0% { background-position: 0% 0%; }
  100% { background-position: -100% 0%; }
}
</style>
