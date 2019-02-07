package com.nutrient.lakkan.mymaterialdesign;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimationMaterialDesign extends AppCompatActivity {
    private ImageView imgLogo, imgProfilePic;
    private TextView sharedName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animation_layout);
        imgLogo = findViewById(R.id.logo_pic);
        imgProfilePic = findViewById(R.id.profile_pic);
        sharedName = findViewById(R.id.shared_name);
    }

    public void showRippleAnimation(View view) {
        Intent intent = new Intent(AnimationMaterialDesign.this, RippleAnimationActivity.class);
        startActivity(intent);
    }

    public void sharedTransition(View view) {
        Pair[] pair = new Pair[3];
        pair[0] = new Pair<View, String>(imgLogo, "logo_shared");
        pair[1] = new Pair<View, String>(sharedName, "lakhan_singh");
        pair[2] = new Pair<View, String>(imgProfilePic, "profile_pic_shared");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation(this, pair);
            Intent intent = new Intent(AnimationMaterialDesign.this, SharedElementActivity.class);
            startActivity(intent, activityOptions.toBundle());
        }
    }
}
