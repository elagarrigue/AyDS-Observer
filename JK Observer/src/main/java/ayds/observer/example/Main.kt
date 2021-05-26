package ayds.observer.example

import ayds.observer.example._1listener.Client as Client1
import ayds.observer.example._1listener.Service as Service1
import ayds.observer.example._2customobserver.Client as Client2
import ayds.observer.example._2customobserver.Service as Service2
import ayds.observer.example._3rx.Client as Client3
import ayds.observer.example._3rx.Service as Service3
import ayds.observer.example._4coroutinesflows.Client as Client4
import ayds.observer.example._4coroutinesflows.Service as Service4

fun main() {

  //testListener()
  //testCustomObserver()
  //testRx()
  //testFlow()
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