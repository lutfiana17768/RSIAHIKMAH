/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:20:04 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:20:04 
 */
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MPaketObat;

public interface NPaketObatDAO {
	public List<MPaketObat> getPaketObats();
	public List<MPaketObat> getPaketObats(int page, int limit);
	public String createLinks(int page, int limit);
	public MPaketObat getPaketObat(int PaketObatId);
	
	public int Store(MPaketObat data);
	public void Update(MPaketObat data);
	public void Delete(MPaketObat data);
}
