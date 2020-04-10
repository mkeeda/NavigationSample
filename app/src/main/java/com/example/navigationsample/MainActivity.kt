package com.example.navigationsample

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("RestrictedApi", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        backStackLogButton.setOnClickListener {
            backStackLogTextView.text = findNavController(R.id.navHostFragment)
                .backStack
                .map { it.toString() }
                .reduce { acc, navBackStackEntryString ->
                    acc + navBackStackEntryString + "\n"
                } + taskId.toString()
        }
    }
}
