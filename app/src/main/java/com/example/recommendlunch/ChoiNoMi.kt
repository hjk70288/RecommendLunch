package com.example.recommendlunch

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_choi_no_mi.*
import kotlinx.android.synthetic.main.activity_potato_soup.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.toast
import java.lang.Exception

class ChoiNoMi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choi_no_mi)
        choinomiBtn1.setOnClickListener {
            choinomiInfo.visibility= View.INVISIBLE
            choinomiMenu.visibility= View.VISIBLE
        }
        choinomiBtn2.setOnClickListener {
            choinomiMenu.visibility= View.INVISIBLE
            choinomiInfo.visibility= View.VISIBLE
        }
        choinomiCall.setOnClickListener {
            val uri = Uri.parse("tel:031-431-9199")
            val intent = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intent)

        }

        choinomiLocation.setOnClickListener {
            browse("https://map.naver.com/v5/directions/-/14108053.847065296,4487071.795887355,%EC%B4%88%EC%9D%B4%EB%85%B8%EB%AF%B8,1507746205,PLACE_POI/-/car")

        }
        bmChoi.setOnClickListener {
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
