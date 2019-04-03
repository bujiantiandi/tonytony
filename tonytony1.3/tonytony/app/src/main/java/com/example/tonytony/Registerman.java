package com.example.tonytony;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by 世界上最帅的人 on 2019/3/30.
 */

public class Registerman extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_man);

    }
    public void mantoregistermain(View v)
    {
        Intent intent= new Intent(Registerman.this, registermain.class);
        startActivity(intent);
        Registerman.this.finish();
    }

}
