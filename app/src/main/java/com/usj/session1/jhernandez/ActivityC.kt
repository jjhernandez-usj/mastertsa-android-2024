package com.usj.session1.jhernandez

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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
            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "123", null))
            startActivity(intent)
        }

        view.btnMail.setOnClickListener {

            val emailIntent = Intent(Intent.ACTION_SEND)

            emailIntent.type = "message/rfc822"

            emailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("recipient@example.com"))

            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject of the Email")

            emailIntent.putExtra(Intent.EXTRA_TEXT, "This is the email body.")

            if (emailIntent.resolveActivity(packageManager) != null) {

                startActivity(emailIntent)
            }
        }

    }
}