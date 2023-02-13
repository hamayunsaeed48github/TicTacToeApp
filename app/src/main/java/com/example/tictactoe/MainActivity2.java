package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,reset;
    String bu1,bu2,bu3,bu4,bu5,bu6,bu7,bu8,bu9;
    int num;
    int count=0;
    TextView result;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        result=findViewById(R.id.result);
        reset=findViewById(R.id.reset);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
                result.setText("");
                Toast.makeText(MainActivity2.this, "Play again", Toast.LENGTH_SHORT).show();

            }
        });

    }
    public void click(View view){
        Button btn = (Button) view;
        count++;

        if(num==0){
            btn.setText("X");
            btn.setTextColor(getResources().getColor(R.color.x));
            num=1;
        }
        else {
            btn.setText("O");
            btn.setTextColor(getResources().getColor(R.color.o));
            num=0;
        }


        if(count>4){
            bu1=b1.getText().toString();
            bu2=b2.getText().toString();
            bu3=b3.getText().toString();
            bu4=b4.getText().toString();
            bu5=b5.getText().toString();
            bu6=b6.getText().toString();
            bu7=b7.getText().toString();
            bu8=b8.getText().toString();
            bu9=b9.getText().toString();

            if(bu1.equals(bu2) && bu2.equals(bu3) && !bu1.equals("")){
                result.setText("Winner is:" +bu1);
            }
            else if(bu4.equals(bu5) && bu5.equals(bu6) && !bu4.equals("")){
                result.setText("Winner is:" +bu4);

            }
            else if(bu7.equals(bu8) && bu8.equals(bu9) && !bu7.equals("")){
                result.setText("Winner is:" +bu7);
            }
            else if(bu1.equals(bu4) && bu4.equals(bu7) && !bu1.equals("")){
                result.setText("Winner is:" +bu1);
            }
            else if(bu2.equals(bu5) && bu5.equals(bu8) && !bu2.equals("")){
                result.setText("Winner is:" +bu2);
            }
            else if(bu3.equals(bu6) && bu6.equals(bu9) && !bu3.equals("")){
                result.setText("Winner is:" +bu3);
            }
            else if(bu1.equals(bu5) && bu5.equals(bu9) && !bu1.equals("")){
                result.setText("Winner is:" +bu1);
            }
            else if(bu3.equals(bu5) && bu5.equals(bu7) && !bu3.equals("")){
                result.setText("Winner is:" +bu3);
            }
        }

    }
}
