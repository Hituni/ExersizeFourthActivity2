package com.example.igor.exersizefourthactivity2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Main2Activity extends AppCompatActivity {

    public final static String THIEF = new String("key");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onRadioButtonClick(View view) {
        Intent answer = new Intent();
        switch (view.getId()){
            case R.id.radioButton: answer.putExtra(THIEF,"1"); break;
            case R.id.radioButton2: answer.putExtra(THIEF,"2"); break;
            case R.id.radioButton3: answer.putExtra(THIEF,"3"); break;
            default:break;
        }
        System.out.println(view.getId());
        setResult(RESULT_OK,answer);
        finish();
    }
}
