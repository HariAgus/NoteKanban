package com.example.notekanban;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.example.notekanban.Adapter.TabAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;


public class HomeScreenActivity extends AppCompatActivity {
    Toolbar toolbar;
    TabItem tabTodo, tabDoing, tabDone;
    TabLayout tabLayout;
    ViewPager viewPager;
    FloatingActionButton fab;

    @SuppressLint("ResourceType")
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        toolbar = findViewById(R.id.toolbar);
        tabLayout = findViewById(R.id.tabLayout);
        tabTodo = findViewById(R.id.tabTodo);
        tabDoing = findViewById(R.id.tabDoing);
        tabDone = findViewById(R.id.tabDone);
        viewPager = findViewById(R.id.viewPager);
        fab = findViewById(R.id.fab);

        TabAdapter tabAdapter = new TabAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(tabAdapter);

        //Button Create Note
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeScreenActivity.this, FormProjectAct.class);
                startActivity(i);
            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_profile,menu);
        return true;
    }
}
