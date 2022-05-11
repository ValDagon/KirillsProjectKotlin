package com.irzstudio.GroceryStore.ui.shop


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.irzstudio.GroceryStore.R
import com.irzstudio.GroceryStore.ui.activity.MainActivity
import kotlinx.android.synthetic.main.order_succes.*

class OrderSuccess : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.order_succes)
        btnOrderSucces()
        }

    private fun btnOrderSucces() {
        btn_back.setOnClickListener {
            startActivity(Intent(applicationContext, MainActivity()::class.java))
        }
    }
}