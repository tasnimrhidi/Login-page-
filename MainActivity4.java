package com.example.loginpage;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity4 extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);
        imageView=findViewById(R.id.imgId);
        textView=findViewById(R.id.textid);
        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
            String cName = bundle.getString("name");
            showDetail(cName);
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    void showDetail(String cName){
        if (cName.equals("Bangladesh")) {
            imageView.setImageResource(R.drawable.bangladesh);
            textView.setText(R.string.bd1);
        }
        if (cName.equals("India")) {
            imageView.setImageResource(R.drawable.india);
            textView.setText(R.string.in1);
        }
        if (cName.equals("America")) {
            imageView.setImageResource(R.drawable.usa);
            textView.setText(R.string.Us1);
        }

    }
}
