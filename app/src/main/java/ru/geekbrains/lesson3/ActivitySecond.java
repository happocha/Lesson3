package ru.geekbrains.lesson3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;


public class ActivitySecond extends AppCompatActivity implements View.OnClickListener {

    private Button button1;
    private TextView textView1;
    private int counter1 = 0;

    private Button button2;
    private TextView textView2;
    private int counter2 = 0;

    private Button button3;
    private TextView textView3;
    private int counter3 = 0;

    private Button button4;
    private TextView textView4;
    private int counter4 = 0;

    private View.OnClickListener button4ClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            counter4++;
            textView4.setText(String.format(Locale.getDefault(), "%d", counter4));
        }
    };


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        button1 = findViewById(R.id.button1);
        textView1 = findViewById(R.id.textView1);

        button2 = findViewById(R.id.button2);
        textView2 = findViewById(R.id.textView2);
        button2.setOnClickListener(this);

        button3 = findViewById(R.id.button3);
        textView3 = findViewById(R.id.textView3);
        button3.setOnClickListener(this);

        button4 = findViewById(R.id.button4);
        textView4 = findViewById(R.id.textView4);
        button4.setOnClickListener(button4ClickListener);

//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                counter2++;
//                textView2.setText(String.format(Locale.getDefault(), "%d", counter2));
//            }
//        });
    }

    public void button1_onClick(View view) {
        counter1++;
        textView1.setText(String.format(Locale.getDefault(), "%d", counter1));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button2:
                counter2++;
                textView2.setText(String.format(Locale.getDefault(), "%d", counter2));
                break;
            case R.id.button3:
                counter3++;
                textView3.setText(String.format(Locale.getDefault(), "%d", counter3));
                break;
        }
    }
}
