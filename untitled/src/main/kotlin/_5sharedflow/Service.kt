package _5sharedflow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.flow


class Service {

  private val mutableSharedFlow = MutableSharedFlow<Int>()
  val sharedFlow: Flow<Int> = mutableSharedFlow

  suspend fun init() {
    for (i in 0..10) {
      delay(500)
      mutableSharedFlow.emit(i)
    }
  }
}