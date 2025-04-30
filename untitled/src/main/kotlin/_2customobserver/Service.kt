package _2customobserver

import observer.Observable
import observer.Subject

class Service {

  private val onIntSubject = Subject<Int>()

  val intObservable: Observable<Int> = onIntSubject

  init {
    Thread {
      var i = 0
      while (true) {
        Thread.sleep(500)

        onIntSubject.notify(i++)
      }
    }.start()
  }

}