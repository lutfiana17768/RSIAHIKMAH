/*
* @Author: PRADESGA
* @Date:   2018-04-07 01:49:18
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-08 08:16:47
*/
package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MPaketHarga;

public interface PaketHargaDAO {
	public List<MPaketHarga> getPaketHargas();
	public List<MPaketHarga> getPaketHargas(int page, int limit);
	public String createLinks(int page, int limit);
	public MPaketHarga getPaketHarga(int PaketId);

	// public List<MPaketHarga> getPaketHargaRuangs();
	// public List<MPaketHarga> getPaketHargaRuangs(int page, int limit);

	// public List<MPaketHarga> getPaketHargaTindakans();
	// public List<MPaketHarga> getPaketHargaTindakans(int page, int limit);

	// // public List<MPaketHarga> getPaketHargaPenunjang();
	// // public List<MPaketHarga> getPaketHargaPenunjang(int page, int limit);

	// public List<MPaketHarga> getPaketHargaObats();
	// public List<MPaketHarga> getPaketHargaObats(int page, int limit);

	public void PaketHargaStore(MPaketHarga PaketHargaModel);
	public void PaketHargaUpdate(MPaketHarga PaketHargaModel);
	public void PaketHargaDelete(MPaketHarga PaketHargaModel);
}