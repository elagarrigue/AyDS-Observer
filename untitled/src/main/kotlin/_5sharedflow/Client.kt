package _5sharedflow

import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Client(service: Service) {

  init {
    runBlocking {
      launch {
        service.init()
      }

      service.sharedFlow.collect {
        println("Event from shared flow $it")
      }
    }
  }
}