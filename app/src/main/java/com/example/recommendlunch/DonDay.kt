package com.example.recommendlunch

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_don_day.*
import kotlinx.android.synthetic.main.activity_potato_soup.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.toast
import java.lang.Exception

class DonDay : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_don_day)
        dondayBtn1.setOnClickListener {
            dondayInfo.visibility= View.INVISIBLE
            dondayMenu.visibility= View.VISIBLE
        }
        dondayBtn2.setOnClickListener {
            dondayMenu.visibility= View.INVISIBLE
            dondayInfo.visibility= View.VISIBLE
        }
        dondayCall.setOnClickListener {
            val uri = Uri.parse("tel:031-431-7080")
            val intent = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intent)

        }

        dondayLocation.setOnClickListener {
            browse("https://map.naver.com/v5/directions/-/14108145.284895036,4487175.440598948,%EB%8F%88%EB%8D%B0%EC%9D%B4%20%EC%8B%9C%ED%9D%A5%EC%A0%95%EC%99%95%EC%A0%90,11781937,PLACE_POI/-/car?c=14109327.7984499,4487906.3314480,15,0,0,0,dh")

        }
        bmDonDay.setOnClickListener {
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
