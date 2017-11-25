package com.example.buran.exercise1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mToysListTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToysListTextView = (TextView) findViewById(R.id.tv_toy_names);
        String[] toysList = FakeToys.getToyNames();
        for (String toy : toysList) {
            mToysListTextView.append(toy + "\n\n\n");
        }
    }
}
