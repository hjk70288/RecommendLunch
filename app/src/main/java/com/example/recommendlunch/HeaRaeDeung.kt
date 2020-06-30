package com.example.recommendlunch

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_hea_rae_deung.*
import kotlinx.android.synthetic.main.activity_potato_soup.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.toast
import java.lang.Exception

class HeaRaeDeung : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hea_rae_deung)
        hearaeBtn1.setOnClickListener {
            hearaeInfo.visibility= View.INVISIBLE
            hearaeMenu.visibility= View.VISIBLE
        }
        hearaeBtn2.setOnClickListener {
            hearaeMenu.visibility= View.INVISIBLE
            hearaeInfo.visibility= View.VISIBLE
        }
        hearaeCall.setOnClickListener {
            val uri = Uri.parse("tel:031-497-4572")
            val intent = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intent)

        }

        hearaeLocation.setOnClickListener {
            browse("https://map.naver.com/v5/directions/-/14108330.475999951,4487211.664680594,%ED%9D%AC%EB%9E%98%EB%93%B1%EC%A4%91%ED%99%94%EC%9A%94%EB%A6%AC,,/-/transit?c=14107865.2663954,4487211.8589099,15,0,0,0,dh")

        }
        bmHeaRae.setOnClickListener {
            try {
                val intent = packageManager.getLaunchIntentForPackage("com.sampleapp")
                startActivity(intent)
            }
            catch (e: Exception)
            {
                toast("어플이 설치되지 않았습니다")
                browse("market://details?id=" + "com.sampleapp")
            }
        }
    }
}
