package com.example.reddy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        LinearLayout ll;
      Button b,b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll =findViewById(R.id.linear1);
       b=findViewById(R.id.btn1);
       b1=findViewById(R.id.btn2);
       b.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               View v1 =getLayoutInflater().inflate(R.layout.ilinear,null);
              ll.addView(v1);

           }
       });
       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               try {
                   //int i=ll.getChildCount()-1;
                  // View v1 = getLayoutInflater().inflate(R.layout.ilinear, null);
                   ll.removeViewAt(ll.getChildCount()-1);
                   //ll.removeViewAt(i);
                   // ll.removeView(v1);
               }
               catch (Exception e)
               {
                   Toast.makeText(MainActivity.this,"this id the Exception"+e,Toast.LENGTH_SHORT).show();
               }
           }
       });

    }

}
