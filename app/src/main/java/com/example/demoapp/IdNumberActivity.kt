package com.example.demoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class IdNumberActivity : AppCompatActivity() {
    lateinit var ed_id: EditText
    lateinit var bt_next: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_id_number)
        ed_id = findViewById(R.id.id_ed2)
        bt_next = findViewById(R.id.next2)


        // check of id number
        bt_next.setOnClickListener {
            if (ed_id.text.toString() == "28908162701697"){
                intent = Intent(this@IdNumberActivity, UserInformationActivity::class.java)
                startActivity(intent)

            } else if (ed_id.text.toString().isEmpty()) {

                ed_id.error = "من فضلك ادخل الرقم القومي أولا"
            }else {

                Toast.makeText(this, "هذا الرقم ليس له اي عمليات ", Toast.LENGTH_SHORT).show()
            }
        }


}
}