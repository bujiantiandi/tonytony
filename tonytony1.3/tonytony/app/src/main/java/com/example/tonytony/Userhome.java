package com.example.tonytony;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by 世界上最帅的人 on 2019/4/1.
 */

public class Userhome extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_homepage);

    }

    //页面跳转
    public void toHome(View view)
    {
        Intent intent = new Intent(Userhome.this,Home.class);
        startActivity(intent);
        Userhome.this.finish();
    }
    public void touserorder(View v)
    {
        Intent intent = new Intent(Userhome.this,Userorder.class);
        startActivity(intent);
        Userhome.this.finish();
    }
}
