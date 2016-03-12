package com.androidtechies.gates16;

import android.graphics.Color;
import android.os.Build;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class EventActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        Toolbar toolbar = (Toolbar) findViewById(R.id.event_toolbar);
//        toolbar.setNavigationIcon(R.drawable.back);
//        toolbar.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        setSupportActionBar(toolbar);



        CollapsingToolbarLayout collapsingToolbar=(CollapsingToolbarLayout) findViewById(R.id.collapse_toolbar);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            collapsingToolbar.setExpandedTitleColor(getResources().getColor(android.R.color.white,getTheme()));
            collapsingToolbar.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        }
        else {
            collapsingToolbar.setExpandedTitleColor(getResources().getColor(android.R.color.white));
//            collapsingToolbar.setBackgroundColor(getColor(R.color.colorPrimary));
        }
        collapsingToolbar.setCollapsedTitleTextColor(Color.parseColor("#FFFFFF"));
    }
}
