package khosbayar.com.quizzy.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import khosbayar.com.quizzy.R;
import khosbayar.com.quizzy.fragments.GroupFragment1;

import android.os.Bundle;

public class CreateGroupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_group);

        if (savedInstanceState == null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            GroupFragment1 fragment = new GroupFragment1();
            transaction.replace(R.id.content_fragment, fragment);
            transaction.commit();
        }
    }
}
