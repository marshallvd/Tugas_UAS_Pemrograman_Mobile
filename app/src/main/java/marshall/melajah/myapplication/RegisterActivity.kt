package marshall.melajah.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var buttondaftar = findViewById<Button>(R.id.btndaftar)
        buttondaftar.setOnClickListener{
            val Intent = Intent(this, LoginActivity::class.java)
            startActivity(Intent)
        }

        var buttonback = findViewById<ImageView>(R.id.ivback)
        buttonback.setOnClickListener{
            val Intent = Intent(this, MainActivity::class.java)
            startActivity(Intent)
        }

        var tvmasuk = findViewById<TextView>(R.id.tvmasuk)
        tvmasuk.setOnClickListener{
            val Intent = Intent(this, LoginActivity::class.java)
            startActivity(Intent)
        }
    }
}