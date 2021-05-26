package ayds.observer.example._4coroutinesflows

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Service {

  val intFlow: Flow<Int>
    get() = flow {
      for (i in 0..10) {
        delay(500)
        emit(i)
      }
    }
}