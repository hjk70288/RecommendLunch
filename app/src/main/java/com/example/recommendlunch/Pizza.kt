package com.example.recommendlunch

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_pizza.*
import kotlinx.android.synthetic.main.activity_potato_soup.*
import org.jetbrains.anko.browse

class Pizza : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza)
        pizzaBtn1.setOnClickListener {
            pizzaInfo.visibility= View.INVISIBLE
            pizzaMenu.visibility= View.VISIBLE
        }
        pizzaBtn2.setOnClickListener {
            pizzaMenu.visibility= View.INVISIBLE
            pizzaInfo.visibility= View.VISIBLE
        }
        pizzaCall.setOnClickListener {
            val uri = Uri.parse("tel:031-433-1544")
            val intent = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intent)

        }

        pizzaLocation.setOnClickListener {
            browse("https://map.naver.com/v5/directions/-/14108249.880688589,4487169.377593225,%EB%AF%B8%EC%8A%A4%ED%84%B0%ED%94%BC%EC%9E%90%20%EC%A0%95%EC%99%95%EC%A0%90,11826652,PLACE_POI/-/car?c=14109327.7984499,4487906.3314480,15,0,0,0,dh")

        }
    }
}
