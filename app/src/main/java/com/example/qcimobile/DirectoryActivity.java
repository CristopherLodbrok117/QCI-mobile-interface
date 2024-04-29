package com.example.qcimobile;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DirectoryActivity extends AppCompatActivity {

    ImageButton btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_directory);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        loadViews();
        setEventListeners();
    }

    public void loadViews(){
        btnBack = (ImageButton) findViewById(R.id.btnBack);
    }

    public void setEventListeners(){
        btnBack.setOnClickListener(event ->{
            changeMenuActivity();
        });
    }

    public void changeMenuActivity(){
        Intent nextActivity = new Intent(this, Menu.class);
        startActivity(nextActivity);
    }
}