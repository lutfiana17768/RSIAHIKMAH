package com.rsia.madura.service;

import java.util.List;
 
import com.rsia.madura.entity.MTransaksiPasien;

public interface TransaksiPasienService {	
	public List<MTransaksiPasien> findAll();
	public List<MTransaksiPasien> findAll(int page, int limit);
	public String createLinks(int page, int limit);
	public MTransaksiPasien getTransaksiPasien(int id);
	
	public int store(MTransaksiPasien data);
	public void update(MTransaksiPasien data);
	public void delete(MTransaksiPasien data);
}
