package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.KartuStokDAO;
import com.rsia.madura.entity.MKartuStok;

@Service
public class KartuStokServiceAction implements KartuStokService{
	@Autowired
	private KartuStokDAO kartuStokDAO;

	@Override
	@Transactional
	public List<MKartuStok> getKartuStok(String month, String year, int barang_id) {
		// TODO Auto-generated method stub
		return this.kartuStokDAO.getKartuStok(month, year, barang_id);
	}

}
