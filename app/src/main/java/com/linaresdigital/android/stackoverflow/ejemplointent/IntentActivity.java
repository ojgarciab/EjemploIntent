package com.linaresdigital.android.stackoverflow.ejemplointent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class IntentActivity extends AppCompatActivity {
    public static final String EXTRA_NAME_STRING = "NAME";
    TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        tvName = (TextView)findViewById(R.id.text_name);
        String strDate = getIntent().getStringExtra(EXTRA_NAME_STRING);
        if (strDate == null) {
            tvName.setText(getText(R.string.cancelled));
        } else {
            tvName.setText(strDate);
        }
    }
}
