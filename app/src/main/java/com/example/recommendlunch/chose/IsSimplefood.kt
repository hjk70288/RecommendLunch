package com.example.recommendlunch.chose

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recommendlunch.R
import com.example.recommendlunch.RiceSoup
import kotlinx.android.synthetic.main.activity_is_noodle.*
import kotlinx.android.synthetic.main.activity_is_simplefood.*

class IsSimplefood : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_is_simplefood)

        var code=intent.getStringExtra("code")
        if(code=="3")
        {
            simpleYes.setOnClickListener {
                val intent= Intent(this, IsClose::class.java)
                code+="1"
                intent.putExtra("code",code)
                startActivity(intent)
                finish()
            }
            simpleNO.setOnClickListener {
                code+="2"
                val intent= Intent(this, IsExpensive::class.java)
                intent.putExtra("code",code)
                startActivity(intent)
                finish()
            }
        }
    }
}
