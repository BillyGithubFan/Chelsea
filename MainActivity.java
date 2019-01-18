package com.example.cng_lau.myfirstapp;


import android.app.ListActivity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = getApplicationContext();
        Resources resources = context.getResources();


        String[] tab_names = getResources().getStringArray(R.array.tabs_names);
        String tabname1=tab_names[0];//"My Tab 1"
        String tabname2=tab_names[1];//"My Tab 2"
        String tabname3=tab_names[2];//"My Tab 3"
        String tabname4=tab_names[3];//"My Tab 4"
        String tabname5=tab_names[4];//"My Tab 5"

        String[] ninja = {tabname1, tabname2, tabname3, tabname4,tabname5};

        TypedArray ninja_icons = resources.obtainTypedArray(R.array.ninja_icons);

        setListAdapter(new ImageAndTextAdapter(context, R.layout.secondary_layout, ninja, ninja_icons));


    }

}
