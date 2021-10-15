package com.example.weread;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.Pair;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputLayout;

public class Login extends AppCompatActivity {

    Button callSignUp, login_btn;
    ImageView image;
    TextInputLayout username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ini baris akan menyembunyikan status bar dari screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        //Hooks
        callSignUp = findViewById(R.id.signup_screen);
        image = findViewById(R.id.logoImage);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login_btn = findViewById(R.id.login_btn);

        callSignUp.setOnClickListener((view) ->{
                    Intent intent = new Intent (Login.this,SignUp.class);
                    startActivity(intent);

            Pair[] pairs = new Pair[5];
            pairs[0] = new Pair<View, String>(image, "logo_image");
            pairs[1] = new Pair<View, String>(username, "username_tran");
            pairs[2] = new Pair<View, String>(password, "password_tran");
            pairs[3] = new Pair<View, String>(login_btn, "button_tran");
            pairs[4] = new Pair<View, String>(callSignUp, "login_signup_tran");

            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Login.this);
            startActivity(intent,options.toBundle());
        });
    }
}