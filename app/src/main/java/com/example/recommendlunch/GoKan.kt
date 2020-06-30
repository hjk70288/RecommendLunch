package com.example.recommendlunch

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_go_kan.*
import kotlinx.android.synthetic.main.activity_potato_soup.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.toast
import java.lang.Exception

class GoKan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_go_kan)
        gokanBtn1.setOnClickListener {
            gokanInfo.visibility= View.INVISIBLE
            gokanMenu.visibility= View.VISIBLE
        }
        gokanBtn2.setOnClickListener {
            gokanMenu.visibility= View.INVISIBLE
            gokanInfo.visibility= View.VISIBLE
        }
        gokanCall.setOnClickListener {
            val uri = Uri.parse("tel:031-432-6456")
            val intent = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intent)

        }

        gokanLocation.setOnClickListener {
            browse("https://map.naver.com/v5/directions/-/14108243.446422022,4487284.155225666,%EA%B3%A0%EC%B9%B8%20%EC%A0%95%EC%99%95%EC%A0%90,1407677177,PLACE_POI/-/car?c=14109327.7984499,4487906.3314480,15,0,0,0,dh")

        }
        bmGoKan.setOnClickListener {
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
