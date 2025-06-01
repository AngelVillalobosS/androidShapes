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

public class triangleView extends AppCompatActivity {
    private Button calcBtn, perimeterBtn;
    private EditText heightET, baseET, thirdET;
    private TextView rstTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_triangle_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        calcBtn = findViewById(R.id.calcBtn4);
        perimeterBtn = findViewById(R.id.periBtn);
        heightET = findViewById(R.id.firstValueETN4);
        baseET = findViewById(R.id.secondValueETN4);
        thirdET = findViewById(R.id.thirdValueETN);
        rstTV = findViewById(R.id.resultTV4);

        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String heightStr = heightET.getText().toString();
                String baseStr = baseET.getText().toString();
                if (heightStr != null && baseStr != null) {

                    float height = Float.parseFloat(heightStr);
                    float base = Float.parseFloat(baseStr);

                    float area = (base * height) / 2;


                    rstTV.setText(String.format("El area es: %.2f", area));
                }else {
                    rstTV.setText("Faltan datos por ingresar");
                }
            }
        });

        perimeterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String heightStr = heightET.getText().toString();
                String baseStr = baseET.getText().toString();
                String thirdStr = thirdET.getText().toString();
                if (heightStr != null && baseStr != null) {

                    float height = Float.parseFloat(heightStr);
                    float base = Float.parseFloat(baseStr);
                    float third = Float.parseFloat(thirdStr);

                    float perimeter = base * height * third;

                    rstTV.setText(String.format("El perimeter es: %.2f", perimeter));
                }else {
                    rstTV.setText("Faltan datos por ingresar");
                }
            }
        });
    }
}