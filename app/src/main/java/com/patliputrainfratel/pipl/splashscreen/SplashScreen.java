package com.patliputrainfratel.pipl.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by piplt on 11/18/2017.
 */

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread time = new Thread(){
            public void run(){
                try {
                    sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent splash = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(splash);
                }
            }
        };
        time.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();

    }
}
