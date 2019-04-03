/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.MyfirstWeb.TonyTony;

public class User {

    //用户姓名
    private String userName;
    //用户密码
    private String password;
    //联系方式
    public String phonenumber; 

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getphoneNumber() {
        return phonenumber;
    }
    public void setphoneNumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
