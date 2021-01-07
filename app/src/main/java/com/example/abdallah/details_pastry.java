package com.example.abdallah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class details_pastry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_details_pastry );

        final TextView details_textview_pastry=findViewById ( R.id.details_textview_pastry );
        final TextView namedetails_pastry=findViewById (R.id.namedetails_pastry);
        final ImageView backepastry_button=findViewById ( R.id.backepastry );
        final ImageView phtopastrydetails=findViewById ( R.id.imageviewdetailspastry );


        Intent intentdetails_pastry =  getIntent();
        String details_pastry = intentdetails_pastry.getStringExtra("details_pastry");
        String name_pastry = intentdetails_pastry.getStringExtra("name_pastry");
        String photopastry=intentdetails_pastry.getStringExtra ("photopastry");
        phtopastrydetails.setImageResource (getResources ().getIdentifier (photopastry,"drawable",getPackageName () ));
        details_textview_pastry.setText(details_pastry);
        namedetails_pastry.setText (name_pastry);


    }
}
