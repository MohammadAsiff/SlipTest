package com.example.sys.sliptest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.internal.NavigationMenu;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {
    public static final String NAME="Name";
    public static final String EMAIL="Email";
    public static final String PASSWORD="Password";
 public EditText e1,e2,e3;
 Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main3 );
        e1=findViewById( R.id.et1 );
        e2=findViewById( R.id.et2 );
        e3=findViewById( R.id.et3 );
        b=findViewById( R.id.btn1 );
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           boolean isValid=true;
           String s1=e1.getText(  ).toString().trim();
           String s2=e2.getText(  ).toString().trim();
           String s3=e3.getText(  ).toString().trim();
                if (s1.isEmpty()){
                    isValid=false;
                    e3.setError( "ENTER NAME" );
                }
                if (s1.isEmpty()){
                    isValid=false;
                    e3.setError( "ENTER EmailId" );
                }
                if (s1.isEmpty()){
                    isValid=false;
                    e3.setError( "ENTER Password" );
                }
                if (isValid)
                {
                    SharedPreferences preferences=getSharedPreferences( "prefs",MODE_PRIVATE );
                    SharedPreferences.Editor editor=preferences.edit();
                    editor.putString( NAME,s1 );
                    editor.putString( EMAIL,s2 );
                    editor.putString( PASSWORD,s3 );
                    Intent i=new Intent( Main3Activity.this,Main2Activity.class );
                    startActivity( i );
                    }

            }
        } );
    }
}
