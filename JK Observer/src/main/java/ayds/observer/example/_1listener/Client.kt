package ayds.observer.example._1listener

class Client(service: Service) {

  init {
    service.setListener(object : Service.Listener {
      override fun onUpdate(i: Int) {
        println("Event from listener $i")

        if (i == 10) service.removeListener(this)
      }
    })
  }
}