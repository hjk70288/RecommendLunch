package com.example.recommendlunch

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_fish_roast.*
import kotlinx.android.synthetic.main.activity_potato_soup.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.toast
import java.lang.Exception

class FishRoast : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fish_roast)
        fishBtn1.setOnClickListener {
            fishInfo.visibility= View.INVISIBLE
            fishMenu.visibility= View.VISIBLE
        }
        fishBtn2.setOnClickListener {
            fishMenu.visibility= View.INVISIBLE
            fishInfo.visibility= View.VISIBLE
        }
        fishCall.setOnClickListener {
            val uri = Uri.parse("tel:031-319-0415")
            val intent = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intent)

        }

        fishLocation.setOnClickListener {
            browse("https://map.naver.com/v5/directions/-/14108089.95910811,4487272.295138994,%EA%B3%A0%EA%B0%80%EB%84%A4%EB%A7%9B%EC%A7%91,37318000,PLACE_POI/-/car?c=14109327.7984499,4487906.3314480,15,0,0,0,dh")

        }
        bmFish.setOnClickListener {
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
