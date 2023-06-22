package marshall.melajah.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class HelloActivity : AppCompatActivity() {

    private lateinit var username: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        username = findViewById(R.id.tvselamatd)

        val showUsername = intent.getStringExtra("username")
        username.text = "Halo $showUsername !"


        var buttonback = findViewById<ImageView>(R.id.ivback)
        buttonback.setOnClickListener{
            val Intent = Intent(this, MainActivity::class.java)
            startActivity(Intent)
        }

        var buttonlanjut = findViewById<Button>(R.id.btndaftar)
        buttonlanjut.setOnClickListener{
            val Intent= Intent(this, BerandaActivity::class.java)
            startActivity(Intent)
        }

    }
}