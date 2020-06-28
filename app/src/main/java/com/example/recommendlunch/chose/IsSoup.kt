package com.example.recommendlunch.chose

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recommendlunch.*
import kotlinx.android.synthetic.main.activity_is_soup.*

class IsSoup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_is_soup)

        var code=intent.getStringExtra("code")
        if(code=="1")
        {
            soupYes.setOnClickListener {
                val intent= Intent(this, IsSpicy::class.java)
                code+="1"
                intent.putExtra("code",code)
                startActivity(intent)
                finish()

            }
            soupNO.setOnClickListener {
                val intent= Intent(this, IsExpensive::class.java)
                code+="2"
                intent.putExtra("code",code)
                startActivity(intent)
                finish()

            }
        }
        else if(code=="22")
        {
            soupYes.setOnClickListener {
                val intent= Intent(this, Maratang::class.java)
                code+="1"
                startActivity(intent)
                finish()

            }
            soupNO.setOnClickListener {
                val intent= Intent(this, SheapRoast::class.java)
                code+="2"
                startActivity(intent)
                finish()

            }
        }

    }
}
