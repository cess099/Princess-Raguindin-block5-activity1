package com.raguindin.princess.block5.p1.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.android.material.button.MaterialButton;

class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    MaterialButton loginButton;
    MaterialButton SIGNUPButton;

    ImageView toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.LoginButton);
        SIGNUPButton = findViewById(R.id.SIGNUPButton);
        toggleButton = findViewById(R.id.toggle_password);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Your login button click logic here
            }
        });

        SIGNUPButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (password.getTransformationMethod() instanceof PasswordTransformationMethod) {
                    // Password is currently hidden, so show it
                    password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    toggleButton.setImageResource(R.drawable.baseline_remove_red_eye_24);
                } else {
                    // Password is currently shown, so hide it
                    password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    toggleButton.setImageResource(R.drawable.baseline_check_24);
                }
            }
        });

    }
}
