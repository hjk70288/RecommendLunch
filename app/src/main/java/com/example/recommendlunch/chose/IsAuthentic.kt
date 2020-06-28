package com.example.recommendlunch.chose
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recommendlunch.ChoiNoMi
import com.example.recommendlunch.R
import com.example.recommendlunch.Ramen
import com.example.recommendlunch.RiceSoup
import kotlinx.android.synthetic.main.activity_is_authentic.*
import kotlinx.android.synthetic.main.activity_is_noodle.*

class IsAuthentic : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_is_authentic)

        var code=intent.getStringExtra("code")
        if(code=="41")
        {
            authenticYes.setOnClickListener {
                val intent= Intent(this, Ramen::class.java)
                code+="1"
                startActivity(intent)
                finish()
            }
            authenticNo.setOnClickListener {
                code+="2"
                val intent= Intent(this, ChoiNoMi::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}
