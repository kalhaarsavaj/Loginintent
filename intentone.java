package com.example.kalhaar.loginintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class intentone extends AppCompatActivity {

    @BindView(R.id.Loginemail)
    EditText loginemail;
    @BindView(R.id.Loginpass)
    EditText loginpass;
    @BindView(R.id.Loginbtn)
    Button loginbtn;
    String n,p;
    String n1,p1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intentone);
        ButterKnife.bind(this);

        n=loginemail.getText().toString();
        p=loginpass.getText().toString();

        Intent i = getIntent();

        n1=i.getStringExtra("email");
        p1=i.getStringExtra("pass");



        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (n.equals(null)||p.equals(null)){
                    Toast.makeText(intentone.this, "Please enter above details", Toast.LENGTH_SHORT).show();
                }
                else if (n.equals(n1) && p.equals(p1)){


                    Toast.makeText(intentone.this, "Redirecting to VIEW PROFILE", Toast.LENGTH_SHORT).show();
                    Intent in =new Intent(intentone.this,intenttwo.class);
                    startActivity(in);

                }
                else
                {
                    Toast.makeText(intentone.this, "Login details are incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}
