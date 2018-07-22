package khosbayar.com.quizzy.activities;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import khosbayar.com.quizzy.customUI.CircleIndicator;
import khosbayar.com.quizzy.R;
import khosbayar.com.quizzy.adapters.GroupFragmentAdapter;

import android.os.Bundle;

public class CreateGroupActivity extends FragmentActivity {

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_group);

        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mViewPager.setAdapter(new GroupFragmentAdapter(getSupportFragmentManager()));

        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(mViewPager);

    }
}
