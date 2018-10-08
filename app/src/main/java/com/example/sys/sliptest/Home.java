package com.example.sys.sliptest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Home extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.home,container,false);
        Log.i("onCreateView", "called");

        ImageView im1=view.findViewById( R.id.c1 );
        ImageView im2=view.findViewById( R.id.c2 );
        ImageView im3=view.findViewById( R.id.c3 );
        ImageView im4=view.findViewById( R.id.c4 );
        ImageView im5=view.findViewById( R.id.c5 );
        im1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Web w=new Web();
                FragmentManager manager1 = getFragmentManager();
                FragmentTransaction transaction1 = manager1.beginTransaction();
                transaction1.replace( R.id.f1,w );
                transaction1.commit();
            }
        } );
        im2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Digi d=new Digi();
                FragmentManager manager2 = getFragmentManager();
                FragmentTransaction transaction2 = manager2.beginTransaction();
                transaction2.replace( R.id.f1,d );
                transaction2.commit();

            }
        } );
        im3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Interior i=new Interior();
                FragmentManager manager3 = getFragmentManager();
                FragmentTransaction transaction3 = manager3.beginTransaction();
                transaction3.replace( R.id.f1,i );
                transaction3.commit();

            }
        } );
        im4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Mapp mp=new Mapp();
                FragmentManager manager4 = getFragmentManager();
                FragmentTransaction transaction4 = manager4.beginTransaction();
                transaction4.replace( R.id.f1,mp );
                transaction4.commit();

            }
        } );
        im5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Printing p=new Printing();
                FragmentManager manager4 = getFragmentManager();
                FragmentTransaction transaction4 = manager4.beginTransaction();
                transaction4.replace( R.id.f1,p );
                transaction4.commit();

            }
        } );
        return view;
    }
}
