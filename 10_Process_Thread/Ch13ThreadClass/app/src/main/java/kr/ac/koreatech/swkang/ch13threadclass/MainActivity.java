package kr.ac.koreatech.swkang.ch13threadclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    CountThread w;
    boolean running = true;
    int mCount = 0;
    TextView tv;

    // 작업 스레드로 사용할 Thread 클래스의 subclass 정의
    class CountThread extends Thread {
        public void run() {
            int i = 0;
            for(i=0; i < 20 && running; i++) {
                // count 값 1 증가


                try {
                    // thread 1초간 sleep

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Log.d("Mobile Programming", "Thread: time=" + mCount);
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.textv);
    }

    @Override
    protected void onStart() {
        super.onStart();

        // 작업 스레드 객체 생성


        // 작업 스레드 시작


        running = true;
    }

    @Override
    protected void onStop() {
        super.onStop();

        running = false;
    }

    public void onClick(View vieW) {
        // TextView의 count 값 갱신

    }
}
