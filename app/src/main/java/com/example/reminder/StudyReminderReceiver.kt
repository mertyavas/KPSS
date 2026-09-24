package com.example.reminder

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.core.app.NotificationCompat
import com.example.MainActivity

class StudyReminderReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent?) {
        NotificationHelper.createNotificationChannel(context)

        val targetIntent = Intent(context, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }

        val pendingIntent = PendingIntent.getActivity(
            context,
            0,
            targetIntent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )

        val quotes = listOf(
            "KPSS'de başarının sırrı sürekliliktir! Bugün hedefin olan 50 soruyu çözdün mü?",
            "Günde sadece 20 soru bile yılda binlerce net fark yaratır. Haydi şimdi başla!",
            "Unutma: Zorluklar kalıcı, memuriyet ve başarın ömür boyudur. Bugünün tekrarını yap!",
            "Hata defterinde bekleyen soruların var. Onları temizleyerek netlerini artır!",
            "Rakiplerin bugün de çalışıyor. 15 dakikalık hızlı bir deneme çözmeye ne dersin?"
        )
        val selectedQuote = quotes.random()

        val notification = NotificationCompat.Builder(context, NotificationHelper.CHANNEL_ID)
            .setSmallIcon(android.R.drawable.ic_dialog_info)
            .setContentTitle("🎯 KPSS Günlük Çalışma Hatırlatıcısı")
            .setContentText(selectedQuote)
            .setStyle(NotificationCompat.BigTextStyle().bigText(selectedQuote))
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setContentIntent(pendingIntent)
            .setAutoCancel(true)
            .build()

        val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.notify(1001, notification)
    }
}
