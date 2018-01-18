package com.linaresdigital.android.stackoverflow.ejemplointent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = (EditText)findViewById(R.id.edit_name);
        findViewById(R.id.button_send).setOnClickListener(this);
        findViewById(R.id.button_cancel).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch(view.getId()) {
            case R.id.button_cancel:
                intent = new Intent(this, IntentActivity.class);
                startActivity(intent);
                break;
            case R.id.button_send:
                intent = new Intent(this, IntentActivity.class);
                intent.putExtra(IntentActivity.EXTRA_NAME_STRING, etName.getText().toString());
                startActivity(intent);
                break;
            default:
                Toast toast = Toast.makeText(view.getContext(), getString(R.string.error), Toast.LENGTH_SHORT);
                toast.show();
        }
    }
}
