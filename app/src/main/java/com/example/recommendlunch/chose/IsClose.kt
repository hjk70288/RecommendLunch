package com.example.recommendlunch.chose
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recommendlunch.R
import kotlinx.android.synthetic.main.activity_is_close.*
import kotlinx.android.synthetic.main.activity_is_simplefood.*

class IsClose : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_is_close)

        var code=intent.getStringExtra("code")
        if(code=="31")
        {
            closeYes.setOnClickListener {
                val intent= Intent(this, IsHamburger::class.java)
                code+="1"
                intent.putExtra("code",code)
                startActivity(intent)
                finish()
            }
            closeNo.setOnClickListener {
                val intent= Intent(this, IsHamburger::class.java)
                code+="2"
                intent.putExtra("code",code)
                startActivity(intent)
                finish()
            }
        }
    }
}
