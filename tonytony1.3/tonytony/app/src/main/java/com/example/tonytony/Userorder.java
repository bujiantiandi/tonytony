package com.example.tonytony;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
/**
 * Created by 世界上最帅的人 on 2019/4/2.
 */

public class Userorder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_order);
    }
    //仅仅是为了查看订单界面，可以删改自己写=======================
    public void toHome(View view)
    {
        Intent intent = new Intent(Userorder.this,Home.class);
        startActivity(intent);
        Userorder.this.finish();
    }
    public void touserhome(View v)
    {
        Intent intent = new Intent(Userorder.this,Userhome.class);
        startActivity(intent);
        Userorder.this.finish();
    }
}
