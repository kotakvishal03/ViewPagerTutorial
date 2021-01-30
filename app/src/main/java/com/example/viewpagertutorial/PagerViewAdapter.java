package com.example.viewpagertutorial;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerViewAdapter extends FragmentPagerAdapter
{
    public PagerViewAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount()
    {
        return 4;
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        Fragment fragment=null;
        switch(position)
        {
            case 0:
            {
                fragment=new Fragment_camera();
                break;
            }

            case 1:
            {
              fragment=new Fragment_chat();
              break;
            }
            case 2:
            {
                fragment=new Fragment_status();
                break;
            }
            case 3:
            {
                fragment=new Fragment_call();
                break;
            }
        }
        return fragment;
    }
}
