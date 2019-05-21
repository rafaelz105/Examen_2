package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.myapplication.R.id.dis4;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button hec=(Button)findViewById(R.id.are1);
        Button hec2=(Button)findViewById(R.id.are2);
        Button meter=(Button)findViewById(R.id.are3);
        Button meter2=(Button)findViewById(R.id.are4);
        Button centimeter=(Button)findViewById(R.id.dis1);
        Button centimeter2=(Button)findViewById(R.id.dis2);
        Button inch=(Button)findViewById(R.id.dis3);
        Button inch2=(Button)findViewById(dis4);
        //hectarea a metro2
        hec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    Intent intent=new Intent(v.getContext(),Cal.class);
                    startActivityForResult(intent,0);
                }catch (Exception e)
                {

                }

            }
        });

        /*doge lalalaalalalalalalla*/
        //hectarea a metro2
        hec2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    Intent intent=new Intent(v.getContext(),Cal.class);
                    startActivityForResult(intent,0);
                }catch (Exception e)
                {

                }

            }
        });
        //hectarea a metro2
        meter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    Intent intent=new Intent(v.getContext(),Cal.class);
                    startActivityForResult(intent,0);
                }catch (Exception e)
                {

                }

            }
        });
        //hectarea a metro2
        meter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    Intent intent=new Intent(v.getContext(),Cal.class);
                    startActivityForResult(intent,0);
                }catch (Exception e)
                {

                }

            }
        });
        //meter to centimeter
        centimeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    Intent intent=new Intent(v.getContext(),Cal.class);
                    startActivityForResult(intent,0);
                }catch (Exception e)
                {

                }

            }
        });
        //centimeter to meter
        centimeter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    Intent intent=new Intent(v.getContext(),Cal.class);
                    startActivityForResult(intent,0);
                }catch (Exception e)
                {

                }

            }
        });
        //centimeter to  inch
        inch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    Intent intent=new Intent(v.getContext(),Cal.class);
                    startActivityForResult(intent,0);
                }catch (Exception e)
                {

                }

            }
        });
        //inch to centimeter
        inch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    Intent intent=new Intent(v.getContext(),Cal.class);
                    startActivityForResult(intent,0);
                }catch (Exception e)
                {

                }

            }
        });
    }
}
