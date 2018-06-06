package com.example.rec.hangmanspider2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    TextView mtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn=findViewById(R.id.button2);
        mtext=findViewById(R.id.textView3);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        openActivity2();
    }
    public void openActivity2(){
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);}
}
