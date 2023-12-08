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
