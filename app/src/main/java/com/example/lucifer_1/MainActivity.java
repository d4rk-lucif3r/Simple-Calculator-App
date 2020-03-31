package com.example.lucifer_1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button addbt1; //usually a good idea to first  declare all your variables
    Button addbt2; //useful if different methods use the reference to these buttons
    Button addbt3; //not particularly necessary in this case tho but still
    Button addbt4;
    Button addbt5;
    Button addbt6;
    Button addbt7;
    Button addbt8;
    Button addbt9;
    Button addbt10;
    Button addbt11;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(MainActivity.this, "By LuCiFeR", Toast.LENGTH_SHORT).show();
        final Vibrator vibe = (Vibrator) MainActivity.this.getSystemService(Context.VIBRATOR_SERVICE);
        vibe.vibrate(80);
        setContentView(R.layout.activity_main);

        addbt1 = findViewById(R.id.addbt1); //cast to (Button) is not necessary
        addbt2 = findViewById(R.id.addbt2); //it was used in previous versions
        addbt3 = findViewById(R.id.addbt3);
        addbt4 = findViewById(R.id.addbt4);
        addbt5 = findViewById(R.id.addbt5);
        addbt6 = findViewById(R.id.addbt6);
        addbt7 = findViewById(R.id.addbt7);
        addbt8 = findViewById(R.id.addbt8);
        addbt9 = findViewById(R.id.addbt9);
        addbt10 = findViewById(R.id.addbt10);
        addbt11 = findViewById(R.id.addbt11);





        addbt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(80);
                //Toast.makeText(MainActivity.this, "Adding", Toast.LENGTH_SHORT).show();
                EditText firstNumEdittext = findViewById(R.id.FirstNumeditText);
                EditText secondNumEdittext = findViewById(R.id.SecondNumeditText);
                TextView resulttextview = findViewById(R.id.ResultTextView1);

                //same thing cast to EditText and TextView not necessary

                String input1 = firstNumEdittext.getText().toString();
                String input2 = secondNumEdittext.getText().toString();

                //this if statement check all the conditions of text box being empty
                if(input1.equals("") && input2.equals("") || input1.equals("")
                        || input2.equals(""))
                {
                    displayToast("Please enter numbers");
                }
                else{
                  float num1 = Float.parseFloat(input1);
                  float num2 = Float.parseFloat(input2);
                  double result1 = num1 + num2;
                    resulttextview.setText(result1 + "");
                }


            }

        });
        addbt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(80);
               // Toast.makeText(MainActivity.this, "Subtracting", Toast.LENGTH_SHORT).show();
                EditText firstNumEdittext = findViewById(R.id.FirstNumeditText);
                EditText secondNumEdittext = findViewById(R.id.SecondNumeditText);
                TextView resulttextview = findViewById(R.id.ResultTextView1);

                //same thing cast to EditText and TextView not necessary

                String input1 = firstNumEdittext.getText().toString();
                String input2 = secondNumEdittext.getText().toString();

                //this if statement check all the conditions of text box being empty
                if(input1.equals("") && input2.equals("") || input1.equals("")
                        || input2.equals(""))
                {
                    displayToast("Please enter numbers");
                }
                else{
                    float num1 = Float.parseFloat(input1);
                    float num2 = Float.parseFloat(input2);
                   double result1 = num1 - num2;
                    resulttextview.setText(result1 + "");
                }
            }
        });
        addbt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(80);
                //Toast.makeText(MainActivity.this, "Multiplying", Toast.LENGTH_SHORT).show();
                EditText firstNumEdittext = findViewById(R.id.FirstNumeditText);
                EditText secondNumEdittext = findViewById(R.id.SecondNumeditText);
                TextView resulttextview = findViewById(R.id.ResultTextView1);

                //same thing cast to EditText and TextView not necessary

                String input1 = firstNumEdittext.getText().toString();
                String input2 = secondNumEdittext.getText().toString();

                //this if statement check all the conditions of text box being empty
                if(input1.equals("") && input2.equals("") || input1.equals("")
                        || input2.equals(""))
                {
                    displayToast("Please enter numbers");
                }
                else{
                    float num1 = Float.parseFloat(input1);
                    float num2 = Float.parseFloat(input2);
                    double result1 = num1 * num2;
                    resulttextview.setText(result1 + "");
                }

            }
        });
        addbt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(80);
              //  Toast.makeText(MainActivity.this, "Dividing", Toast.LENGTH_SHORT).show();
                EditText firstNumEdittext = findViewById(R.id.FirstNumeditText);
                EditText secondNumEdittext = findViewById(R.id.SecondNumeditText);
                TextView resulttextview = findViewById(R.id.ResultTextView1);

                //same thing cast to EditText and TextView not necessary

                String input1 = firstNumEdittext.getText().toString();
                String input2 = secondNumEdittext.getText().toString();

                //this if statement check all the conditions of text box being empty
                if(input1.equals("") && input2.equals("") || input1.equals("")
                        || input2.equals(""))
                {
                    displayToast("Please enter numbers");
                }
                else{
                  float num1 = Float.parseFloat(input1);
                   float num2 = Float.parseFloat(input2);

                    if(num2==0)
                    {
                        displayToast("Cannot Divide by 0");
                    }else{
                         double result1 = num1 / num2;
                        resulttextview.setText(result1 + "");
                    }

                }
            }
        });
        addbt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(80);
                //Toast.makeText(MainActivity.this, "Multiplying", Toast.LENGTH_SHORT).show();
                EditText firstNumEdittext = findViewById(R.id.FirstNumeditText);
                EditText secondNumEdittext = findViewById(R.id.SecondNumeditText);
                TextView resulttextview = findViewById(R.id.ResultTextView1);

                //same thing cast to EditText and TextView not necessary

                String input1 = firstNumEdittext.getText().toString();
                String input2 = secondNumEdittext.getText().toString();

                //this if statement check all the conditions of text box being empty
                if(input1.equals("") && input2.equals("") || input1.equals("")
                        || input2.equals(""))
                {
                    displayToast("Please enter numbers");
                }
                else{
                    float num1 = Float.parseFloat(input1);
                    float num2 = Float.parseFloat(input2);
                    double result1 = Math.pow(num1,num2);
                    resulttextview.setText(result1 + "");
                }

            }
        });
        addbt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(80);
                //Toast.makeText(MainActivity.this, "Multiplying", Toast.LENGTH_SHORT).show();
                EditText firstNumEdittext = findViewById(R.id.FirstNumeditText);

                TextView resulttextview = findViewById(R.id.ResultTextView1);

                //same thing cast to EditText and TextView not necessary

                String input1 = firstNumEdittext.getText().toString();


                //this if statement check all the conditions of text box being empty
                if(input1.equals("") || input1.equals(""))
                {
                    displayToast("Input 2 disabled");

                }
                else{
                    float num1 = Float.parseFloat(input1);
                    double result1 = Math.sqrt(num1);
                    resulttextview.setText(result1 + "");
                }

            }
        });
        addbt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(80);
                TextView resulttextview = findViewById(R.id.ResultTextView1);
                    double result1 = Math.exp(1);
                    resulttextview.setText(result1 + "");


            }
        });
        addbt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(80);
                TextView resulttextview = findViewById(R.id.ResultTextView1);
                double result1 = Math.PI;
                resulttextview.setText(result1 + "");


            }
        });
        addbt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(80);
                TextView resulttextview = findViewById(R.id.ResultTextView1);
                EditText firstNumEdittext = findViewById(R.id.FirstNumeditText);
                String input1 = firstNumEdittext.getText().toString();
                double result1=1;
                if(input1.equals("") || input1.equals(""))
                {
                    displayToast("please give input and Input 2 disabled");

                }
                else{
                    float num1 = Float.parseFloat(input1);
                    for (int i =1;i<=num1;i++) {
                        result1 = result1 *i;
                    }
                    resulttextview.setText(result1 + "");
                }


            }
        }); addbt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(80);
                TextView resulttextview = findViewById(R.id.ResultTextView1);
                EditText firstNumEdittext = findViewById(R.id.FirstNumeditText);
                String input1 = firstNumEdittext.getText().toString();

                if(input1.equals("") || input1.equals(""))
                {
                    displayToast("Input 2 disabled");

                }
                else{
                    float num1 = Float.parseFloat(input1);
                    double result1=Math.log(num1)/2.303;
                    resulttextview.setText(result1 + "");
                }


            }
        });
        addbt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(80);
                TextView resulttextview = findViewById(R.id.ResultTextView1);
                EditText firstNumEdittext = findViewById(R.id.FirstNumeditText);
                String input1 = firstNumEdittext.getText().toString();

                if(input1.equals("") || input1.equals(""))
                {
                    displayToast("Input 2 disabled");

                }
                else{
                    float num1 = Float.parseFloat(input1);
                    double result1=Math.log(num1);
                    resulttextview.setText(result1 + "");
                }


            }
        });

    }

    public void displayToast(String message) //use a () to make multiple toasts and you can pass the duration as well
    {
        Toast.makeText(MainActivity.this,message,Toast.LENGTH_SHORT).show();
    }
public void nextActivity(View view)
{
    Intent i = new Intent(this,SecondActivity.class);
    final Vibrator vibe = (Vibrator) MainActivity.this.getSystemService(Context.VIBRATOR_SERVICE);
    vibe.vibrate(80);
    startActivity(i);

}

}
