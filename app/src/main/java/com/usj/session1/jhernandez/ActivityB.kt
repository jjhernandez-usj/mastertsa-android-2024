package com.usj.session1.jhernandez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.usj.session1.jhernandez.databinding.ActivityBBinding

class ActivityB : AppCompatActivity() {

    private val view by lazy {
        ActivityBBinding.inflate(layoutInflater)
    }

    private val launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        if (it.resultCode == RESULT_OK) {
            view.txtResult.text = it.data?.getStringExtra(RESULT_KEY)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(view.root)

        view.btnBtoA.setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
            startActivity(intent)
        }

        view.btnBtoD.setOnClickListener {
            val intent = Intent(this, ActivityD::class.java)
            launcher.launch(intent)
        }
    }
}