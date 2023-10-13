package com.usyssoft.deeplink

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.usyssoft.deeplink.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b : ActivityMainBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        val getDeepLink: Uri? = intent.data
        b.apply {
            if (getDeepLink != null && Intent.ACTION_VIEW == intent.action) {
                val path: String? = getDeepLink.path
                val field1Value: String? = getDeepLink.getQueryParameter("field1")
                val field2Value: String? = getDeepLink.getQueryParameter("field2")

                if (!path.isNullOrEmpty() && !field1Value.isNullOrEmpty() && !field2Value.isNullOrEmpty()) {
                    field1TextView.text = "Field1: $field1Value"
                    field2TextView.text = "Field2: $field2Value"
                }
            }
        }

    }
}