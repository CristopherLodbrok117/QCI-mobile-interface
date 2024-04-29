package com.example.qcimobile;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Menu extends AppCompatActivity {
    ImageButton btnMenuIcon;
    ImageButton btnUserIcon;
    ImageView imgDirectory;

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
        btnUserIcon = (ImageButton) findViewById(R.id.btnUserIcon);
        imgDirectory = (ImageView) findViewById(R.id.imgDirectory);
    }

    public void setEventListeners(){

        btnUserIcon.setOnClickListener(event -> {
            changeLoginActivity();
        });

        imgDirectory.setOnClickListener(event -> {
            changeDirectoryActivity();
        });
    }

    public void changeLoginActivity(){
        Intent nextActivity = new Intent(this, MainActivity.class);
        startActivity(nextActivity);
    }

    public void changeDirectoryActivity(){
        Intent nextActivity = new Intent(this, DirectoryActivity.class);
        startActivity(nextActivity);
    }
}