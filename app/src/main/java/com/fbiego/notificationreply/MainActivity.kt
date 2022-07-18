package com.fbiego.notificationreply

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import android.widget.TextView
import androidx.core.app.NotificationManagerCompat
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Timber.plant(Timber.DebugTree())

        findViewById<Button>(R.id.button).setOnClickListener {
            startActivity(Intent(Settings.ACTION_NOTIFICATION_LISTENER_SETTINGS))
        }
    }

    override fun onResume() {
        super.onResume()

        val enabled = NotificationManagerCompat.getEnabledListenerPackages(this).contains(
            "com.fbiego.notificationreply"  //BuildConfig.APPLICATION_ID
        )
        findViewById<TextView>(R.id.textView).text = if (enabled) "Listener enabled" else "Click to enable listener"
    }
}