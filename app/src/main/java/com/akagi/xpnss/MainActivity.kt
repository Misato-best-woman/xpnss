package com.akagi.xpnss

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationBarView

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFragment(BalanceFragment())

        val navBar = findViewById<NavigationBarView>(R.id.navBar)
        navBar.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.balance -> {
                    loadFragment(BalanceFragment())
                    title = "Balance"
                    true
                }
                R.id.income -> {
                    loadFragment(IncomeFragment())
                    title = "Income"
                    true
                }
                R.id.outcome -> {
                    loadFragment(OutcomeFragment())
                    title = "Outcome"
                    true
                }
                else -> {
                    false
                }
            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.navBarFLayout, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}