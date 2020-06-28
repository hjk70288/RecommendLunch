package com.example.recommendlunch

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_potato_soup.*
import kotlinx.android.synthetic.main.activity_rice_soup.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.toast
import java.lang.Exception

class RiceSoup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rice_soup)
        riceBtn1.setOnClickListener {
            riceInfo.visibility= View.INVISIBLE
            riceMenu.visibility= View.VISIBLE
        }
        riceBtn2.setOnClickListener {
            riceMenu.visibility= View.INVISIBLE
            riceInfo.visibility= View.VISIBLE
        }
        riceCall.setOnClickListener {
            val uri = Uri.parse("tel:031-433-7578")
            val intent = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intent)

        }

        riceLocation.setOnClickListener {
            browse("https://map.naver.com/v5/directions/-/14108082.845792647,4487021.346122488,%EB%9C%A8%EB%81%88%EC%9D%B4%EA%B0%90%EC%9E%90%ED%83%95%20%EC%8B%9C%ED%99%94%EC%9D%B4%EB%A7%88%ED%8A%B8%EC%A0%90,1392673937,PLACE_POI/-/car?c=14109327.7984499,4487906.3314480,15,0,0,0,dh")

        }
        bmRice.setOnClickListener {
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
