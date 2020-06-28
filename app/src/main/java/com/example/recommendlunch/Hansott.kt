package com.example.recommendlunch

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_hansott.*
import kotlinx.android.synthetic.main.activity_potato_soup.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.toast
import java.lang.Exception

class Hansott : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hansott)
        hansottBtn1.setOnClickListener {
            hansottInfo.visibility= View.INVISIBLE
            hansottMenu.visibility= View.VISIBLE
        }
        hansottBtn2.setOnClickListener {
            hansottMenu.visibility= View.INVISIBLE
            hansottInfo.visibility= View.VISIBLE
        }
        hansottCall.setOnClickListener {
            val uri = Uri.parse("tel:031-319-1144")
            val intent = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intent)

        }

        hansottLocation.setOnClickListener {
            browse("https://map.naver.com/v5/directions/-/14108199.08560494,4487159.085894054,%ED%95%9C%EC%86%A5%EB%8F%84%EC%8B%9C%EB%9D%BD%20%EC%8B%9C%ED%99%94%EC%A4%91%EC%8B%AC%EC%83%81%EA%B0%80%EC%A0%90,13376472,PLACE_POI/-/car?c=14109327.7984499,4487906.3314480,15,0,0,0,dh")

        }
        bmHanSott.setOnClickListener {
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
