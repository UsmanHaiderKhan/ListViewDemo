package com.example.usmankhan.listviewdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdpter extends ArrayAdapter<String> {

    public CustomAdpter( Context context, String[] fruits) {

        super( context,R.layout.custom_row, fruits );
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater myInflater=LayoutInflater.from( getContext() );
        View CustomView=myInflater.inflate( R.layout.custom_row,parent,false );
        String singFurities=getItem( position );
        TextView textView=(TextView) CustomView.findViewById( R.id.mytext );
        ImageView imageView=(ImageView) CustomView.findViewById( R.id.myimg );

        textView.setText( singFurities );
        imageView.setImageResource( R.drawable.apple );
        return CustomView;

    }
}
