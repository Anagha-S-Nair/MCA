package com.example.registraionapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    ImageView imgGender;

    TextView txtName;
    TextView txtEmail;
    TextView txtPhone;
    TextView txtAge;
    TextView txtAddress;
    TextView txtGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        imgGender = findViewById(R.id.imgGender);

        txtName = findViewById(R.id.txtName);
        txtEmail = findViewById(R.id.txtEmail);
        txtPhone = findViewById(R.id.txtPhone);
        txtAge = findViewById(R.id.txtAge);
        txtAddress = findViewById(R.id.txtAddress);
        txtGender = findViewById(R.id.txtGender);

        String name = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");
        String phone = getIntent().getStringExtra("phone");
        String age = getIntent().getStringExtra("age");
        String address = getIntent().getStringExtra("address");
        String gender = getIntent().getStringExtra("gender");

        txtName.setText("Name : " + name);
        txtEmail.setText("Email : " + email);
        txtPhone.setText("Phone : " + phone);
        txtAge.setText("Age : " + age);
        txtAddress.setText("Address : " + address);
        txtGender.setText("Gender : " + gender);

        if ("Male".equals(gender)) {
            imgGender.setImageResource(R.drawable.male);
        } else {
            imgGender.setImageResource(R.drawable.female);
        }
    }
}