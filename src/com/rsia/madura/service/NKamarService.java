/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:28:06 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:28:06 
 */
package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MKamar;

public interface NKamarService {
	public List<MKamar> findAll();
	public List<MKamar> findAll(int page, int limit);

	public String createLinks(int page, int limit);
	public MKamar getKamar(int id);
	
	public void store(MKamar data);
	public void update(MKamar data);
	public void delete(MKamar data);
}
