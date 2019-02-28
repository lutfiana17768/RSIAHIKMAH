package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MKartuStok;

public interface KartuStokService {

	public List<MKartuStok> getKartuStok(String month, String year, int barang_id);
	public List<MKartuStok> getKartuStokLast(String month, String year, int barang_id);

}
