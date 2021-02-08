package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton genderButton;
    private Button button;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroupId);
        button = findViewById(R.id.btnId);
        resultTextView  = findViewById(R.id.resultId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                genderButton = findViewById(selectedId);

                String value = genderButton.getText().toString();

                resultTextView.setText("You have selected " + value);
            }
        });
    }
}