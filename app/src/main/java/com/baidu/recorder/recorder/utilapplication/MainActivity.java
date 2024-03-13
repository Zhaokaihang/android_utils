package com.baidu.recorder.recorder.utilapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.zkh.util.UtilsContext;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UtilsContext.init(this);
    }
}