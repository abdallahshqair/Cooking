package com.example.abdallah;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MySweetsViewHolder extends RecyclerView.ViewHolder {
    ImageView photosweets;
    TextView namesweets;
    public MySweetsViewHolder(@NonNull View itemView) {

        super ( itemView );
        photosweets=itemView.findViewById (R.id.imagesweets);
        namesweets=itemView.findViewById ( R.id.namesweets );
    }
}
