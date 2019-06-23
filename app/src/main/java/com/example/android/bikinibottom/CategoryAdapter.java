package com.example.android.bikinibottom;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    private Context context;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super( fm );
        this.context = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new LandmarksFragment();
        } else if (position == 1) {
            return new StoresFragment();
        } else if (position == 2) {
            return new RestaurantsFragment();
        } else {
            return new MuseumsFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString( R.string.category_landmarks );
        } else if (position == 1) {
            return context.getString( R.string.category_stores );
        } else if (position == 2) {
            return context.getString( R.string.category_restaurants );
        } else {
            return context.getString( R.string.category_museums );
        }
    }
}