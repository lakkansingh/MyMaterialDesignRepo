package com.nutrient.lakkan.mymaterialdesign;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.support.v7.widget.Toolbar;

public class RippleAnimationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ripple_activity);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Ripple Animation");
    }

    public void dummyClick(View view) {
        //Need to enable Ripple effect on Views.
        //without click event, the ripple effect is not visible on Views.
        // Remove onClick attribute on Views and see the difference. try it yourself.
    }
}
