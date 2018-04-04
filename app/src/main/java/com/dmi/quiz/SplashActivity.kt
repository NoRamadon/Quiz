package com.dmi.quiz

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.reactivex.Observable
import java.util.concurrent.TimeUnit

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Observable.timer(3, TimeUnit.SECONDS).subscribe {
            startMainActivity()
        }
    }

    private fun startMainActivity(){
        startActivity(Intent(this, MainActivity::class.java))
        finish()
        overridePendingTransition(android.R.anim.slide_out_right, android.R.anim.slide_in_left)
    }
}
