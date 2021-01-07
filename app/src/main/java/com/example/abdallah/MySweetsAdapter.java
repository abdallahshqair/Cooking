package com.example.abdallah;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MySweetsAdapter extends RecyclerView.Adapter<MySweetsViewHolder> {

    ArrayList<Datasweets> arrayListdatasweets;
    int itemLayoutId;

    public  MySweetsAdapter(ArrayList<Datasweets> arrayListdatasweets, int itemLayoutId) {
        this.arrayListdatasweets = arrayListdatasweets;
        this.itemLayoutId = itemLayoutId;

    }

    @NonNull
    @Override
    public MySweetsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View view=LayoutInflater.from(parent.getContext ()).inflate (itemLayoutId,parent,false );
        MySweetsViewHolder mySweetsViewHolder=new MySweetsViewHolder (view);
        return mySweetsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final MySweetsViewHolder SweetsViewHolderholder, int postion) {
        final Datasweets datasweets=arrayListdatasweets.get ( postion );
        SweetsViewHolderholder.photosweets.setImageResource (SweetsViewHolderholder.itemView.getContext ().getResources ().getIdentifier (datasweets.getPhotosweets (),"drawable",SweetsViewHolderholder.itemView.getContext ().getPackageName ()));

        SweetsViewHolderholder.namesweets.setText (datasweets.getNamesweets () );
        SweetsViewHolderholder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent_dtails_sweets = new Intent (SweetsViewHolderholder.itemView.getContext(),Details_Sweets.class);
                intent_dtails_sweets.putExtra("details_sweets",datasweets.getDatasweets ());
                intent_dtails_sweets.putExtra ("name_sweets",datasweets.getNamesweets ());
                intent_dtails_sweets.putExtra ("photo_sweets",datasweets.getPhotosweets ());

                SweetsViewHolderholder.itemView.getContext().startActivity(intent_dtails_sweets);


            }
        });
    }




    @Override
    public int getItemCount() {
        return arrayListdatasweets.size ();
    }
}
