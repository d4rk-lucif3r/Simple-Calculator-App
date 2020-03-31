package com.example.lucifer_1;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    Button addbt12; //usually a good idea to first  declare all your variables
    Button addbt13; //useful if different methods use the reference to these buttons
    Button addbt14; //not particularly necessary in this case tho but still
    Button addbt15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final Vibrator vibe = (Vibrator) SecondActivity.this.getSystemService(Context.VIBRATOR_SERVICE);
        vibe.vibrate(80);
        addbt12 = findViewById(R.id.addbt12);
        addbt13 = findViewById(R.id.addbt13);
        addbt14 = findViewById(R.id.addbt14);
        addbt15 = findViewById(R.id.addbt15);
         addbt12.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 vibe.vibrate(80);
                 EditText firstNumEdittext1 = findViewById(R.id.firstNumeditText1);
                 TextView resulttextview1 = findViewById(R.id.resultTextView2);
                 String input1 = firstNumEdittext1.getText().toString();
                 if(input1.equals("")  || input1.equals(""))
                 {
                     Toast.makeText(SecondActivity.this, "Please Give input", Toast.LENGTH_SHORT).show();
                 }
                 else{
                     float num1 = Float.parseFloat(input1);
                     double result1 = Math.sin(Math.toRadians(num1));
                     resulttextview1.setText(result1 + "");
                 }


             }

         });
        addbt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(80);
                EditText firstNumEdittext1 = findViewById(R.id.firstNumeditText1);
                TextView resulttextview1 = findViewById(R.id.resultTextView2);
                String input1 = firstNumEdittext1.getText().toString();
                if(input1.equals("")  || input1.equals(""))
                {
                    Toast.makeText(SecondActivity.this, "Please Give input", Toast.LENGTH_SHORT).show();
                }
                else{
                    float num1 = Float.parseFloat(input1);
                    // float num2 = Float.parseFloat(input2);
                    double result1 = Math.cos(Math.toRadians(num1));
                    resulttextview1.setText(result1 + "");
                }


            }

        });
        addbt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(80);
                EditText firstNumEdittext1 = findViewById(R.id.firstNumeditText1);
                TextView resulttextview1 = findViewById(R.id.resultTextView2);
                String input1 = firstNumEdittext1.getText().toString();
                if(input1.equals("")  || input1.equals(""))
                {
                    Toast.makeText(SecondActivity.this, "Please Give input", Toast.LENGTH_SHORT).show();
                }
                else{
                    float num1 = Float.parseFloat(input1);
                    double result1 = Math.tan(Math.toRadians(num1));
                    resulttextview1.setText(result1 + "");
                }


            }

        });
        addbt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(80);
                EditText firstNumEdittext1 = findViewById(R.id.firstNumeditText1);
                TextView resulttextview1 = findViewById(R.id.resultTextView2);
                String input1 = firstNumEdittext1.getText().toString();
                if(input1.equals("")  || input1.equals(""))
                {
                    Toast.makeText(SecondActivity.this, "Please Give input", Toast.LENGTH_SHORT).show();
                }
                else{
                    float num1 = Float.parseFloat(input1);

                    double result1 = Math.toRadians(num1);
                    resulttextview1.setText(result1 + "");
                }


            }

        });
    }
}
