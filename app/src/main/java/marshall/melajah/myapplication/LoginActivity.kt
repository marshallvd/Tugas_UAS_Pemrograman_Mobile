package marshall.melajah.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class LoginActivity : AppCompatActivity() {


    private lateinit var username: EditText
    private lateinit var button: Button

    private fun initComp() {
        username = findViewById(R.id.et1)
        button = findViewById(R.id.btnmasuk)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



        initComp()

        button.setOnClickListener {
            startActivity(
                Intent(this, HelloActivity::class.java)
                    .putExtra("username", username.text.toString())
            )
        }

        var buttonback = findViewById<ImageView>(R.id.ivback)
        buttonback.setOnClickListener{
            val Intent= Intent(this, MainActivity::class.java)
            startActivity(Intent)
        }

//        var buttonmasuk = findViewById<Button>(R.id.btnmasuk)
//        buttonmasuk.setOnClickListener{
//            val Intent = Intent(this, HelloActivity::class.java)
//            startActivity(Intent)
//        }

        var tvdaftar = findViewById<TextView>(R.id.tvdaftar)
        tvdaftar.setOnClickListener{
            val Intent = Intent(this, RegisterActivity::class.java)
            startActivity(Intent)
        }

    }
}