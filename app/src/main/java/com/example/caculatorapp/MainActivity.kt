package com.example.caculatorapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.constraintlayout.widget.Group
import androidx.databinding.DataBindingUtil
import com.example.caculatorapp.databinding.MainActivityBinding
import com.example.caculatorapp.databinding.TestBinding


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.login_form)
//        var binding : TestBinding = DataBindingUtil
//            .setContentView(this, R.layout.test)




//        binding.button7.setOnClickListener {
//        if (binding.group1.visibility == View.VISIBLE) {
//            binding.group1.visibility = View.GONE
//        }
//        else {
//            binding.group1.visibility = View.VISIBLE
//             }
//        }

    }
}

