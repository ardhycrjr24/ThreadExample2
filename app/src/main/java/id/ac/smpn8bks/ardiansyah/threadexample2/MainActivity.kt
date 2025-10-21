package id.ac.smpn8bks.ardiansyah.threadexample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import id.ac.smpn8bks.ardiansyah.threadexample2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var exampleThread: ExampleThread? = null
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStartThread.setOnClickListener {
            startThread()
        }

        binding.btnStopThread.setOnClickListener {
            stopThread()
        }
    }

    private fun startThread() {
        exampleThread = ExampleThread(10)
        exampleThread!!.start()
        binding.tvStatus.text = "Thread dimulai..."
        Log.d(TAG, "Thread dimulai...")
    }

    private fun stopThread() {
        exampleThread?.stopThread()
        binding.tvStatus.text = "Thread dihentikan!"
        Log.d(TAG, "Thread dihentikan!")
    }
}
