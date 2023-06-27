package marshall.melajah.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class BerandaActivity : AppCompatActivity() {

    private val rotateOpen: Animation by lazy {AnimationUtils.loadAnimation(this,R.anim.rotate_open_anim)}
    private val rotateClose: Animation by lazy {AnimationUtils.loadAnimation(this,R.anim.rotate_close_anim)}
    private val fromBottom: Animation by lazy {AnimationUtils.loadAnimation(this,R.anim.from_bottom_anim)}
    private val toBottom: Animation by lazy {AnimationUtils.loadAnimation(this,R.anim.to_bottom_anim)}

    private var clicked =false

    lateinit var pengeluaran_button: FloatingActionButton
    lateinit var pemasukan_button: FloatingActionButton
    lateinit var add_button: FloatingActionButton

    private fun kntl(){
        pengeluaran_button = findViewById(R.id.btnpengeluaran)
        pemasukan_button = findViewById(R.id.btnpemasukan)
        add_button = findViewById(R.id.add_button)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beranda)


        kntl()

        add_button.setOnClickListener{
            onAddButtonClicked()
        }


        pengeluaran_button.setOnClickListener{
            val Intent = Intent(this, TambahTransaksiActivity::class.java)
            startActivity(Intent)
//            Toast.makeText(this, "kamu menekan tombol pengeluaran", Toast.LENGTH_SHORT).show()
        }


        pemasukan_button.setOnClickListener{
            val Intent = Intent(this, TambahTransaksiActivity::class.java)
            startActivity(Intent)
//            Toast.makeText(this, "kamu menekan tombol pemasukan", Toast.LENGTH_SHORT).show()
        }

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
    }


    private fun onAddButtonClicked() {
        setVisibility(clicked)
        setAnimation(clicked)
        setClickedable(clicked)
        clicked=!clicked
    }



    fun setVisibility(clicked: Boolean) {
        if (!clicked){

            pengeluaran_button.visibility = View.VISIBLE
            pemasukan_button.visibility = View.VISIBLE

        }else{
            pengeluaran_button.visibility = View.INVISIBLE
            pemasukan_button.visibility = View.INVISIBLE
        }
    }


    fun setAnimation(clicked: Boolean) {
        if (!clicked){
            pengeluaran_button.startAnimation(fromBottom)
            pemasukan_button.startAnimation(fromBottom)
            add_button.startAnimation(rotateOpen)
        }else{
            pengeluaran_button.startAnimation(toBottom)
            pemasukan_button.startAnimation(toBottom)
            add_button.startAnimation(rotateClose)
        }
    }

    fun setClickedable(clicked: Boolean){
        if (!clicked){
            pengeluaran_button.isClickable = true
            pemasukan_button.isClickable = true
        }else{
            pengeluaran_button.isClickable = false
            pemasukan_button.isClickable = false
        }
    }
}