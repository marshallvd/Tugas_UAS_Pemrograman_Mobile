package marshall.melajah.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class TambahTransaksiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambah_transaksi)

        val buttonback = findViewById<ImageView>(R.id.ivback)
        buttonback.setOnClickListener{
            val Intent = Intent(this, BerandaActivity::class.java)
            startActivity(Intent)
        }

        val buttontambah = findViewById<Button>(R.id.btntambah)
        buttontambah.setOnClickListener {
            val Intent = Intent(this, BerandaActivity::class.java)
            startActivity(Intent)
        }

        val buttonanalisis = findViewById<ImageView>(R.id.ivanalisis)
        buttonanalisis.setOnClickListener{
            val Intent= Intent(this, AnalisisActivity::class.java)
            startActivity(Intent)
        }

        val buttonberanda = findViewById<ImageView>(R.id.ivberanda)
        buttonberanda.setOnClickListener{
            val Intent= Intent(this, BerandaActivity::class.java)
            startActivity(Intent)
        }

        val buttonprofil= findViewById<ImageView>(R.id.ivprofil)
        buttonprofil.setOnClickListener{
            val Intent= Intent(this, ProfilActivity::class.java)
            startActivity(Intent)
        }
    }
}