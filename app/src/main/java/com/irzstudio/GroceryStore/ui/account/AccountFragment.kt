package com.irzstudio.GroceryStore.ui.account

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.irzstudio.GroceryStore.R
import com.irzstudio.GroceryStore.ui.activity.LoginAvtivity
import com.irzstudio.GroceryStore.ui.activity.RegistrasiActivity
import kotlinx.android.synthetic.main.activity_registrasi.*
import kotlinx.android.synthetic.main.fragment_account.*


class AccountFragment : Fragment(R.layout.fragment_account) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_out_logged()
    }
    private fun btn_out_logged() {
        btn_out_logged.setOnClickListener {
            startActivity(Intent(context, LoginAvtivity::class.java))
        }
    }
}