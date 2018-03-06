package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_rujukan")
public class m_Rujukan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rujukan_id")
	private int rujukan_id;
	
	@Column(name="rujukan_jenis")
	private int rujukan_jenis;
	
	@Column(name="rujukan_nama")
	private String rujukan_nama;
	
	@Column(name="rujukan_alamat")
	private String rujukan_alamat;
	
	@Column(name="rujukan_kecamatan")
	private int rujukan_kecamatan;
	
	@Column(name="rujukan_kota")
	private int rujukan_kota;
	
	@Column(name="rujukan_propinsi")
	private int rujukan_propinsi;
	
	@Column(name="rujukan_telp")
	private String rujukan_telp;
	
	@Column(name="rujukan_email")
	private String rujukan_email;
	
	@Column(name="rujukan_fax")
	private String rujukan_fax;
	
	@Column(name="rujukan_cp")
	private String rujukan_cp;
	
	@Column(name="rujukan_cp_telp")
	private String rujukan_cp_telp;
	
	@Column(name="rujukan_aktif")
	private String rujukan_aktif;
	
	@Column(name="rujukan_revised")
	private int rujukan_revised;
	
	@Column(name="rujukan_created_by")
	private String rujukan_created_by;
	
	@Column(name="rujukan_updated_by")
	private String rujukan_updated_by;
	
	@Column(name="rujukan_created_date")
	private Timestamp rujukan_created_date;
	
	@Column(name="rujukan_updated_date")
	private Timestamp rujukan_updated_date;
	
	@Column(name="rujukan_kode")
	private String rujukan_kode;
	  
	@Column(name="rujukan_deleted_date")
	private Timestamp rujukan_deleted_date;

	public int getRujukan_id() {
		return rujukan_id;
	}

	public void setRujukan_id(int rujukan_id) {
		this.rujukan_id = rujukan_id;
	}

	public int getRujukan_jenis() {
		return rujukan_jenis;
	}

	public void setRujukan_jenis(int rujukan_jenis) {
		this.rujukan_jenis = rujukan_jenis;
	}

	public String getRujukan_nama() {
		return rujukan_nama;
	}

	public void setRujukan_nama(String rujukan_nama) {
		this.rujukan_nama = rujukan_nama;
	}

	public String getRujukan_alamat() {
		return rujukan_alamat;
	}

	public void setRujukan_alamat(String rujukan_alamat) {
		this.rujukan_alamat = rujukan_alamat;
	}

	public int getRujukan_kecamatan() {
		return rujukan_kecamatan;
	}

	public void setRujukan_kecamatan(int rujukan_kecamatan) {
		this.rujukan_kecamatan = rujukan_kecamatan;
	}

	public int getRujukan_kota() {
		return rujukan_kota;
	}

	public void setRujukan_kota(int rujukan_kota) {
		this.rujukan_kota = rujukan_kota;
	}

	public int getRujukan_propinsi() {
		return rujukan_propinsi;
	}

	public void setRujukan_propinsi(int rujukan_propinsi) {
		this.rujukan_propinsi = rujukan_propinsi;
	}

	public String getRujukan_telp() {
		return rujukan_telp;
	}

	public void setRujukan_telp(String rujukan_telp) {
		this.rujukan_telp = rujukan_telp;
	}

	public String getRujukan_email() {
		return rujukan_email;
	}

	public void setRujukan_email(String rujukan_email) {
		this.rujukan_email = rujukan_email;
	}

	public String getRujukan_fax() {
		return rujukan_fax;
	}

	public void setRujukan_fax(String rujukan_fax) {
		this.rujukan_fax = rujukan_fax;
	}

	public String getRujukan_cp() {
		return rujukan_cp;
	}

	public void setRujukan_cp(String rujukan_cp) {
		this.rujukan_cp = rujukan_cp;
	}

	public String getRujukan_cp_telp() {
		return rujukan_cp_telp;
	}

	public void setRujukan_cp_telp(String rujukan_cp_telp) {
		this.rujukan_cp_telp = rujukan_cp_telp;
	}

	public String getRujukan_aktif() {
		return rujukan_aktif;
	}

	public void setRujukan_aktif(String rujukan_aktif) {
		this.rujukan_aktif = rujukan_aktif;
	}

	public int getRujukan_revised() {
		return rujukan_revised;
	}

	public void setRujukan_revised(int rujukan_revised) {
		this.rujukan_revised = rujukan_revised;
	}

	public String getRujukan_created_by() {
		return rujukan_created_by;
	}

	public void setRujukan_created_by(String rujukan_created_by) {
		this.rujukan_created_by = rujukan_created_by;
	}

	public String getRujukan_updated_by() {
		return rujukan_updated_by;
	}

	public void setRujukan_updated_by(String rujukan_updated_by) {
		this.rujukan_updated_by = rujukan_updated_by;
	}

	public Timestamp getRujukan_created_date() {
		return rujukan_created_date;
	}

	public void setRujukan_created_date(Timestamp rujukan_created_date) {
		this.rujukan_created_date = rujukan_created_date;
	}

	public Timestamp getRujukan_updated_date() {
		return rujukan_updated_date;
	}

	public void setRujukan_updated_date(Timestamp rujukan_updated_date) {
		this.rujukan_updated_date = rujukan_updated_date;
	}

	public String getRujukan_kode() {
		return rujukan_kode;
	}

	public void setRujukan_kode(String rujukan_kode) {
		this.rujukan_kode = rujukan_kode;
	}

	public Timestamp getRujukan_deleted_date() {
		return rujukan_deleted_date;
	}

	public void setRujukan_deleted_date(Timestamp rujukan_deleted_date) {
		this.rujukan_deleted_date = rujukan_deleted_date;
	}

	@Override
	public String toString() {
		return "m_Rujukan [rujukan_id=" + rujukan_id + ", rujukan_jenis=" + rujukan_jenis + ", rujukan_nama="
				+ rujukan_nama + ", rujukan_alamat=" + rujukan_alamat + ", rujukan_kecamatan=" + rujukan_kecamatan
				+ ", rujukan_kota=" + rujukan_kota + ", rujukan_propinsi=" + rujukan_propinsi + ", rujukan_telp="
				+ rujukan_telp + ", rujukan_email=" + rujukan_email + ", rujukan_fax=" + rujukan_fax + ", rujukan_cp="
				+ rujukan_cp + ", rujukan_cp_telp=" + rujukan_cp_telp + ", rujukan_aktif=" + rujukan_aktif
				+ ", rujukan_revised=" + rujukan_revised + ", rujukan_created_by=" + rujukan_created_by
				+ ", rujukan_updated_by=" + rujukan_updated_by + ", rujukan_created_date=" + rujukan_created_date
				+ ", rujukan_updated_date=" + rujukan_updated_date + ", rujukan_kode=" + rujukan_kode
				+ ", rujukan_deleted_date=" + rujukan_deleted_date + "]";
	}
 
	
}
