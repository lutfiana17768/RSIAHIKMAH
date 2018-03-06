package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.t_Gaji;

public interface GajiDAO {
	public List<t_Gaji> getGajis();
	public t_Gaji getGaji(int gajiId);
	public void getTotal(t_Gaji gajiModel);
	
	public void gajiStore(t_Gaji gajiModel);
	public void gajiUpdate(t_Gaji gajiModel);
	public void gajiDelete(t_Gaji gajiModel);
}
