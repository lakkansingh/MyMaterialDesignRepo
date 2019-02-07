package com.nutrient.lakkan.mymaterialdesign;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class StandaloneToolbar extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.standalone_toolbar);
        toolbar.setSubtitle("By Lakhan Singh");
        // This not as per google standard
        // toolbar.setNavigationIcon(R.drawable.back);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            toolbar.setElevation(10f);
        }
        toolbar.inflateMenu(R.menu.menu_main);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                String title = (String) menuItem.getTitle();
                Toast.makeText(getApplicationContext(), title + " Selected !", Toast.LENGTH_SHORT).show();
                switch (menuItem.getItemId()){
                    case R.id.save:
                        //perform task
                        break;
                    case R.id.help:
                        //perform task
                        break;
                }
                return true;
            }
        });
    }
}
