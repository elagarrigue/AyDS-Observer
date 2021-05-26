package ayds.observer.example._1listener

class Service {

  interface Listener {
    fun onUpdate(i: Int)
  }

  private var listener: Listener? = null

  fun setListener(listener: Listener) {
    this.listener = listener
  }

  fun removeListener(listener: Listener) {
    if(this.listener == listener) {
      this.listener = null
    }
  }

  init {
    Thread {
      var i = 0
      while (true) {
        Thread.sleep(500)

        listener?.onUpdate(i++)
      }
    }.start()
  }

}