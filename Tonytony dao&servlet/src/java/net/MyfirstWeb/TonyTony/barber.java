/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.MyfirstWeb.TonyTony;

/**
 *
 * @author DELL
 */
public class barber {
    //店名
    public String barbername;
    //店号
    public int barberId;
    //店账号
    private String barberaccount;
    //店密码
    private String barberpassword;
    //店地址
    public String location;
    public String tele;
    public int mark;
    public int work1;
    public int work2;
    public int work3;
    public int work4;
    public int work5;
    public String work6;
    public String picture;
    
//理发店名
    public String getBarberName() {
        return barbername;
    }

    public void setBarberName(String barbername) {
        this.barbername = barbername;
    }
//理发店注册号
    public int getBarberId() {
        return barberId;
    }

    public void setBarberId(int barberId) {
        this.barberId = barberId;
    }
//理发店账号
    public String getBarberAccount() {
        return barberaccount;
    }
    public void setBarberAccount(String barberaccount) {
        this.barberaccount = barberaccount;
    }
//理发店密码
    public String getBarberPassword() {
        return barberpassword;
    }
    public void setBarberPassword(String barberpassword) {
        this.barberpassword = barberpassword;
    }
//位置
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
//联系方式
    public String getTele() {
        return tele;
    }
    public void setTele(String tele) {
        this.tele = tele;
    }
    //评分
    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    //业务1
    public int getWork1() {
        return work1;
    }

    public void setWork1(int work1) {
        this.work1 = work1;
    }
    
    public int getWork2() {
        return work2;
    }

    public void setWork2(int work2) {
        this.work2 = work2;
    }
    
    public int getWork3() {
        return work1;
    }

    public void setWork3(int work3) {
        this.work3 = work3;
    }
    
    public int getWork4() {
        return work4;
    }

    public void setWork4(int work4) {
        this.work4 = work4;
    }
    
    public int getWork5() {
        return work5;
    }

    public void setWork5(int work5) {
        this.work5 = work5;
    }
    
    public String getWork6() {
        return work6;
    }

    public void setWork6(String work6) {
        this.work6 = work6;
    }

    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
    
            
}
