package com.example.recommendlunch.chose
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recommendlunch.*
import kotlinx.android.synthetic.main.activity_is_expensive.*
import kotlinx.android.synthetic.main.activity_is_soup.*

class IsExpensive : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_is_expensive)

        var code=intent.getStringExtra("code")
        if(code=="111")
        {
            expensiveYes.setOnClickListener {
                code+="1"
                val intent= Intent(this, PotatoSoup::class.java)
                startActivity(intent)
                finish()
            }
            expensiveNo.setOnClickListener {
                code+="2"
                val intent= Intent(this, BaeBuJang::class.java)
                startActivity(intent)
                finish()

            }
        }
        else if(code=="12")
        {
            expensiveYes.setOnClickListener {
                code+="1"
                val intent= Intent(this, IsSeafood::class.java)
                intent.putExtra("code",code)
                startActivity(intent)
                finish()
            }
            expensiveNo.setOnClickListener {
                code+="2"
                val intent= Intent(this, IsHomefood::class.java)
                intent.putExtra("code",code)
                startActivity(intent)
                finish()

            }
        }
        else if(code=="21")
        {
            expensiveYes.setOnClickListener {
                code+="1"
                val intent= Intent(this, Baizing::class.java)
                startActivity(intent)
                finish()
            }
            expensiveNo.setOnClickListener {
                code+="2"
                val intent= Intent(this, HeaRaeDeung::class.java)
                startActivity(intent)
                finish()

            }
        }

        else if(code=="32")
        {
            expensiveYes.setOnClickListener {
                code+="1"
                val intent= Intent(this, Pizza::class.java)
                startActivity(intent)
                finish()
            }
            expensiveNo.setOnClickListener {
                code+="2"
                val intent= Intent(this, Zzambbong::class.java)
                startActivity(intent)
                finish()

            }
        }

    }
}
