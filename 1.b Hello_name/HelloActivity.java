package com.example.android_class;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class HelloActivity extends AppCompatActivity {
    TextView tv;
    Button bt;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        tv = (TextView)findViewById(R.id.textView1);
        bt = (Button)findViewById(R.id.button);
        et = (EditText)findViewById(R.id.editText);
    }

    public void onClickBtn(View view) {
        String s = et.getText().toString();
        tv.setText("Hello "+s);
    }
}
