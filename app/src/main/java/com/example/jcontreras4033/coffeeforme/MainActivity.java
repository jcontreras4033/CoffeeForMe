package com.example.jcontreras4033.coffeeforme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {

    byte numCoffees;
    double cost = 4.50;
    DecimalFormat currency = new DecimalFormat("0.00");
    TextView tCost;
    TextView quantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        numCoffees = 0;
        setContentView(R.layout.activity_main);
        tCost = (TextView) findViewById(R.id.totalTextView);
        quantity = (TextView) findViewById(R.id.quantityTextView);
    }

    public void subOrder(View view){
        if (numCoffees>0)
        numCoffees--;
        displayQuantity();
    }

    public void addOrder(View view){
        numCoffees++;
        displayQuantity();
    }

    public void submitOrder(View view){

        displayTotalCost();
    }


    private void displayQuantity(){

        quantity.setText(""+numCoffees);
    }

    private void displayTotalCost(){

        tCost.setText("Total Cost = " +  numCoffees + " * " + cost + " = $" + currency.format(numCoffees * cost));

    }



}
