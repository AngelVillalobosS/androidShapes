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

public class rectangleView extends AppCompatActivity {
    private Button calculateBtn;
    private TextView result;
    private EditText heightTV, widthTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_rectangle_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        calculateBtn = findViewById(R.id.calcBtn2);
        result = findViewById(R.id.resultTV2);
        heightTV = findViewById(R.id.firstValueETN);
        widthTV = findViewById(R.id.secondValueETN);

//        Declaracion de variables a usar
        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String height = heightTV.getText().toString();
                String width = widthTV.getText().toString();

                float num1 = Float.parseFloat(height);
                float num2 = Float.parseFloat(width);

                float area = num1 * num2;
                float perimeter = area * 2;

                result.setText(String.format("El area es: %.2f \nEl perimetro es: %.2f", area, perimeter));

            }
        });
    }
}