package id.ac.smpn8bks.ardiansyah.threadexample2

import android.util.Log

class ExampleThread(private var seconds: Int) : Thread() {
    private val TAG = "MainActivity"

    override fun run() {
        // Loop berjalan dari 1 hingga (seconds - 1)
        for (i in 1 until seconds) {
            Log.d(TAG, "startThread: $i")
            try {
                // Memberi jeda eksekusi selama 1 detik (1000 milidetik)
                Thread.sleep(1000)
            } catch (ie: InterruptedException) {
                // Menangani jika thread diinterupsi, dan mencetak stack trace
                ie.printStackTrace()
            }
        }
    }
}