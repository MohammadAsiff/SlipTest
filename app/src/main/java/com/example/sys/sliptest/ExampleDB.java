package com.example.sys.sliptest;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ExampleDB extends SQLiteOpenHelper {
    public static final String DATABASE="sampledb";
    public static final String TABLENAME = "employee";
    public static final String NAME = "USER_NAME";
    public static final String EMAIL = "Email";
    public static final String PASSWORD = "password";

    public ExampleDB(Context context) {
        super( context,DATABASE,null,1 );
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL( "Create table " + TABLENAME + "(" + NAME + " TEXT," + EMAIL + " TEXT,"
                + PASSWORD + " TEXT," + ")" );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL( "DROP TABLE IF EXISTS" + TABLENAME );
        onCreate( sqLiteDatabase );
    }
     public void insert(String s1,String s2,String s3){
         SQLiteDatabase sqLiteDatabase = getWritableDatabase();
         ContentValues contentValues = new ContentValues();
         contentValues.put( NAME,s1 );
         contentValues.put( EMAIL,s2 );
         contentValues.put( PASSWORD,s3 );
         sqLiteDatabase.insert( TABLENAME, null, contentValues );
         }

}
