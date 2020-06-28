package com.example.recommendlunch

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_potato_soup.*
import kotlinx.android.synthetic.main.activity_tos_pia.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.toast
import java.lang.Exception

class TosPia : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tos_pia)
        tospiaBtn1.setOnClickListener {
            tospiaInfo.visibility= View.INVISIBLE
            tospiaMenu.visibility= View.VISIBLE
        }
        tospiaBtn2.setOnClickListener {
            tospiaMenu.visibility= View.INVISIBLE
            tospiaInfo.visibility= View.VISIBLE
        }
        tospiaCall.setOnClickListener {
            val uri = Uri.parse("tel:031-496-8595")
            val intent = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intent)

        }

        tospiaLocation.setOnClickListener {
            browse("https://map.naver.com/v5/directions/-/14107909.36549823,4486609.747814125,%EA%B9%8C%ED%8E%98%ED%86%A0%EC%8A%A4%ED%94%BC%EC%95%84,,/-/transit?c=14107442.4740827,4486609.9173122,15,0,0,0,dh")

        }
        bmTospia.setOnClickListener {
            try {
                val intent = packageManager.getLaunchIntentForPackage("com.sampleapp")
                intent!!.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                startActivity(intent)
            }
            catch (e: Exception)
            {
                toast("어플이 설치되지 않았습니다")
            }
        }
    }
}
