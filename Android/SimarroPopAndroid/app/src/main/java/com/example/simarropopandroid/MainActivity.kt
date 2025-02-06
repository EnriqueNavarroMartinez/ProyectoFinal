package com.example.simarropopandroid

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.simarropopandroid.databinding.ActivityMainBinding
import com.example.simarropopandroid.fragments.HomeFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //inicializo el view binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //cargar la home fragment
        if (savedInstanceState == null) { //si no hay instancia guardada se carga el fragment por primera vez
            loadFragment(HomeFragment()) //pasamos el fragment que queremos cargar
        }

    }


    //funcion para cargar un fragment
    private fun loadFragment(fragment: Fragment) { //recibo el fragment a cargar
        supportFragmentManager.beginTransaction()
            .replace(binding.fragmentContainter.id, fragment)  // Usamos ViewBinding aquí
            .commit()

    }
}
