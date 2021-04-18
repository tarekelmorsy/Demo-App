package com.example.demoapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class BranchActivity : AppCompatActivity(), CustomAdapter.RecyclerViewInterface {
    val modelList: ArrayList<Model> = ArrayList<Model>()
    lateinit var organizationsName: String
    lateinit var logoBranch: ImageView

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_branch)
        logoBranch = findViewById(R.id.logo_branch)

        //getting recyclerview from xml
        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        //adding a layoutmanager
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val extras = intent.extras
        //adding some data to the list
        //If he chooses 1 equal bank masr
        // 2 : the post
        //"الشهر العقاري"3
        //4: fedcoc
        if (extras?.getString("organizationsName") == "1") {
            logoBranch.visibility = View.GONE
            organizationsName = "1"

            modelList.add(Model("فرع الزمالك", R.drawable.masr))
            modelList.add(Model("فرع دمياط", R.drawable.masr))
            modelList.add(Model("فرع المنصورة", R.drawable.masr))
            modelList.add(Model("فرع القاهرة", R.drawable.masr))
            modelList.add(Model("فرع دمياط الجديدة", R.drawable.masr))
            modelList.add(Model("فرع الدقهلية", R.drawable.masr))
            modelList.add(Model("فرع المنوفية", R.drawable.masr))
            modelList.add(Model("فرع الزمالك", R.drawable.masr))
            modelList.add(Model("فرع دمياط", R.drawable.masr))
            modelList.add(Model("فرع المنصورة", R.drawable.masr))
            modelList.add(Model("فرع القاهرة", R.drawable.masr))
            modelList.add(Model("فرع دمياط الجديدة", R.drawable.masr))
            modelList.add(Model("فرع الدقهلية", R.drawable.masr))
            modelList.add(Model("فرع المنوفية", R.drawable.masr))
            modelList.add(Model("فرع الزمالك", R.drawable.masr))
            modelList.add(Model("فرع دمياط", R.drawable.masr))
            modelList.add(Model("فرع المنصورة", R.drawable.masr))
            modelList.add(Model("فرع القاهرة", R.drawable.masr))
            modelList.add(Model("فرع دمياط الجديدة", R.drawable.masr))
            modelList.add(Model("فرع الدقهلية", R.drawable.masr))
            modelList.add(Model("فرع المنوفية", R.drawable.masr))
        } else if (extras?.getString("organizationsName") == "2") {
            logoBranch.visibility = View.GONE
            organizationsName = "2"

            modelList.add(Model("فرع الزمالك", R.drawable.post))
            modelList.add(Model("فرع دمياط", R.drawable.post))
            modelList.add(Model("فرع المنصورة", R.drawable.post))
            modelList.add(Model("فرع القاهرة", R.drawable.post))
            modelList.add(Model("فرع دمياط الجديدة", R.drawable.post))
            modelList.add(Model("فرع الزمالك", R.drawable.post))
            modelList.add(Model("فرع دمياط", R.drawable.post))
            modelList.add(Model("فرع المنصورة", R.drawable.post))
            modelList.add(Model("فرع القاهرة", R.drawable.post))
            modelList.add(Model("فرع دمياط الجديدة", R.drawable.post))
            modelList.add(Model("فرع الزمالك", R.drawable.post))
            modelList.add(Model("فرع دمياط", R.drawable.post))
            modelList.add(Model("فرع المنصورة", R.drawable.post))
            modelList.add(Model("فرع القاهرة", R.drawable.post))
            modelList.add(Model("فرع دمياط الجديدة", R.drawable.post))
            modelList.add(Model("فرع الزمالك", R.drawable.post))
            modelList.add(Model("فرع دمياط", R.drawable.post))
            modelList.add(Model("فرع المنصورة", R.drawable.post))
            modelList.add(Model("فرع القاهرة", R.drawable.post))
            modelList.add(Model("فرع دمياط الجديدة", R.drawable.post))

        } else if (extras?.getString("organizationsName") == "3") {
            organizationsName = "3"

            logoBranch.visibility = View.GONE
            modelList.add(Model("فرع الزمالك", R.drawable.ahaher))
            modelList.add(Model("فرع دمياط", R.drawable.ahaher))
            modelList.add(Model("فرع المنصورة", R.drawable.ahaher))
            modelList.add(Model("فرع القاهرة", R.drawable.ahaher))
            modelList.add(Model("فرع دمياط الجديدة", R.drawable.ahaher))
            modelList.add(Model("فرع الزمالك", R.drawable.ahaher))
            modelList.add(Model("فرع دمياط", R.drawable.ahaher))
            modelList.add(Model("فرع المنصورة", R.drawable.ahaher))
            modelList.add(Model("فرع القاهرة", R.drawable.ahaher))
            modelList.add(Model("فرع دمياط الجديدة", R.drawable.ahaher))
            modelList.add(Model("فرع الزمالك", R.drawable.ahaher))
            modelList.add(Model("فرع دمياط", R.drawable.ahaher))
            modelList.add(Model("فرع المنصورة", R.drawable.ahaher))
            modelList.add(Model("فرع القاهرة", R.drawable.ahaher))
            modelList.add(Model("فرع دمياط الجديدة", R.drawable.ahaher))
        } else if (extras?.getString("organizationsName") == "4") {
            organizationsName = "4"

            logoBranch.visibility = View.VISIBLE
            logoBranch.setImageResource(R.drawable.gh)
            modelList.add(Model("فرع دمياط", R.drawable.damieetagh))
            modelList.add(Model("فرع القاهرة", R.drawable.cairogh))
            modelList.add(Model("فرع الاسماعيلية", R.drawable.ismaeliagh))
            modelList.add(Model("فرع كفر الشيخ", R.drawable.kafergh))
            modelList.add(Model("فرع بورسعيد", R.drawable.borsagh))
            modelList.add(Model("فرع الأسكندرية", R.drawable.alexgh))
            modelList.add(Model("فرع البحيرة", R.drawable.bjeragh))
            modelList.add(Model("فرع البحر الأحمر", R.drawable.redseagh))
            modelList.add(Model("فرع الدقهلبة", R.drawable.dakgh))
        }


        //creating our adapter
        val adapter = CustomAdapter(modelList, this)

        //now adding the adapter to recyclerview
        recyclerView.adapter = adapter
    }

    override fun onItemClick(position: Int) {
        val intent = Intent(this@BranchActivity, ServiceActivity::class.java)
        intent.putExtra("branchName", modelList.get(position).name)
        intent.putExtra("organizationsName", organizationsName)

        startActivity(intent)
    }

}