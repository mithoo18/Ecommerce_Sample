package com.example.ecommerce_sample

import android.app.Application
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.text.FieldPosition


class MainActivity : AppCompatActivity(),View.OnClickListener {
    lateinit var adapter : RecyclerAdapter
    lateinit var myListData: Array<ListData>
    lateinit var recyclerView  : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        context = this@MainActivity
        Utils.content = context


        val fashion_btn: LinearLayout = findViewById<View>(R.id.fashion_btn) as LinearLayout
        val electronic_btn: LinearLayout = findViewById<View>(R.id.electronic_btn) as LinearLayout
        val motor_btn: LinearLayout = findViewById<View>(R.id.motor_btn) as LinearLayout
        recyclerView = findViewById<View>(R.id.recyclerView) as RecyclerView
        recyclerView2 = findViewById<View>(R.id.recyclerView2) as RecyclerView


        fashion_btn.setOnClickListener(this)
        electronic_btn.setOnClickListener(this)
        motor_btn.setOnClickListener(this)



       /* myListData = arrayOf<ListData>(
            ListData("Email", R.drawable.ic_launcher_background),
            ListData("Info", R.drawable.ic_launcher_background),
            ListData("Delete", R.drawable.ic_launcher_background),
            ListData("Dialer", R.drawable.ic_launcher_background),
            ListData("Alert", R.drawable.ic_launcher_background),
            ListData("Map", R.drawable.ic_launcher_background),
            ListData("Email", R.drawable.ic_launcher_background),
            ListData("Info", R.drawable.ic_launcher_background),
            ListData("Delete", R.drawable.ic_launcher_background),
            ListData("Dialer", R.drawable.ic_launcher_background),
            ListData("Alert", R.drawable.ic_launcher_background),
            ListData("Map", R.drawable.ic_launcher_background)
        )
*/


