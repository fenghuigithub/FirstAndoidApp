package com.example.firstandoidapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Color;

public class LoginActivity extends Activity {

    Button b1;
    EditText ed1,ed2;
    TextView tx1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        b1=(Button)findViewById(R.id.button);
        ed1=(EditText)findViewById(R.id.EditView1);
        ed2=(EditText)findViewById(R.id.EditView2);

        //b2=(Button)findViewById(R.id.button2);
        tx1=(TextView)findViewById(R.id.textView);
        tx1.setVisibility(View.GONE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals("Hui") &&

                        ed2.getText().toString().equals("0606")) {
                    tx1.setVisibility(View.VISIBLE);
                }
                else{


                    //tx1.setVisibility(View.VISIBLE);
                    tx1.setBackgroundColor(Color.RED);
                    //counter--;
                    //tx1.setText(Integer.toString(counter));

                    }
                }
        });
    }
}
