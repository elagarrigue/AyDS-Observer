
import _1listener.Client as Client1
import _1listener.Service as Service1
import _2customobserver.Client as Client2
import _2customobserver.Service as Service2
import _3rx.Client as Client3
import _3rx.Service as Service3
import _4coroutinesflows.Client as Client4
import _4coroutinesflows.Service as Service4
import _5sharedflow.Client as Client5
import _5sharedflow.Service as Service5
import _6stateflow.Client as Client6
import _6stateflow.Service as Service6

fun main() {

  //testListener()
  //testCustomObserver()
  //testRx()
  //testFlow()
  //testSharedFlow()
  testStateFlow()
}
fun testListener() {
  Client1(Service1())
}

fun testCustomObserver() {
  Client2(Service2())
}

fun testRx() {
  Client3(Service3())
}

fun testFlow() {
  Client4(Service4())
}

fun testSharedFlow() {
  Client5(Service5())
}

fun testStateFlow() {
  Client6(Service6())
}