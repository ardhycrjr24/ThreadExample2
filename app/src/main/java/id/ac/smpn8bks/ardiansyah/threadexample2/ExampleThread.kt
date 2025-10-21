package id.ac.smpn8bks.ardiansyah.threadexample2

import android.util.Log

class ExampleThread(private val seconds: Int) : Thread() {

    private val TAG = "ExampleThread"
    @Volatile private var running = true

    override fun run() {
        for (i in 1..seconds) {
            if (!running) {
                Log.d(TAG, "Thread dihentikan di step $i")
                return
            }

            Log.d(TAG, "Thread berjalan: $i")
            try {
                sleep(1000)
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
        }
        Log.d(TAG, "Thread selesai sepenuhnya!")
    }

    fun stopThread() {
        running = false
    }
}
