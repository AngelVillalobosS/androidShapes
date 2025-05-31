package com.example.shapes;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageButton bCircle, bSquare, bRectangle, bTriangle;
    MediaPlayer circleS, squareS, rectangleS, triangleS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        bCircle = findViewById(R.id.IB1);
        bSquare = findViewById(R.id.IB2);
        bRectangle = findViewById(R.id.IB3);
        bTriangle = findViewById(R.id.IB4);

        Intent squareView = new Intent(MainActivity.this, squareView.class);
        startActivity(squareView);

        bSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent squareView = new Intent(MainActivity.this, squareView.class);
                startActivity(squareView);
            }
        });

        bRectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rectangleView = new Intent(MainActivity.this, rectangleView.class);
                startActivity(rectangleView);
            }
        });

        bTriangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent triangleView = new Intent(MainActivity.this, triangleView.class);
                startActivity(triangleView);
            }
        });

    }
}