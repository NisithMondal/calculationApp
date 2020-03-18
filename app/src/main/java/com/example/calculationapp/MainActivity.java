package com.example.calculationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1,tv2;
    EditText et1,et2;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=(TextView)findViewById(R.id.sumtv);
        tv2=(TextView)findViewById(R.id.subtv);
        et1=(EditText)findViewById(R.id.edittext1);
        et2=(EditText)findViewById(R.id.edittext2);
        b1=(Button)findViewById(R.id.addition);
        b2=(Button) findViewById(R.id.substract);
        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                int a=Integer.parseInt(et1.getText().toString());
                int b=Integer.parseInt(et2.getText().toString());
                int sum=a+b;
                tv1.setText("Sum is"+sum);
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                int a=Integer.parseInt(et1.getText().toString());
                int b=Integer.parseInt(et2.getText().toString());
                int sub=a-b;
                tv2.setText("SUB is"+sub);
            }
        });
    }
}
