package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MPaketTindakan;

public interface NPaketTindakanService {
	public List<MPaketTindakan> findAll();
	public List<MPaketTindakan> findAll(int page, int limit);
	public String createLinks(int page, int limit);
	public MPaketTindakan getPaketTindakan(int id);
	
	public void store(MPaketTindakan data);
	public void update(MPaketTindakan data);
	public void delete(MPaketTindakan data);
}
