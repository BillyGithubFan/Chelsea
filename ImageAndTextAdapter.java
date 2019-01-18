package com.example.cng_lau.myfirstapp;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageAndTextAdapter extends ArrayAdapter<String> {

    private LayoutInflater mInflater;

    private String[] mStrings;
    private TypedArray mIcons;

    private int mViewResourceId;

    public ImageAndTextAdapter(Context ctx, int viewResourceId,
                               String[] strings, TypedArray icons) {
        super(ctx, viewResourceId, strings);

        //instantiate layout XML file into its corresponding view objects which can be used in java programs.
        mInflater = (LayoutInflater)ctx.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);

        mStrings = strings;
        mIcons = icons;

        mViewResourceId = viewResourceId;
    }


        @Override
    public int getCount() {return mStrings.length;}

    @Override
    public String getItem(int position) {return mStrings[position];}

    @Override
    public long getItemId(int position) {return 0;}


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = mInflater.inflate(mViewResourceId, null);

        //find the "imageView" in secondary_layout.xml, and then set the image icon
        ImageView iv = (ImageView)((View) convertView).findViewById(R.id.imageView);
        iv.setImageDrawable(mIcons.getDrawable(position));

        //find the "textView" in secondary_layout.xml, and then set the text
        TextView tv = (TextView)convertView.findViewById(R.id.textView);
        tv.setText(mStrings[position]);


        return convertView;
    }


}
