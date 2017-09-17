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

import com.hchooney.qewqs.tourtogether.Kakaotalk.KakaoSignupActivity;
import com.kakao.auth.ISessionCallback;
import com.kakao.auth.Session;
import com.kakao.util.exception.KakaoException;
import com.nhn.android.naverlogin.OAuthLogin;
import com.nhn.android.naverlogin.OAuthLoginHandler;
import com.nhn.android.naverlogin.ui.view.OAuthLoginButton;

public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "LoginActivity";

    private ViewFlipper background_viewflipper;
    private TextView Login_Title_Textview;

    private Button temp;

    //네이버 로그인 API 변수 파트
    private OAuthLogin mOAuthLoginModule;
    private OAuthLoginButton mOAuthLoginButton;
    private OAuthLoginHandler mOAuthLoginHandler;

    private String OAUTH_CLIENT_ID;
    private String OAUTH_CLIENT_SECRET;
    private String OAUTH_CLIENT_NAME;

    //카카오톡 로그인 API 변수 파트
    private SessionCallback callback;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        /*
        * 로그인 액티비티
        * 최종
        * 네이버
        * 카카오
        *
        * 2가지 방식으로 로그인 합니다.
        *
        *
        * 2017_09_06 : 네이버의 경우 앱명이 필요. 앱이름 확정 시 추가 인증 코드 추가
         */
        init();

    }

    private void init(){
        background_viewflipper = (ViewFlipper) findViewById(R.id.Login_ViewFlipper);
        background_viewflipper.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.fade_in));
        background_viewflipper.setOutAnimation(AnimationUtils.loadAnimation(this, R.anim.fade_out));
        //자동 Flipping 시작 (3초)
        background_viewflipper.setFlipInterval(3000);
        background_viewflipper.startFlipping();

        temp = (Button) findViewById(R.id.Login_temp_button);
        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "개발자용 건너뛰기", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginActivity.this, SheetActivity.class);
                startActivity(intent);
                finish();
            }
        });

        //네이버 로그인 API 코드 부분
        mOAuthLoginModule = OAuthLogin.getInstance();
        mOAuthLoginModule.init(
                LoginActivity.this,
                OAUTH_CLIENT_ID,
                OAUTH_CLIENT_SECRET,
                OAUTH_CLIENT_NAME
        );

        Login_Title_Textview = (TextView) findViewById(R.id.Login_Title_textview);
        Login_Title_Textview.setTypeface(Typeface.createFromAsset(getAssets(), "HoonMakdaeyunpilR.ttf"));

        mOAuthLoginHandler = new OAuthLoginHandler() {
            @Override
            public void run(boolean success) {
                if(success){
                    String accessToken = mOAuthLoginModule.getAccessToken(getApplicationContext());
                    String refreshToken = mOAuthLoginModule.getRefreshToken(getApplicationContext());
                    long expiresAt = mOAuthLoginModule.getExpiresAt(getApplicationContext());
                    String tokenType = mOAuthLoginModule.getTokenType(getApplicationContext());

                    Log.d(TAG, "AccessToken : " + accessToken);
                    Log.d(TAG, "RefreshToken : " + refreshToken);
                    Log.d(TAG, "ExpireToken : " + expiresAt);
                    Log.d(TAG, "Tokentype : " + tokenType);
                }else{
                    Toast.makeText(getApplicationContext(), "정상적으로 로그인되지 못했습니다.\n다시 시도해주십시오..", Toast.LENGTH_LONG).show();
                    Log.e(TAG, "Error : " + mOAuthLoginModule.getLastErrorCode(getApplicationContext()).getCode() + " : " + mOAuthLoginModule.getLastErrorDesc(getApplicationContext()));
                }
            }
        };

        mOAuthLoginButton = (OAuthLoginButton) findViewById(R.id.Login_naver_button);
        mOAuthLoginButton.setOAuthLoginHandler(mOAuthLoginHandler);

        mOAuthLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mOAuthLoginModule.startOauthLoginActivity(LoginActivity.this, mOAuthLoginHandler);
            }
        });

        //카카오톡 로그인 API
        callback = new SessionCallback();
        //카카오톡 해싱 이후에 살릴것.
        //Session.getCurrentSession().addCallback(callback);
    }

    //카카오톡 로그인을 위한 콜백 클래스
    private class SessionCallback implements ISessionCallback{

        @Override
        public void onSessionOpened() {
            redirectSignupActivity();
        }

        @Override
        public void onSessionOpenFailed(KakaoException exception) {
            if(exception != null){
                Log.e(TAG, "Error : " + exception);
            }

            setContentView(R.layout.activity_login);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(Session.getCurrentSession().handleActivityResult(requestCode, resultCode, data)){
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    protected void redirectSignupActivity(){
        final Intent intent = new Intent(this, KakaoSignupActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent);
        finish();
    }
}
