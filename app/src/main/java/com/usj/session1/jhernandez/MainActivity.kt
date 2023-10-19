package com.usj.session1.jhernandez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.usj.session1.jhernandez.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val view by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(view.root)
        view.tvHelloWorld.text = "Hola Samuel"
        Log.v("MTSA", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.v("MTSA", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.v("MTSA", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.v("MTSA", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.v("MTSA", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v("MTSA", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("MTSA", "onDestroy")
    }
}