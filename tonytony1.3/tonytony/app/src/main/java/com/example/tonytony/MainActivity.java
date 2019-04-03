package com.example.tonytony;

import android.app.Application;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private Button bt2;
    TextView inputname;
    TextView inputpassword;

   // final String url1="http://242l4v7844.wicp.vip/WebApplication1/LoginServlet";
   // final String url2="http://242l4v7844.wicp.vip/WebApplication/BarberLoginServlet";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        inputname=(TextView)findViewById(R.id.acountNumber);
        inputpassword=(TextView)findViewById(R.id.editText2);
        final  RadioGroup types=(RadioGroup)findViewById(R.id.radioGroup2);

        bt2=(Button)findViewById(R.id.bt2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               switch(types.getCheckedRadioButtonId())
                {
                    case R.id.rb1:
                        LoginRequest(inputname.getText().toString(),inputpassword.getText().toString());
                        break;
                    case R.id.rb2:
                        LoginRequest2(inputname.getText().toString(),inputpassword.getText().toString());
                        break;
                    case R.id.rb3:
                        Toast.makeText(MainActivity.this, "管理员尚不能登录", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "请选择你的身份", Toast.LENGTH_LONG).show();
                }


            }
        });


    }



   //跳转操作
    public  void toregistermain(View v)
    {
        Intent intent= new Intent(MainActivity.this, registermain.class);
        startActivity(intent);
        MainActivity.this.finish();
    }

    public  void tohome(View v)
    {
        Intent intent= new Intent(MainActivity.this, Home.class);
        startActivity(intent);
        MainActivity.this.finish();
    }

 //普通用户请求登录
   public  void LoginRequest(final String accountNumber, final String password) {
        //请求地址
          //注①
        String url ="http://242l4v7844.wicp.vip/WebApplication1/LoginServlet";
        String tag = "Login";    //注②

        //取得请求队列
       RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());

        //防止重复请求，所以先取消tag标识的请求队列
        requestQueue.cancelAll(tag);

        //创建StringRequest，定义字符串请求的请求方式为POST(省略第一个参数会默认为GET方式)
        final StringRequest request = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = (JSONObject) new JSONObject(response).get("params");  //注③
                            String result = jsonObject.getString("Result");  //注④
                            if (result.equals("success")) {  //注⑤

                                Toast.makeText(MainActivity.this, "登陆成功", Toast.LENGTH_SHORT).show();
                                Intent intent= new Intent(MainActivity.this,Home.class);
                                startActivity(intent);
                                MainActivity.this.finish();
                                //做自己的登录成功操作，如页面跳转
                            } else{
                                Toast.makeText(MainActivity.this, "用户名或密码错误", Toast.LENGTH_SHORT).show();
                                //做自己的登录失败操作，如Toast提示
                            }
                        } catch (JSONException e) {
                            //做自己的请求异常操作，如Toast提示（“无网络连接”等）
                            Toast.makeText(MainActivity.this, "无网络连接", Toast.LENGTH_SHORT).show();
                            Log.e("TAG", e.getMessage(), e);
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //做自己的响应错误操作，如Toast提示（“请稍后重试”等）
                Toast.makeText(MainActivity.this, "请稍后重试", Toast.LENGTH_SHORT).show();
                Log.e("TAG", error.getMessage(), error);
            }
        })
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("accountNumber", accountNumber);  //注⑥
                params.put("Password", password);
                return params;

            }
        };

        //设置Tag标签
        request.setTag(tag);

        //将请求添加到队列中
        requestQueue.add(request);
    }

    //商家登录请求
    public  void LoginRequest2(final String accountNumber, final String password) {
        //请求地址
        //注①
        String url ="http://242l4v7844.wicp.vip/WebApplication1/BarberLoginServlet";
        String tag = "Login";    //注②

        //取得请求队列
        RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());

        //防止重复请求，所以先取消tag标识的请求队列
        requestQueue.cancelAll(tag);

        //创建StringRequest，定义字符串请求的请求方式为POST(省略第一个参数会默认为GET方式)
        final StringRequest request = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = (JSONObject) new JSONObject(response).get("params");  //注③
                            String result = jsonObject.getString("Result");  //注④
                            if (result.equals("success")) {  //注⑤

                                Toast.makeText(MainActivity.this, "登陆成功", Toast.LENGTH_SHORT).show();
                                Intent intent= new Intent(MainActivity.this, Merhome.class);
                                startActivity(intent);
                                MainActivity.this.finish();
                                //做自己的登录成功操作，如页面跳转
                            } else{
                                Toast.makeText(MainActivity.this, "用户名或密码错误", Toast.LENGTH_SHORT).show();
                                //做自己的登录失败操作，如Toast提示
                            }
                        } catch (JSONException e) {
                            //做自己的请求异常操作，如Toast提示（“无网络连接”等）
                            Toast.makeText(MainActivity.this, "无网络连接", Toast.LENGTH_SHORT).show();
                            Log.e("TAG", e.getMessage(), e);
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //做自己的响应错误操作，如Toast提示（“请稍后重试”等）
                Toast.makeText(MainActivity.this, "请稍后重试", Toast.LENGTH_SHORT).show();
                Log.e("TAG", error.getMessage(), error);
            }
        })
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("barberaccount", accountNumber);  //注⑥
                params.put("barberpassword", password);
                return params;

            }
        };

        //设置Tag标签
        request.setTag(tag);

        //将请求添加到队列中
        requestQueue.add(request);
    }









}
