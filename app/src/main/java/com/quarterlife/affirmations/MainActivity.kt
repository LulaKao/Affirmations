package com.quarterlife.affirmations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.quarterlife.affirmations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binging: ActivityMainBinding // add this for view binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binging = ActivityMainBinding.inflate(layoutInflater) // add this for view binding
        setContentView(binging.root) // add this for view binding

    }
}
