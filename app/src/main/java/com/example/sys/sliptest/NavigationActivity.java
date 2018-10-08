package com.example.sys.sliptest;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class NavigationActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_navigation );
        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );

        FloatingActionButton fab = (FloatingActionButton) findViewById( R.id.fab );
        fab.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make( view, "Replace with your own action", Snackbar.LENGTH_LONG )
                        .setAction( "Action", null ).show();
            }
        } );

        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close );
        drawer.addDrawerListener( toggle );
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById( R.id.nav_view );
        navigationView.setNavigationItemSelectedListener( this );
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );
        if (drawer.isDrawerOpen( GravityCompat.START )) {
            drawer.closeDrawer( GravityCompat.START );
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate( R.menu.navigation, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected( item );
    }

    @SuppressLint("ResourceType")
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        if (id == R.id.nav_home) {
            Home h =new Home();
            FragmentManager manager5 = getSupportFragmentManager();
            FragmentTransaction transaction5 = manager5.beginTransaction();
            transaction5.replace( R.id.f1,h );
            transaction5.commit();
        }


        else if (id == R.id.nav_about) {
            About about=new About();
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.replace( R.id.f1,about );
            transaction.commit();


        } else if (id == R.id.nav_webdesign) {
                       Web w=new Web();
            FragmentManager manager1 = getSupportFragmentManager();
            FragmentTransaction transaction1 = manager1.beginTransaction();
            transaction1.replace( R.id.f1,w );
            transaction1.commit();

        } else if (id == R.id.nav_digital) {
            Digi d=new Digi();
            FragmentManager manager2 = getSupportFragmentManager();
            FragmentTransaction transaction2 = manager2.beginTransaction();
            transaction2.replace( R.id.f1,d );
            transaction2.commit();

        } else if (id == R.id.nav_3d) {
            Printing p=new Printing();
            FragmentManager manager4 = getSupportFragmentManager();
            FragmentTransaction transaction4 = manager4.beginTransaction();
            transaction4.replace( R.id.f1,p );
            transaction4.commit();



        } else if (id == R.id.nav_interior) {
            Interior i=new Interior();
            FragmentManager manager3 = getSupportFragmentManager();
            FragmentTransaction transaction3 = manager3.beginTransaction();
            transaction3.replace( R.id.f1,i );
            transaction3.commit();



        } else if (id == R.id.nav_mobileapps) {
           Mapp mp=new Mapp();
            FragmentManager manager4 = getSupportFragmentManager();
            FragmentTransaction transaction4 = manager4.beginTransaction();
            transaction4.replace( R.id.f1,mp );
            transaction4.commit();


        }

        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );
        drawer.closeDrawer( GravityCompat.START );
        return true;
    }



}
