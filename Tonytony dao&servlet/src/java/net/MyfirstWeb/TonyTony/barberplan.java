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
public class barberplan {
    
    private int Id;
    public String barbershop;
    public int orderid;
    public Date timeava;
    public String worktype;
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
    public String getBarbershop() {
        return barbershop;
    }    
    public void setBarbershop(String barbershop) {
        this.barbershop = barbershop;
    }
    
    public int getOrderId() {
        return orderid;
    }

    public void setOrderId(int orderid) {
        this.orderid = orderid;
    }
    
    public String getWorktype() {
        return worktype;
    }    
    public void setWorktype(String worktype) {
        this.worktype = worktype;
    }
    
     public Date getTimeAva() {
        return timeava;
    }

    public void setTimeAva(Date timeava) {
        this.timeava = timeava;
    }
}
