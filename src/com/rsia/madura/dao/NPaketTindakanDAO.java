/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:20:36 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:20:36 
 */
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MPaketTindakan;

public interface NPaketTindakanDAO {
	public List<MPaketTindakan> getPaketTindakans();
	public List<MPaketTindakan> getPaketTindakans(int page, int limit);
	public String createLinks(int page, int limit);
	public MPaketTindakan getPaketTindakan(int pakettindakanId);
	
	public int Store(MPaketTindakan data);
	public void Update(MPaketTindakan data);
	public void Delete(MPaketTindakan data);
}
