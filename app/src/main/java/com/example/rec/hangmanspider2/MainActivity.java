package com.example.rec.hangmanspider2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    public ArrayList<String> wordlist;
    private int mConstant;
    private int i;
    private int r;
    private int count;
    private int c=0;
    private int b=7;

    private char letter;

    private String dashes;


    String word;
    TextView mText;


    ImageView head;
    ImageView gallows;
    ImageView leg1;
    ImageView leg2;
    ImageView body;
    ImageView hand1;
    ImageView hand2;

    EditText mtry;
    EditText  mletter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         head=(ImageView) findViewById(R.id.imageView2);
        gallows=(ImageView) findViewById(R.id.imageView);

        leg1=(ImageView) findViewById(R.id.imageView7);
        leg2=(ImageView) findViewById(R.id.imageView6);
        hand2=(ImageView) findViewById(R.id.imageView5);
        hand1=(ImageView) findViewById(R.id.imageView4);
        body=(ImageView) findViewById(R.id.imageView3);

        Button btn=findViewById(R.id.button);
         mText=findViewById(R.id.mText);
         mletter=findViewById(R.id.editText);
         mtry=findViewById(R.id.editText1);


        mtry.setText("7");
        wordlist = new ArrayList<String>();
        wordlist.add("one");wordlist.add("two");wordlist.add("three");wordlist.add("four");wordlist.add("five");
        wordlist.add("six");wordlist.add("seven");wordlist.add("eight");wordlist.add("nine");wordlist.add("ten");
        newword();
        btn.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {

        letter=mletter.getText().toString().charAt(0);
        fillthedashes();
        if(count==word.length()){

                openActivity();

        }
        else if(b==0){openActivity2();}

    }
    public void newword(){
        Random ran =new Random();
        r=ran.nextInt(10);
         mConstant = r; wordindashes(r);


    }
    public void wordindashes(int i){
        dashes="";
       word=wordlist.get(i) ;
        int x= word.length();

        for(int j=0;j<x;j++){
            dashes=dashes +"-";
        }mText.setText(dashes);
    }
    public void fillthedashes(){
        int flag=0;


        for(int k=0;k<word.length();k++){
            if(word.charAt(k)==letter){

                count++;flag++;

                StringBuilder wordNew=new StringBuilder(dashes);
                wordNew.setCharAt(k,letter);
                dashes=wordNew.toString();
                mText.setText(dashes);
            }


        }



        if(flag==0){
            b--;c++;
            imageupdate(c);

            String str=String.valueOf(b);
            mtry.setText(str);
        }



    }
    public void imageupdate(int u){
        switch(u){
            case 1:gallows.setVisibility(View.VISIBLE);break;
            case 2:head.setVisibility(View.VISIBLE);break;
            case 3:body.setVisibility(View.VISIBLE);break;
            case 4:hand1.setVisibility(View.VISIBLE);break;
            case 5:hand2.setVisibility(View.VISIBLE);break;
            case 6:leg2.setVisibility(View.VISIBLE);break;
            case 7:leg1.setVisibility(View.VISIBLE);break;

        }
    }

    public void openActivity(){
        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);}
    public void openActivity2(){
        Intent i=new Intent(this,Main3Activity.class);
        startActivity(i);}
}
