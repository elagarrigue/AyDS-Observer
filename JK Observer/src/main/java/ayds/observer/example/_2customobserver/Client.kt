package ayds.observer.example._2customobserver

import ayds.observer.Observer

class Client(service: Service) {

  init {
    service.intObservable.subscribe(object : Observer<Int> {
      override fun update(value: Int) {
        println("Event from custom observable $value")

        if (value == 10) service.intObservable.unSubscribe(this)
      }
    })
  }
}