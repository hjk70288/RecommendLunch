package com.example.recommendlunch.chose
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recommendlunch.*
import kotlinx.android.synthetic.main.activity_is_close.*
import kotlinx.android.synthetic.main.activity_is_hamburger.*

class IsHamburger : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_is_hamburger)

        var code=intent.getStringExtra("code")
        if(code=="311")
        {
            hamburgerYes.setOnClickListener {
                val intent= Intent(this, MomsTouch::class.java)
                code+="1"
                startActivity(intent)
                finish()
            }
            hamburgerNO.setOnClickListener {
                val intent= Intent(this, TosPia::class.java)
                code+="2"
                startActivity(intent)
                finish()
            }
        }
        else if(code=="312")
        {
            hamburgerYes.setOnClickListener {
                val intent= Intent(this, BurgerKing::class.java)
                code+="1"
                startActivity(intent)
                finish()
            }
            hamburgerNO.setOnClickListener {
                val intent= Intent(this, Subway::class.java)
                code+="2"
                startActivity(intent)
                finish()
            }
        }
    }
}
