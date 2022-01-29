export default class API {
  static #base = 'http://localhost:3000/gsl-service/v1'

  static async #fetch(url, method, body = undefined) {
    return new Promise((resolve, reject) => {
      fetch(
        `${API.#base}${url}`,
        {
          method,
          ...(body !== undefined && { body: JSON.stringify(body) }),
          headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json',
          },
        },
      ).then(
        response => resolve(response.json()),
      ).catch(
        error => reject(error),
      )
    })
  }

  static GET(url) {
    return API.#fetch(url, 'GET')
  }

  static POST(url, body) {
    return API.#fetch(url, 'POST', body)
  }
}
