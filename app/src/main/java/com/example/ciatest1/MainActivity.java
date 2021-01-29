package com.example.ciatest1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private double mAmount = 0;
    private double twoWheelerAmount = 100.00;
    private double fourWheelerAmount = 200.00;
    private double truckAmount = 400.00;
    private double vipAmount = 0.00;
    private TextView mShowAmount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.showCount);
        mShowAmount = (TextView) findViewById(R.id.showAmount);
    }
    public void addTwoWheeler(View view) {
        ++mCount;
        mAmount = mAmount + twoWheelerAmount;
        mShowCount.setText(Integer.toString(mCount));
        mShowAmount.setText(Double.toString(mAmount));

    }

    public void addForWheeler(View view) {
        ++mCount;
        mAmount = mAmount + fourWheelerAmount;
        mShowCount.setText(Integer.toString(mCount));
        mShowAmount.setText(Double.toString(mAmount));
    }

    public void addTruck(View view) {
        ++mCount;
        mAmount = mAmount + truckAmount;
        mShowCount.setText(Integer.toString(mCount));
        mShowAmount.setText(Double.toString(mAmount));
    }

    public void addvip(View view) {
        ++mCount;
        mAmount = mAmount + vipAmount;
        mShowCount.setText(Integer.toString(mCount));
        mShowAmount.setText(Double.toString(mAmount));
    }
}