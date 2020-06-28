package com.example.recommendlunch

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_potato_soup.*
import kotlinx.android.synthetic.main.activity_subway.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.toast
import java.lang.Exception

class Subway : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subway)
        subwayBtn1.setOnClickListener {
            subwayInfo.visibility= View.INVISIBLE
            subwayMenu.visibility= View.VISIBLE
        }
        subwayBtn2.setOnClickListener {
            subwayMenu.visibility= View.INVISIBLE
            subwayInfo.visibility= View.VISIBLE
        }
        subwayCall.setOnClickListener {
            val uri = Uri.parse("tel:031-433-0036")
            val intent = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intent)

        }

        subwayLocation.setOnClickListener {
            browse("https://map.naver.com/v5/directions/-/14108275.05002546,4487196.90618773,%EC%8D%A8%EB%B8%8C%EC%9B%A8%EC%9D%B4%20%EC%8B%9C%ED%9D%A5%EC%A0%95%EC%99%95%EC%A0%90,118073539,PLACE_POI/-/car?c=14109327.7984499,4487906.3314480,15,0,0,0,dh")

        }
        bmSubway.setOnClickListener {
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
