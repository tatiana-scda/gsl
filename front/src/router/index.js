import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '@/views/Home.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Quem Somos',
    component: Home,
  },
  {
    path: '/login',
    name: 'Login',
    component: () => import(/* webpackChunkName: "login" */ '@/views/Login.vue'),
  },
  {
    path: '/cadastro',
    name: 'Cadastro',
    component: () => import(/* webpackChunkName: "register" */ '@/views/Register.vue'),
  },
  {
    path: '/entrega/:id?',
    name: 'Entrega',
    component: () => import(/* webpackChunkName: "delivery" */ '@/views/Delivery.vue'),
  },
  {
    path: '/rota/:id?',
    name: 'Rota',
    component: () => import(/* webpackChunkName: "route" */ '@/views/Route.vue'),
  },
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes,
})

export default router
