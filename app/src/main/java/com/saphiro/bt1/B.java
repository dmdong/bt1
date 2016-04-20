package com.saphiro.bt1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class B extends AppCompatActivity {

    Button next, back;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(01, 01, data);
            finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        next = (Button)findViewById(R.id.nextbtn);
        back = (Button)findViewById(R.id.backbtn);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),C.class);
                startActivityForResult(intent, 01);

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        Toast.makeText(B.this, "Màn hình B", Toast.LENGTH_SHORT).show();
    }
}
