package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MPaketObat;

public interface PaketObatService {
	public List<MPaketObat> findAll();
	public List<MPaketObat> findAll(int page, int limit);
	public String createLinks(int page, int limit);
	public MPaketObat getPaketObat(int id);
	
	public void store(MPaketObat data);
	public void update(MPaketObat data);
	public void delete(MPaketObat data);
}
