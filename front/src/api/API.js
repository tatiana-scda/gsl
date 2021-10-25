export default class API {
  static #base = 'https://6174283b08834f0017c708e9.mockapi.io'

  static async #fetch(url, method, body = undefined) {
    const response = await fetch(
      `${API.#base}${url}`,
      {
        'Content-Type': 'application/json',
        'Accept': 'application/json',
        method,
        ...(body !== undefined && { body: JSON.stringify(body) }),
      },
    )
    return await response.json()
  }

  static GET(url) {
    return API.#fetch(url, 'GET')
  }

  static POST(url, body) {
    return API.#fetch(url, 'POST', body)
  }
}
