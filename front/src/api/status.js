import API from './API'

export function delivery(id) {
  return API.GET(`/delivery/${id}`)
}

export function route(id) {
  return API.GET(`/route/${id}`)
}
