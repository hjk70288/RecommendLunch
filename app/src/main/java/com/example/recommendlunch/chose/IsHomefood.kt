package com.example.recommendlunch.chose
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recommendlunch.*
import kotlinx.android.synthetic.main.activity_is_expensive.*
import kotlinx.android.synthetic.main.activity_is_homefood.*

class IsHomefood : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_is_homefood)

        var code=intent.getStringExtra("code")
        if(code=="122")
        {
            homefoodYes.setOnClickListener {
                code+="1"
                val intent= Intent(this, FishRoast::class.java)
                startActivity(intent)
                finish()
            }
            homefoodNo.setOnClickListener {
                code+="2"
                val intent= Intent(this, Hansott::class.java)
                startActivity(intent)
                finish()

            }
        }
    }
}
