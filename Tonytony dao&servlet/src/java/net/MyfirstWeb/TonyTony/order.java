/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.MyfirstWeb.TonyTony;
import java.util.Date;
/**
 *
 * @author DELL
 */
public class order {
    public int orderId;
    private String worktype;
    public int price;
    private String userid;
    private String barberac;
    public Date datetime;
    
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }   
    
    public String getWorkType() {
        return worktype;
    }
    public void setWorkType(String worktype) {
        this.worktype = worktype;
    }
    
    public String getBarberAc() {
        return barberac;
    }

    public void setBarberAc(String barberac) {
        this.barberac = barberac;
    }

    public String getUserId() {
        return userid;
    }

    public void setUserId(String userid) {
        this.userid = userid;
    }
    //消费时间！慎重！
    public Date getDateTime() {
        return datetime;
    }

    public void setDateTime(Date datetime) {
        this.datetime = datetime;
    }
     
}
