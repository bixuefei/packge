package com.example.administrator.handler_01;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Handler handler = new Handler();
    private ImageView imageView;
    private  int images[]={R.mipmap.qwer,R.mipmap.bjtp,R.mipmap.beautiful};
    private int index;
    private MyRunnable myRunnable = new MyRunnable();

    class MyRunnable implements Runnable{

        @Override
        public void run() {
            index++;
            index=index%3;
            imageView.setImageResource(images[index]);
            handler.postDelayed(myRunnable,1000);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        handler.postDelayed(myRunnable,1000);
    }
}
