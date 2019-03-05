package com.alphadude.user.matrixcal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {
    Button Two,Three,Profile,determinant;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Two = findViewById(R.id.twomatrix);
        Three = findViewById(R.id.threematrix);
        Profile = findViewById(R.id.profile);
        determinant = findViewById(R.id.determinant);

        Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                twoMatrix();
            }
        });

        Three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                threeMatrix();
            }
        });

        determinant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Determinant();
            }
        });

        Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                profilePage();
            }
        });
    }

    public void twoMatrix(){
        Intent open = new Intent(this, TwoMatrix.class);
        startActivity(open);
    }

    public void threeMatrix(){
        Intent open = new Intent(this, ThreeMartix.class);
        startActivity(open);
    }

    public void profilePage(){
        Intent open = new Intent(this, ProfileActivity.class);
        startActivity(open);
    }

    public void Determinant(){
        Intent open = new Intent(this, Determinant.class);
        startActivity(open);
    }


}
