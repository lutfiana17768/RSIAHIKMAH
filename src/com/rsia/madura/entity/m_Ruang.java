package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_ruang")
public class m_Ruang {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ruang_id")
	private int ruang_id;
	
	@Column(name="ruang_kode")
	private int ruang_kode;
	
	@Column(name="ruang_nama")
	private String ruang_nama;
	
	@Column(name="ruang_keterangan")
	private String ruang_keterangan;
	
	@Column(name="ruang_kepala")
	private int ruang_kepala;
	
	@Column(name="ruang_aktif")
	private String ruang_aktif;
	
	@Column(name="ruang_created_by")
	private String ruang_created_by;
	
	
	@Column(name="ruang_created_date")
	private Timestamp ruang_created_date;
	
	@Column(name="ruang_updated_by")
	private String ruang_updated_by;
	
	
	@Column(name="ruang_updated_date")
	private Timestamp ruang_updated_date;
	
	@Column(name="ruang_revised")
	private int ruang_revised;
	
	
	@Column(name="ruang_deleted_date")
	private Timestamp ruang_deleted_date;


	public int getRuang_id() {
		return ruang_id;
	}


	public void setRuang_id(int ruang_id) {
		this.ruang_id = ruang_id;
	}


	public int getRuang_kode() {
		return ruang_kode;
	}


	public void setRuang_kode(int ruang_kode) {
		this.ruang_kode = ruang_kode;
	}


	public String getRuang_nama() {
		return ruang_nama;
	}


	public void setRuang_nama(String ruang_nama) {
		this.ruang_nama = ruang_nama;
	}


	public String getRuang_keterangan() {
		return ruang_keterangan;
	}


	public void setRuang_keterangan(String ruang_keterangan) {
		this.ruang_keterangan = ruang_keterangan;
	}


	public int getRuang_kepala() {
		return ruang_kepala;
	}


	public void setRuang_kepala(int ruang_kepala) {
		this.ruang_kepala = ruang_kepala;
	}


	public String getRuang_aktif() {
		return ruang_aktif;
	}


	public void setRuang_aktif(String ruang_aktif) {
		this.ruang_aktif = ruang_aktif;
	}


	public String getRuang_created_by() {
		return ruang_created_by;
	}


	public void setRuang_created_by(String ruang_created_by) {
		this.ruang_created_by = ruang_created_by;
	}


	public Timestamp getRuang_created_date() {
		return ruang_created_date;
	}


	public void setRuang_created_date(Timestamp ruang_created_date) {
		this.ruang_created_date = ruang_created_date;
	}


	public String getRuang_updated_by() {
		return ruang_updated_by;
	}


	public void setRuang_updated_by(String ruang_updated_by) {
		this.ruang_updated_by = ruang_updated_by;
	}


	public Timestamp getRuang_updated_date() {
		return ruang_updated_date;
	}


	public void setRuang_updated_date(Timestamp ruang_updated_date) {
		this.ruang_updated_date = ruang_updated_date;
	}


	public int getRuang_revised() {
		return ruang_revised;
	}


	public void setRuang_revised(int ruang_revised) {
		this.ruang_revised = ruang_revised;
	}


	public Timestamp getRuang_deleted_date() {
		return ruang_deleted_date;
	}


	public void setRuang_deleted_date(Timestamp ruang_deleted_date) {
		this.ruang_deleted_date = ruang_deleted_date;
	}		

}
