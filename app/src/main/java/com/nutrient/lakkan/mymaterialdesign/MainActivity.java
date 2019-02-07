package com.nutrient.lakkan.mymaterialdesign;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // need to commit on git

        // check if we're running on android 5.0 or higher
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            // call somer material design API's her
        }
        else {
            // implement this feature for without material design

        }
    }
    public void showStandaloneToolbar(View view){
        Intent intent=new Intent(MainActivity.this,StandaloneToolbar.class);
        startActivity(intent);
    }
    public void showToolbarAsActionBar(View view){
        Intent intent=new Intent(MainActivity.this,ToolbarAsActionBar.class);
        startActivity(intent);
    }
    public void ShowContextualMenu(View view){
        Intent intent=new Intent(MainActivity.this,ContextualMenu.class);
        startActivity(intent);
    }
    public void showSnackbar(View view){
        Intent intent=new Intent(MainActivity.this,BuildingBlockSnackBar.class);
        startActivity(intent);
    }
    public void showFAB(View view){
        Intent intent=new Intent(MainActivity.this,FAB.class);
        startActivity(intent);
    }
    public void showAnimation(View view){
        Intent intent=new Intent(MainActivity.this,AnimationMaterialDesign.class);
        startActivity(intent);
    }
}
