package com.usj.session1.jhernandez

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.usj.session1.jhernandez.databinding.ActivityABinding

class ActivityA : AppCompatActivity() {

    private val view by lazy {
        ActivityABinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(view.root)

        view.btnAtoB.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            startActivity(intent)
        }

        view.btnAtoC.setOnClickListener {
            val intent = Intent(this, ActivityC::class.java)
            startActivity(intent)
        }

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
}