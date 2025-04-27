package com.example.loginpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {
    private Button babtn,inbtn,usbtn;
    private Intent intent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        babtn=findViewById(R.id.btn1);
        inbtn=findViewById(R.id.btn2);
        usbtn=findViewById(R.id.btn3);
        babtn.setOnClickListener(this);
        inbtn.setOnClickListener(this);
        usbtn.setOnClickListener(this);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btn1){
            intent=new Intent(MainActivity3.this, MainActivity4.class);
            intent.putExtra("name","Bangladesh");
            startActivity(intent);
        }
        if (v.getId()==R.id.btn2){
            intent=new Intent(MainActivity3.this, MainActivity4.class);
            intent.putExtra("name","India");
            startActivity(intent);
        }

        if (v.getId()==R.id.btn3){
            intent=new Intent(MainActivity3.this, MainActivity4.class);
            intent.putExtra("name","America");
            startActivity(intent);
        }


    }
}