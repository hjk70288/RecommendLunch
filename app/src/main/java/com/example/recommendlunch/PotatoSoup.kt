package com.example.recommendlunch

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_potato_soup.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.makeCall

class PotatoSoup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_potato_soup)
        potatoBtn1.setOnClickListener {
            potatoInfo.visibility=View.INVISIBLE
            potatoMenu.visibility= View.VISIBLE
        }
        potatoBtn2.setOnClickListener {
            potatoMenu.visibility=View.INVISIBLE
            potatoInfo.visibility= View.VISIBLE
        }
        potatoCall.setOnClickListener {
            val uri = Uri.parse("tel:031-8041-0787")
            val intent = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intent)

        }

        potatoLocation.setOnClickListener {
            browse("https://map.naver.com/v5/directions/-/14108308.768699218,4487051.198687945,%EB%9D%BC%EB%9D%BC%EA%B0%90%EC%9E%90%ED%83%95%EB%B3%B8%EC%A0%90,32085009,PLACE_POI/-/car?c=14108292.8360224,4486957.4669252,15,0,0,0,dh")
        }
    }
}
