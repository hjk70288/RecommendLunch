package com.example.recommendlunch

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_don_don_jung.*
import kotlinx.android.synthetic.main.activity_potato_soup.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.toast
import java.lang.Exception

class DonDonJung : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_don_don_jung)
        dondonBtn1.setOnClickListener {
            dondonInfo.visibility= View.INVISIBLE
            dondonMenu.visibility= View.VISIBLE
        }
        dondonBtn2.setOnClickListener {
            dondonMenu.visibility= View.INVISIBLE
            dondonInfo.visibility= View.VISIBLE
        }
        dondonCall.setOnClickListener {
            val uri = Uri.parse("tel:031-433-0525")
            val intent = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intent)

        }

        dondonLocation.setOnClickListener {
            browse("https://map.naver.com/v5/directions/-/14108320.212342877,4487326.078708928,%EB%8F%88%EB%8F%88%EC%A0%95%20%EC%A0%95%EC%99%95%EC%A0%90,38257901,PLACE_POI/-/car?c=14109327.7984499,4487906.3314480,15,0,0,0,dh")

        }
        bmDonDon.setOnClickListener {
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
