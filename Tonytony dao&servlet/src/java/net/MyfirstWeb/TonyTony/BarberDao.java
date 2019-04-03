/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.MyfirstWeb.TonyTony;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class BarberDao implements BaseDao<barber>{

    private Connection conn;
    private Statement stat;
    public List<barber> getBarberByName(String barbername) {
	conn = DBmanager.getConnection();
	stat = DBmanager.getStatement(conn);
	System.out.print(barbername);
	try {
		barbername = new String(barbername.getBytes("ISO-8859-1"),"utf-8");
	} catch (UnsupportedEncodingException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
	}
	ArrayList<barber> list = new ArrayList<barber>();
            try {
                    ResultSet rs = stat.executeQuery("select * from barber where barbername like'%" +barbername + "%'");
			while (rs.next()){
				barber temp = new barber();
				temp.setBarberId(rs.getInt(4));
				temp.setBarberName(rs.getString(3));
				temp.setLocation(rs.getString(5));
				temp.setMark(rs.getInt(7));
				list.add(temp);		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public barber getBarber(String barbernameex) {
            conn = DBmanager.getConnection();
            stat = DBmanager.getStatement(conn);
            System.out.print(barbernameex);
		barber barber = null;
		try {
			ResultSet rs = stat.executeQuery("select * from barber where barbername ='" +barbernameex +"'");
			while (rs.next()){
				barber temp = new barber();
                                temp.setBarberName(rs.getString(3));
				temp.setBarberId(rs.getInt(4));				
				temp.setLocation(rs.getString(5));
                                temp.setTele(rs.getString(6));
				temp.setMark(rs.getInt(7));
                                temp.setWork1(rs.getInt(8));
				temp.setWork2(rs.getInt(9));
                                temp.setWork3(rs.getInt(10));
				temp.setWork4(rs.getInt(11));
                                temp.setWork5(rs.getInt(12));
				temp.setWork6(rs.getString(13));
				barber = temp;
			}
			conn.close();
			stat.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return barber;
	}

	public boolean save(barber t) {
            conn = DBmanager.getConnection();
            stat = DBmanager.getStatement(conn);
		try {
			stat.executeUpdate("insert into barber(barberid,location,barbername) values('"+
					t.getBarberId()+"','"+t.getLocation()+"','"+t.getBarberName()+
					"')");
			conn.close();
			stat.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public List<barber> getAll() {
            conn = DBmanager.getConnection();
            stat = DBmanager.getStatement(conn);
		ArrayList<barber> list = new ArrayList<barber>();
		try {
			ResultSet rs = stat.executeQuery("select * from barber");
			while (rs.next()){
				barber temp = new barber();
				temp.setBarberId(rs.getInt(4));
				temp.setBarberName(rs.getString(3));
				temp.setLocation(rs.getString(5));
				temp.setMark(rs.getInt(7));
				list.add(temp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}



}
