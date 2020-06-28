package com.example.recommendlunch.chose

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recommendlunch.*
import kotlinx.android.synthetic.main.activity_is_soup.*
import kotlinx.android.synthetic.main.activity_is_spicy.*

class IsSpicy : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_is_spicy)

        var code=intent.getStringExtra("code")
        if(code=="11")
        {
            spicyYes.setOnClickListener {
                val intent= Intent(this, IsExpensive::class.java)
                code+="1"
                intent.putExtra("code",code)
                startActivity(intent)
                finish()
            }
            spicyNo.setOnClickListener {
                val intent= Intent(this, IsNoodle::class.java)
                code+="2"
                intent.putExtra("code",code)
                startActivity(intent)
                finish()
            }
        }

    }
}
