package com.example.recommendlunch

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_burger_king.*
import kotlinx.android.synthetic.main.activity_potato_soup.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.toast
import java.lang.Exception

class BurgerKing : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_burger_king)
        burgerBtn1.setOnClickListener {
            burgerInfo.visibility= View.INVISIBLE
            burgerMenu.visibility= View.VISIBLE
        }
        burgerBtn2.setOnClickListener {
            burgerMenu.visibility= View.INVISIBLE
            burgerInfo.visibility= View.VISIBLE
        }
        burgerCall.setOnClickListener {
            val uri = Uri.parse("tel:070-7462-6849")
            val intent = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intent)

        }

        burgerLocation.setOnClickListener {
            browse("https://map.naver.com/v5/directions/-/14108388.106100302,4487258.19467555,%EB%B2%84%EA%B1%B0%ED%82%B9%20%EC%8B%9C%ED%9D%A5%EC%A0%95%EC%99%95%EC%A0%90,1996835933,PLACE_POI/-/car?c=14109327.7984499,4487906.3314480,15,0,0,0,dh")

        }
        bmBurger.setOnClickListener {
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
