package com.example.abdallah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details_Sweets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_details__sweets );

        final TextView details_textview =  findViewById(R.id.details_textview);
        final TextView nameintent=findViewById ( R.id.nameintent );
        final ImageView backedetails_sweets=findViewById (R.id.detailsbackepastry );
        final ImageView photo_sweets_details=findViewById (R.id.imageviewdetails_sweets);


        Intent intentdetails_sweets =  getIntent();


        if(intentdetails_sweets.hasExtra ("details_sweets")&&intentdetails_sweets.hasExtra ( "name_sweets" )){
        String details_sweets = intentdetails_sweets.getStringExtra("details_sweets");
        String nameintent_sweets=intentdetails_sweets.getStringExtra ( "name_sweets" );
        String photo_sweets_d=intentdetails_sweets.getStringExtra ("photo_sweets");

        details_textview.setText(details_sweets);
        nameintent.setText (nameintent_sweets);
        photo_sweets_details.setImageResource (getResources ().getIdentifier (photo_sweets_d,"drawable",getPackageName () ));

        }else {


        }



    }
}
