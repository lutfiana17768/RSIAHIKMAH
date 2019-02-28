package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MKartuStok;

public interface KartuStokDAO {

	public List<MKartuStok> getKartuStok(String month, String year, int barang_id);
	public List<MKartuStok> getKartuStokLast(String month, String year, int barang_id);

}
