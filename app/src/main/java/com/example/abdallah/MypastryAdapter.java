package com.example.abdallah;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MypastryAdapter extends RecyclerView.Adapter<MypastryViewHolder> {
    ArrayList<DataPastry> arrayListdatapastry;
    int itemLayoutId;

    public MypastryAdapter(ArrayList<DataPastry> arrayListdatapastry, int itemLayoutId) {
        this.arrayListdatapastry=arrayListdatapastry;

        this.itemLayoutId = itemLayoutId;

    }

    @NonNull
    @Override
    public MypastryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View view = LayoutInflater.from ( parent.getContext () ).inflate ( itemLayoutId, parent, false );
        MypastryViewHolder mypastryViewHolder = new MypastryViewHolder ( view );
        return mypastryViewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull final MypastryViewHolder mypastryViewHolder, int postion) {
        final DataPastry arraylistdatapastry = arrayListdatapastry.get ( postion );
        mypastryViewHolder.photopastry.setImageResource ( mypastryViewHolder.itemView.getContext ().getResources ().getIdentifier ( arraylistdatapastry.getPhotopastry (), "drawable", mypastryViewHolder.itemView.getContext ().getPackageName () ) );
        mypastryViewHolder.namepastry.setText ( arraylistdatapastry.getNamepastry () );
        mypastryViewHolder.itemView.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent_dtails_pastry = new Intent ( mypastryViewHolder.itemView.getContext (), details_pastry.class );
                intent_dtails_pastry.putExtra ( "details_pastry", arraylistdatapastry.getDatapastry () );
                intent_dtails_pastry.putExtra ( "name_pastry", arraylistdatapastry.getNamepastry () );

                intent_dtails_pastry.putExtra ( "photopastry", arraylistdatapastry.getPhotopastry () );


                mypastryViewHolder.itemView.getContext ().startActivity ( intent_dtails_pastry );


            }
        } );
    }



    @Override
    public int getItemCount() {
        return arrayListdatapastry.size ();
    }}
