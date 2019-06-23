package com.example.android.bikinibottom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    /**
     * Resource ID for the background color for this list of words
     */
    private int colorCategory;

    /**
     * Create a new {@link PlaceAdapter} object.
     */
    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super( context, 0, places );
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from( getContext() ).inflate(
                    R.layout.list_item, parent, false );
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem( position );

        // Find the TextView in the list_item.xml layout with the ID name_text_view.
        TextView nameTextView = (TextView) listItemView.findViewById( R.id.name_text_view );
        nameTextView.setText( currentPlace.getName() );

        // Find the TextView in the list_item.xml layout with the ID desc_text_view.
        TextView defaultTextView = (TextView) listItemView.findViewById( R.id.desc_text_view );
        defaultTextView.setText( currentPlace.getDescription() );

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById( R.id.image );
        // Set the ImageView to the image resource specified in the current Word
        imageView.setImageResource( currentPlace.getImage() );

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}