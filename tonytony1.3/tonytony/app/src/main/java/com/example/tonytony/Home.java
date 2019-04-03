package com.example.tonytony;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * Created by 世界上最帅的人 on 2019/4/2.
 */

public class Home extends AppCompatActivity{
    // 抽屉菜单对象
    private ActionBarDrawerToggle drawerbar;
    public DrawerLayout drawerLayout;
    private RelativeLayout main_left_drawer_layout, main_right_drawer_layout;

    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        setContentView(R.layout.home);
        initLayout();
        initEvent();
    }

    public void initLayout() {
        drawerLayout = (DrawerLayout) findViewById(R.id.main_drawer_layout);

        //设置菜单内容之外其他区域的背景色
        drawerLayout.setScrimColor(Color.TRANSPARENT);
        //右边菜单
        main_right_drawer_layout = (RelativeLayout) findViewById(R.id.main_right_drawer_layout);

    }

    //设置开关监听
    private void initEvent() {
        drawerbar = new ActionBarDrawerToggle(this, drawerLayout,R.string.drawer_open, R.string.drawer_close) {
            //菜单打开
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            // 菜单关闭
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };

        drawerLayout.addDrawerListener(drawerbar);
    }
    // 右边菜单开关事件
    public void openRightLayout(View view) {
        if (drawerLayout.isDrawerOpen(main_right_drawer_layout)) {
            drawerLayout.closeDrawer(main_right_drawer_layout);
        } else {
            drawerLayout.openDrawer(main_right_drawer_layout);
        }
    }

    //仅仅是为了查看订单界面，可以删改自己写=======================
    public void toOrder(View v)
    {
        Intent intent = new Intent(Home.this,Userorder.class);
        startActivity(intent);
        Home.this.finish();
    }
    public void touserhome(View v)
    {
        Intent intent = new Intent(Home.this,Userhome.class);
        startActivity(intent);
        Home.this.finish();
    }
//=========================================================
}
