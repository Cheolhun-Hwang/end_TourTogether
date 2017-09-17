package com.hchooney.qewqs.tourtogether.Global;

import android.app.Activity;
import android.app.Application;

import com.hchooney.qewqs.tourtogether.Kakaotalk.KakaoSDKAdapter;
import com.kakao.auth.KakaoSDK;

/**
 * Created by qewqs on 2017-09-06.
 */

public class ApplicationController extends Application{
    private static ApplicationController instance = null;
    private static volatile Activity currentActivity = null;

    public static ApplicationController getInstance(){
        return instance;
    }

    @Override
    public void onCreate(){
        super.onCreate();

        ApplicationController.instance = this;
        KakaoSDK.init(new KakaoSDKAdapter());

    }

    public static Activity getCurrentActivity(){
        return currentActivity;
    }

    public static void setCurrentActivity(Activity currentActivity){
        ApplicationController.currentActivity = currentActivity;
    }

    @Override
    public void onTerminate(){
        super.onTerminate();
        instance = null;
    }
}
