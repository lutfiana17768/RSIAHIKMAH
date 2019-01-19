package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MBarang;
import com.rsia.madura.entity.MGetBarang;

public interface BarangDAO {

	public List<MBarang> getBarangs();
	public List<MGetBarang> getBarangs(int page, int limit);
	public List<MGetBarang> getBarang();
	public String createLinks(int page, int limit);
	public MBarang getBarang(int barangId);
	
	public int barangStore(MBarang barangModel);
	public int barangUpdate(MBarang barangModel);
	public int barangDelete(MBarang barangModel);

}
