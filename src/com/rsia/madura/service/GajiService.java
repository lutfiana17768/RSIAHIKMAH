package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.t_Gaji;

public interface GajiService {
	public List<t_Gaji> getGajis();
	public t_Gaji getGaji(int gajiId);
	public void getTotal(t_Gaji gajiModel);
	
	public void store(t_Gaji gajiModel);
	public void update(t_Gaji gajiModel);
	public void delete(t_Gaji gajiModel);
}
