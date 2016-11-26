package com.ahmadnemati.awesomecalendarapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ahmadnemati.awesomecalendar.AwesomeCalendar;
import com.ahmadnemati.awesomecalendar.enums.LogLevel;

public class MainActivity extends AppCompatActivity {
    private AwesomeCalendar awesomeCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        awesomeCalendar= (AwesomeCalendar) findViewById(R.id.awesome_calendar);
        awesomeCalendar.setLogLevel(LogLevel.LEVEL_DEBUG);
    }
}
