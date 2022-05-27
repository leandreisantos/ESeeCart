package com.example.eseecart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    TextView label;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_nav);
        label = findViewById(R.id.tv_label);
        bottomNavigationView.setOnNavigationItemSelectedListener(onNav);

        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new DashboardFragment()).commit();

    }
    private BottomNavigationView.OnNavigationItemSelectedListener onNav = item -> {
        Fragment selected = null;
        switch(item.getItemId()){
            case R.id.dashboard_bottom:
                label.setText("Dashboard");
                selected = new DashboardFragment();
                break;
            case R.id.category_bottom:
                label.setText("Category");
                selected = new CategoryFragment();
                break;
            case R.id.notification_bottom:
                label.setText("Notification");
                selected = new NotificationFragment();
                break;
            case R.id.settings_bottom:
                label.setText("Profile");
                selected = new ProfileFragment();
                break;
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,selected).commit();
        return true;
    };
}