package com.example.androidktxbaiscauth

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT = 5000 // 5 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // In your main activity onCreate() method or wherever you prefer
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = resources.getColor(R.color.ui_primary, null)
        }

        Handler().postDelayed({
            // This method will be executed once the timer is over
            // Start your app main activity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            // close this activity
            finish()
        }, SPLASH_TIME_OUT.toLong())
    }
}
