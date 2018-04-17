package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MPaketObat;

public interface PaketObatDAO {
	public List<MPaketObat> getPaketObats();
	public List<MPaketObat> getPaketObats(int page, int limit);
	public String createLinks(int page, int limit);
	public MPaketObat getPaketObat(int PaketObatId);
	
	public int Store(MPaketObat data);
	public void Update(MPaketObat data);
	public void Delete(MPaketObat data);
}
