package com.lmao.gayyy.personaldatakotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState != null) {

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, intent: Intent?) {
        super.onActivityResult(requestCode, resultCode, intent)
        //Intent intent = getIntent();
        val messageText3 = intent!!.getStringExtra(FAGGOT_MESSAGE)
        val messageView3 = findViewById<View>(R.id.Gay) as TextView
        messageView3.text = "On the ShowActivity i asked if you were gay and you said: $messageText3"
    }

    //call ClickedSend when you click the send button
    fun ClickedSend(view: View) {

        val NameView = findViewById<View>(R.id.Name) as EditText
        val NameText = NameView.text.toString()

        val AddressView = findViewById<View>(R.id.Address) as EditText
        val AddressText = AddressView.text.toString()

        val intent = Intent(this, ShowActivity::class.java)

        intent.putExtra(ShowActivity.EXTRA_MESSAGE, NameText)

        intent.putExtra(ShowActivity.ANOTHER_MESSAGE, AddressText)
        startActivityForResult(intent, 1)
    }

    companion object {

        val FAGGOT_MESSAGE = "Gay"
    }
}
