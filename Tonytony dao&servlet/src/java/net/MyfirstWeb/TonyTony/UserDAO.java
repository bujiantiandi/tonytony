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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class UserDAO {
    /**
     * 查询给定用户名的用户的详细信息
     *
     * @param userName 给定的用户名
     * @return 查询到的封装了详细信息的User对象
     */
    public static User queryUser(String userName) {
        //获得数据库的连接对象
        Connection connection = DBmanager.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        //生成SQL代码
        StringBuilder sqlStatement = new StringBuilder();
        sqlStatement.append("SELECT * FROM user WHERE UserName=?");

        //设置数据库的字段值
        try {
            preparedStatement = connection.prepareStatement(sqlStatement.toString());
            preparedStatement.setString(1, userName);
            
            resultSet = preparedStatement.executeQuery();
            User user = new User();
            if (resultSet.next()) {
                user.setUserName(resultSet.getString("UserName"));
                user.setPassword(resultSet.getString("PassWord"));
                return user;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            DBmanager.closeAll(connection, preparedStatement, resultSet);
        }
    }
    
    public static boolean deleteUser(String UserName) {
        Connection connection = DBmanager.getConnection();
        Statement statement=DBmanager.getStatement(connection);
		try {
			statement.executeUpdate("delete from user where UserName="+UserName);
			connection.close();
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
    	public static boolean insertUser(User t) {
		Connection connection = DBmanager.getConnection();
		Statement statement = DBmanager.getStatement(connection);
		try {
			statement.executeUpdate("insert into user(username,password,phoneNumber) values('"+
					t.getUserName()+"','"+t.getPassword()+"','"+t.getphoneNumber()+
					"')");
			connection.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
    	public static User getUser(String UserName) {
		Connection connection = DBmanager.getConnection();
		Statement statement = DBmanager.getStatement(connection);
		User user = null;
		try {
			ResultSet rs = statement.executeQuery("select * from user where UserName="+UserName);
			while (rs.next()){
				User temp = new User();
				temp.setUserName(rs.getString(1));
				temp.setPassword(rs.getString(2));
				temp.setphoneNumber(rs.getString(3));
				user = temp;
			}
			connection.close();
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
        
    public static boolean updateUser(User t) {
        Connection conn= DBmanager.getConnection();
        Statement statement = DBmanager.getStatement(conn);

		try {
			statement.executeUpdate("update user set password='"
					+t.getPassword()+"',phonenumber='"+t.getphoneNumber()+"' where Username="+t.getUserName());
			conn.close();
			statement.close();
		} catch (SQLException e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
    public User loginCheck(String userName){
            Connection conn= DBmanager.getConnection();
            Statement statement = DBmanager.getStatement(conn);
            User user = null;
            try {
                //AND password='"+password+"'
		ResultSet rs = statement.executeQuery("select * from user where username='"+userName+"'");
			while (rs.next()){
				User temp = new User();
				temp.setUserName(rs.getString(1));
				temp.setPassword(rs.getString(2));
				temp.setphoneNumber(rs.getString(3));
				user = temp;
			}
			conn.close();
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
    
        
    public static barber queryBarber(String barberaccount) {
        //获得数据库的连接对象
        Connection connection = DBmanager.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        //生成SQL代码
        StringBuilder sqlStatement = new StringBuilder();
        sqlStatement.append("SELECT * FROM barber WHERE barberaccount=?");

        //设置数据库的字段值
        try {
            preparedStatement = connection.prepareStatement(sqlStatement.toString());
            preparedStatement.setString(1, barberaccount);
            
            resultSet = preparedStatement.executeQuery();
            barber barber = new barber();
            if (resultSet.next()) {
                barber.setBarberAccount(resultSet.getString("barberaccount"));
                barber.setBarberPassword(resultSet.getString("barberpassword"));
                return barber;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            DBmanager.closeAll(connection, preparedStatement, resultSet);
        }
    }

}
//查询函数用executeQuery外，其他的增删改等操作都属于更新操作，要用executeUpdate，返回值为int型，即数据库中受到更新操作影响的行数。
