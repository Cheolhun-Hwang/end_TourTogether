package com.hchooney.qewqs.tourtogether;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import com.hchooney.qewqs.tourtogether.DatabaseReference.DataRef;
import com.hchooney.qewqs.tourtogether.MyFragment.AccountFragment;
import com.hchooney.qewqs.tourtogether.MyFragment.ColumnFragment;
import com.hchooney.qewqs.tourtogether.MyFragment.RecommandFragment;
import com.hchooney.qewqs.tourtogether.MyFragment.SearchFragment;

public class MainActivity extends AppCompatActivity {

    private DataRef dataref;

    private FragmentManager manager;

    private RecommandFragment recommandFragment;
    private ColumnFragment columnFragment;
    private AccountFragment accountFragment;



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_recommendation:
                    switchFragment(recommandFragment);
                    return true;
                case R.id.navigation_column:
                    switchFragment(columnFragment);
                    return true;
                case R.id.navigation_account:
                    switchFragment(accountFragment);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        init();
        navigation.setSelectedItemId(R.id.navigation_recommendation);
    }

    private void init(){
        dataref = new DataRef();
        recommandFragment = new RecommandFragment();
        columnFragment = new ColumnFragment();
        accountFragment = new AccountFragment();
        manager = getSupportFragmentManager();
    }

    private void switchFragment(Fragment fragment){
        manager.beginTransaction().replace(R.id.content, fragment).commit();
    }

}
