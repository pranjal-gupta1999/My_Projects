package com.example.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


public void clickFunction(View view)
{
    EditText textfield1 =(EditText)findViewById(R.id.textfield1);
    Double a =Double.parseDouble(textfield1.getText().toString());
    Double b = a*78;

    Toast.makeText(MainActivity.this, ""+b+"Rs", Toast.LENGTH_SHORT).show();
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
