package com.example.abdallah;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MypastryViewHolder extends RecyclerView.ViewHolder {
    ImageView photopastry;
    TextView namepastry;
    public  MypastryViewHolder(@NonNull View itemView) {

        super ( itemView );
        photopastry=itemView.findViewById (R.id.imagesweets);
        namepastry=itemView.findViewById ( R.id.namesweets );
    }
}

