package _6stateflow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flow


class Service {

  private val mutableStateFlow = MutableStateFlow(-1)
  val stateFlow: Flow<Int> = mutableStateFlow

  suspend fun init() {
    for (i in 0..10) {
      delay(500)
      mutableStateFlow.emit(i)
    }
  }
}