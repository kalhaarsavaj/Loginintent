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

public class MainActivity extends AppCompatActivity {

   /* @BindView(R.id.signupname)
    EditText signupname;
    @BindView(R.id.signupemail)
    EditText signupemail;
    @BindView(R.id.signuppass)
    EditText signuppass;
    @BindView(R.id.signupbtn)
    Button signupbtn;
    String name,email,pass;
    */
   public String name,email,pass;
   EditText Signupemail,Signupname,Signuppass;
   Button Signupbtn;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // ButterKnife.bind(this);

        Signupname=(EditText)findViewById(R.id.signupname);
        Signupemail=(EditText)findViewById(R.id.signupemail);
        Signuppass=(EditText)findViewById(R.id.signuppass);
        Signupbtn= (Button) findViewById(R.id.signupbtn);
        name=Signupname.getText().toString();
       email=Signupemail.getText().toString();
       pass=Signuppass.getText().toString();

        Signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.equals("") || (name.equals(null))) {
                    Toast.makeText(MainActivity.this, "Please enter your name", Toast.LENGTH_SHORT).show();
                }
               else if (email.equals("")) {
                    Toast.makeText(MainActivity.this, "Please enter your Email", Toast.LENGTH_SHORT).show();
                }
                else if (pass.equals("")) {
                    Toast.makeText(MainActivity.this, "Please enter your Password", Toast.LENGTH_SHORT).show();
                }
                else if (name.equals("") && email.equals("") && pass.equals("")) {
                    Toast.makeText(MainActivity.this, "Please enter above details", Toast.LENGTH_SHORT).show();
                } else {

                    Toast.makeText(MainActivity.this, "Redirecting to Login Page", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, intentone.class);
                    i.putExtra("name", name);
                    i.putExtra("email", email);
                    i.putExtra("pass", pass);
                    

                    startActivity(i);
                }

            }});










        }
}
