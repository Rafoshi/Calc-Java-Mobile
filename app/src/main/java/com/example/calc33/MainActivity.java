package com.example.calc33;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edTxt1, edTxt2;
    TextView txtView;
    Button btnSoma, btnDiv, btnMult, btnSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edTxt1 = (EditText) findViewById(R.id.editText1);
        edTxt2 = (EditText) findViewById(R.id.editText2);

        txtView = (TextView) findViewById(R.id.txtResultado);

        btnSoma = (Button) findViewById(R.id.btn1);
        btnSub = (Button) findViewById(R.id.btn2);
        btnMult = (Button) findViewById(R.id.btn3);
        btnDiv = (Button) findViewById(R.id.btn4);

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double input1, input2, result;

                input1 = Double.parseDouble(edTxt1.getText().toString());
                input2 = Double.parseDouble(edTxt1.getText().toString());
                result = input1 - input2;

                txtView.setText(result.toString());
            }
        });

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double input1, input2, result;

                input1 = Double.parseDouble(edTxt1.getText().toString());
                input2 = Double.parseDouble(edTxt2.getText().toString());
                result = input1 + input2;

                txtView.setText(result.toString());
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double input1, input2, result;

                input1 = Double.parseDouble(edTxt1.getText().toString());
                input2 = Double.parseDouble(edTxt2.getText().toString());

                result = input1/input2;
                txtView.setText(result.toString());
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double input1,input2, result;

                input1 = Double.parseDouble(edTxt1.getText().toString());
                input2 = Double.parseDouble(edTxt2.getText().toString());

                result = input1 * input2;
                txtView.setText(result.toString());
            }
        });
    }
}