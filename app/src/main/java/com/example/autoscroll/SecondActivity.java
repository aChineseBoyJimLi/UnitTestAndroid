package com.example.autoscroll;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
    }

    public void Click(View view){
        EditText text1 = (EditText)findViewById(R.id.mail);
        String mail = text1.getText().toString();

        Toast.makeText(this, mail, Toast.LENGTH_SHORT).show();
    }
}
