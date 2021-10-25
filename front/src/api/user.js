import API from './API'

export function login(body) {
  return API.POST('/login', body)
}

export function register(body) {
  return API.POST('/user', body)
}
