package com.example.aplicaciones3.fragments2;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements frag1.OnFragmentInteractionListener, frag2.OnFragmentInteractionListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                FragmentTransaction ff= getSupportFragmentManager().beginTransaction();
                frag1 f1 = frag1.newInstance("id","KATIA");
                ff.replace(R.id.contenedor,f1).commit();
            }
        });


        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                FragmentTransaction ff= getSupportFragmentManager().beginTransaction();
                frag2 f2 = frag2.newInstance("id","PAOLA");
                ff.replace(R.id.contenedor,f2).commit();

            }
        });



    }//cierra onCreate


    @Override
    public void onFragmentInteraction(Uri uri)
    {

    }
}//CIERRA EL MAIN
