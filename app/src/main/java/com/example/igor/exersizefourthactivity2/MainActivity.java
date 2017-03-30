package com.example.igor.exersizefourthactivity2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    static final private int CHOOSE_THIEF = 0;

    private Button oldButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oldButton = (Button)findViewById(R.id.button);
    }

    public void onClick(View view) {
        Intent choise = new Intent(MainActivity.this,Main2Activity.class);
        startActivityForResult(choise, CHOOSE_THIEF);
    }

    protected void onActivityResult(int requestCode,int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CHOOSE_THIEF) {
            if (resultCode == RESULT_OK) {
                String thiefname = data.getStringExtra(Main2Activity.THIEF);
                oldButton.setText(thiefname);
            }else {
                oldButton.setText("Вариант не выбран");
                String thiefname = data.getStringExtra(Main2Activity.THIEF);
                oldButton.setText(thiefname);
            }
        }

    }
}
