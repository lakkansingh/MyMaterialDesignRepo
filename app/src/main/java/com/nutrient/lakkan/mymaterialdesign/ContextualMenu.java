package com.nutrient.lakkan.mymaterialdesign;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ContextualMenu extends AppCompatActivity {
    private Button button;
    private ActionMode actionMode;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contextual_menu);
        button = findViewById(R.id.button_contextual_menu);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Contextual Menu");
        toolbar.setSubtitle("by Lakhan !");
        toolbar.inflateMenu(R.menu.menu_main);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                String title = (String) menuItem.getTitle();
                Toast.makeText(ContextualMenu.this, title + "", Toast.LENGTH_SHORT).show();
                switch (menuItem.getItemId()) {
                    case R.id.save:
                        //
                    case R.id.camera:
                        //
                }
                return true;
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionMode=ContextualMenu.this.startSupportActionMode(new ContextualCallback());
            }
        });
    }

    class ContextualCallback implements ActionMode.Callback {

        @Override
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            actionMode.getMenuInflater().inflate(R.menu.contextual_menu, menu);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            actionMode.setTitle("My Action Mode");
            actionMode.setSubtitle("by Lakhan ");
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            //add funtionality to menu item
            // switch case statement
            return false;
        }

        @Override
        public void onDestroyActionMode(ActionMode actionMode) {
            // when Action Mode is completed
        }
    }

}
