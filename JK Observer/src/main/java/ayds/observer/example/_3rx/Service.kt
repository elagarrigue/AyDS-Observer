package ayds.observer.example._3rx

import io.reactivex.rxjava3.core.Observable

class Service {

  val intObservable: Observable<Int> = Observable.create { emitter ->
    var i = 0
    while (!emitter.isDisposed) {
      Thread.sleep(500)
      emitter.onNext(i++)
    }
  }
}