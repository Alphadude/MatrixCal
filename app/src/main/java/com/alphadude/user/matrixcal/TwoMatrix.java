package com.alphadude.user.matrixcal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TwoMatrix extends AppCompatActivity {

    Button calculate;
    EditText editA,editB,editC,editD;
    TextView Answer,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_matrix);

        calculate = findViewById(R.id.calculate);

        editA = findViewById(R.id.value_a);
        editB = findViewById(R.id.value_b);
        editC = findViewById(R.id.value_c);
        editD = findViewById(R.id.value_d);

        Answer = findViewById(R.id.answer);
        back = findViewById(R.id.moveback);


        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                analyze();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backHome();
            }
        });
    }

    public void analyze(){

        String valuea = editA.getText().toString().trim();
        String valueb = editB.getText().toString().trim();
        String valuec = editC.getText().toString().trim();
        String valued = editD.getText().toString().trim();


        if(valuea.isEmpty() || valueb.isEmpty() || valuec.isEmpty() || valued.isEmpty() ){
            Toast.makeText(getApplicationContext(),"Check the field for empty place",Toast.LENGTH_LONG).show();
            return;
        }

        
        double valueA = Double.parseDouble(valuea);
        double valueB = Double.parseDouble(valueb);
        double valueC = Double.parseDouble(valuec);
        double valueD = Double.parseDouble(valued);

        double Solution = (valueA * valueD) - (valueC * valueB);

        Answer.setText(""+Solution);

    }

    public void backHome(){
        Intent open = new Intent(this, HomePage.class);
        startActivity(open);
    }
}
