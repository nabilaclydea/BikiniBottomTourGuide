/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.bikinibottom;

import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView( R.layout.activity_main );

        // Find the toolbar that shows app name
        final Toolbar toolbar = findViewById( R.id.toolbar );

        // Set title of the toolbar
        toolbar.setTitle( getResources().getString( R.string.app_name ) );

        // Find the view pager that will allow the user to swipe between fragments
        final ViewPager viewPager = (ViewPager) findViewById( R.id.viewpager );

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter( this, getSupportFragmentManager() );

        // Set the adapter onto the view pager
        viewPager.setAdapter( adapter );

        // Find the tab layout that shows the tabs
        final TabLayout tabLayout = (TabLayout) findViewById( R.id.tabs );

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager( viewPager );

        tabLayout.addOnTabSelectedListener( new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem( tab.getPosition() );
                if (tab.getPosition() == 0) {
                    toolbar.setBackgroundColor( ContextCompat.getColor( MainActivity.this,
                            R.color.category_landmarks ) );
                    tabLayout.setBackgroundColor( ContextCompat.getColor( MainActivity.this,
                            R.color.category_landmarks ) );
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getWindow().setStatusBarColor( ContextCompat.getColor( MainActivity.this,
                                R.color.category_landmarks ) );
                    }
                } else if (tab.getPosition() == 1) {
                    toolbar.setBackgroundColor( ContextCompat.getColor( MainActivity.this,
                            R.color.category_stores ) );
                    tabLayout.setBackgroundColor( ContextCompat.getColor( MainActivity.this,
                            R.color.category_stores ) );
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getWindow().setStatusBarColor( ContextCompat.getColor( MainActivity.this,
                                R.color.category_stores ) );
                    }
                } else if (tab.getPosition() == 2) {
                    toolbar.setBackgroundColor( ContextCompat.getColor( MainActivity.this,
                            R.color.category_restaurants ) );
                    tabLayout.setBackgroundColor( ContextCompat.getColor( MainActivity.this,
                            R.color.category_restaurants ) );
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getWindow().setStatusBarColor( ContextCompat.getColor( MainActivity.this,
                                R.color.category_restaurants ) );
                    }
                } else {
                    toolbar.setBackgroundColor( ContextCompat.getColor( MainActivity.this,
                            R.color.category_museums ) );
                    tabLayout.setBackgroundColor( ContextCompat.getColor( MainActivity.this,
                            R.color.category_museums ) );
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getWindow().setStatusBarColor( ContextCompat.getColor( MainActivity.this,
                                R.color.category_museums ) );
                    }
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        } );

    }
}