package khosbayar.com.quizzy.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import khosbayar.com.quizzy.fragments.AddMembersFragment;
import khosbayar.com.quizzy.fragments.ChooseGroupNameFragment;
import khosbayar.com.quizzy.fragments.ConfirmFragment;

public class GroupFragmentAdapter extends FragmentPagerAdapter {
    public GroupFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {

            case 0: return ChooseGroupNameFragment.newInstance("Choose name, Instance 1");
            case 1: return AddMembersFragment.newInstance("Add member, Instance 1");
            case 2: return ConfirmFragment.newInstance("Confirm, Instance 1");
            default: return ChooseGroupNameFragment.newInstance("Choose name, Instance 1");

        }
    }


    @Override
    public int getCount() {
        return 3;
    }
}
