package ayds.observer.example._4coroutinesflows

import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking

class Client(service: Service) {

  init {
    runBlocking {
      service.intFlow.collect {
        println("Event from flow $it")
      }
    }
  }
}