package com.example.forcegroundservice29032022;

import android.app.Notification;
import android.content.Context;
import android.icu.text.CaseMap;

import androidx.core.app.NotificationCompat;

import org.w3c.dom.Text;

public class NotificationUtils {

    private static String channel_id    = "myChannel";

    public static Notification createNotification(Context context, String title, String text){
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context,channel_id);
        builder.setSmallIcon(android.R.drawable.star_big_on);
        builder.setContentTitle(title);
        builder.setContentText(text);
        return builder.build();
    }
}
