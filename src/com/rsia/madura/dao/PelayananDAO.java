/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-18 10:01:14
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-18 10:02:17
*/
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MPendaftaran;

public interface PelayananDAO {
	public List<MPendaftaran> getPelayanans();
	public List<MPendaftaran> getPelayanans(int page, int limit);
	public String createLinks(int page, int limit);
	public MPendaftaran getPelayanan(int PelayananId);
	
	public int PelayananStore(MPendaftaran PelayananModel);
	public void PelayananUpdate(MPendaftaran PelayananModel);
	public void PelayananDelete(MPendaftaran PelayananModel);
}