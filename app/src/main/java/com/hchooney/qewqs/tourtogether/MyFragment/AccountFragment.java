package com.hchooney.qewqs.tourtogether.MyFragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.hchooney.qewqs.tourtogether.LoginActivity;
import com.hchooney.qewqs.tourtogether.MainActivity;
import com.hchooney.qewqs.tourtogether.R;
import com.hchooney.qewqs.tourtogether.SettingMenuActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class AccountFragment extends Fragment {
    private View view;

    private final static String TAG = "AccountFragment";
    public static final int AccountFragement_Request = 3001;

    private ImageButton settingBTN;
    private ImageButton giftBTN;

    private Button tabOne;
    private Button tabTwo;
    private Button tabThree;
    private Button tabFour;

    private int flag_whatbutton;

    private FragmentManager manager;

    public AccountFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onStart() {
        flag_whatbutton = 0;
        chaneTabs();
        super.onStart();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_account, container, false);

        init(view);

        return view;
    }

    private void init(View v){
        manager = getActivity().getSupportFragmentManager();

        settingBTN = (ImageButton) view.findViewById(R.id.account_setting_button);
        settingBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SettingMenuActivity.class);
                startActivityForResult(intent, AccountFragement_Request);
            }
        });
        giftBTN = (ImageButton) view.findViewById(R.id.account_gitf_button);
        giftBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        tabOne = (Button) view.findViewById(R.id.account_tab_one);
        tabTwo = (Button) view.findViewById(R.id.account_tab_two);
        tabThree = (Button) view.findViewById(R.id.account_tab_three);
        tabFour = (Button) view.findViewById(R.id.account_tab_four);

        tabOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(flag_whatbutton == 0)){
                    flag_whatbutton = 0;
                    chaneTabs();
                }


            }
        });

        tabTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(flag_whatbutton == 1)){
                    flag_whatbutton = 1;
                    chaneTabs();
                }
            }
        });
        tabThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(flag_whatbutton == 2)){
                    flag_whatbutton = 2;
                    chaneTabs();
                }
            }
        });
        tabFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(flag_whatbutton == 3)){
                    flag_whatbutton = 3;
                    chaneTabs();
                }
            }
        });

    }
    private void chaneTabs(){
        if (flag_whatbutton == 0) {
            manager.beginTransaction().replace(R.id.account_container, new LikeLocationFragment()).commit();
            tabOne.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
            tabOne.setTextColor(getResources().getColor(R.color.white));
            tabTwo.setBackgroundColor(getResources().getColor(R.color.white));
            tabTwo.setTextColor(getResources().getColor(R.color.black));
            tabThree.setBackgroundColor(getResources().getColor(R.color.white));
            tabThree.setTextColor(getResources().getColor(R.color.black));
            tabFour.setBackgroundColor(getResources().getColor(R.color.white));
            tabFour.setTextColor(getResources().getColor(R.color.black));
        }else if (flag_whatbutton == 1) {
            manager.beginTransaction().replace(R.id.account_container, new ClipsFragment()).commit();
            tabOne.setBackgroundColor(getResources().getColor(R.color.white));
            tabTwo.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
            tabThree.setBackgroundColor(getResources().getColor(R.color.white));
            tabFour.setBackgroundColor(getResources().getColor(R.color.white));
            tabOne.setTextColor(getResources().getColor(R.color.black));
            tabTwo.setTextColor(getResources().getColor(R.color.white));
            tabThree.setTextColor(getResources().getColor(R.color.black));
            tabFour.setTextColor(getResources().getColor(R.color.black));
        }else if (flag_whatbutton == 2) {
            manager.beginTransaction().replace(R.id.account_container, new EventListFragment()).commit();
            tabOne.setBackgroundColor(getResources().getColor(R.color.white));
            tabTwo.setBackgroundColor(getResources().getColor(R.color.white));
            tabThree.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
            tabFour.setBackgroundColor(getResources().getColor(R.color.white));
            tabOne.setTextColor(getResources().getColor(R.color.black));
            tabTwo.setTextColor(getResources().getColor(R.color.black));
            tabThree.setTextColor(getResources().getColor(R.color.white));
            tabFour.setTextColor(getResources().getColor(R.color.black));
        }else if (flag_whatbutton == 3) {
            manager.beginTransaction().replace(R.id.account_container, new PointFragment()).commit();
            tabOne.setBackgroundColor(getResources().getColor(R.color.white));
            tabTwo.setBackgroundColor(getResources().getColor(R.color.white));
            tabThree.setBackgroundColor(getResources().getColor(R.color.white));
            tabFour.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
            tabOne.setTextColor(getResources().getColor(R.color.black));
            tabTwo.setTextColor(getResources().getColor(R.color.black));
            tabThree.setTextColor(getResources().getColor(R.color.black));
            tabFour.setTextColor(getResources().getColor(R.color.white));
        }else{
            Log.e(TAG, "Tab Error!");
        }
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == AccountFragement_Request){
            switch (resultCode){
                case 4001 :     //logout
                    Log.d(TAG, "Logout");
                    Intent intent = new Intent(getActivity(), LoginActivity.class);
                    startActivity(intent);
                    getActivity().finish();
                    break;
                case 4002 :     //nothing
                    Log.d(TAG, "SettingMenu > Account Nothing");
                    break;
                default:
                    break;
            }
        }



    }
}
