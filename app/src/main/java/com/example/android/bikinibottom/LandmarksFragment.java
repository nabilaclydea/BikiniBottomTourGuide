package com.example.android.bikinibottom;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class LandmarksFragment extends Fragment {


    public LandmarksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.place_list, container, false );

        /** TODO: Insert all the code from the NumberActivity’s onCreate() method after the setContentView method call */
        // Create a list of words
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add( new Place( getString( R.string.landmarks_jellyfish_fields ),
                getString( R.string.desc_landmarks_jellyfish_fields ),
                R.drawable.landmarks_jellyfish_fields ) );
        places.add( new Place( getString( R.string.landmarks_kelp_forest ),
                getString( R.string.desc_landmarks_kelp_forest ),
                R.drawable.landmarks_kelp_forest ) );
        places.add( new Place( getString( R.string.landmarks_goo_lagoon ),
                getString( R.string.desc_landmarks_goo_lagoon ),
                R.drawable.landmarks_goo_lagoon ) );
        places.add( new Place( getString( R.string.landmarks_sand_mountain ),
                getString( R.string.desc_landmarks_sand_mountain ),
                R.drawable.landmarks_sand_mountain ) );
        places.add( new Place( getString( R.string.landmarks_sulfur_fields ),
                getString( R.string.desc_landmarks_sulfur_fields ),
                R.drawable.landmarks_sulfur_fields ) );
        places.add( new Place( getString( R.string.landmarks_makeout_reef ),
                getString( R.string.desc_landmarks_makeout_reef ),
                R.drawable.landmarks_makeout_reef ) );
        places.add( new Place( getString( R.string.landmarks_brain_coral_fields ),
                getString( R.string.desc_landmarks_brain_coral_fields ),
                R.drawable.landmarks_brain_coral_fields ) );
        places.add( new Place( getString( R.string.landmarks_sea_needle ),
                getString( R.string.desc_landmarks_sea_needle ),
                R.drawable.landmarks_sea_needle ) );

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter( getActivity(), places );

        ListView listView = (ListView) rootView.findViewById( R.id.list );

        listView.setAdapter( adapter );

        return rootView;
    }

}