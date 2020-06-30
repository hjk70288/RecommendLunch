package com.example.recommendlunch

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_potato_soup.*
import kotlinx.android.synthetic.main.activity_sheap_roast.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.toast
import java.lang.Exception

class SheapRoast : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sheap_roast)
        sheapBtn1.setOnClickListener {
            sheapInfo.visibility= View.INVISIBLE
            sheapMenu.visibility= View.VISIBLE
        }
        sheapBtn2.setOnClickListener {
            sheapMenu.visibility= View.INVISIBLE
            sheapInfo.visibility= View.VISIBLE
        }
        sheapCall.setOnClickListener {
            val uri = Uri.parse("tel:031-319-8859")
            val intent = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intent)

        }

        sheapLocation.setOnClickListener {
            browse("https://map.naver.com/v5/directions/-/14108185.3933076,4487145.391648741,%EB%AA%85%EA%B0%80%EA%BC%AC%EC%B9%98%EA%B5%AC%EC%9D%B4,,/-/transit?c=14107719.5583102,4487144.9765102,15,0,0,0,dh")

        }
        bmSheap.setOnClickListener {
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
