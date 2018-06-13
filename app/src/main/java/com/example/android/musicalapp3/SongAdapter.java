package com.example.android.musicalapp3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    private static final String LOG_TAG = SongAdapter.class.getSimpleName();
    private Object currentSongAdapter;

    public SongAdapter(Activity context, ArrayList<Song> songs) {

        super(context, 0,  songs);
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


//        public AndroidFlavorAdapter(Activity context, ArrayList<AndroidFlavor> androidFlavors) {
//            // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
//            // the second argument is used when the ArrayAdapter is populating a single TextView.
//            // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
//            // going to use this second argument, so it can be any value. Here, we used 0.
//            super(context, 0, androidFlavors);
//        }
//
        //return super.getView(position,convertView,parent);
        //    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
// Get the {@link AndroidFlavor} object located at this position in the list
        // Get the {@link Word} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView musicTextView = (TextView) listItemView.findViewById(R.id.siouxsie_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView

        musicTextView.setText(currentSong.getDefaultSong());


//        //find the textview in list_item with id miwok_text_view
//        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
//        //gets the miwok Translation and set it to the text of this textView
//        miwokTextView.setText(word_item.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.marywells_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        defaultTextView.setText(currentSong.getSiouxsieSong());


//        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
//        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
//        // Get the image resource ID from the current AndroidFlavor object and
//        // set the image to iconView
//        iconView.setImageResource(currentSongAdapter.getImageResourceId());



        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }



}