export default class API {
  static #base = 'https://c44a-2804-14c-5b81-46c6-55ea-5d8e-ba83-9008.ngrok.io/gsl-service/v1'

  static async #fetch(url, method, body = undefined) {
    return new Promise((resolve, reject) => {
      fetch(
        `${API.#base}${url}`,
        {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
          method,
          ...(body !== undefined && { body: JSON.stringify(body) }),
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
