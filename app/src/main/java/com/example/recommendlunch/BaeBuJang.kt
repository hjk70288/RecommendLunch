package com.example.recommendlunch

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_bae_bu_jang.*
import kotlinx.android.synthetic.main.activity_potato_soup.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.toast
import java.lang.Exception

class BaeBuJang : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bae_bu_jang)
        baeBtn1.setOnClickListener {
            baeInfo.visibility= View.INVISIBLE
            baeMenu.visibility= View.VISIBLE
        }
        baeBtn2.setOnClickListener {
            baeMenu.visibility= View.INVISIBLE
            baeInfo.visibility= View.VISIBLE
        }
        baeCall.setOnClickListener {
            val uri = Uri.parse("tel:031-431-5977")
            val intent = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intent)

        }

        baeLocation.setOnClickListener {
            browse("https://map.naver.com/v5/directions/-/14108386.313856535,4487184.360084862,%EB%B0%B0%EB%B6%80%EC%9E%A5%EC%B0%8C%EA%B0%9C%20%EC%A0%95%EC%99%95%EB%8F%99%EC%A0%90,,/-/transit?c=14107920.2055095,4487183.1950243,15,0,0,0,dh")
        }
        bmBaeBuJang.setOnClickListener {
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
