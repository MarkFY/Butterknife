package com.shenghui.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.mfy.butterknife.ButterKnife;
import com.shenghui.butterknife_annotation.BindView;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv)
    TextView textView1;

    @BindView(R.id.tv1)
    TextView textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"1111111111111111111111111111111",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
