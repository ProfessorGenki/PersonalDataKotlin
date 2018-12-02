package com.lmao.gayyy.personaldatakotlin

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class ShowActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)
        val intent = intent
        val messageText = intent.getStringExtra(EXTRA_MESSAGE)
        val messageView = findViewById<View>(R.id.Name) as TextView
        messageView.text = "Name: $messageText"

        val messageText2 = intent.getStringExtra(ANOTHER_MESSAGE)
        val messageView2 = findViewById<View>(R.id.Address) as TextView
        messageView2.text = "Address: $messageText2"
    }

    fun ClickedBack(view: View) {

        val GayView = findViewById<View>(R.id.Gay) as EditText
        val GayText = GayView.text.toString()

        val intent = Intent()

        intent.putExtra(MainActivity.FAGGOT_MESSAGE, GayText)

        setResult(Activity.RESULT_OK, intent)
        finish()
    }

    companion object {

        val EXTRA_MESSAGE = "Name"
        val ANOTHER_MESSAGE = "Address"
        val FAGGOT_MESSAGE = "Gay"
    }
}