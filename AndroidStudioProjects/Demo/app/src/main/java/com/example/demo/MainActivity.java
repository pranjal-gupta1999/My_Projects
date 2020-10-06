package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void clickFunction(View view)
    {

        EditText myTextField =(EditText)findViewById(R.id.myTextField);
        Log.i("INFO",myTextField.getText().toString());
        EditText myTextField1 =(EditText)findViewById(R.id.myTextField1);
        Log.i("INFO",myTextField1.getText().toString());
        Toast.makeText(MainActivity.this,"Username:"+myTextField.getText().toString()+"\n"+"passwd:"+myTextField1.getText().toString(), Toast.LENGTH_SHORT).show();
        //ImageView image =(ImageView)findViewById(R.id.imageView1);
        //image.setImageResource(R.drawable.flag);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
