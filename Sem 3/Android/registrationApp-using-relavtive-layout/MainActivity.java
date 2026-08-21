package com.example.registraionapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etName, etEmail, etPhone,
            etAge, etAddress,
            etPassword, etConfirmPassword;

    RadioButton rbMale, rbFemale;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPhone = findViewById(R.id.etPhone);
        etAge = findViewById(R.id.etAge);
        etAddress = findViewById(R.id.etAddress);
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);

        rbMale = findViewById(R.id.rbMale);
        rbFemale = findViewById(R.id.rbFemale);

        btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = etName.getText().toString();
                String email = etEmail.getText().toString();
                String phone = etPhone.getText().toString();
                String age = etAge.getText().toString();
                String address = etAddress.getText().toString();
                String password = etPassword.getText().toString();
                String confirmPassword = etConfirmPassword.getText().toString();

                String gender = "";

                if (rbMale.isChecked()) {
                    gender = "Male";
                } else if (rbFemale.isChecked()) {
                    gender = "Female";
                }

                if (name.isEmpty() ||
                        email.isEmpty() ||
                        phone.isEmpty() ||
                        age.isEmpty() ||
                        address.isEmpty() ||
                        password.isEmpty() ||
                        confirmPassword.isEmpty()) {

                    Toast.makeText(MainActivity.this,
                            "Please fill all fields",
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                if (!password.equals(confirmPassword)) {
                    Toast.makeText(MainActivity.this,
                            "Passwords do not match",
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent intent =
                        new Intent(MainActivity.this,
                                SecondActivity.class);

                intent.putExtra("name", name);
                intent.putExtra("email", email);
                intent.putExtra("phone", phone);
                intent.putExtra("age", age);
                intent.putExtra("address", address);
                intent.putExtra("gender", gender);

                startActivity(intent);
            }
        });
    }
}