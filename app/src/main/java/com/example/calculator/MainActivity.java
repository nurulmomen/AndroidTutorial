package com.example.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editOperand1;
    private EditText editOperand2;
    private Button btnAddition;
    private Button btnSubtraction;
    private Button btnMultiplication;
    private Button btnDivision;
    private Button btnClear;
    private Button btnScientific;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editOperand1 = (EditText) findViewById(R.id.editOperand1);
        editOperand2 = (EditText) findViewById(R.id.editOperand2);
        btnAddition = (Button) findViewById(R.id.btnAddition);
        btnSubtraction = (Button) findViewById(R.id.btnSubstraction);
        btnMultiplication = (Button) findViewById(R.id.btnMultiplication);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnClear = (Button) findViewById(R.id.btnClear);
        txtResult = (TextView) findViewById(R.id.txtResult);
        btnScientific = (Button) findViewById(R.id.btnScientific);

        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editOperand1.length() > 0 && editOperand2.length() > 0) {
                    Double value1 = Double.parseDouble(editOperand1.getText().toString());
                    Double value2 = Double.parseDouble(editOperand2.getText().toString());
                    Double result = value1 + value2;
                    txtResult.setText(Double.toString(result));
                } else Toast.makeText(MainActivity.this, "Please enter both operands", Toast.LENGTH_LONG).show();
            }
        });
        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editOperand1.length() > 0 && editOperand2.length() > 0) {
                    Double value1 = Double.parseDouble(editOperand1.getText().toString());
                    Double value2 = Double.parseDouble(editOperand2.getText().toString());
                    Double result = value1 - value2;
                    txtResult.setText(Double.toString(result));
                } else Toast.makeText(MainActivity.this, "Please enter both operands", Toast.LENGTH_LONG).show();
            }
        });
        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editOperand1.length() > 0 && editOperand2.length() > 0) {
                    Double value1 = Double.parseDouble(editOperand1.getText().toString());
                    Double value2 = Double.parseDouble(editOperand2.getText().toString());
                    Double result = value1 * value2;
                    txtResult.setText(Double.toString(result));
                } else Toast.makeText(MainActivity.this, "Please enter both operands", Toast.LENGTH_LONG).show();
            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editOperand1.length() > 0 && editOperand2.length() > 0) {
                    Double value1 = Double.parseDouble(editOperand1.getText().toString());
                    Double value2 = Double.parseDouble(editOperand2.getText().toString());
                    Double result = value1 / value2;
                    txtResult.setText(Double.toString(result));
                } else Toast.makeText(MainActivity.this, "Please enter both operands", Toast.LENGTH_LONG).show();
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editOperand1.setText("");
                editOperand2.setText("");
                txtResult.setText("0.00");
                editOperand1.requestFocus();
            }
        });
        btnScientific.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ourIntent = new Intent(MainActivity.this, Scientific.class);
                startActivity(ourIntent);
            }
        });
    }
}
