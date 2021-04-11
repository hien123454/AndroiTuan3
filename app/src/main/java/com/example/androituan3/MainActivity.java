package com.example.androituan3;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnMau;
    Intent intent;
    ImageView imgPhoneActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        imgPhoneActivity = findViewById(R.id.imgPhoneActivity);
        btnMau = findViewById(R.id.btnChonMau);
        btnMau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivityForResult(intent,99);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(99 , 33, intent);
        if(requestCode ==99 && resultCode ==33)
        {
            int resimage1 = data.getIntExtra("traanh",2);
            imgPhoneActivity.setImageResource(resimage1);
        }

    }
}
