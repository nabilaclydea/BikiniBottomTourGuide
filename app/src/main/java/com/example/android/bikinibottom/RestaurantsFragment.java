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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.place_list, container, false );

        /** TODO: Insert all the code from the NumberActivity’s onCreate() method after the setContentView method call */
        // Create a list of words
        ArrayList<Place> places = new ArrayList<Place>();
        places.add( new Place( getString( R.string.restaurants_krusty_krab ),
                getString( R.string.desc_restaurants_krusty_krab ),
                R.drawable.restaurants_krusty_krab ) );
        places.add( new Place( getString( R.string.restaurants_chum_bucket ),
                getString( R.string.desc_restaurants_chum_bucket ),
                R.drawable.restaurants_chum_bucket ) );
        places.add( new Place( getString( R.string.restaurants_diner ),
                getString( R.string.desc_restaurants_diner ),
                R.drawable.restaurants_diner ) );
        places.add( new Place( getString( R.string.restaurants_fancy ),
                getString( R.string.desc_restaurants_fancy ),
                R.drawable.restaurants_fancy ) );
        places.add( new Place( getString( R.string.restaurants_goofy_goobers_ice_cream_party_boat ),
                getString( R.string.desc_restaurants_goofy_goobers_ice_cream_party_boat ),
                R.drawable.restaurants_goofy_goobers_ice_cream_party_boat ) );
        places.add( new Place( getString( R.string.restaurants_the_salty_spitoon ),
                getString( R.string.desc_restaurants_the_salty_spitoon ),
                R.drawable.restaurants_the_salty_spitoon ) );
        places.add( new Place( getString( R.string.restaurants_winnie_hut_jr ),
                getString( R.string.desc_restaurants_winnie_hut_jr ),
                R.drawable.restaurants_winnie_hut_jr ) );

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter( getActivity(), places );

        ListView listView = (ListView) rootView.findViewById( R.id.list );

        listView.setAdapter( adapter );

        return rootView;
    }

}