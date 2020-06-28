package com.example.recommendlunch.chose
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recommendlunch.*
import kotlinx.android.synthetic.main.activity_is_noodle.*
import kotlinx.android.synthetic.main.activity_is_spicy.*

class IsNoodle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_is_noodle)

        var code=intent.getStringExtra("code")
        if(code=="112")
        {
            noodleYes.setOnClickListener {
                val intent= Intent(this, IsCold::class.java)
                code+="1"
                intent.putExtra("code",code)
                startActivity(intent)
                finish()
            }
            noodleNo.setOnClickListener {
                code+="2"
                val intent= Intent(this, RiceSoup::class.java)
                startActivity(intent)
                finish()
            }
        }
        else if(code=="2")
        {
            noodleYes.setOnClickListener {
                val intent= Intent(this, IsExpensive::class.java)
                code+="1"
                intent.putExtra("code",code)
                startActivity(intent)
                finish()
            }
            noodleNo.setOnClickListener {
                code+="2"
                val intent= Intent(this, IsSoup::class.java)
                intent.putExtra("code",code)
                startActivity(intent)
                finish()
            }
        }

        else if(code=="4")
        {
            noodleYes.setOnClickListener {
                val intent= Intent(this, IsAuthentic::class.java)
                code+="1"
                intent.putExtra("code",code)
                startActivity(intent)
                finish()
            }
            noodleNo.setOnClickListener {
                code+="2"
                val intent= Intent(this, IsBowlOfRice::class.java)
                intent.putExtra("code",code)
                startActivity(intent)
                finish()
            }
        }

    }
}
