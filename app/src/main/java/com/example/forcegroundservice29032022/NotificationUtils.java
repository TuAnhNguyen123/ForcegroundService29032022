package com.example.forcegroundservice29032022;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.icu.text.CaseMap;

import androidx.core.app.NotificationCompat;

import org.w3c.dom.Text;

public class NotificationUtils {

    private static String channel_id    = "myChannel";

    public static Notification createNotification(Context context, String title, String text, Intent intent){
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context,channel_id);
        builder.setSmallIcon(android.R.drawable.star_big_on);
        builder.setContentTitle(title);
        builder.setContentText(text);

        PendingIntent pendingIntent = PendingIntent.getActivity(context,0,intent, PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(pendingIntent);
        return builder.build();
    }
}
