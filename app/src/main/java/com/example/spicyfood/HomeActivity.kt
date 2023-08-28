package com.example.spicyfood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.FrameLayout
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class HomeActivity : AppCompatActivity() {

    lateinit var drawerlayout: DrawerLayout
    lateinit var coordinatorLayout: CoordinatorLayout
    lateinit var toolbar: androidx.appcompat.widget.Toolbar
    lateinit var frameLayout: FrameLayout
    lateinit var navigationView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Link all the views in kotlin
        drawerlayout = findViewById(R.id.drawerLayout)
        coordinatorLayout = findViewById(R.id.coordinatorLayout)
        toolbar = findViewById(R.id.toolbar)
        frameLayout = findViewById(R.id.frameLayout)
        navigationView = findViewById(R.id.navigationView)

        setupToolbar()

        val actionBarDrawerToggle = ActionBarDrawerToggle(this@HomeActivity, drawerlayout, R.string.open_drawer, R.string.close_drawer)
        drawerlayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()

        navigationView.setNavigationItemSelectedListener {

            when(it.itemId){
                R.id.dashboard -> Toast.makeText(this@HomeActivity, "Dashboard", Toast.LENGTH_SHORT)
                    .show()
                R.id.favorites -> Toast.makeText(this@HomeActivity, "Favorites", Toast.LENGTH_SHORT)
                    .show()
                R.id.profile -> Toast.makeText(this@HomeActivity, "Profile", Toast.LENGTH_SHORT)
                    .show()
                R.id.about -> Toast.makeText(this@HomeActivity, "About", Toast.LENGTH_SHORT)
                    .show()

            }
            return@setNavigationItemSelectedListener true
        }

    }

    fun setupToolbar(){
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Dashboard"
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home){
            drawerlayout.openDrawer(GravityCompat.START)
        }
        return super.onOptionsItemSelected(item)
    }


}