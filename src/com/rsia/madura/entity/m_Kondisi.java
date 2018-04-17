package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_kondisi")
public class m_Kondisi {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="kondisi_id")
	private int kondisi_id;
	
	@Column(name="kondisi_kode")
	private String kondisi_kode;
	
	@Column(name="kondisi_nama")
	private String kondisi_nama;
	
	@Column(name="kondisi_aktif")
	private String kondisi_aktif;
	
	@Column(name="kondisi_created_by")
	private String kondisi_created_by;
	
	@Column(name="kondisi_created_date")
	private Timestamp kondisi_created_date;
	
	@Column(name="kondisi_updated_by")
	private String kondisi_updated_by;
	
	@Column(name="kondisi_updated_date")
	private Timestamp kondisi_updated_date;
	
	@Column(name="kondisi_revised")
	private int kondisi_revised;
	
	@Column(name="kondisi_keterangan")
	private String kondisi_keterangan;
	
	@Column(name="kondisi_deleted_date")
	private Timestamp kondisi_deleted_date;

	public int getKondisi_id() {
		return kondisi_id;
	}

	public void setKondisi_id(int kondisi_id) {
		this.kondisi_id = kondisi_id;
	}

	public String getKondisi_kode() {
		return kondisi_kode;
	}

	public void setKondisi_kode(String kondisi_kode) {
		this.kondisi_kode = kondisi_kode;
	}

	public String getKondisi_nama() {
		return kondisi_nama;
	}

	public void setKondisi_nama(String kondisi_nama) {
		this.kondisi_nama = kondisi_nama;
	}

	public String getKondisi_aktif() {
		return kondisi_aktif;
	}
	
	public void setKondisi_aktif(String c) {
		this.kondisi_aktif = c;
	}

	public String getKondisi_created_by() {
		return kondisi_created_by;
	}

	public void setKondisi_created_by(String kondisi_created_by) {
		this.kondisi_created_by = kondisi_created_by;
	}

	public Timestamp getKondisi_created_date() {
		return kondisi_created_date;
	}

	public void setKondisi_created_date(Timestamp kondisi_created_date) {
		this.kondisi_created_date = kondisi_created_date;
	}

	public String getKondisi_updated_by() {
		return kondisi_updated_by;
	}

	public void setKondisi_updated_by(String kondisi_updated_by) {
		this.kondisi_updated_by = kondisi_updated_by;
	}

	public Timestamp getKondisi_updated_date() {
		return kondisi_updated_date;
	}

	public void setKondisi_updated_date(Timestamp kondisi_updated_date) {
		this.kondisi_updated_date = kondisi_updated_date;
	}

	public int getKondisi_revised() {
		return kondisi_revised;
	}

	public void setKondisi_revised(int kondisi_revised) {
		this.kondisi_revised = kondisi_revised;
	}

	public String getKondisi_keterangan() {
		return kondisi_keterangan;
	}

	public void setKondisi_keterangan(String kondisi_keterangan) {
		this.kondisi_keterangan = kondisi_keterangan;
	}

	public Timestamp getKondisi_deleted_date() {
		return kondisi_deleted_date;
	}

	public void setKondisi_deleted_date(Timestamp kondisi_deleted_date) {
		this.kondisi_deleted_date = kondisi_deleted_date;
	}

	@Override
	public String toString() {
		return "m_Kondisi [kondisi_id=" + kondisi_id + ", kondisi_kode=" + kondisi_kode + ", kondisi_nama="
				+ kondisi_nama + ", kondisi_aktif=" + kondisi_aktif + ", kondisi_created_by=" + kondisi_created_by
				+ ", kondisi_created_date=" + kondisi_created_date + ", kondisi_updated_by=" + kondisi_updated_by
				+ ", kondisi_updated_date=" + kondisi_updated_date + ", kondisi_revised=" + kondisi_revised
				+ ", kondisi_keterangan=" + kondisi_keterangan + ", kondisi_deleted_date=" + kondisi_deleted_date + "]";
	}
 
	  
		 

}
