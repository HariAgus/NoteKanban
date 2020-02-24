package com.example.notekanban.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.notekanban.Fragment.DoingFragment;
import com.example.notekanban.Fragment.DoneFragment;
import com.example.notekanban.Fragment.TodoFragment;

public class TabAdapter extends FragmentPagerAdapter {

    private int numTab;

    public TabAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm);
        this.numTab = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new TodoFragment();
            case 1:
                return new DoingFragment();
            case 2:
                return new DoneFragment();
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return numTab;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }
}
