package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_pasien")
public class m_Pasien {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pasien_id")
	private int pasien_id;
	
	@Column(name="pasien_norm")
	private String pasien_norm;
	
	@Column(name="pasien_nik")
	private String pasien_nik;
	
	@Column(name="pasien_nama")
	private String pasien_nama;
	
	@Column(name="pasien_kelamin")
	private String pasien_kelamin;
	
	@Column(name="pasien_alamat")
	private String pasien_alamat;
	
	@Column(name="m_kecamatan_id")
	private int m_kecamatan_id;
	
	@Column(name="m_kota_id")
	private int m_kota_id;
	
	@Column(name="m_propinsi_id")
	private int m_propinsi_id;
	
	@Column(name="pasien_notelp")
	private String pasien_notelp;
	
	@Column(name="pasien_nohp")
	private String pasien_nohp;
	
	@Column(name="pasien_goldarah")
	private String pasien_goldarah;
	
	@Column(name="pasien_bb")
	private String pasien_bb;
	
	@Column(name="pasien_tb")
	private String pasien_tb;
	
	@Column(name="pasien_aktif")
	private String pasien_aktif;
	
	@Column(name="pasien_created_by")
	private String pasien_created_by;
	
	@Column(name="pasien_created_date")
	private Timestamp pasien_created_date;
	
	@Column(name="pasien_updated_by")
	private String pasien_updated_by;
	
	@Column(name="pasien_updated_date")
	private Timestamp pasien_updated_date;
	
	@Column(name="m_kota_id_tempatlahir")
	private int m_kota_id_tempatlahir;
	
	@Column(name="pasien_tanggallahir")
	private Timestamp pasien_tanggallahir;
	
	@Column(name="m_kelurahan_id")
	private int m_kelurahan_id;
	
	@Column(name="m_status_id")
	private int m_status_id;
	
	@Column(name="pasien_keterangan")
	private String pasien_keterangan;
	
	@Column(name="pasien_domisili")
	private String pasien_domisili;
	
	@Column(name="pasien_pekerjaan")
	private String pasien_pekerjaan;
	
	@Column(name="pasien_statusnikah")
	private String pasien_statusnikah;
	
	@Column(name="m_agama_id")
	private int m_agama_id;
	
	@Column(name="m_pendidikan_id")
	private int m_pendidikan_id;
	
	@Column(name="m_pekerjaan_id")
	private int m_pekerjaan_id;
	
	@Column(name="pasien_alergi")
	private String pasien_alergi;
	
	@Column(name="pasien_deleted_date")
	private Timestamp pasien_deleted_date;

	public int getPasien_id() {
		return pasien_id;
	}

	public void setPasien_id(int pasien_id) {
		this.pasien_id = pasien_id;
	}

	public String getPasien_norm() {
		return pasien_norm;
	}

	public void setPasien_norm(String pasien_norm) {
		this.pasien_norm = pasien_norm;
	}

	public String getPasien_nik() {
		return pasien_nik;
	}

	public void setPasien_nik(String pasien_nik) {
		this.pasien_nik = pasien_nik;
	}

	public String getPasien_nama() {
		return pasien_nama;
	}

	public void setPasien_nama(String pasien_nama) {
		this.pasien_nama = pasien_nama;
	}

	public String getPasien_kelamin() {
		return pasien_kelamin;
	}

	public void setPasien_kelamin(String pasien_kelamin) {
		this.pasien_kelamin = pasien_kelamin;
	}

	public String getPasien_alamat() {
		return pasien_alamat;
	}

	public void setPasien_alamat(String pasien_alamat) {
		this.pasien_alamat = pasien_alamat;
	}

	public int getM_kecamatan_id() {
		return m_kecamatan_id;
	}

	public void setM_kecamatan_id(int m_kecamatan_id) {
		this.m_kecamatan_id = m_kecamatan_id;
	}

	public int getM_kota_id() {
		return m_kota_id;
	}

	public void setM_kota_id(int m_kota_id) {
		this.m_kota_id = m_kota_id;
	}

	public int getM_propinsi_id() {
		return m_propinsi_id;
	}

	public void setM_propinsi_id(int m_propinsi_id) {
		this.m_propinsi_id = m_propinsi_id;
	}

	public String getPasien_notelp() {
		return pasien_notelp;
	}

	public void setPasien_notelp(String pasien_notelp) {
		this.pasien_notelp = pasien_notelp;
	}

	public String getPasien_nohp() {
		return pasien_nohp;
	}

	public void setPasien_nohp(String pasien_nohp) {
		this.pasien_nohp = pasien_nohp;
	}

	public String getPasien_goldarah() {
		return pasien_goldarah;
	}

	public void setPasien_goldarah(String pasien_goldarah) {
		this.pasien_goldarah = pasien_goldarah;
	}

	public String getPasien_bb() {
		return pasien_bb;
	}

	public void setPasien_bb(String pasien_bb) {
		this.pasien_bb = pasien_bb;
	}

	public String getPasien_tb() {
		return pasien_tb;
	}

	public void setPasien_tb(String pasien_tb) {
		this.pasien_tb = pasien_tb;
	}

	public String getPasien_aktif() {
		return pasien_aktif;
	}

	public void setPasien_aktif(String pasien_aktif) {
		this.pasien_aktif = pasien_aktif;
	}

	public String getPasien_created_by() {
		return pasien_created_by;
	}

