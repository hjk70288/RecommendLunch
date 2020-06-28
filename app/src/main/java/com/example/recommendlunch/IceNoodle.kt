package com.example.recommendlunch

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_ice_noodle.*
import kotlinx.android.synthetic.main.activity_potato_soup.*
import org.jetbrains.anko.browse

class IceNoodle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ice_noodle)
        iceBtn1.setOnClickListener {
            iceInfo.visibility= View.INVISIBLE
            iceMenu.visibility= View.VISIBLE
        }
        iceBtn2.setOnClickListener {
            iceMenu.visibility= View.INVISIBLE
            iceInfo.visibility= View.VISIBLE
        }
        iceCall.setOnClickListener {
            val uri = Uri.parse("tel:031-497-6392")
            val intent = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intent)

        }

        iceLocation.setOnClickListener {
            browse("https://map.naver.com/v5/directions/-/14108214.926368507,4487189.134883412,%EC%9C%A1%EC%8C%88%EB%83%89%EB%A9%B4%20%EC%8B%9C%ED%9D%A5%EC%A0%90,,/-/transit?c=14107748.2221958,4487187.9723386,15,0,0,0,dh")

        }
    }
}
