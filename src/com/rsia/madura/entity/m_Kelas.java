package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_kelas")
public class m_Kelas {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="kelas_id")
	private int kelas_id;
	
	@Column(name="kelas_kode")
	private String kelas_kode;
	
	@Column(name="kelas_nama")
	private String kelas_nama;
	
	@Column(name="kelas_keterangan")
	private String kelas_keterangan;
	
	@Column(name="kelas_aktif")
	private String kelas_aktif;
	
	@Column(name="kelas_created_by")
	private String kelas_created_by;
	
	@Column(name="kelas_created_date")
	private Timestamp kelas_created_date;
	
	@Column(name="kelas_updated_by")
	private String kelas_updated_by;
	
	@Column(name="kelas_updated_date")
	private Timestamp kelas_updated_date;
	
	@Column(name="kelas_revised")
	private String kelas_revised;
	
	@Column(name="kelas_deleted_date")
	private Timestamp kelas_deleted_date;

	public int getKelas_id() {
		return kelas_id;
	}

	public void setKelas_id(int kelas_id) {
		this.kelas_id = kelas_id;
	}

	public String getKelas_kode() {
		return kelas_kode;
	}

	public void setKelas_kode(String kelas_kode) {
		this.kelas_kode = kelas_kode;
	}

	public String getKelas_nama() {
		return kelas_nama;
	}

	public void setKelas_nama(String kelas_nama) {
		this.kelas_nama = kelas_nama;
	}

	public String getKelas_keterangan() {
		return kelas_keterangan;
	}

	public void setKelas_keterangan(String kelas_keterangan) {
		this.kelas_keterangan = kelas_keterangan;
	}

	public String getKelas_aktif() {
		return kelas_aktif;
	}

	public void setKelas_aktif(String kelas_aktif) {
		this.kelas_aktif = kelas_aktif;
	}

	public String getKelas_created_by() {
		return kelas_created_by;
	}

	public void setKelas_created_by(String kelas_created_by) {
		this.kelas_created_by = kelas_created_by;
	}

	public Timestamp getKelas_created_date() {
		return kelas_created_date;
	}

	public void setKelas_created_date(Timestamp kelas_created_date) {
		this.kelas_created_date = kelas_created_date;
	}

	public String getKelas_updated_by() {
		return kelas_updated_by;
	}

	public void setKelas_updated_by(String kelas_updated_by) {
		this.kelas_updated_by = kelas_updated_by;
	}

	public Timestamp getKelas_updated_date() {
		return kelas_updated_date;
	}

	public void setKelas_updated_date(Timestamp kelas_updated_date) {
		this.kelas_updated_date = kelas_updated_date;
	}

	public String getKelas_revised() {
		return kelas_revised;
	}

	public void setKelas_revised(String kelas_revised) {
		this.kelas_revised = kelas_revised;
	}

	public Timestamp getKelas_deleted_date() {
		return kelas_deleted_date;
	}

	public void setKelas_deleted_date(Timestamp kelas_deleted_date) {
		this.kelas_deleted_date = kelas_deleted_date;
	}

	@Override
	public String toString() {
		return "m_Kelas [kelas_id=" + kelas_id + ", kelas_kode=" + kelas_kode + ", kelas_nama=" + kelas_nama
				+ ", kelas_keterangan=" + kelas_keterangan + ", kelas_aktif=" + kelas_aktif + ", kelas_created_by="
				+ kelas_created_by + ", kelas_created_date=" + kelas_created_date + ", kelas_updated_by="
				+ kelas_updated_by + ", kelas_updated_date=" + kelas_updated_date + ", kelas_revised=" + kelas_revised
				+ ", kelas_deleted_date=" + kelas_deleted_date + "]";
	}
 

	public void setKelas_aktif(char c) {
		// TODO Auto-generated method stub
		
	}
  
	

}
