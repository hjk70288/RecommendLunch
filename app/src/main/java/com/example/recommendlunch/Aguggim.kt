package com.example.recommendlunch

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_aguggim.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.toast


class Aguggim : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aguggim)
        aguggimBtn1.setOnClickListener {
            aguggimInfo.visibility= View.INVISIBLE
            aguggimMenu.visibility= View.VISIBLE
        }
        aguggimBtn2.setOnClickListener {
            aguggimMenu.visibility= View.INVISIBLE
            aguggimInfo.visibility= View.VISIBLE
        }
        aguggimCall.setOnClickListener {
            val uri = Uri.parse("tel:031-434-3125")
            val intent = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intent)

        }

        aguggimLocation.setOnClickListener {
            browse("https://map.naver.com/v5/directions/-/14108344.99206155,4487292.850764075,%EB%AA%85%EB%AC%BC%EC%AD%88%EA%BE%B8%EB%AF%B8%EC%95%84%EA%B5%AC%EC%B0%9C%20%EC%A0%95%EC%99%95%EB%B3%B8%EC%A0%90,,/-/transit?c=14107879.5983382,4487293.0732525,15,0,0,0,dh")

        }
        bmAgu.setOnClickListener {
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
