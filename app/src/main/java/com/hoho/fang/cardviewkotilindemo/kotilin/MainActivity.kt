package com.hoho.fang.cardviewkotilindemo.kotilin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.hoho.fang.cardviewkotilindemo.R
import com.hoho.fang.cardviewkotilindemo.legacy.CardViewActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState==null){
            supportFragmentManager.beginTransaction().add(R.id.kotlin_fragment_container,KcardFragment()).commit()
        }
    }
}
