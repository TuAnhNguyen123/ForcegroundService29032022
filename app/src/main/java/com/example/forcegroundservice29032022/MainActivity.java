package com.example.forcegroundservice29032022;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCreateNotification, btnStartForeground, btnStopForeground;
    NotificationManager notificationManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCreateNotification = findViewById(R.id.button_create_notification);
        btnStartForeground =findViewById(R.id.button_start_foreground_service);
        btnStopForeground = findViewById(R.id.button_stop_foreground_service);

        notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        btnCreateNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity.class);
                Notification notification = NotificationUtils.createNotification(
                        MainActivity.this,
                        "Notice!",
                        "You have a unread message!",
                        intent
                );
                notificationManager.notify(1,notification);
            }
        });

        btnStartForeground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MyService.class);
                startService(intent);
            }
        });
        btnStopForeground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MyService.class);
                stopService(intent);
            }
        });
    }
}