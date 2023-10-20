package com.usj.session1.jhernandez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.usj.session1.jhernandez.databinding.ActivityDBinding

class ActivityD : AppCompatActivity() {

    private val view by lazy {
        ActivityDBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(view.root)
    }
}