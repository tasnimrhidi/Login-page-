package com.example.loginpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText editText1,getEditText2;
    private Button loginbutton;
    private TextView textView;
    private int counter =3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editText1= findViewById(R.id.Userid);
        getEditText2= findViewById(R.id.Passwordid);
        loginbutton=findViewById(R.id.btnid);
        textView=findViewById(R.id.textviewid);
        textView.setText("number of attempt remaining :3");
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username =editText1.getText().toString();
                String password =getEditText2.getText().toString();
                if (username.equals("admin")&& password.equals("123")){
                    Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                    startActivity(intent);

                }
                else {
                    counter--;
                    textView.setText("Number of attempt remaining :"+counter);
                    if (counter==0){
                        loginbutton.setEnabled(false);
                    }
                }
            }
        });
    }
}


