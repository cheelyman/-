package com.example.jettrxjavademo_20201014;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import com.example.jettrxjavademo_20201014.mapop.Function;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(Emitter<String> emitter) {
                emitter.onNext("大家好");
            }
        }).map(new Function<String,String>() {
            @Override
            public String apply(String t) {
                String u=t+"111";
                return u;
            }
        }).map(new Function<String,String>() {
            @Override
            public String apply(String t) {
                String u=t+"222";
                return u;
            }
        })

                .subscribeObserver(new Observer() {
            @Override
            public void onNext(Object o) {
                Log.i("jett2","msg="+o.toString());
            }

            @Override
            public void onSubscribe() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }
}
