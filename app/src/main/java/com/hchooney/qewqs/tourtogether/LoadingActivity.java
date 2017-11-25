package com.hchooney.qewqs.tourtogether;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.File;

public class LoadingActivity extends AppCompatActivity {
    private final String TAG = "LoadingActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        Thread turnActivity = new Thread(new Runnable() {
            @Override
            public void run() {
                //데이터를 백업하는 과정입니다.
                checkData();
                //일단 2초로 설정
                IntentActivityAfterSec(2);
            }
        });

        turnActivity.start();
    }

    private void IntentActivityAfterSec(int sec){
        /*
        sec의 경우 초로 입력 받으며 sec * 1000을 해줘야됨
        Sleep의 경우 밀리초
         */
        try{
            Thread.sleep(sec*1000);

            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(intent);
            finish();
        }catch (Exception e){
            e.printStackTrace();
            Log.e(TAG, "IntentActivityAfterSec Error");
        }
    }

    private void checkData(){

    }


    private boolean isCash(){
        //path 부분엔 파일 경로를 지정해주세요.
        File files = new File("tourtogethercash.txt");
        //파일 유무를 확인합니다.
        if(files.exists()==true) {
            //파일이 있을시
            return true;
        } else {
            //파일이 없을시
            return false;
        }

    }
}
