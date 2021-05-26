package ayds.observer.example._2customobserver

import ayds.observer.Observable
import ayds.observer.Subject

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