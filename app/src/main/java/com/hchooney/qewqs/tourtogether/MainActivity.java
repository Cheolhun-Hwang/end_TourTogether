package com.hchooney.qewqs.tourtogether;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.hchooney.qewqs.tourtogether.Fragment.AccoutFragment;
import com.hchooney.qewqs.tourtogether.Fragment.ColumnFragment;
import com.hchooney.qewqs.tourtogether.Fragment.RecommendFragment;
import com.hchooney.qewqs.tourtogether.Temp.BottomNavigationViewHelper;

public class MainActivity extends AppCompatActivity {

    private FragmentManager manager;

    private ImageButton setting;
    private ImageButton gift;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_recommendation:
                    switchFragment(new RecommendFragment());
                    return true;
                case R.id.navigation_column:
                    switchFragment(new ColumnFragment());
                    return true;
                case R.id.navigation_account:
                    switchFragment(new AccoutFragment());
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        BottomNavigationViewHelper.removeShiftMode(navigation);
        navigation.setSelectedItemId(R.id.navigation_recommendation);

    }

    private void init(){
        manager = getSupportFragmentManager();

        setting = (ImageButton) findViewById(R.id.main_setting_btn);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SettingsActivity.class));
            }
        });

        gift = (ImageButton) findViewById(R.id.main_gift_btn);
        gift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "현재 준비중인 서비스입니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void switchFragment(Fragment fragment){
        manager.beginTransaction().replace(R.id.content, fragment).commit();
    }

}
