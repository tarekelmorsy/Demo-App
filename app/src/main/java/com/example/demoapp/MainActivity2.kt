package com.example.demoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.material.textfield.TextInputLayout

class MainActivity2 : AppCompatActivity() {

    //create variable
    lateinit var ed_id: EditText
    lateinit var bt_next: Button
    lateinit var ot_organizations: AutoCompleteTextView
    lateinit var til_organizations: TextInputLayout
    lateinit var arrayListOrganizations: ArrayList<String>
    lateinit var arrayAdapterOrganizations: ArrayAdapter<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        ed_id = findViewById(R.id.id_ed)
        bt_next = findViewById(R.id.next)
        ot_organizations = findViewById(R.id.organizations_ot)
        til_organizations = findViewById(R.id.organizations_til)
        arrayListOrganizations = ArrayList<String>()

        var intent: Intent
        // list of Organizations
        arrayListOrganizations.add("بنك مصر ")
        arrayListOrganizations.add("البريد  المصري")
        arrayListOrganizations.add("البنك الأهلي")
        arrayListOrganizations.add("الشهر العقاري")
        arrayListOrganizations.add("الإدارة العامة للمرور")
        arrayListOrganizations.add("الغرفة التجارية")


        arrayAdapterOrganizations =
            ArrayAdapter(applicationContext, R.layout.tv_entity, arrayListOrganizations)
        ot_organizations.setAdapter(arrayAdapterOrganizations)

        ot_organizations.threshold = 1

        // chick id number and Organizations
        // If the customer have any relation between him and the organization it will open directly  BranchActivity
        bt_next.setOnClickListener {
            if (ed_id.text.toString() == "13" && ot_organizations.text.toString() == arrayListOrganizations.get(
                    0
                )
            ) {

                intent = Intent(this@MainActivity2, BranchActivity::class.java)
                intent.putExtra("organizationsName", "1")
                startActivity(intent)
            } else if (ed_id.text.toString() == "13" && ot_organizations.text.toString() == arrayListOrganizations.get(
                    1
                )
            ) {

                intent = Intent(this@MainActivity2, BranchActivity::class.java)
                intent.putExtra("organizationsName", "2")
                startActivity(intent)
            } else if (ed_id.text.toString() == "13" && ot_organizations.text.toString() == arrayListOrganizations.get(
                    3
                )
            ) {

                intent = Intent(this@MainActivity2, BranchActivity::class.java)
                intent.putExtra("organizationsName", "3")
                startActivity(intent)
            } else if (ed_id.text.toString() == "13" && ot_organizations.text.toString() == arrayListOrganizations.get(
                    5
                )
            ) {

                intent = Intent(this@MainActivity2, BranchActivity::class.java)
                intent.putExtra("organizationsName", "4")
                startActivity(intent)
            } else if (ed_id.text.toString().isEmpty()) {

                ed_id.error = "من فضلك ادخل الرقم القومي أولا"
            } else if (ot_organizations.text.toString().isEmpty()) {

                ot_organizations.error = "من فضلك ادخل اسم المؤسسة أولا"

            } else {

                Toast.makeText(this, "الرقم القومي أو المؤسسة  خاطئان", Toast.LENGTH_SHORT).show()
            }


        }


    }
}