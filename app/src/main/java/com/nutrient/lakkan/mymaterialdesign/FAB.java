package com.nutrient.lakkan.mymaterialdesign;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

public class FAB extends AppCompatActivity {
    private CoordinatorLayout rootlayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fab_activity);
        rootlayout=findViewById(R.id.mylayout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Floating Action Bar");
        getSupportActionBar().setSubtitle("By Lakhan");
        FloatingActionButton floatingActionButton=findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSimpleSnackBar();
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String msg = "";
        switch (item.getItemId()) {
            case R.id.simple:
                showSimpleSnackBar();
                break;
            case R.id.custom_snackbar:
                showSnackbarCustomizeColorText();
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
        Snackbar.make(rootlayout, "Simple Snack Bar Example", Snackbar.LENGTH_LONG).show();
    }

    public void showSnackbarWithOptionActionCallback() {
        Snackbar snackbar = Snackbar.make(rootlayout, "File Deleted Successfully", Snackbar.LENGTH_LONG);
        snackbar.setAction("UNDO", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(rootlayout, "File Recovered Successfully", Snackbar.LENGTH_SHORT).show();
            }

        });
        snackbar.show();
    }

    public void showSnackbarCustomizeColorText() {
        Snackbar snackbar = Snackbar.make(rootlayout, "File Deleted Successfully", Snackbar.LENGTH_LONG);

        snackbar.setAction("UNDO", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(rootlayout, "File Recovered Successfully", Snackbar.LENGTH_SHORT).show();
            }

        });
        View snackBarView = snackbar.getView();
        snackBarView.setBackgroundColor(this.getResources().getColor(R.color.design_default_color_primary_dark));
        snackbar.show();

    }

    }

