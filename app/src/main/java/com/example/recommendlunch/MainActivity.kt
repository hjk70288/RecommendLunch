package com.example.recommendlunch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import com.example.recommendlunch.chose.IsNoodle
import com.example.recommendlunch.chose.IsSimplefood
import com.example.recommendlunch.chose.IsSoup
import com.example.recommendlunch.chose.IsSpicy
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.browse

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var code=""
        koreaBtn.setOnClickListener {
            code="1"
            val intent=Intent(this, IsSoup::class.java)
            intent.putExtra("code",code)
            startActivity(intent)
        }
        chinaBtn.setOnClickListener {
            code="2"
            val intent=Intent(this,IsNoodle::class.java)
            intent.putExtra("code",code)
            startActivity(intent)
        }
        americaBtn.setOnClickListener {
            code="3"
            val intent=Intent(this,IsSimplefood::class.java)
            intent.putExtra("code",code)
            startActivity(intent)
        }
        japanBtn.setOnClickListener {
            code="4"
            val intent=Intent(this,IsNoodle::class.java)
            intent.putExtra("code",code)
            startActivity(intent)
        }

    }
}
