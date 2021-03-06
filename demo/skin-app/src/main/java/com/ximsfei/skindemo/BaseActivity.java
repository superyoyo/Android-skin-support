package com.ximsfei.skindemo;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;

import com.ximsfei.skindemo.settings.SettingsActivity;

import skin.support.annotation.Skinable;

/**
 * Created by ximsfei on 17-3-1.
 */

@Skinable
public class BaseActivity extends AppCompatActivity {
    protected void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Title");
        toolbar.setSubtitle("Subtitle");
        toolbar.setNavigationIcon(R.drawable.ic_settings_black_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BaseActivity.this, SettingsActivity.class));
            }
        });
        toolbar.setOverflowIcon(getResources().getDrawable(R.drawable.ic_camera_24dp));
    }
}
