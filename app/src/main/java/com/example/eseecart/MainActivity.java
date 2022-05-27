package com.example.eseecart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(onNav);

        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new DashboardFragment()).commit();

    }
    private BottomNavigationView.OnNavigationItemSelectedListener onNav = item -> {
        Fragment selected = null;
        switch(item.getItemId()){
            case R.id.dashboard_bottom:
                selected = new DashboardFragment();
                break;

        }
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,selected).commit();
        return true;
    };
}