package com.hchooney.qewqs.tourtogether;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SettingMenuActivity extends AppCompatActivity {
    private static final String TAG = "SettingMenuActivity";

    private ImageButton CloseButton;
    private Button Notice;
    private Button ServiceCenter;
    private Button Policiesandterms;
    private Button Help;
    private Button Logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_menu);

        init();
    }

    private void init(){
        CloseButton = (ImageButton) findViewById(R.id.Notice_Close);
        CloseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(4002);
                finish();
            }
        });
        Notice = (Button) findViewById(R.id.setting_notice_button);
        Notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingMenuActivity.this, NoticeActivity.class);
                startActivity(intent);
            }
        });
        ServiceCenter = (Button) findViewById(R.id.setting_service_button);
        ServiceCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Policiesandterms = (Button) findViewById(R.id.setting_promise_button);
        Policiesandterms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Help = (Button) findViewById(R.id.setting_help_button);
        Help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Logout = (Button) findViewById(R.id.setting_logout_button);
        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(4001);
                finish();
            }
        });
    }
}
