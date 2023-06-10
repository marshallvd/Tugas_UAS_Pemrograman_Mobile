package marshall.melajah.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var buttonmasuk = findViewById<Button>(R.id.btnmasuk)
        buttonmasuk.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        var buttondaftar = findViewById<Button>(R.id.btndaftar)
        buttondaftar.setOnClickListener{
            val Intent = Intent(this, RegisterActivity::class.java)
            startActivity(Intent)
        }
    }
}