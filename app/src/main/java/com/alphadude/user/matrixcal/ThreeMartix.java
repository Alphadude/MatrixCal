package com.alphadude.user.matrixcal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ThreeMartix extends AppCompatActivity {

    Button calculate;
    EditText editA1,editB1,editC1,editA2,editB2,editC2,editA3,editB3,editC3;
    TextView Answer,Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_martix);

        calculate = findViewById(R.id.calculate);

        editA1 = findViewById(R.id.value_a1);
        editB1 = findViewById(R.id.value_b1);
        editC1 = findViewById(R.id.value_c1);

        editA2 = findViewById(R.id.value_a2);
        editB2 = findViewById(R.id.value_b2);
        editC2 = findViewById(R.id.value_c2);

        editA3 = findViewById(R.id.value_a3);
        editB3 = findViewById(R.id.value_b3);
        editC3 = findViewById(R.id.value_c3);


        Answer = findViewById(R.id.answer);
        Back = findViewById(R.id.back);


        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                analyze();
            }
        });
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backHome();
            }
        });
    }

    public void analyze(){

        String valuea1 = editA1.getText().toString().trim();
        String valuea2 = editA2.getText().toString().trim();
        String valuea3 = editA3.getText().toString().trim();
        String valueb1 = editB1.getText().toString().trim();
        String valueb2 = editB2.getText().toString().trim();
        String valueb3 = editB3.getText().toString().trim();
        String valuec1 = editC1.getText().toString().trim();
        String valuec2 = editC2.getText().toString().trim();
        String valuec3 = editC3.getText().toString().trim();

        if(valuea1.isEmpty() || valuea2.isEmpty() || valuea3.isEmpty() || valueb1.isEmpty() || valueb2.isEmpty() || valueb3.isEmpty() || valuec1.isEmpty() || valuec2.isEmpty() || valuec3.isEmpty() ){
            Toast.makeText(getApplicationContext(),"Check the field for empty place",Toast.LENGTH_LONG).show();
            return;
        }

        double valueA1 = Double.parseDouble(valuea1);
        double valueB1 = Double.parseDouble(valueb1);
        double valueC1 = Double.parseDouble(valuec1);


        double valueA2 = Double.parseDouble(valuea2);
        double valueB2 = Double.parseDouble(valueb2);
        double valueC2 = Double.parseDouble(valuec2);


        double valueA3 = Double.parseDouble(valuea3);
        double valueB3 = Double.parseDouble(valueb3);
        double valueC3 = Double.parseDouble(valuec3);


        double Solution = ((valueA1 * valueB2 * valueC3) + (valueB1 * valueC2 *valueA3) +(valueC1 * valueA2 *valueB3))
                - ((valueC1 * valueB2 * valueA3)+(valueA1 * valueC2 * valueB3)+(valueA2 * valueB1 * valueC3));

        Answer.setText(""+Solution);

    }

    public void backHome(){
        Intent open = new Intent(this, HomePage.class);
        startActivity(open);
    }


}
