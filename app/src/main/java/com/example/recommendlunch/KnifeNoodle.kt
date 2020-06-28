package com.example.recommendlunch

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_knife_noodle.*
import kotlinx.android.synthetic.main.activity_potato_soup.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.toast
import java.lang.Exception

class KnifeNoodle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_knife_noodle)
        knifeBtn1.setOnClickListener {
            knifeInfo.visibility= View.INVISIBLE
            knifeMenu.visibility= View.VISIBLE
        }
        knifeBtn2.setOnClickListener {
            knifeMenu.visibility= View.INVISIBLE
            knifeInfo.visibility= View.VISIBLE
        }
        knifeCall.setOnClickListener {
            val uri = Uri.parse("tel:031-431-2113")
            val intent = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intent)
        }

        knifeLocation.setOnClickListener {
            browse("https://map.naver.com/v5/directions/-/14108352.405939639,4487303.520661598,%EB%AA%85%EB%8F%99%EC%B9%BC%EA%B5%AD%EC%88%98,,/-/transit?c=14107886.7643096,4487302.6278810,15,0,0,0,dh")
        }
        bmKnife.setOnClickListener {
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
