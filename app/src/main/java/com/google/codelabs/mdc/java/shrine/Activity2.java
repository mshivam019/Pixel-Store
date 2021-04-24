package com.google.codelabs.mdc.java.shrine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import java.text.DecimalFormat;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        MaterialButton btn = (MaterialButton)findViewById(R.id.back_button);
        TextView receiver_msg = (TextView) findViewById(R.id.received_value_id);
        receiver_msg.setText("Hello "+LoginFragment.str+", here's your account info.");
        TextView receiver_msg1 = (TextView) findViewById(R.id.received_value_id1);
        receiver_msg1.setText("Based on a downpayment of $"+LoginFragment.str1);
        TextView receiver_msg2 = (TextView) findViewById(R.id.received_value_id2);
        receiver_msg2.setText(LoginFragment.text+" in "+LoginFragment.text1);
        int i =Integer.parseInt(LoginFragment.str1);
        int j=799-i;
        double f=j/12.00;
        DecimalFormat df2= new DecimalFormat("#.##");
        TextView receiver_msg3 = (TextView) findViewById(R.id.fina);
        receiver_msg3.setText("Your monthly payment is: $"+df2.format(f));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity2.this, MainActivity.class));
            }
        });
    }
}