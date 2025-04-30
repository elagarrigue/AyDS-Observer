package _6stateflow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Client(service: Service) {

  init {
    runBlocking {
      launch {
        service.init()
      }

      service.stateFlow.collect {
        println("Event from state flow $it")
      }
    }
  }
}