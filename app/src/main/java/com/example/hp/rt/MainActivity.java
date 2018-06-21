package com.example.hp.rt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText email,pass;
//Button B1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=findViewById(R.id.F_view);
        pass=findViewById(R.id.S_view);
       // B1=findViewById(R.id.B_type);
    }
    public void signIn(View view){
        String eMail=email.getText().toString();
        String passWord=pass.getText().toString();
        Intent i = new Intent(this,Main2Activity.class);
        i.putExtra("Hello",eMail);
        i.putExtra("pass",passWord);
        startActivity(i);
    }
}
