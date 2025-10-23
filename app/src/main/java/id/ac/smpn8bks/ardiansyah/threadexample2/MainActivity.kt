package id.ac.smpn8bks.ardiansyah.threadexample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import id.ac.smpn8bks.ardiansyah.threadexample2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStartThread.setOnClickListener {
            startThread()
        }
    }

    private fun startThread() {
        val exampleThread = ExampleThread(10)
        exampleThread.start()
    }
}
