package marshall.melajah.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout

class ProfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        var buttonanalisis = findViewById<ImageView>(R.id.ivanalisis)
        buttonanalisis.setOnClickListener{
            val Intent= Intent(this, AnalisisActivity::class.java)
            startActivity(Intent)
        }

        var buttonberanda = findViewById<ImageView>(R.id.ivberanda)
        buttonberanda.setOnClickListener{
            val Intent= Intent(this, BerandaActivity::class.java)
            startActivity(Intent)
        }

        var buttonprofil= findViewById<ImageView>(R.id.ivprofil)
        buttonprofil.setOnClickListener{
            val Intent= Intent(this, ProfilActivity::class.java)
            startActivity(Intent)
        }

        var buttonlogout= findViewById<RelativeLayout>(R.id.boxlogout)
        buttonlogout.setOnClickListener{
            val Intent= Intent(this, MainActivity::class.java)
            startActivity(Intent)
        }
    }
}