package com.example.demoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var ed_id:EditText
    lateinit var ed_organizations:EditText
    lateinit var bt_next:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ed_id= findViewById(R.id.id_ed)
        ed_organizations= findViewById(R.id.organizations_ed)
        bt_next=findViewById(R.id.next)

        bt_next.setOnClickListener {

            if (ed_id.text.toString()=="5"&& ed_organizations.text.toString()!=""){

                val intent = Intent(this@MainActivity,BranchActivity::class.java)
                startActivity(intent)
            }else if (ed_id.text.toString().isEmpty()){

                ed_id.error="من فضلك ادخل الرقم اولا"
            }



        }


    }
}