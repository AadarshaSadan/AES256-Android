package com.example.aesencryption;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.aesencryption.Encryption.AES256;
import com.example.aesencryption.Encryption.AES256D;

import static com.example.aesencryption.Encryption.AES256.encrypt;

public class MainActivity extends AppCompatActivity {
TextView tv,textView;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv=findViewById(R.id.tv);
        textView=findViewById(R.id.textView);
        System.out.println(encrypt("sadan"));
//        System.out.println(AES256D.decrypt());
        String passworddata=AES256.encrypt("SADAN");
        tv.setText(passworddata);
//        Log.d("KEY",AES256D.decrypt(passworddata));
        textView.setText(AES256D.decrypt(passworddata));

    }
}