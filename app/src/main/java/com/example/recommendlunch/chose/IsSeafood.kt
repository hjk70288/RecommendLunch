package com.example.recommendlunch.chose

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recommendlunch.Aguggim
import com.example.recommendlunch.DonDay
import com.example.recommendlunch.R
import kotlinx.android.synthetic.main.activity_is_expensive.*
import kotlinx.android.synthetic.main.activity_is_seafood.*

class IsSeafood : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_is_seafood)

        var code=intent.getStringExtra("code")
        if(code=="121")
        {
            seafoodYes.setOnClickListener {
                code+="1"
                val intent= Intent(this, Aguggim::class.java)
                startActivity(intent)
                finish()
            }
            seafoodNo.setOnClickListener {
                code+="2"
                val intent= Intent(this, DonDay::class.java)
                startActivity(intent)
                finish()

            }
        }
    }
}
