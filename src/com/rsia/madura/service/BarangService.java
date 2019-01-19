package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MBarang;
import com.rsia.madura.entity.MGetBarang;

public interface BarangService {
	public List<MBarang> getBarangs();
	public List<MGetBarang> getBarangs(int page, int limit);
	public List<MGetBarang> getBarang();
	public String createLinks(int page, int limit);
	public MBarang getBarang(int barangId);
	
	public int store(MBarang barangModel);
	public int update(MBarang barangModel);
	public int delete(MBarang barangModel);
}
