package com.nutrient.lakkan.mymaterialdesign;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;

public class ToolbarAsActionBar extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Toolbar as Actionbar");
        toolbar.setSubtitle("by Lakhan !");


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String msg = "";
        switch (item.getItemId()) {
            case R.id.camera:
                msg = getString(R.string.camera);
            case R.id.settings:
                msg = getString(R.string.settings);
            case R.id.help:
                msg = getString(R.string.help);
            case R.id.websearch:
                msg = getString(R.string.websearch);
            case R.id.save:
                msg = getString(R.string.save);
        }
        Toast.makeText(ToolbarAsActionBar.this, msg + " Selected !", Toast.LENGTH_SHORT).show();
        return true;
    }
}
