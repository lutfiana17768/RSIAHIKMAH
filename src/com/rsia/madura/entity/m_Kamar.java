package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_kamar")
public class m_Kamar {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="kamar_id")
	private int kamar_id;
	
	@Column(name="kamar_no")
	private String kamar_no;
	
	@Column(name="m_ruang_id")
	private Integer m_ruang_id;
	
	@Column(name="m_kelas_id")
	private int m_kelas_id;
	 
	@Column(name="kamar_keterangan")
	private String kamar_keterangan;
	
	@Column(name="kamar_aktif")
	private String kamar_aktif;
	
	@Column(name="kamar_created_by")
	private String kamar_created_by;
	 
	@Column(name="kamar_created_date")
	private Timestamp kamar_created_date;
	 
	@Column(name="kamar_updated_by")
	private String kamar_updated_by;
	 
	@Column(name="kamar_updated_date")
	private Timestamp kamar_updated_date;
	 
	@Column(name="kamar_revised")
	private int kamar_revised;
	 
	@Column(name="kamar_kategori")
	private String kamar_kategori;
	 
	@Column(name="kamar_deleted_date")
	private Timestamp kamar_deleted_date;

	public int getKamar_id() {
		return kamar_id;
	}

	public void setKamar_id(int kamar_id) {
		this.kamar_id = kamar_id;
	}

	public String getKamar_no() {
		return kamar_no;
	}

	public void setKamar_no(String kamar_no) {
		this.kamar_no = kamar_no;
	}

	public int getM_ruang_id() {
		return m_ruang_id;
	}

	public void setM_ruang_id(int m_ruang_id) {
		this.m_ruang_id = m_ruang_id;
	}

	public int getM_kelas_id() {
		return m_kelas_id;
	}

	public void setM_kelas_id(int m_kelas_id) {
		this.m_kelas_id = m_kelas_id;
	}

	public String getKamar_keterangan() {
		return kamar_keterangan;
	}

	public void setKamar_keterangan(String kamar_keterangan) {
		this.kamar_keterangan = kamar_keterangan;
	}

	public String getKamar_aktif() {
		return kamar_aktif;
	}

	public void setKamar_aktif(String kamar_aktif) {
		this.kamar_aktif = kamar_aktif;
	}

	public String getKamar_created_by() {
		return kamar_created_by;
	}

	public void setKamar_created_by(String kamar_created_by) {
		this.kamar_created_by = kamar_created_by;
	}

	public Timestamp getKamar_created_date() {
		return kamar_created_date;
	}

	public void setKamar_created_date(Timestamp kamar_created_date) {
		this.kamar_created_date = kamar_created_date;
	}

	public String getKamar_updated_by() {
		return kamar_updated_by;
	}

	public void setKamar_updated_by(String kamar_updated_by) {
		this.kamar_updated_by = kamar_updated_by;
	}

	public Timestamp getKamar_updated_date() {
		return kamar_updated_date;
	}

	public void setKamar_updated_date(Timestamp kamar_updated_date) {
		this.kamar_updated_date = kamar_updated_date;
	}

	public int getKamar_revised() {
		return kamar_revised;
	}

	public void setKamar_revised(int kamar_revised) {
		this.kamar_revised = kamar_revised;
	}

	public String getKamar_kategori() {
		return kamar_kategori;
	}

	public void setKamar_kategori(String kamar_kategori) {
		this.kamar_kategori = kamar_kategori;
	}

	public Timestamp getKamar_deleted_date() {
		return kamar_deleted_date;
	}

	public void setKamar_deleted_date(Timestamp kamar_deleted_date) {
		this.kamar_deleted_date = kamar_deleted_date;
	}

	@Override
	public String toString() {
		return "m_Kamar [kamar_id=" + kamar_id + ", kamar_no=" + kamar_no + ", m_ruang_id=" + m_ruang_id
				+ ", m_kelas_id=" + m_kelas_id + ", kamar_keterangan=" + kamar_keterangan + ", kamar_aktif="
				+ kamar_aktif + ", kamar_created_by=" + kamar_created_by + ", kamar_created_date=" + kamar_created_date
				+ ", kamar_updated_by=" + kamar_updated_by + ", kamar_updated_date=" + kamar_updated_date
				+ ", kamar_revised=" + kamar_revised + ", kamar_kategori=" + kamar_kategori + ", kamar_deleted_date="
				+ kamar_deleted_date + "]";
	}

	public void setkamar_aktif(char c) {
		// TODO Auto-generated method stub
		
	}
 
	
}
