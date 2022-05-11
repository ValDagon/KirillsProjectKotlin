package com.irzstudio.GroceryStore.ui.activity

import android.content.Intent
import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.irzstudio.GroceryStore.R
import com.irzstudio.GroceryStore.helper.PreferencesHelper
import kotlinx.android.synthetic.main.activity_login_avtivity.*
import java.util.*


class LoginAvtivity : AppCompatActivity() {
    private val sharedPref: PreferencesHelper by lazy {
        PreferencesHelper(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_avtivity)

        loginOrSignIn()
        navigationToRegistrasi()

    }

    private fun loginOrSignIn() {
        btn_sign_in.setOnClickListener {
            when {
                et_email_login.text.isEmpty() -> {
                    et_email_login.error = null
                    et_email_login.requestFocus()
                    val toast: Toast = Toast.makeText(this, "Email пуст", Toast.LENGTH_LONG)
                    val view: View? = toast.view
                    if (view != null) {
                        view.getBackground()
                            .setColorFilter(Color.parseColor("#FF0000"), PorterDuff.Mode.SRC_IN)
                    }
                    toast.show()
                }
                et_pass_login.text.isEmpty() -> {
                    et_pass_login.error = null
                    et_pass_login.requestFocus()
                    val toast2: Toast = Toast.makeText(this, "Пароль пуст", Toast.LENGTH_LONG)
                    val view: View? = toast2.view
                    if (view != null) {
                        view.getBackground()
                            .setColorFilter(Color.parseColor("#FF0000"), PorterDuff.Mode.SRC_IN)
                    }
                    toast2.show()
                }
                else -> {
                    for(element in RegistrasiActivity.logins_list) {
                        if (Collections.frequency(RegistrasiActivity.logins_list, et_email_login.text.toString()) >= 1) {
                            if(Collections.frequency(RegistrasiActivity.pass_list, et_pass_login.text.toString()) >= 1)
                                startActivity(Intent(applicationContext, MainActivity::class.java))
                            else {
                                Toast.makeText(this, "Неверный email или пароль", Toast.LENGTH_SHORT).show()
                            }
                        }
                        else {
                            val toast3: Toast = Toast.makeText(this, "Неверный email или пароль", Toast.LENGTH_LONG)
                            val view: View? = toast3.view
                            if (view != null) {
                                view.getBackground()
                                    .setColorFilter(Color.parseColor("#FF0000"), PorterDuff.Mode.SRC_IN)
                            }
                            toast3.show()
                        }
                    }
                }
            }
        }
    }

    private fun navigationToRegistrasi() {
        tv_sign_up.setOnClickListener {
            startActivity(Intent(applicationContext, RegistrasiActivity::class.java))
            finish()
        }
    }
}





