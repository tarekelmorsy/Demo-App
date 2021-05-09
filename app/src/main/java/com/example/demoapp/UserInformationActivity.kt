package com.example.demoapp

import android.content.DialogInterface
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class UserInformationActivity : AppCompatActivity() {
    lateinit var user_state_EditTxt: TextView
    lateinit var state: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_information)
        user_state_EditTxt = findViewById(R.id.user_state_EditTxt)
        state = findViewById(R.id.state)
        var booleanState: Boolean = true
        this.setTheme(R.style.MyAlertDialogTheme);

        user_state_EditTxt.setOnClickListener {

            if (booleanState) {

                val dialogBuilder = AlertDialog.Builder(this)


                //set title for alert dialog
                dialogBuilder.setTitle("تغير حالة الطلب")
                //set message for alert dialog
                dialogBuilder.setMessage("هل انت متاكد من انك تريد إلغاء الطلب ")
                dialogBuilder.setIcon(android.R.drawable.ic_dialog_alert)                    // if the dialog is cancelable
                    .setCancelable(false)
                    // negative button text and action
                    .setNegativeButton("إلغاء", DialogInterface.OnClickListener { dialog, id ->
                        dialog.cancel()

                    })
                    // positive button text and action
                    .setPositiveButton("تاكيد", DialogInterface.OnClickListener { dialog, id ->
                        dialog.cancel()
                        booleanState = false
                        state.text = "تم الإلغاء"
                        state.setTextColor(Color.parseColor("#ff471a"));
                    })

                // create dialog box
                val alert = dialogBuilder.create()
                // show alert dialog
                alert.show()
            }
        }
    }


}