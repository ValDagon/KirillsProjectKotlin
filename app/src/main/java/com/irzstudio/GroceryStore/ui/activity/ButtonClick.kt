package com.irzstudio.GroceryStore;

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class buttonclick : AppCompatActivity() {
    override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_cart)
    }

    fun toastMe(view: View)
    {
        Toast.makeText(this, "Заказ оформлен", Toast.LENGTH_SHORT).show()
    }
}
