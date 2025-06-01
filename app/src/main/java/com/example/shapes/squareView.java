package com.example.shapes;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class squareView extends AppCompatActivity {
    private Button calcBtn;
    private EditText sideET;
    private TextView resultMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_square_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        calcBtn = findViewById(R.id.calcBtn3);
        sideET = findViewById(R.id.firstValueETN2);
        resultMsg = findViewById(R.id.resultTV3);

        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sideStr = sideET.getText().toString();
                float side = Float.parseFloat(sideStr);
                float area = side * 2;
                float perimeter = side * 4;

                resultMsg.setText(String.format("El area es: %.2f \nEl perimetro es: %.2f", area, perimeter));
            }
        });
    }
}