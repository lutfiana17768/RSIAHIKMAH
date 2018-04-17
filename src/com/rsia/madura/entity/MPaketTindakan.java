package com.rsia.madura.entity;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_paket_tindakan")
public class MPaketTindakan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="paket_tindakan_id")
	private int paket_tindakan_id;
	
	@Column(name="m_paket_id")
	private int m_paket_id;
	
	@Column(name="m_tindakan_id")
	private int m_tindakan_id;
	
	@Column(name="paket_tindakan_jumlah")
	private int paket_tindakan_jumlah;
	
	@Column(name="paket_tindakan_created_by")
	private String paket_tindakan_created_by;
	
	@Column(name="paket_tindakan_created_date")
	private Timestamp paket_tindakan_created_date;
	
	@Column(name="paket_tindakan_updated_by")
	private String paket_tindakan_updated_by;
	
	@Column(name="paket_tindakan_updated_date")
	private Timestamp paket_tindakan_updated_date;
	
	@Column(name="paket_tindakan_revised")
	private int paket_tindakan_revised;
	  
	@Column(name="m_kelas_id")
	private int m_kelas_id;
	
	@Column(name="paket_tindakan_harga")
	private Float paket_tindakan_harga;
		  
	@Column(name="paket_tindakan_aktif")
	private String paket_tindakan_aktif;
	
	@Column(name="paketindakan_deleted_date")
	private Timestamp paketindakan_deleted_date;

	public int getPaket_tindakan_id() {
		return paket_tindakan_id;
	}

	public void setPaket_tindakan_id(int paket_tindakan_id) {
		this.paket_tindakan_id = paket_tindakan_id;
	}

	public int getM_paket_id() {
		return m_paket_id;
	}

	public void setM_paket_id(int m_paket_id) {
		this.m_paket_id = m_paket_id;
	}

	public int getM_tindakan_id() {
		return m_tindakan_id;
	}

	public void setM_tindakan_id(int m_tindakan_id) {
		this.m_tindakan_id = m_tindakan_id;
	}

	public int getPaket_tindakan_jumlah() {
		return paket_tindakan_jumlah;
	}

	public void setPaket_tindakan_jumlah(int paket_tindakan_jumlah) {
		this.paket_tindakan_jumlah = paket_tindakan_jumlah;
	}

	public String getPaket_tindakan_created_by() {
		return paket_tindakan_created_by;
	}

	public void setPaket_tindakan_created_by(String paket_tindakan_created_by) {
		this.paket_tindakan_created_by = paket_tindakan_created_by;
	}

	public Timestamp getPaket_tindakan_created_date() {
		return paket_tindakan_created_date;
	}

	public void setPaket_tindakan_created_date(Timestamp paket_tindakan_created_date) {
		this.paket_tindakan_created_date = paket_tindakan_created_date;
	}

	public String getPaket_tindakan_updated_by() {
		return paket_tindakan_updated_by;
	}

	public void setPaket_tindakan_updated_by(String paket_tindakan_updated_by) {
		this.paket_tindakan_updated_by = paket_tindakan_updated_by;
	}

	public Timestamp getPaket_tindakan_updated_date() {
		return paket_tindakan_updated_date;
	}

	public void setPaket_tindakan_updated_date(Timestamp paket_tindakan_updated_date) {
		this.paket_tindakan_updated_date = paket_tindakan_updated_date;
	}

	public int getPaket_tindakan_revised() {
		return paket_tindakan_revised;
	}

	public void setPaket_tindakan_revised(int paket_tindakan_revised) {
		this.paket_tindakan_revised = paket_tindakan_revised;
	}

	public int getM_kelas_id() {
		return m_kelas_id;
	}

	public void setM_kelas_id(int m_kelas_id) {
		this.m_kelas_id = m_kelas_id;
	}

	public String getPaket_tindakan_harga() {
		return paket_tindakan_harga.toString();
	}

	public void setPaket_tindakan_harga(String paket_tindakan_harga) {
		this.paket_tindakan_harga = Float.valueOf(paket_tindakan_harga);
	}

	public String getPaket_tindakan_aktif() {
		return paket_tindakan_aktif;
	}

	public void setPaket_tindakan_aktif(String paket_tindakan_aktif) {
		this.paket_tindakan_aktif = paket_tindakan_aktif;
	}

	public Timestamp getPaketindakan_deleted_date() {
		return paketindakan_deleted_date;
	}

	public void setPaketindakan_deleted_date(Timestamp paketindakan_deleted_date) {
		this.paketindakan_deleted_date = paketindakan_deleted_date;
	}

	@Override
	public String toString() {
		return "m_PaketTindakan [paket_tindakan_id=" + paket_tindakan_id + ", m_paket_id=" + m_paket_id
				+ ", m_tindakan_id=" + m_tindakan_id + ", paket_tindakan_jumlah=" + paket_tindakan_jumlah
				+ ", paket_tindakan_created_by=" + paket_tindakan_created_by + ", paket_tindakan_created_date="
				+ paket_tindakan_created_date + ", paket_tindakan_updated_by=" + paket_tindakan_updated_by
				+ ", paket_tindakan_updated_date=" + paket_tindakan_updated_date + ", paket_tindakan_revised="
				+ paket_tindakan_revised + ", m_kelas_id=" + m_kelas_id + ", paket_tindakan_harga="
				+ paket_tindakan_harga + ", paket_tindakan_aktif="
				+ paket_tindakan_aktif + ", paketindakan_deleted_date=" + paketindakan_deleted_date + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
