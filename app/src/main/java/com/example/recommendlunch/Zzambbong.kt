package com.example.recommendlunch

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_potato_soup.*
import kotlinx.android.synthetic.main.activity_zzambbong.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.toast
import java.lang.Exception

class Zzambbong : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zzambbong)
        zzamBtn1.setOnClickListener {
            zzamInfo.visibility= View.INVISIBLE
            zzamMenu.visibility= View.VISIBLE
        }
        zzamBtn2.setOnClickListener {
            zzamMenu.visibility= View.INVISIBLE
            zzamInfo.visibility= View.VISIBLE
        }
        zzamCall.setOnClickListener {
            val uri = Uri.parse("tel:031-319-5138")
            val intent = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intent)

        }

        zzamLocation.setOnClickListener {
            browse("https://map.naver.com/v5/directions/-/14108325.555678431,4487325.336575003,%EB%8B%88%EB%BD%95%EB%82%B4%EB%BD%95%20%EC%8B%9C%ED%9D%A5%EC%A0%95%EC%99%95%EC%A0%90,35135753,PLACE_POI/-/car?c=14109327.7984499,4487906.3314480,15,0,0,0,dh")

        }
        bmZzam.setOnClickListener {
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
