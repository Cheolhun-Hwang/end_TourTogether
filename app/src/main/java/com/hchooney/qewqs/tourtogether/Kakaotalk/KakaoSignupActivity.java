package com.hchooney.qewqs.tourtogether.Kakaotalk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.hchooney.qewqs.tourtogether.LoginActivity;
import com.hchooney.qewqs.tourtogether.MainActivity;
import com.kakao.auth.ErrorCode;
import com.kakao.network.ErrorResult;
import com.kakao.usermgmt.UserManagement;
import com.kakao.usermgmt.callback.MeResponseCallback;
import com.kakao.usermgmt.response.model.UserProfile;

/**
 * Created by qewqs on 2017-09-06.
 */

public class KakaoSignupActivity extends Activity {
    private static final String TAG = "KakaoSignupActivity";

    @Override
    protected void onCreate(final Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }

    protected void requestMe(){ //유저정보를 받아오는 함수
        UserManagement.requestMe(new MeResponseCallback() {
            @Override
            public void onFailure(ErrorResult errorResult){
                String message = "failed to get user info. msg = " + errorResult;
                Log.e(TAG, message);

                ErrorCode result = ErrorCode.valueOf(errorResult.getErrorCode());
                if(result == ErrorCode.CLIENT_ERROR_CODE){
                    finish();
                }else{
                    redirectLoginActivity();
                }
            }
            @Override
            public void onSessionClosed(ErrorResult errorResult) {
                redirectLoginActivity();
            }

            @Override
            public void onNotSignedUp() {
                showSingup();
            }

            @Override
            public void onSuccess(UserProfile result) {
                Log.d(TAG, "UserProfile : " + result);
                Log.d(TAG, "User : " + result.toString());
                redirectMainActivity();
                // 차후 파일에 저장하여 읽을것인지 값을 넘겨줄것인지 고민해야됨
            }
        });
    }

    protected void showSingup(){
        redirectLoginActivity();
    }

    protected void redirectMainActivity(){
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    protected void redirectLoginActivity(){
        final Intent intent = new Intent(this, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent);
        finish();
    }
}
