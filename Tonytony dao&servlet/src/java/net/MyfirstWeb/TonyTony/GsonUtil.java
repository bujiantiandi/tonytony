/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.MyfirstWeb.TonyTony;

import com.google.gson.Gson;

/**
 *
 * @author DELL
 */
    public class GsonUtil {
	private static Gson gson = new Gson();
	public static Gson getGson(){
		return gson;
	}
}
