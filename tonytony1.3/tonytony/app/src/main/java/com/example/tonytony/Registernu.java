package com.example.tonytony;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by 世界上最帅的人 on 2019/3/30.
 */

public class Registernu extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_nu);
    }

    public void nutoregistermain(View v)
    {
        Intent intent= new Intent(Registernu.this, registermain.class);
        startActivity(intent);
        Registernu.this.finish();
    }
}
