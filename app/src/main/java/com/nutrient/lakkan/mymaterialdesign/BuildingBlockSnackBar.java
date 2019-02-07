package com.nutrient.lakkan.mymaterialdesign;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

public class BuildingBlockSnackBar extends AppCompatActivity {
    private FrameLayout rootLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snackbar_layout);
        rootLayout = findViewById(R.id.mylayout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Snackbar");
        getSupportActionBar().setSubtitle("By Lakhan");

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String msg = "";
        switch (item.getItemId()) {
            case R.id.simple:
                showSimpleSnackBar();
                break;
            case R.id.custom_snackbar:
                //need to develop
                break;
            case R.id.snackbar_option:
                showSnackbarWithOptionActionCallback();
                break;
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_snackbar_test, menu);
        return true;
    }

    public void showSimpleSnackBar() {
        Snackbar.make(rootLayout, "Simple Snack Bar Example", Snackbar.LENGTH_LONG).show();
    }

    public void showSnackbarWithOptionActionCallback() {
        Snackbar snackbar = Snackbar.make(rootLayout, "File Deleted Successfully", Snackbar.LENGTH_LONG);
        snackbar.setAction("UNDO", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(rootLayout, "File Recovered Successfully", Snackbar.LENGTH_SHORT).show();
            }

        });
        snackbar.show();
    }

    public void showSnackbarCustomizeColorText() {

    }
}
