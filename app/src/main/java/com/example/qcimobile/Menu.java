package com.example.qcimobile;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Menu extends AppCompatActivity {
    ImageButton btnMenuIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        loadViews();
        setEventListeners();
    }

    public void loadViews(){
        btnMenuIcon = (ImageButton) findViewById(R.id.btnMenuIcon);
    }

    public void setEventListeners(){

        btnMenuIcon.setOnClickListener(ecent ->{
            changeLoginActivity();
        });
    }

    public void changeLoginActivity(){
        Intent nextActivity = new Intent(this, MainActivity.class);
        startActivity(nextActivity);
    }
}