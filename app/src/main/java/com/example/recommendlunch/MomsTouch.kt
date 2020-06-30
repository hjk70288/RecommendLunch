package com.example.recommendlunch

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_moms_touch.*
import kotlinx.android.synthetic.main.activity_potato_soup.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.toast
import java.lang.Exception

class MomsTouch : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_moms_touch)
        momsBtn1.setOnClickListener {
            momsInfo.visibility= View.INVISIBLE
            momsMenu.visibility= View.VISIBLE
        }
        momsBtn2.setOnClickListener {
            momsMenu.visibility= View.INVISIBLE
            momsInfo.visibility= View.VISIBLE
        }
        momsCall.setOnClickListener {
            val uri = Uri.parse("tel:031-319-9289")
            val intent = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intent)

        }

        momsLocation.setOnClickListener {
            browse("https://map.naver.com/v5/directions/-/14108029.156402241,4486405.830875661,%EB%A7%98%EC%8A%A4%ED%84%B0%EC%B9%98%20%EC%82%B0%EA%B8%B0%EB%8C%80%EC%A0%90,37393402,PLACE_POI/-/car?c=14109327.7984499,4487906.3314480,15,0,0,0,dh")

        }
        bmMoms.setOnClickListener {
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
