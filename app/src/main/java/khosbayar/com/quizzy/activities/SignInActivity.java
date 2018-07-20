package khosbayar.com.quizzy.activities;

import androidx.appcompat.app.AppCompatActivity;
import khosbayar.com.quizzy.R;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        TextView tx = (TextView) findViewById(R.id.tv_appname);

        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/BebasNeue-Regular.ttf");

        tx.setTypeface(custom_font);
    }


    public void NavToSignUp(View view) {
        Intent intent = new Intent(getApplicationContext(), SignUpActivity.class);
        startActivity(intent);
    }

    public void navToMainActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}
