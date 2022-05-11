package com.irzstudio.GroceryStore.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.irzstudio.GroceryStore.R
import com.irzstudio.GroceryStore.utill.lists
import kotlinx.android.synthetic.main.activity_login_avtivity.*
import kotlinx.android.synthetic.main.activity_registrasi.*
import com.irzstudio.GroceryStore.utill.*
import java.io.File

class RegistrasiActivity : AppCompatActivity() {
    companion object {
        var logins_list = mutableListOf("myemail@gmail.com")
        var pass_list = mutableListOf("12345")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)

        BtnGetStarted()
        navigationToLogin()
    }

    private fun BtnGetStarted() {
        btn_get_started.setOnClickListener {
            logins_list.add(et_email_reg.text.toString())
            pass_list.add(et_pass_reg.text.toString())
            startActivity(Intent(applicationContext, LoginAvtivity::class.java))
        }
    }
    private fun navigationToLogin() {
        tv_sign_in.setOnClickListener {
            startActivity(Intent(applicationContext, LoginAvtivity::class.java))
        }
    }
}