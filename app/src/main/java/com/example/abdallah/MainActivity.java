package com.example.abdallah;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    public static MyHelper helper;

.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

    helper=new MyHelper (getApplicationContext (),"cooking32" ,7);

          final LinearLayout linearLayoutpastry= findViewById ( R.id.linearLayout_pastry );
        final LinearLayout linearLayoutsweets= findViewById ( R.id.linearLayout_sweets );
        linearLayoutpastry.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent (getApplicationContext (),pastry.class);
                startActivityForResult(intent,100);

            }
        } );
        linearLayoutsweets.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent ( getApplicationContext (),sweets.class);
                startActivityForResult(intent1,100);

            }
        } );






    }
}
