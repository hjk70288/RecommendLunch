package com.example.recommendlunch.chose
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recommendlunch.*
import kotlinx.android.synthetic.main.activity_is_cold.*
import kotlinx.android.synthetic.main.activity_is_expensive.*

class IsCold : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_is_cold)

        var code=intent.getStringExtra("code")
        if(code=="1121")
        {
            coldYes.setOnClickListener {
                code+="1"
                val intent= Intent(this, IceNoodle::class.java)
                startActivity(intent)
                finish()
            }
            coldNo.setOnClickListener {
                code+="2"
                val intent= Intent(this, KnifeNoodle::class.java)
                startActivity(intent)
                finish()
            }
        }

    }
}
