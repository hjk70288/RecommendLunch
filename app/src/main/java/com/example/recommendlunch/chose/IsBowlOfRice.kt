package com.example.recommendlunch.chose
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recommendlunch.DonDonJung
import com.example.recommendlunch.GoKan
import com.example.recommendlunch.R
import com.example.recommendlunch.RiceSoup
import kotlinx.android.synthetic.main.activity_is_bowl_of_rice.*
import kotlinx.android.synthetic.main.activity_is_noodle.*

class IsBowlOfRice : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_is_bowl_of_rice)

        var code=intent.getStringExtra("code")
        if(code=="42")
        {
            bowlYes.setOnClickListener {
                val intent= Intent(this, GoKan::class.java)
                code+="1"
                startActivity(intent)
                finish()
            }
            bowlNO.setOnClickListener {
                code+="2"
                val intent= Intent(this, DonDonJung::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}
