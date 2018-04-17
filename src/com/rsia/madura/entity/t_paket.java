package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_paket")
public class t_paket {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="apaket_id")
	private int apaket_id;
	
	@Column(name="m_paket_id")
	private int m_paket_id;
	
	@Column(name="apaket_harga")
	private String apaket_harga;
	
	@Column(name="apaket_keterangan")
	private String apaket_keterangan;
	
	@Column(name="apaket_aktif")
	private String apaket_aktif;
	
	@Column(name="apaket_created_by")
	private String apaket_created_by;
	
	@Column(name="apaket_created_date")
	private Timestamp apaket_created_date;
	
	@Column(name="apaket_updated_by")
	private String apaket_updated_by;
	
	@Column(name="apaket_updated_date")
	private Timestamp apaket_updated_date;
	
	@Column(name="apaket_revised")
	private int apaket_revised;
	
	@Column(name="t_pendaftaran_id")
	private int t_pendaftaran_id;
	
	@Column(name="paket_deleted_date")
	private Timestamp paket_deleted_date;

	public int getApaket_id() {
		return apaket_id;
	}

	public void setApaket_id(int apaket_id) {
		this.apaket_id = apaket_id;
	}

	public int getM_paket_id() {
		return m_paket_id;
	}

	public void setM_paket_id(int m_paket_id) {
		this.m_paket_id = m_paket_id;
	}

	public String getApaket_harga() {
		return apaket_harga;
	}

	public void setApaket_harga(String apaket_harga) {
		this.apaket_harga = apaket_harga;
	}

	public String getApaket_keterangan() {
		return apaket_keterangan;
	}

	public void setApaket_keterangan(String apaket_keterangan) {
		this.apaket_keterangan = apaket_keterangan;
	}

	public String getApaket_aktif() {
		return apaket_aktif;
	}

	public void setApaket_aktif(String apaket_aktif) {
		this.apaket_aktif = apaket_aktif;
	}

	public String getApaket_created_by() {
		return apaket_created_by;
	}

	public void setApaket_created_by(String apaket_created_by) {
		this.apaket_created_by = apaket_created_by;
	}

	public Timestamp getApaket_created_date() {
		return apaket_created_date;
	}

	public void setApaket_created_date(Timestamp apaket_created_date) {
		this.apaket_created_date = apaket_created_date;
	}

	public String getApaket_updated_by() {
		return apaket_updated_by;
	}

	public void setApaket_updated_by(String apaket_updated_by) {
		this.apaket_updated_by = apaket_updated_by;
	}

	public Timestamp getApaket_updated_date() {
		return apaket_updated_date;
	}

	public void setApaket_updated_date(Timestamp apaket_updated_date) {
		this.apaket_updated_date = apaket_updated_date;
	}

	public int getApaket_revised() {
		return apaket_revised;
	}

	public void setApaket_revised(int apaket_revised) {
		this.apaket_revised = apaket_revised;
	}

	public int getT_pendaftaran_id() {
		return t_pendaftaran_id;
	}

	public void setT_pendaftaran_id(int t_pendaftaran_id) {
		this.t_pendaftaran_id = t_pendaftaran_id;
	}

	public Timestamp getPaket_deleted_date() {
		return paket_deleted_date;
	}

	public void setPaket_deleted_date(Timestamp paket_deleted_date) {
		this.paket_deleted_date = paket_deleted_date;
	}

	@Override
	public String toString() {
		return "t_paket [apaket_id=" + apaket_id + ", m_paket_id=" + m_paket_id + ", apaket_harga=" + apaket_harga
				+ ", apaket_keterangan=" + apaket_keterangan + ", apaket_aktif=" + apaket_aktif + ", apaket_created_by="
				+ apaket_created_by + ", apaket_created_date=" + apaket_created_date + ", apaket_updated_by="
				+ apaket_updated_by + ", apaket_updated_date=" + apaket_updated_date + ", apaket_revised="
				+ apaket_revised + ", t_pendaftaran_id=" + t_pendaftaran_id + ", paket_deleted_date="
				+ paket_deleted_date + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
