package com.example.recommendlunch

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_potato_soup.*
import kotlinx.android.synthetic.main.activity_ramen.*
import org.jetbrains.anko.browse

class Ramen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ramen)
        ramenBtn1.setOnClickListener {
            ramenInfo.visibility= View.INVISIBLE
            ramenMenu.visibility= View.VISIBLE
        }
        ramenBtn2.setOnClickListener {
            ramenMenu.visibility= View.INVISIBLE
            ramenInfo.visibility= View.VISIBLE
        }
        ramenCall.setOnClickListener {
            val uri = Uri.parse("tel:031-503-2702")
            val intent = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intent)

        }

        ramenLocation.setOnClickListener {
            browse("https://map.naver.com/v5/directions/-/14108256.476995584,4487209.51267009,%EC%9D%B4%EC%B0%8C%EB%B0%A9%20%EC%A0%95%EC%99%95%EC%A0%90,141503623,PLACE_POI/-/car?c=14109327.7984499,4487906.3314480,15,0,0,0,dh")

        }
    }
}
