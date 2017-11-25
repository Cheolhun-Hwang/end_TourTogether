package com.hchooney.qewqs.tourtogether;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "LoginActivity";

    private ViewFlipper background_viewflipper;
    private TextView Login_Title_Textview;

    private Button temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();

    }

    private void init(){
        background_viewflipper = (ViewFlipper) findViewById(R.id.Login_ViewFlipper);
        background_viewflipper.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.fade_in));
        background_viewflipper.setOutAnimation(AnimationUtils.loadAnimation(this, R.anim.fade_out));
        //자동 Flipping 시작 (3초)
        background_viewflipper.setFlipInterval(4000);
        background_viewflipper.startFlipping();

        temp = (Button) findViewById(R.id.Login_temp_button);
        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "개발자용 건너뛰기", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Login_Title_Textview = (TextView) findViewById(R.id.Login_Title_textview);
        Login_Title_Textview.setTypeface(Typeface.createFromAsset(getAssets(), "HoonMakdaeyunpilR.ttf"));
    }

}
