package com.trainee.appinventiv.dummylabrery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.trainee.appinventiv.mylibrary.ToastActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ToastActivity.simpleToast("hii",this)
    }
}