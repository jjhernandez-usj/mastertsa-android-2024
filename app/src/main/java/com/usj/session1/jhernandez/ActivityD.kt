package com.usj.session1.jhernandez

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.usj.session1.jhernandez.databinding.ActivityDBinding

const val RESULT_KEY = "result"
class ActivityD : AppCompatActivity() {

    private val view by lazy {
        ActivityDBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(view.root)

        view.btnDforResult.setOnClickListener {
            intent.putExtra(RESULT_KEY, view.etInput.text.toString())
            setResult(RESULT_OK, intent)
            finish()
        }


    }


}