/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:14:35 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:14:35 
 */
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MKamar;

public interface NKamarDAO {
	public List<MKamar> getKamars();
	public List<MKamar> getKamars(int page, int limit);
	public String createLinks(int page, int limit);
	public MKamar getKamar(int KamarId);
	
	public void Store(MKamar Model);
	public void Update(MKamar Model);
	public void Delete(MKamar Model);

}
