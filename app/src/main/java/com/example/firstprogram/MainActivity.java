package com.example.firstprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultTextViev;
    private EditText number_field_1, number_field_2;
    private Button add_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextViev = findViewById(R.id.resultTextView);
        number_field_1 = findViewById(R.id.number_field_1);
        number_field_2 = findViewById(R.id.number_field_2);
        add_button = findViewById(R.id.add_button);

        //метод, который срабатывает при нажатии на кнопку. Внутрь этого метода
        //мы помещаем создание анонимного класса и автоматически создается метод onClick
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            float num1 = Float.parseFloat(number_field_1.getText().toString());
            float num2 = Float.parseFloat(number_field_2.getText().toString());
            float res = num1+num2;
            resultTextViev.setText(String.valueOf(res));

            }
        });
    }
}