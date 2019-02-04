package com.example.mp4_b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub,
            buttonMul, button10, buttonC, buttonEqual;

    EditText ViewR;

    float Val1, Val2;

    boolean Addition, Subtract, Multiplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button_0);
        button1 = (Button) findViewById(R.id.button_1);
        button2 = (Button) findViewById(R.id.button_2);
        button3 = (Button) findViewById(R.id.button_3);
        button4 = (Button) findViewById(R.id.button_4);
        button5 = (Button) findViewById(R.id.button_5);
        button6 = (Button) findViewById(R.id.button_6);
        button7 = (Button) findViewById(R.id.button_7);
        button8 = (Button) findViewById(R.id.button_8);
        button9 = (Button) findViewById(R.id.button_9);
        button10 = (Button) findViewById(R.id.button_10);
        buttonAdd = (Button) findViewById(R.id.button_plus);
        buttonSub = (Button) findViewById(R.id.button_minus);
        buttonMul = (Button) findViewById(R.id.button_multiple);
        buttonC = (Button) findViewById(R.id.button_c);
        buttonEqual = (Button) findViewById(R.id.button_equal);
        ViewR = (EditText) findViewById(R.id.result);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewR.setText(ViewR.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewR.setText(ViewR.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewR.setText(ViewR.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewR.setText(ViewR.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewR.setText(ViewR.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewR.setText(ViewR.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewR.setText(ViewR.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewR.setText(ViewR.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewR.setText(ViewR.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewR.setText(ViewR.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ViewR == null) {
                    ViewR.setText("");
                } else {
                    Val1 = Float.parseFloat(ViewR.getText() + "");
                    Addition = true;
                    ViewR.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Val1 = Float.parseFloat(ViewR.getText() + "");
                Subtract = true;
                ViewR.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Val1 = Float.parseFloat(ViewR.getText() + "");
                Multiplication = true;
                ViewR.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Val2 = Float.parseFloat(ViewR.getText() + "");

                if (Addition == true) {
                    ViewR.setText(Val1 + Val2 + "");
                    Addition = false;
                }

                if (Subtract == true) {
                    ViewR.setText(Val1 - Val2 + "");
                    Subtract = false;
                }

                if (Multiplication == true) {
                    ViewR.setText(Val1 * Val2 + "");
                    Multiplication = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewR.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewR.setText(ViewR.getText() + ".");
            }
        });


    }

}
