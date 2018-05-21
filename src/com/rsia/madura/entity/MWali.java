/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:10:39 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:10:39 
 */
package com.rsia.madura.entity;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_wali")
public class MWali {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="wali_id")
	private int wali_id;
	
	@Column(name="m_pasien_id")
	private int m_pasien_id;
	
	@Column(name="wali_kode")
	private String wali_kode;
	
	@Column(name="wali_nama")
	private String wali_nama;
	
	@Column(name="wali_kelamin")
	private String wali_kelamin;
	
	@Column(name="wali_alamat")
	private String wali_alamat;
	
	@Column(name="wali_hubungan")
	private String wali_hubungan;
	
	@Column(name="wali_aktif")
	private String wali_aktif;
	
	@Column(name="wali_created_by")
	private String wali_created_by;
	
	@Column(name="wali_created_date")
	private Timestamp wali_created_date;
	
	@Column(name="wali_updated_by")
	private String wali_updated_by;
	
	@Column(name="wali_updated_date")
	private Timestamp wali_updated_date;
	
	@Column(name="wali_revised")
	private int wali_revised;
	
	@Column(name="wali_tgllahir")
	private Timestamp wali_tgllahir;
	
	@Column(name="wali_deleted_date")
	private Timestamp wali_deleted_date;

	public int getWali_id() {
		return wali_id;
	}

	public void setWali_id(int wali_id) {
		this.wali_id = wali_id;
	}

	public int getM_pasien_id() {
		return m_pasien_id;
	}

	public void setM_pasien_id(int m_pasien_id) {
		this.m_pasien_id = m_pasien_id;
	}

	public String getWali_kode() {
		return wali_kode;
	}

	public void setWali_kode(String wali_kode) {
		this.wali_kode = wali_kode;
	}

	public String getWali_nama() {
		return wali_nama;
	}

	public void setWali_nama(String wali_nama) {
		this.wali_nama = wali_nama;
	}

	public String getWali_kelamin() {
		return wali_kelamin;
	}

	public void setWali_kelamin(String wali_kelamin) {
		this.wali_kelamin = wali_kelamin;
	}

	public String getWali_alamat() {
		return wali_alamat;
	}

	public void setWali_alamat(String wali_alamat) {
		this.wali_alamat = wali_alamat;
	}

	public String getWali_hubungan() {
		return wali_hubungan;
	}

	public void setWali_hubungan(String wali_hubungan) {
		this.wali_hubungan = wali_hubungan;
	}

	public String getWali_aktif() {
		return wali_aktif;
	}

	public void setWali_aktif(String wali_aktif) {
		this.wali_aktif = wali_aktif;
	}

	public String getWali_created_by() {
		return wali_created_by;
	}

	public void setWali_created_by(String wali_created_by) {
		this.wali_created_by = wali_created_by;
	}

	public Timestamp getWali_created_date() {
		return wali_created_date;
	}

	public void setWali_created_date(Timestamp wali_created_date) {
		this.wali_created_date = wali_created_date;
	}

	public String getWali_updated_by() {
		return wali_updated_by;
	}

	public void setWali_updated_by(String wali_updated_by) {
		this.wali_updated_by = wali_updated_by;
	}

	public Timestamp getWali_updated_date() {
		return wali_updated_date;
	}

	public void setWali_updated_date(Timestamp wali_updated_date) {
		this.wali_updated_date = wali_updated_date;
	}

	public int getWali_revised() {
		return wali_revised;
	}

	public void setWali_revised(int wali_revised) {
		this.wali_revised = wali_revised;
	}

	public Timestamp getWali_tgllahir() {
		return wali_tgllahir;
	}

	public void setWali_tgllahir(Timestamp wali_tgllahir) {
		this.wali_tgllahir = wali_tgllahir;
	}

	public Timestamp getWali_deleted_date() {
		return wali_deleted_date;
	}

	public void setWali_deleted_date(Timestamp wali_deleted_date) {
		this.wali_deleted_date = wali_deleted_date;
	}

	@Override
	public String toString() {
		return "MWali [wali_id=" + wali_id + ", m_pasien_id=" + m_pasien_id + ", wali_kode=" + wali_kode
				+ ", wali_nama=" + wali_nama + ", wali_kelamin=" + wali_kelamin + ", wali_alamat=" + wali_alamat
				+ ", wali_hubungan=" + wali_hubungan + ", wali_aktif=" + wali_aktif + ", wali_created_by="
				+ wali_created_by + ", wali_created_date=" + wali_created_date + ", wali_updated_by=" + wali_updated_by
				+ ", wali_updated_date=" + wali_updated_date + ", wali_revised=" + wali_revised + ", wali_tgllahir="
				+ wali_tgllahir + ", wali_deleted_date=" + wali_deleted_date + "]";
	}
	
	
}

