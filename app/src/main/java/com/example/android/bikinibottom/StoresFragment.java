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
public class StoresFragment extends Fragment {


    public StoresFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.place_list, container, false );

        /** TODO: Insert all the code from the NumberActivity’s onCreate() method after the setContentView method call */
        // Create a list of words
        ArrayList<Place> places = new ArrayList<Place>();
        places.add( new Place( getString( R.string.stores_barg_n_mart ),
                getString( R.string.desc_stores_bargnmart ),
                R.drawable.stores_barg_n_mart ) );
        places.add( new Place( getString( R.string.stores_bikini_bottom_supermarket ),
                getString( R.string.desc_stores_bikinibottom_supermarket ),
                R.drawable.stores_bikini_bottom_supermarket ) );
        places.add( new Place( getString( R.string.stores_bikini_bottom_mall ),
                getString( R.string.desc_stores_bikini_bottom_mall ),
                R.drawable.stores_bikini_bottom_mall ) );
        places.add( new Place( getString( R.string.stores_palace_of_pranks ),
                getString( R.string.desc_stores_palace_of_pranks ),
                R.drawable.stores_palace_of_pranks ) );
        places.add( new Place( getString( R.string.stores_hats ),
                getString( R.string.desc_stores_hats ),
                R.drawable.stores_hats ) );
        places.add( new Place( getString( R.string.stores_magic_shop ),
                getString( R.string.desc_stores_magic_shop ),
                R.drawable.stores_magic_shop ) );
        places.add( new Place( getString( R.string.stores_near_mint_comic_books ),
                getString( R.string.desc_stores_near_mint_comic_books ),
                R.drawable.stores_near_mint_comic_books ) );
        places.add( new Place( getString( R.string.stores_guppies_r_us ),
                getString( R.string.desc_stores_guppies_r_us ),
                R.drawable.stores_guppies_r_us ) );

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter( getActivity(), places );

        ListView listView = (ListView) rootView.findViewById( R.id.list );

        listView.setAdapter( adapter );

        return rootView;
    }

}