package com.example.damangames;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView Registeration;
    TextView Login;
    TextView JoinLive;
    TextView JoinTelegram;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); // Or ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
//Registration now
        Registeration=findViewById(R.id.Register);
        Registeration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Register("https://www.instagram.com/picadu24?igsh=c2NnY243aDIxbXk=");//url link
            }
        });
//Login now
        Login=findViewById(R.id.Login);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Register("https://www.youtube.com");//url link
            }
        });
//Join live
        JoinLive=findViewById(R.id.JoinLive);
        JoinLive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Register("https://www.instagram.com/picadu24?igsh=c2NnY243aDIxbXk=");//url link
            }
        });
//JoinTelegram
        JoinTelegram=findViewById(R.id.JoinTelegram);
        JoinTelegram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Register("https://www.instagram.com/picadu24?igsh=c2NnY243aDIxbXk=");//url link
            }
        });


//bottom links



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }






    void Register(String s){
        try{
            Uri uri = Uri.parse(s);
            startActivity(new Intent(Intent.ACTION_VIEW,uri));

        }
        catch (Exception e){
            Toast.makeText(getApplicationContext(),"No Website Linked",Toast.LENGTH_SHORT).show();
        }
    }

    void Login(String s){
        try{
            Uri uri = Uri.parse(s);
            startActivity(new Intent(Intent.ACTION_VIEW,uri));

        }
        catch (Exception e){
            Toast.makeText(getApplicationContext(),"No Website Linked",Toast.LENGTH_SHORT).show();
        }
    }
    void JoinLive(String s){
        try{
            Uri uri = Uri.parse(s);
            startActivity(new Intent(Intent.ACTION_VIEW,uri));

        }
        catch (Exception e){
            Toast.makeText(getApplicationContext(),"No Website Linked",Toast.LENGTH_SHORT).show();
        }
    }
    void JoinTelegram(String s){
        try{
            Uri uri = Uri.parse(s);
            startActivity(new Intent(Intent.ACTION_VIEW,uri));

        }
        catch (Exception e){
            Toast.makeText(getApplicationContext(),"No Website Linked",Toast.LENGTH_SHORT).show();
        }
    }
}






