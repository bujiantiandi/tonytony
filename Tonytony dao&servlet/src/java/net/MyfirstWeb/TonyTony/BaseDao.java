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
import java.util.List;

public interface BaseDao<T> {
    
    public boolean save(T t);
    public T getBarber(String barbername);
    public List<T> getAll();
}
