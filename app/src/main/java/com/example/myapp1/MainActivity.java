package com.example.myapp1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private static final String  TAG = "MainActivity";
    int f=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void mode(View view) {
        Button b=findViewById(R.id.button1);
        if(b.getText().toString().equalsIgnoreCase("Mode addition"))
        {
            b.setText("MODE SUBTRACTION");
            f=2;
        }
        else if(b.getText().toString().equalsIgnoreCase("Mode subtraction"))
        {
            b.setText("MODE MULTIPLICATION");
            f=3;
        }
        else if(b.getText().toString().equalsIgnoreCase("Mode multiplication"))
        {
            b.setText("MODE DIVISION");
            f=4;
        }
        else if(b.getText().toString().equalsIgnoreCase("Mode division"))
        {
            b.setText("MODE ADDITION");
            f=1;
        }

    }

    public void calc(View view) {
        EditText e1=findViewById(R.id.etext1),e2=findViewById(R.id.etext2),e3=findViewById(R.id.etext3);double r;
        switch (f)
        {
            case 1: r=((Double.parseDouble(e1.getText().toString()) + Double.parseDouble(e2.getText().toString())));
                    e3.setText(String.valueOf(r));
                    break;
            case 2: r=((Double.parseDouble(e1.getText().toString()) - Double.parseDouble(e2.getText().toString())));
                    e3.setText(String.valueOf(r));
                    break;
            case 3: r=((Double.parseDouble(e1.getText().toString()) * Double.parseDouble(e2.getText().toString())));
                    e3.setText(String.valueOf(r));
                    break;
            case 4:if(e2.getText().toString().equals("0")){
                Toast.makeText(this, "cannot / 0", Toast.LENGTH_SHORT).show();break; }
                DecimalFormat n = new DecimalFormat("#0.00");
                    r=((Double.parseDouble(e1.getText().toString()) / Double.parseDouble(e2.getText().toString())));
                    e3.setText(String.valueOf(n.format(r)));
                    break;
        }
    }
}
