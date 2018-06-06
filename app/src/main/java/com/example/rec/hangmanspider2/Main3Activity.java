package com.example.rec.hangmanspider2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    private Button btn;
    private TextView mtext;
    private ImageView mimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btn=findViewById(R.id.button3);
        mimage=findViewById(R.id.imageView8);
        mtext=findViewById(R.id.textView4);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        openAcivity();
    }
    public void openAcivity(){
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
