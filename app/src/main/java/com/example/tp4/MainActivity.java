package com.example.tp4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private EditText etNom,etPrenom,etEmail;
    private Button btn;

    private void init(){
        etNom = findViewById(R.id.etNom);
        etPrenom = findViewById(R.id.etPrenom);
        etEmail = findViewById(R.id.etEmail);
        btn = findViewById(R.id.btn);
    }
    private String getNom(){
        return etNom.getText().toString();
    }
    private String getPrenom(){
        return etPrenom.getText().toString();
    }

    private String getEmail(){
        return etEmail.getText().toString();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        init();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this,WelcomeActivity.class);
                myIntent.putExtra("nom",getNom());
                myIntent.putExtra("prenom",getPrenom());
                myIntent.putExtra("email",getEmail());
                startActivity(myIntent);
            }
        });
    }
}