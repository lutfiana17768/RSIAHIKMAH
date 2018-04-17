/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:38:07 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:38:07 
 */
package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MPasien;

public interface NPasienService {
	public List<MPasien> getPasien();
	public List<MPasien> getPasiens(int page, int limit);
	public String createLinks(int page, int limit);
	public MPasien getPasien(int id);
	
	public void store(MPasien data);
	public void update(MPasien data);
	public void delete(MPasien data);
}
