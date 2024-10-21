package com.example.citas_medicas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState = savedInstanceState)
        ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.toolbar)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.title = "Reserva de Citas"

        var commit = supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, DoctorSelectionFragment())
            .commit()
    }
}
