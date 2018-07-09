package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MGaji;
import com.rsia.madura.entity.MGetGaji;

public interface GajiService {
	public List<MGaji> getGajis();
	public List<MGetGaji> getGajis(int page, int limit);
	public MGaji getGaji(int gajiId);
	public String createLinks(int page, int limit);
	public void getTotal(MGaji gajiModel);
	
	public void store(MGaji gajiModel);
	public void update(MGaji gajiModel);
	public void delete(MGaji gajiModel);
}
