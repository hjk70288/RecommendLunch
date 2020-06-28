package com.example.recommendlunch

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_maratang.*
import kotlinx.android.synthetic.main.activity_potato_soup.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.toast
import java.lang.Exception

class Maratang : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maratang)
        maraBtn1.setOnClickListener {
            maraInfo.visibility= View.INVISIBLE
            maraMenu.visibility= View.VISIBLE
        }
        maraBtn2.setOnClickListener {
            maraMenu.visibility= View.INVISIBLE
            maraInfo.visibility= View.VISIBLE
        }
        maraCall.setOnClickListener {
            val uri = Uri.parse("tel:031-499-2888")
            val intent = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intent)

        }

        maraLocation.setOnClickListener {
            browse("https://map.naver.com/v5/directions/-/14108883.355382893,4488190.812339505,%EC%B2%9C%EC%99%95%EB%A7%88%EB%9D%BC%ED%83%95,1839406562,PLACE_POI/-/car?c=14109327.7984499,4487906.3314480,15,0,0,0,dh")

        }
        bmMara.setOnClickListener {
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