      /*  adapter = RecyclerAdapter(myListData)*/
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this,
        LinearLayoutManager.HORIZONTAL,true)
       /* recyclerView.adapter = adapter*/
        defaultValues()
    }


    fun defaultValues(){
        myListData = arrayOf<ListData>(
            ListData("Email", R.drawable.ic_launcher_background),
            ListData("Info", R.drawable.ic_launcher_background),
            ListData("Delete", R.drawable.ic_launcher_background),
            ListData("Dialer", R.drawable.ic_launcher_background),
            ListData("Alert", R.drawable.ic_launcher_background),
            ListData("Map", R.drawable.ic_launcher_background),
            ListData("Email", R.drawable.ic_launcher_background),
            ListData("Info", R.drawable.ic_launcher_background),
            ListData("Delete", R.drawable.ic_launcher_background),
            ListData("Dialer", R.drawable.ic_launcher_background),
            ListData("Alert", R.drawable.ic_launcher_background),
            ListData("Map", R.drawable.ic_launcher_background)
        )
        adapter = RecyclerAdapter(myListData)
        recyclerView.adapter = adapter
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.fashion_btn -> {
                myListData = arrayOf<ListData>(
                    ListData("Mens_Fashion", R.drawable.ic_launcher_background),
                    ListData("Womens_Fashion", R.drawable.ic_launcher_background)
                )

                adapter = RecyclerAdapter(myListData)
                recyclerView.adapter = adapter

            }
            R.id.motor_btn -> {
                myListData = arrayOf<ListData>(
                    ListData("Cars", R.drawable.ic_launcher_background),
                    ListData("Bikes", R.drawable.ic_launcher_background)
                )

                adapter = RecyclerAdapter(myListData)
                recyclerView.adapter = adapter

            }
            R.id.electronic_btn -> {
                myListData = arrayOf<ListData>(
                    ListData("Computer", R.drawable.ic_launcher_background),
                    ListData("Phones", R.drawable.ic_launcher_background)
                )

                adapter = RecyclerAdapter(myListData)
                recyclerView.adapter = adapter

            }
            R.id.demo_btn_1 -> { defaultValues() }
            R.id.demo_btn_2 -> { defaultValues() }
            R.id.demo_btn_3 -> { defaultValues() }

            else -> { // Note the block
                defaultValues()
                Toast.makeText(this, "Feature Notadded", Toast.LENGTH_SHORT)
                    .show();
            }
        }
    }

    companion object{
        lateinit var adapter2 : RecyclerAdapterSubcategory
        lateinit var recyclerView2  : RecyclerView
        //lateinit var myListData2: Array<ListData>
        lateinit var context: Context



        fun RecyclerView2(value : String){
        var myListData2: Array<ListData>

        recyclerView2.setHasFixedSize(true)
        recyclerView2.layoutManager = LinearLayoutManager(
            Utils.content,
        LinearLayoutManager.HORIZONTAL,true)

            Log.d("checkings","runit" + value)

        if (value == ("Womens_Fashion")) {
            Log.d("checkings","run")
            myListData2 = arrayOf<ListData>(
                ListData("women_cloth1", R.drawable.ic_launcher_background),
                ListData("women_cloth2", R.drawable.ic_launcher_background),
                ListData("women_cloth3", R.drawable.ic_launcher_background)
            )
            adapter2 = RecyclerAdapterSubcategory(myListData2)
            recyclerView2.adapter = adapter2
        }
        else if( value.equals("Mens_Fashion")) {
            myListData2 = arrayOf<ListData>(
                ListData("mens_clothes1", R.drawable.ic_launcher_background),
                ListData("mens_clothes2", R.drawable.ic_launcher_background),
                ListData("mens_clothes3", R.drawable.ic_launcher_background)
            )
            adapter2 = RecyclerAdapterSubcategory(myListData2)
            recyclerView2.adapter = adapter2
        }
        else if (value.equals("Phones")) {
            myListData2 = arrayOf<ListData>(
                ListData("phone1", R.drawable.ic_launcher_background),
                ListData("phone2", R.drawable.ic_launcher_background),
                ListData("phone3", R.drawable.ic_launcher_background),
                ListData("phone4", R.drawable.ic_launcher_background)
            )
            adapter2 = RecyclerAdapterSubcategory(myListData2)
            recyclerView2.adapter = adapter2
        }

        else if (value.equals("Computer")) {
            myListData2 = arrayOf<ListData>(
                ListData("computer1", R.drawable.ic_launcher_background),
                ListData("computer2", R.drawable.ic_launcher_background),
                ListData("computer3", R.drawable.ic_launcher_background)
            )
            adapter2 = RecyclerAdapterSubcategory(myListData2)
            recyclerView2.adapter = adapter2
        }
        else if(value.equals("Bikes")) {
            myListData2 = arrayOf<ListData>(
                ListData("Bike1", R.drawable.ic_launcher_background),
                ListData("Bike2", R.drawable.ic_launcher_background),
                ListData("Bike3", R.drawable.ic_launcher_background)
            )
            adapter2 = RecyclerAdapterSubcategory(myListData2)
            recyclerView2.adapter = adapter2
        }
        else if(value.equals("Cars")) {
            myListData2 = arrayOf<ListData>(
                ListData("Car1", R.drawable.ic_launcher_background),
                ListData("Car2", R.drawable.ic_launcher_background),
                ListData("Car3", R.drawable.ic_launcher_background),
                ListData("Car4", R.drawable.ic_launcher_background)
            )
            adapter2 = RecyclerAdapterSubcategory(myListData2)
            recyclerView2.adapter = adapter2
        }
/*        else{
            myListData2 = arrayOf<ListData>(
                ListData("demo1", R.drawable.ic_launcher_background),
                ListData("demo2", R.drawable.ic_launcher_background),
                ListData("demo3", R.drawable.ic_launcher_background),
                ListData("demo4", R.drawable.ic_launcher_background)
            )*/
        }


    }


}