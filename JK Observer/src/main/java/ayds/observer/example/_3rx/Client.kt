package ayds.observer.example._3rx

class Client(service: Service) {

  init {
    service.intObservable
      .take(11)
      .subscribe {
        println("Event from Rx $it")
    }
  }
}