package khosbayar.com.quizzy;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tx = (TextView)findViewById(R.id.tv_appname);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/BebasNeue-Regular.ttf");

        tx.setTypeface(custom_font);
    }
}