package com.example.sys.sliptest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.regex.Pattern;

public class Main2Activity extends AppCompatActivity {

    public Button log,sign;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );
        log=findViewById( R.id.bt1 );
        sign=findViewById( R.id.bt2 );
        log.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( Main2Activity.this,NavigationActivity.class ) );
            }
        } );
        sign.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( Main2Activity.this,Main3Activity.class ) );
            }
        } );

    }
}
