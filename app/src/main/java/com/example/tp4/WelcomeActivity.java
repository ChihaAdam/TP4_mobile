package com.example.tp4;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WelcomeActivity extends AppCompatActivity {
    private TextView welcomeMsg;
    private String nom,prenom,email;
    private void init(){
        welcomeMsg = findViewById(R.id.welcomeMsg);
        nom = getIntent().getStringExtra( "nom");
        prenom = getIntent().getStringExtra( "prenom");
        email= getIntent().getStringExtra("email");
    }
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_welcome);
        init();
        welcomeMsg.setText("Bienvenue "+nom+" " + prenom + ","+
                           "c'est la deuxiéme activité. vous serez bientot connecté sur: "
                  + email);
    }
}