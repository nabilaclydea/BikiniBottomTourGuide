package com.example.android.bikinibottom;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.place_list, container, false );

        /** TODO: Insert all the code from the NumberActivity’s onCreate() method after the setContentView method call */
        // Create a list of words
        ArrayList<Place> places = new ArrayList<Place>();
        places.add( new Place( getString( R.string.museums_fry_cook_museum ),
                getString( R.string.desc_museums_fry_cook_museum ),
                R.drawable.museums_fry_cook_museum ) );
        places.add( new Place( getString( R.string.museums_hook_museum ),
                getString( R.string.desc_museums_hook_museum ),
                R.drawable.museums_hook_museum ) );
        places.add( new Place( getString( R.string.museums_bikini_bottom_boat_museum ),
                getString( R.string.desc_museums_bikini_bottom_boat_museum ),
                R.drawable.museums_bikini_bottom_boat_museum ) );

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter( getActivity(), places );

        ListView listView = (ListView) rootView.findViewById( R.id.list );

        listView.setAdapter( adapter );

        return rootView;
    }

}