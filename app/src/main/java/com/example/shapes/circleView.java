package com.example.shapes;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class circleView extends AppCompatActivity {
    private Button calcBtn;
    private EditText radius;
    private TextView result;
    double area = 0, perimeter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_circle_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        calcBtn = findViewById(R.id.calcBtn);
        radius = findViewById(R.id.radiusET);
        result = findViewById(R.id.rstTV);



        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = radius.getText().toString();

                Double radius = Double.parseDouble(num1);
                area = ((Math.PI/4) * Math.pow(radius, 2));
                perimeter = ((Math.PI * 2) * radius );

                result.setText(String.format("El area es: %.2f \nEl perimetro es: %.2f", area, perimeter));
            }
        });
    }
}