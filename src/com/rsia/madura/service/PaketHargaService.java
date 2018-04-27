/*
* @Author: PRADESGA
* @Date:   2018-04-07 03:59:33
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-10 11:10:23
*/
package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MPaketHarga;

public interface PaketHargaService {
	public List<MPaketHarga> findAll();
	public List<MPaketHarga> findAll(int page, int limit);
	public String createLinks(int page, int limit);
	public MPaketHarga getById(int id);
	
	public void store(MPaketHarga data);
	public void update(MPaketHarga data);
	public void delete(MPaketHarga data);
}