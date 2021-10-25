const delivery = {
  DEBT: {
    icon: 'time',
    title: 'Aguardando pagamento',
  },
  PAID: {
    icon: 'money',
    title: 'Pagamento feito',
  },
  ON_ROUTE: {
    icon: 'truck',
    title: 'Em rota',
  },
  DELIVERED: {
    icon: 'package',
    title: 'Entregue',
  },
}

const route = {
  PROCESSING: {
    icon: 'time',
    title: 'Processando',
  },
  IN_PROGRESS: {
    icon: 'truck',
    title: 'Em progresso',
  },
  DONE: {
    icon: 'package',
    title: 'Feito',
  },
}

const status = {
  delivery,
  route,
}

export default status
