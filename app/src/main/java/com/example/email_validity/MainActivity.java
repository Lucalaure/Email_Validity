package com.example.email_validity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtEmail;
    private Button btnChecker;
    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer = (TextView) findViewById(R.id.answer);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        btnChecker = (Button) findViewById(R.id.btnChecker);

        btnChecker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = edtEmail.getText().toString();

                if (email.indexOf('@') != -1) {
                    answer.setBackgroundColor(Color.parseColor("#90EE90"));
                    answer.setText("VALID");
                } else {
                    answer.setBackgroundColor(Color.parseColor("#FF0000"));
                    answer.setText("INVALID");
                }
            }
        });
    }
}