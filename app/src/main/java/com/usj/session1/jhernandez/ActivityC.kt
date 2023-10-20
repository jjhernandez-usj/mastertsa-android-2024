package com.usj.session1.jhernandez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.usj.session1.jhernandez.databinding.ActivityCBinding


class ActivityC : AppCompatActivity() {

    private val view by lazy {
        ActivityCBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(view.root)

        view.btnCtoA.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }

        view.btnCall.setOnClickListener {
            val intent = Intent()
            intent.action=Intent.ACTION_DIAL
            intent.putExtra(Intent.EXTRA_PHONE_NUMBER, 123)
            startActivity(intent)
        }
    }
}