	public void setPasien_created_by(String pasien_created_by) {
		this.pasien_created_by = pasien_created_by;
	}

	public Timestamp getPasien_created_date() {
		return pasien_created_date;
	}

	public void setPasien_created_date(Timestamp pasien_created_date) {
		this.pasien_created_date = pasien_created_date;
	}

	public String getPasien_updated_by() {
		return pasien_updated_by;
	}

	public void setPasien_updated_by(String pasien_updated_by) {
		this.pasien_updated_by = pasien_updated_by;
	}

	public Timestamp getPasien_updated_date() {
		return pasien_updated_date;
	}

	public void setPasien_updated_date(Timestamp pasien_updated_date) {
		this.pasien_updated_date = pasien_updated_date;
	}

	public int getM_kota_id_tempatlahir() {
		return m_kota_id_tempatlahir;
	}

	public void setM_kota_id_tempatlahir(int m_kota_id_tempatlahir) {
		this.m_kota_id_tempatlahir = m_kota_id_tempatlahir;
	}

	public Timestamp getPasien_tanggallahir() {
		return pasien_tanggallahir;
	}

	public void setPasien_tanggallahir(Timestamp pasien_tanggallahir) {
		this.pasien_tanggallahir = pasien_tanggallahir;
	}

	public int getM_kelurahan_id() {
		return m_kelurahan_id;
	}

	public void setM_kelurahan_id(int m_kelurahan_id) {
		this.m_kelurahan_id = m_kelurahan_id;
	}

	public int getM_status_id() {
		return m_status_id;
	}

	public void setM_status_id(int m_status_id) {
		this.m_status_id = m_status_id;
	}

	public String getPasien_keterangan() {
		return pasien_keterangan;
	}

	public void setPasien_keterangan(String pasien_keterangan) {
		this.pasien_keterangan = pasien_keterangan;
	}

	public String getPasien_domisili() {
		return pasien_domisili;
	}

	public void setPasien_domisili(String pasien_domisili) {
		this.pasien_domisili = pasien_domisili;
	}

	public String getPasien_pekerjaan() {
		return pasien_pekerjaan;
	}

	public void setPasien_pekerjaan(String pasien_pekerjaan) {
		this.pasien_pekerjaan = pasien_pekerjaan;
	}

	public String getPasien_statusnikah() {
		return pasien_statusnikah;
	}

	public void setPasien_statusnikah(String pasien_statusnikah) {
		this.pasien_statusnikah = pasien_statusnikah;
	}

	public int getM_agama_id() {
		return m_agama_id;
	}

	public void setM_agama_id(int m_agama_id) {
		this.m_agama_id = m_agama_id;
	}

	public int getM_pendidikan_id() {
		return m_pendidikan_id;
	}

	public void setM_pendidikan_id(int m_pendidikan_id) {
		this.m_pendidikan_id = m_pendidikan_id;
	}

	public int getM_pekerjaan_id() {
		return m_pekerjaan_id;
	}

	public void setM_pekerjaan_id(int m_pekerjaan_id) {
		this.m_pekerjaan_id = m_pekerjaan_id;
	}

	public String getPasien_alergi() {
		return pasien_alergi;
	}

	public void setPasien_alergi(String pasien_alergi) {
		this.pasien_alergi = pasien_alergi;
	}

	public Timestamp getPasien_deleted_date() {
		return pasien_deleted_date;
	}

	public void setPasien_deleted_date(Timestamp pasien_deleted_date) {
		this.pasien_deleted_date = pasien_deleted_date;
	}

	@Override
	public String toString() {
		return "m_Pasien [pasien_id=" + pasien_id + ", pasien_norm=" + pasien_norm + ", pasien_nik=" + pasien_nik
				+ ", pasien_nama=" + pasien_nama + ", pasien_kelamin=" + pasien_kelamin + ", pasien_alamat="
				+ pasien_alamat + ", m_kecamatan_id=" + m_kecamatan_id + ", m_kota_id=" + m_kota_id + ", m_propinsi_id="
				+ m_propinsi_id + ", pasien_notelp=" + pasien_notelp + ", pasien_nohp=" + pasien_nohp
				+ ", pasien_goldarah=" + pasien_goldarah + ", pasien_bb=" + pasien_bb + ", pasien_tb=" + pasien_tb
				+ ", pasien_aktif=" + pasien_aktif + ", pasien_created_by=" + pasien_created_by
				+ ", pasien_created_date=" + pasien_created_date + ", pasien_updated_by=" + pasien_updated_by
				+ ", pasien_updated_date=" + pasien_updated_date + ", m_kota_id_tempatlahir=" + m_kota_id_tempatlahir
				+ ", pasien_tanggallahir=" + pasien_tanggallahir + ", m_kelurahan_id=" + m_kelurahan_id
				+ ", m_status_id=" + m_status_id + ", pasien_keterangan=" + pasien_keterangan + ", pasien_domisili="
				+ pasien_domisili + ", pasien_pekerjaan=" + pasien_pekerjaan + ", pasien_statusnikah="
				+ pasien_statusnikah + ", m_agama_id=" + m_agama_id + ", m_pendidikan_id=" + m_pendidikan_id
				+ ", m_pekerjaan_id=" + m_pekerjaan_id + ", pasien_alergi=" + pasien_alergi + ", pasien_deleted_date="
				+ pasien_deleted_date + "]";
	}

}
