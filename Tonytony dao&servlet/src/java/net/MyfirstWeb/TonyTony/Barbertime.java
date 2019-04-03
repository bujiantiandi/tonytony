/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.MyfirstWeb.TonyTony;
import java.util.Date;
import java.util.List;
import net.MyfirstWeb.TonyTony.barberplan;

/**
 *
 * @author DELL
 */
public interface Barbertime {
	/**
	 * 添加预约许可
	 */
	barberplan addBarberplan(barberplan barberplan);

	/**
         * 查看所有可预约情况
	 * @return List<barberplan>
	 */
	List<barberplan> getAllplan();

	/**
	 * 删除可预约时段
	 */
	int deletePlanById(int Id);

	/**
	* 修改可预约情况
	 */
	int updatePlan(barberplan barberplan);

	
	/**
         * 通过时间查找指定时段
	 */
	barberplan  getPlanByDatetime(Date datetime);
	

}
