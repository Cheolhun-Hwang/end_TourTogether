package com.hchooney.qewqs.tourtogether;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.File;

public class RoadingActivity extends AppCompatActivity {
    private final String TAG = "RoadingActivity";
    private final String Version = "1.0.0.1";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roading);

        /*
        * 로딩 액티비티
        *
        * 회사 로고 및 자동 로그인 데이터 받기, 캐쉬 데이터 백업 등에서 이용된다. 또한
        * 차후 업데이트 시 이에 강제 업데이트를 위한 부분이 현 액티비티에 들어간다.
        *
        *
         */

        /*
        * App 버전 확인
        * 버전이 맞지 않으면 강제 업데이트가 필요하다고 알림
         */



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

    private boolean isVersion(){
        /*
        *parsion
         */

        if(Version.equals("1.0.0.1")){
            return true;
        }else{
            return false;
        }
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

    private void checkData(){
        if(!(isVersion())){
            Log.e(TAG, "App Version Check Error. Pleas Check your App's Version");
            /*
            * 추후 앱 버전이 다르면 앱을 홀드 시키고 해당 스토어로 이동합니다.
             */

        }else{
            if(isCash()){
                /*
                * 앱에 기존 들어온 기록이 있다면
                * 기존 캐쉬파일을 백업하고 바로 메인으로 이동합니다.
                 */

            }else{
                /*
                * 앱에 첫 들어오거나 백업한 상태라면 로그인을 하도록 합니다.
                * 로그인시 네이버의 고유 id를 통해 firebase 에서 기존 기록이 있는지 찾습니다.
                *
                * 기존에 들어온 기록이 없다면 로그인 페이지로 이동합니다.
                * 만약 기존에 들어온 기록이 있다면 백업하여 파일로 저장합니다.
                * 이후 메인 페이지로 이동합니다.
                *
                 */
            }
        }
    }

}
