package com.example.sophia.bookmanager;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TestActivity extends AppCompatActivity {

    SimpleBookManager bookManager = new SimpleBookManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bookManager.createBook("Mark","Davinci",200,"testNumber","history");
        bookManager.createBook("Mark2","Davinci",200,"testNumber","history");
        bookManager.createBook("Mark3","Davinci",200,"testNumber","history");
        bookManager.createBook("Mark4","Davinci",200,"testNumber","history");
        bookManager.createBook("Mark5","Davinci",200,"testNumber","history");
        Settings.System.out
        setContentView(R.layout.activity_test);
    }

}
