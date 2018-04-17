package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.GajiDAO;
import com.rsia.madura.entity.t_Gaji;

@Service
public class GajiServiceAction implements GajiService {
	@Autowired
	private GajiDAO gajiDAO;
	
	@Override
	@Transactional
	public List<t_Gaji> getGajis() {
	
		return gajiDAO.getGajis();
	}

	@Override
	@Transactional
	public t_Gaji getGaji(int gajiId) {
		
		return gajiDAO.getGaji(gajiId);	
	}

	@Override
	public void getTotal(t_Gaji gajiModel) {
		
		gajiDAO.getTotal(gajiModel);

	}

	@Override
	@Transactional
	public void store(t_Gaji gajiModel) {
		
		gajiDAO.gajiStore(gajiModel);

	}

	@Override
	@Transactional
	public void update(t_Gaji gajiModel) {
		
		gajiDAO.gajiUpdate(gajiModel);

	}

	@Override
	@Transactional
	public void delete(t_Gaji gajiModel) {
		
		gajiDAO.gajiDelete(gajiModel);

	}

}
