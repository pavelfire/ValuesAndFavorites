package com.vk.directop.valuesandfavirites

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

private const val LAST_SELECTED_ITEM = "item"

class MainActivity : AppCompatActivity() {

    private lateinit var bottomMenu : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomMenu = findViewById(R.id.bottom_nav)

        bottomMenu.setOnItemSelectedListener {
            when(it.itemId){
                R.id.all_items -> {
                    val menuFragment = ItemsFragment()
                    replaceFragment(menuFragment)
                }
                R.id.favorite -> {
                    val favoriteFragment = FavoriteFragment()
                    replaceFragment(favoriteFragment)
                }
                R.id.about -> {
                    val aboutFragment = AboutFragment()
                    replaceFragment(aboutFragment)
                }
            }
            true
        }
        val itemsFragment = ItemsFragment()
        supportFragmentManager // обращаемся к fm
            .beginTransaction() //начать транзакцию
            .add(R.id.fragment_container, itemsFragment) // действие
            .commit() // закончить транзакцию

        // восстанавливаем выбранный пункт меню при пересоздании активити
        bottomMenu.selectedItemId = savedInstanceState?.getInt(LAST_SELECTED_ITEM) ?: R.id.all_items
    }
    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager // обращаемся к fm
            .beginTransaction() //начать транзакцию
            .replace(R.id.fragment_container, fragment) // действие
            .commit() // закончить транзакцию
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(LAST_SELECTED_ITEM, bottomMenu.selectedItemId)
        super.onSaveInstanceState(outState)
    }
}