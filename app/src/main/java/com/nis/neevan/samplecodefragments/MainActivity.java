package com.nis.neevan.samplecodefragments;

import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;
import android.widget.Toast;

import com.nis.neevan.samplecodefragments.fragments.Fragment_A;
import com.nis.neevan.samplecodefragments.fragments.Fragment_B;
import com.nis.neevan.samplecodefragments.fragments.Fragment_C;

public class MainActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Fragments");
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        //On Item Clicked in the action bar.
        if (id == R.id.action_settings) {

            Toast.makeText(this, "Settings Clicked", Toast.LENGTH_SHORT).show();

            return true;
        }

        if (id == R.id.action_logout) {

            Toast.makeText(this, "Logout Clicked", Toast.LENGTH_SHORT).show();
            finish();
            return true;
        }

        if (id == R.id.action_updates) {

            Toast.makeText(this, "Updates Clicked", Toast.LENGTH_SHORT).show();

            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */

    // Sample Code for Fragments Naveen_Varma #naveenvarma
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).

            switch (position) {

                case 0:
                    //Passing Fragment A Object to the Main Activity
                    Fragment_A fragment_a = new Fragment_A();

                    return fragment_a;

                case 1:
//Passing Fragment B Object to the Main Activity
                    Fragment_B fragment_b = new Fragment_B();

                    return fragment_b;

                case 2:

                    //Passing Fragment C Object to the Main Activity
                    Fragment_C fragment_c = new Fragment_C();

                    return fragment_c;

                case 3:

                    Fragment_B fragment_b1 = new Fragment_B();

                    return fragment_b1;
            }
            Fragment_A fragment_a1 = new Fragment_A();

            return fragment_a1;
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "CHATS";
                case 1:
                    return "CONTACTS";
                case 2:
                    return "STATUS";
                case 3:
                    return "CAMERA";
            }
            return null;
        }
    }
}
