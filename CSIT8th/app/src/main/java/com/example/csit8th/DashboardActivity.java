package com.example.csit8th;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;


public class DashboardActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    private int[] iconList = {R.drawable.ic_menu,R.drawable.ic_search,R.drawable.ic_setting};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    private void findViews() {
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        setupViewPager();
    }

    private void setupViewPager(){
        adapter= new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new HomeFragment(),"Home");
        adapter.addFragment(new HomeFragment(),"Category");
        adapter.addFragment(new HomeFragment(),"Profile");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
    private void setIcon(){
        tabLayout.getTabAt(0).setIcon(iconList(0));
        tabLayout.getTabAt(1).setIcon(iconList(1));
        tabLayout.getTabAt(2).setIcon(iconList(2));
    }


}