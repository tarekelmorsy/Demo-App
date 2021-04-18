package com.example.demoapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class ServiceActivity : AppCompatActivity(), CustomAdapter.RecyclerViewInterface {
    lateinit var service_name: TextView
    val modelList: ArrayList<Model> = ArrayList<Model>()

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)
        service_name = findViewById(R.id.service_name)

        val extras = intent.extras
        if (extras != null) {
            val value = extras.getString("branchName")
            service_name.setText("خدمات " + value)
        }

        //getting recyclerview from xml
        val recyclerView = findViewById(R.id.serviceRecyclerView) as RecyclerView

        //adding a layoutmanager
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        //adding some data to the list
        //If he chooses 1 equal bank masr Service
        // 2 : the post Service
        //"الشهر العقاري"3 Service
        //4: fedcoc Service
        if (extras?.getString("organizationsName") == "1") {

            modelList.add(Model("  تغير العملة", R.drawable.icon_bank3))
            modelList.add(Model("معاملات الفيزا", R.drawable.icon_bank2))
            modelList.add(Model(" شيكات ", R.drawable.icon_bank4))
            modelList.add(Model(" سحب ", R.drawable.iconbank5))
            modelList.add(Model("إيداع ", R.mipmap.ic_bank1_foreground))
            modelList.add(Model("قرض", R.drawable.icon_bank6))
            modelList.add(Model("حوالة ", R.drawable.icon_bank7))
        } else if (extras?.getString("organizationsName") == "2") {
            modelList.add(Model("إرسال حوالة", R.drawable.hewala))
            modelList.add(Model("إستقبال حوالة", R.drawable.hewala))
            modelList.add(Model("إيداع ", R.mipmap.ic_bank1_foreground))
            modelList.add(Model("صرف معاش", R.drawable.iconbank5))
            modelList.add(Model(" سحب  ", R.drawable.iconbank5))

        } else if (extras?.getString("organizationsName") == "4") {
            modelList.add(Model("قيد سجل تجاري ", R.drawable.tglogo))
            modelList.add(Model("مستخرج سجل تجاري ", R.drawable.tg2logo))
            modelList.add(Model(" إصافة نشاط", R.drawable.tglogo))

        } else if (extras?.getString("organizationsName") == "3") {
            modelList.add(Model("اثبات تاريخ ", R.drawable.tglogo))
            modelList.add(Model("عمل توكيل", R.drawable.signaturelogo))
            modelList.add(Model(" توثيق", R.drawable.signaturelogo))

        }


        //creating our adapter
        val adapter = CustomAdapter(modelList, this)

        //now adding the adapter to recyclerview
        recyclerView.adapter = adapter
    }

    override fun onItemClick(position: Int) {
        val intent = Intent(this@ServiceActivity, RankActivity::class.java)
        intent.putExtra("ServiceName", modelList.get(position).name)
        startActivity(intent)
    }

}
