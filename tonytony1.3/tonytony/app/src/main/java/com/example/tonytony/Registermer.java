package com.example.tonytony;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by 世界上最帅的人 on 2019/4/1.
 */

public class Registermer extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_mer);

    }
    public void mertoregistermain(View v)
    {
        Intent intent= new Intent(Registermer.this, registermain.class);
        startActivity(intent);
        Registermer.this.finish();
    }
}
