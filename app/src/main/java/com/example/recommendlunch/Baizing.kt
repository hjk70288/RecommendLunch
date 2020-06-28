package com.example.recommendlunch

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_baizing.*
import kotlinx.android.synthetic.main.activity_potato_soup.*
import org.jetbrains.anko.browse

class Baizing : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baizing)
        baizingBtn1.setOnClickListener {
            baizingInfo.visibility= View.INVISIBLE
            baizingMenu.visibility= View.VISIBLE
        }
        baizingBtn2.setOnClickListener {
            baizingMenu.visibility= View.INVISIBLE
            baizingInfo.visibility= View.VISIBLE
        }
        baizingCall.setOnClickListener {
            val uri = Uri.parse("tel:031-379-4289")
            val intent = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intent)

        }

        baizingLocation.setOnClickListener {
            browse("https://map.naver.com/v5/directions/-/14108053.546502676,4487047.01204256,%EB%8D%94%EB%B2%A0%EC%9D%B4%EC%A7%95,144877088,PLACE_POI/-/car?c=14109327.7984499,4487906.3314480,15,0,0,0,dh")

        }
    }
}
