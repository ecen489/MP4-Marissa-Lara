package com.example.mp4_a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //New function
    public void button1_input(View view){
        TextView textview = (TextView) findViewById(R.id.TextView1);
        EditText edittext = (EditText) findViewById(R.id.EditText1);
        String mystring;
        mystring = edittext.getText().toString();
        textview.setText(mystring);
        edittext.setText("");
    }
}


