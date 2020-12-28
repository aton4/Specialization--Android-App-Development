package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText emailText =  (EditText) findViewById(R.id.emailInput);
        EditText passwordText = (EditText) findViewById(R.id.passwordInput);

        Toast toast = Toast.makeText(getApplicationContext(), "Toast Initialized", Toast.LENGTH_SHORT);

        Button button = (Button)findViewById(R.id.loginButton);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Log.i("User Data:", "Email: " + emailText.getText().toString() + " Password: " + passwordText.getText().toString());

                String passwordCheck = LoginUtils.isValidPassword(passwordText.getText().toString());
                if ( passwordCheck != null)
                {
                    toast.setText(passwordCheck);
                    toast.show();
                    return;
                }
                if ( !LoginUtils.isValidEmail(emailText.getText().toString()))
                {
                    toast.setText("Invalid email address");
                    toast.show();
                    return;
                }

                toast.setText("Login success");
                toast.show();
            }
        }
        );
    }

}