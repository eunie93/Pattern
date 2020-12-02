package com.test.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val addStr = MessageBox("※")
        val service = PrototypeService()
        service.register("name", addStr)
        val text = service.create("name")!!
        Log.d("체크해보자", text.use("테스트")!!)
    }
}