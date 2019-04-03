package com.example.tonytony;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by 世界上最帅的人 on 2019/3/29.
 */

public class registermain extends AppCompatActivity{


    Button user;
    Button merchant;
    Button manager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_main);

        user=(Button)findViewById(R.id.bt1);
        merchant=(Button)findViewById(R.id.bt2);
        manager=(Button)findViewById(R.id.bt3);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toregisternu(user);
            }
        });

    }

    public void toregisternu(View v)
    {
        Intent intent= new Intent(registermain.this, Registernu.class);
        startActivity(intent);
        registermain.this.finish();
    }

    public void toregisterman(View v)
    {
        Intent intent= new Intent(registermain.this, Registerman.class);
        startActivity(intent);
        registermain.this.finish();
    }

    public void toregistermer(View v)
    {
        Intent intent= new Intent(registermain.this, Registermer.class);
        startActivity(intent);
        registermain.this.finish();
    }

    public void tomain(View v)
    {
        Intent intent= new Intent(registermain.this, MainActivity.class);
        startActivity(intent);
        registermain.this.finish();
    }
}
