package com.example.kalhaar.loginintent;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class intenttwo extends AppCompatActivity {


    @BindView(R.id.showname)
    TextView showname;
    @BindView(R.id.showemail)
    TextView showemail;
    @BindView(R.id.showpass)
    TextView showpass;
    @BindView(R.id.sharebtn)
    Button sharebtn;
    @BindView(R.id.camerabtn)
    Button camerabtn;
    @BindView(R.id.instabtn)
    Button instabtn;
    @BindView(R.id.fbbtn)
    Button fbbtn;
    @BindView(R.id.twitterbtn)
    Button twitterbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intenttwo);

        Intent a=getIntent();
        showname.setText(a.getStringExtra("name"));
        showemail.setText(a.getStringExtra("email"));
        showpass.setText(a.getStringExtra("pass"));
        ButterKnife.bind(this);

        sharebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT,showname.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT,showemail.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT,showpass.getText().toString());
                intent.setType("text/plain");
                startActivity(intent);

            }
        });
        camerabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(intent);

            }

        });
        instabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/mr._calculator/"));

                startActivity(intent);

            }
        });
        fbbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));

                startActivity(intent);

            }
        });
        twitterbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitter.com/"));

                startActivity(intent);

            }
        });

    }
}
