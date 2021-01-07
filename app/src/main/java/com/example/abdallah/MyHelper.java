package com.example.abdallah;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class MyHelper extends SQLiteOpenHelper {


    public MyHelper( Context context, String name , int version) {
        super ( context, name, null, version );
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL ("CREATE TABLE sweets_dp(name_sweets text not null,photo_sweets text not null ,dataintent_sweets text not null )");
        db.execSQL ("CREATE TABLE pastry_dp(name_pastry text not null,photo_pastry text not null ,dataintent_pastry text not null )");

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
