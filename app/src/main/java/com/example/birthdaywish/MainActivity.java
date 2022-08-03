package com.example.birthdaywish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private FrameLayout side1;
    private FrameLayout side2;
    private TextInputLayout name;
    private TextInputEditText fill_name;
    public static final String EXTRA_NAME ="kuch_bhi";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        fill_name = findViewById(R.id.fill_name);
    }


    public void openActivity(View view){
        Toast.makeText(this, "Your card is ready!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,page2.class);
        fill_name = findViewById(R.id.fill_name);
        String b_name = fill_name.getText().toString();
        intent.putExtra(EXTRA_NAME,b_name);
        startActivity(intent);

    }
}