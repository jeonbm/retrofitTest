package com.catchmini

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toast("안녕하세요!")
    }

    fun toast(_str:String){
        Toast.makeText(baseContext,_str,Toast.LENGTH_SHORT).show()
    }
}