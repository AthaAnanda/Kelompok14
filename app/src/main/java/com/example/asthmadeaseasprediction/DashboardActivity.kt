package com.example.asthmadeaseasprediction
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.asmaapp.databinding.ActivityDashboardBinding

class DashboardActivity : AppCompatActivity() {

    private lateinit var b: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(b.root)

        // Tombol-tombol menuju halaman lain (nanti tinggal ditambahkan)
        b.btnNews.setOnClickListener {

        }

        b.btnDiagnosis.setOnClickListener {

        }

        b.btnServices.setOnClickListener {

        }
    }
}
