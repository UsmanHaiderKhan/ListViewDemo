package com.example.usmankhan.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        String[] fruits={"Apple","Peach","Orange","Mango"};
        ListAdapter adapter=new CustomAdpter( this,fruits );
        ListView myListView=(ListView) findViewById( R.id.myListView );
        myListView.setAdapter( adapter );

        myListView.setOnItemClickListener(
           new AdapterView.OnItemClickListener(){
               @Override
               public void onItemClick(AdapterView<?> parent, View view,int positon,long id){
                String fruit=String.valueOf( parent.getItemAtPosition( positon ) );
                   Toast.makeText( MainActivity.this,fruit,Toast.LENGTH_LONG ).show();

               }
           }
        );

    }
}
