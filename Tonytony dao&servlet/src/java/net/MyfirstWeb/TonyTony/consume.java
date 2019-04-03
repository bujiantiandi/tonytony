/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.MyfirstWeb.TonyTony;
import java.util.Date;
import java.sql.Timestamp;

/**
 *
 * @author DELL
 */
public class consume {
    private String consumerid;
    public int times;
    public Date datetime;
    public String productname;
    public int priceofcon;

    public String getConsumerId() {
        return consumerid;
    }    
    public void setConsumerId(String consumerid) {
        this.consumerid = consumerid;
    }
    
    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }
    
    //消费时间！慎重！
    public Date getDateTime() {
        return datetime;
    }

    public void setDateTime(Date datetime) {
        this.datetime = datetime;
    }
    //消费项目
    public String getProductName() {
        return productname;
    }    
    public void setProductName(String productname) {
        this.productname = productname;
    }
    
    public int getPriceofCon() {
        return priceofcon;
    }

    public void setPriceofCon(int priceofcon) {
        this.priceofcon= priceofcon;
    }
    
}
