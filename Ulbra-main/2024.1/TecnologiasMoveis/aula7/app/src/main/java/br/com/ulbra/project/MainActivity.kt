package br.com.ulbra.project

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar) //buscar a toolbar
        setSupportActionBar(toolbar)

        navController = findNavController(R.id.nav_host_fragment)
        appBarConfiguration = AppBarConfiguration(setOf(
            R.id.homeFragment, R.id.addFragment //destinos principais da barra de ação
        ))

        //configurar a ActionBar e BottomNavigationView com NavController
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.menu_bottom)
        NavigationUI.setupWithNavController(bottomNavigationView, navController)

        //ouvinte para mudança de destino/Toolbar
        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.homeFragment -> toolbar.title = "Home"
                R.id.addFragment -> toolbar.title = "Create Product"
                else -> toolbar.title = destination.label
            }
        }
    }
}