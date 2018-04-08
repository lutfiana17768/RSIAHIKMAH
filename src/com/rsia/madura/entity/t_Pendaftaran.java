package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_Pendaftaran")
public class t_Pendaftaran {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pendaftaran_id")
	private int pendaftaran_id;
	
	@Column(name="pendaftaran_no")
	private String pendaftaran_no;
	
	@Column(name="pendaftaran_nourut")
	private int pendaftaran_nourut;
	
	@Column(name="m_unit_id")
	private int m_unit_id;
	
	@Column(name="pendaftaran_mrs")
	private Timestamp pendaftaran_mrs;

	@Column(name="m_pasien_id")
	private int m_pasien_id;

	@Column(name="m_kondisi_id")
	private int m_kondisi_id;
	
	@Column(name="pendaftaran_krs")
	private Timestamp pendaftaran_krs;
	
	@Column(name="m_status_id")
	private int m_status_id;
	
	@Column(name="m_rujuk_id_keluar")
	private int m_rujuk_id_keluar;
	
	@Column(name="pendaftaran_aktif")
	private String pendaftaran_aktif;
	
	@Column(name="pendaftaran_created_by")
	private String pendaftaran_created_by;
	
	@Column(name="pendaftaran_created_date")
	private Timestamp pendaftaran_created_date;
	
	@Column(name="pendaftaran_updated_by")
	private String pendaftaran_updated_by;
	
	@Column(name="pendaftaran_updated_date")
	private Timestamp pendaftaran_updated_date;
	
	@Column(name="pendaftaran_revised")
	private int pendaftaran_revised;
	
	@Column(name="m_kondisi_id_keluar")
	private int m_kondisi_id_keluar;
	
	@Column(name="pendaftaran_keterangan")
	private String pendaftaran_keterangan;
	
	@Column(name="pendaftaran_tarif")
	private int pendaftaran_tarif;
	
	@Column(name="m_status_id_masuk")
	private int m_status_id_masuk;
	
	@Column(name="m_status_id_pelayanan")
	private String m_status_id_pelayanan;
	
	@Column(name="pendaftaran_status_kunjungan")
	private String pendaftaran_status_kunjungan;
	
	@Column(name="m_kondisi_id_masuk")
	private int m_kondisi_id_masuk;
	
	@Column(name="m_rujukan_id")
	private int m_rujukan_id;
	
	@Column(name="pendaftaran_jenis")
	private String pendaftaran_jenis;
	
	@Column(name="pendaftaran_status_konsul")
	private String pendaftaran_status_konsul;
	
	@Column(name="m_unit_id_asal")
	private int m_unit_id_asal;
	
	@Column(name="pendaftaran_m_pasien_norm")
	private String pendaftaran_m_pasien_norm;
	
	@Column(name="m_kelas_id_standar")
	private int m_kelas_id_standar;
	
	@Column(name="pendaftaran_dokter")
	private int pendaftaran_dokter;
	
	@Column(name="pendaftaran_pasien_nama")
	private String pendaftaran_pasien_nama;
	
	@Column(name="pendaftaran_pasien_alamat")
	private String pendaftaran_pasien_alamat;
	
	@Column(name="pendaftaran_pasien_tgllahir")
	private Timestamp pendaftaran_pasien_tgllahir;
	
	@Column(name="pendaftaran_pasien_kelamin")
	private String pendaftaran_pasien_kelamin;
	
	@Column(name="pendaftaran_pasien_notelp")
	private String pendaftaran_pasien_notelp;
	
	@Column(name="pendaftaran_deleted_date")
	private Timestamp pendaftaran_deleted_date;

	public int getPendaftaran_id() {
		return pendaftaran_id;
	}

	public void setPendaftaran_id(int pendaftaran_id) {
		this.pendaftaran_id = pendaftaran_id;
	}

	public String getPendaftaran_no() {
		return pendaftaran_no;
	}

	public void setPendaftaran_no(String pendaftaran_no) {
		this.pendaftaran_no = pendaftaran_no;
	}

	public int getPendaftaran_nourut() {
		return pendaftaran_nourut;
	}

	public void setPendaftaran_nourut(int pendaftaran_nourut) {
		this.pendaftaran_nourut = pendaftaran_nourut;
	}

	public int getM_unit_id() {
		return m_unit_id;
	}

	public void setM_unit_id(int m_unit_id) {
		this.m_unit_id = m_unit_id;
	}

	public Timestamp getPendaftaran_mrs() {
		return pendaftaran_mrs;
	}

	public void setPendaftaran_mrs(Timestamp pendaftaran_mrs) {
		this.pendaftaran_mrs = pendaftaran_mrs;
	}

	public int getM_pasien_id() {
		return m_pasien_id;
	}

	public void setM_pasien_id(int m_pasien_id) {
		this.m_pasien_id = m_pasien_id;
	}

	public int getM_kondisi_id() {
		return m_kondisi_id;
	}

	public void setM_kondisi_id(int m_kondisi_id) {
		this.m_kondisi_id = m_kondisi_id;
	}

	public Timestamp getPendaftaran_krs() {
		return pendaftaran_krs;
	}

	public void setPendaftaran_krs(Timestamp pendaftaran_krs) {
		this.pendaftaran_krs = pendaftaran_krs;
	}

	public int getM_status_id() {
		return m_status_id;
	}

	public void setM_status_id(int m_status_id) {
		this.m_status_id = m_status_id;
	}

	public int getM_rujuk_id_keluar() {
		return m_rujuk_id_keluar;
	}

	public void setM_rujuk_id_keluar(int m_rujuk_id_keluar) {
		this.m_rujuk_id_keluar = m_rujuk_id_keluar;
	}

	public String getPendaftaran_aktif() {
		return pendaftaran_aktif;
	}

	public void setPendaftaran_aktif(String pendaftaran_aktif) {
		this.pendaftaran_aktif = pendaftaran_aktif;
	}

	public String getPendaftaran_created_by() {
		return pendaftaran_created_by;
	}

	public void setPendaftaran_created_by(String pendaftaran_created_by) {
		this.pendaftaran_created_by = pendaftaran_created_by;
	}

	public Timestamp getPendaftaran_created_date() {
		return pendaftaran_created_date;
	}

	public void setPendaftaran_created_date(Timestamp pendaftaran_created_date) {
		this.pendaftaran_created_date = pendaftaran_created_date;
	}

	public String getPendaftaran_updated_by() {
		return pendaftaran_updated_by;
	}

	public void setPendaftaran_updated_by(String pendaftaran_updated_by) {
		this.pendaftaran_updated_by = pendaftaran_updated_by;
	}

	public Timestamp getPendaftaran_updated_date() {
		return pendaftaran_updated_date;
	}

	public void setPendaftaran_updated_date(Timestamp pendaftaran_updated_date) {
		this.pendaftaran_updated_date = pendaftaran_updated_date;
	}

	public int getPendaftaran_revised() {
		return pendaftaran_revised;
	}

	public void setPendaftaran_revised(int pendaftaran_revised) {
		this.pendaftaran_revised = pendaftaran_revised;
	}

	public int getM_kondisi_id_keluar() {
		return m_kondisi_id_keluar;
	}

	public void setM_kondisi_id_keluar(int m_kondisi_id_keluar) {
		this.m_kondisi_id_keluar = m_kondisi_id_keluar;
	}

	public String getPendaftaran_keterangan() {
		return pendaftaran_keterangan;
	}

	public void setPendaftaran_keterangan(String pendaftaran_keterangan) {
		this.pendaftaran_keterangan = pendaftaran_keterangan;
	}

	public int getPendaftaran_tarif() {
		return pendaftaran_tarif;
	}

	public void setPendaftaran_tarif(int pendaftaran_tarif) {
		this.pendaftaran_tarif = pendaftaran_tarif;
	}

	public int getM_status_id_masuk() {
		return m_status_id_masuk;
	}

	public void setM_status_id_masuk(int m_status_id_masuk) {
		this.m_status_id_masuk = m_status_id_masuk;
	}

	public String getM_status_id_pelayanan() {
		return m_status_id_pelayanan;
	}

	public void setM_status_id_pelayanan(String m_status_id_pelayanan) {
		this.m_status_id_pelayanan = m_status_id_pelayanan;
	}

	public String getPendaftaran_status_kunjungan() {
		return pendaftaran_status_kunjungan;
	}

	public void setPendaftaran_status_kunjungan(String pendaftaran_status_kunjungan) {
		this.pendaftaran_status_kunjungan = pendaftaran_status_kunjungan;
	}

	public int getM_kondisi_id_masuk() {
		return m_kondisi_id_masuk;
	}

	public void setM_kondisi_id_masuk(int m_kondisi_id_masuk) {
		this.m_kondisi_id_masuk = m_kondisi_id_masuk;
	}

	public int getM_rujukan_id() {
		return m_rujukan_id;
	}

	public void setM_rujukan_id(int m_rujukan_id) {
		this.m_rujukan_id = m_rujukan_id;
	}

	public String getPendaftaran_jenis() {
		return pendaftaran_jenis;
	}

	public void setPendaftaran_jenis(String pendaftaran_jenis) {
		this.pendaftaran_jenis = pendaftaran_jenis;
	}

	public String getPendaftaran_status_konsul() {
		return pendaftaran_status_konsul;
	}

	public void setPendaftaran_status_konsul(String pendaftaran_status_konsul) {
		this.pendaftaran_status_konsul = pendaftaran_status_konsul;
	}

	public int getM_unit_id_asal() {
		return m_unit_id_asal;
	}

	public void setM_unit_id_asal(int m_unit_id_asal) {
		this.m_unit_id_asal = m_unit_id_asal;
	}

	public String getPendaftaran_m_pasien_norm() {
		return pendaftaran_m_pasien_norm;
	}

	public void setPendaftaran_m_pasien_norm(String pendaftaran_m_pasien_norm) {
		this.pendaftaran_m_pasien_norm = pendaftaran_m_pasien_norm;
	}

	public int getM_kelas_id_standar() {
		return m_kelas_id_standar;
	}

	public void setM_kelas_id_standar(int m_kelas_id_standar) {
		this.m_kelas_id_standar = m_kelas_id_standar;
	}

	public int getPendaftaran_dokter() {
		return pendaftaran_dokter;
	}

	public void setPendaftaran_dokter(int pendaftaran_dokter) {
		this.pendaftaran_dokter = pendaftaran_dokter;
	}

	public String getPendaftaran_pasien_nama() {
		return pendaftaran_pasien_nama;
	}

	public void setPendaftaran_pasien_nama(String pendaftaran_pasien_nama) {
		this.pendaftaran_pasien_nama = pendaftaran_pasien_nama;
	}

	public String getPendaftaran_pasien_alamat() {
		return pendaftaran_pasien_alamat;
	}

	public void setPendaftaran_pasien_alamat(String pendaftaran_pasien_alamat) {
		this.pendaftaran_pasien_alamat = pendaftaran_pasien_alamat;
	}

	public Timestamp getPendaftaran_pasien_tgllahir() {
		return pendaftaran_pasien_tgllahir;
	}

	public void setPendaftaran_pasien_tgllahir(Timestamp pendaftaran_pasien_tgllahir) {
		this.pendaftaran_pasien_tgllahir = pendaftaran_pasien_tgllahir;
	}

	public String getPendaftaran_pasien_kelamin() {
		return pendaftaran_pasien_kelamin;
	}

	public void setPendaftaran_pasien_kelamin(String pendaftaran_pasien_kelamin) {
		this.pendaftaran_pasien_kelamin = pendaftaran_pasien_kelamin;
	}

	public String getPendaftaran_pasien_notelp() {
		return pendaftaran_pasien_notelp;
	}

	public void setPendaftaran_pasien_notelp(String pendaftaran_pasien_notelp) {
		this.pendaftaran_pasien_notelp = pendaftaran_pasien_notelp;
	}

	public Timestamp getPendaftaran_deleted_date() {
		return pendaftaran_deleted_date;
	}

	public void setPendaftaran_deleted_date(Timestamp pendaftaran_deleted_date) {
		this.pendaftaran_deleted_date = pendaftaran_deleted_date;
	}

	@Override
	public String toString() {
		return "t_Pendaftaran [pendaftaran_id=" + pendaftaran_id + ", pendaftaran_no=" + pendaftaran_no
				+ ", pendaftaran_nourut=" + pendaftaran_nourut + ", m_unit_id=" + m_unit_id + ", pendaftaran_mrs="
				+ pendaftaran_mrs + ", m_pasien_id=" + m_pasien_id + ", m_kondisi_id=" + m_kondisi_id
				+ ", pendaftaran_krs=" + pendaftaran_krs + ", m_status_id=" + m_status_id + ", m_rujuk_id_keluar="
				+ m_rujuk_id_keluar + ", pendaftaran_aktif=" + pendaftaran_aktif + ", pendaftaran_created_by="
				+ pendaftaran_created_by + ", pendaftaran_created_date=" + pendaftaran_created_date
				+ ", pendaftaran_updated_by=" + pendaftaran_updated_by + ", pendaftaran_updated_date="
				+ pendaftaran_updated_date + ", pendaftaran_revised=" + pendaftaran_revised + ", m_kondisi_id_keluar="
				+ m_kondisi_id_keluar + ", pendaftaran_keterangan=" + pendaftaran_keterangan + ", pendaftaran_tarif="
				+ pendaftaran_tarif + ", m_status_id_masuk=" + m_status_id_masuk + ", m_status_id_pelayanan="
				+ m_status_id_pelayanan + ", pendaftaran_status_kunjungan=" + pendaftaran_status_kunjungan
				+ ", m_kondisi_id_masuk=" + m_kondisi_id_masuk + ", m_rujukan_id=" + m_rujukan_id
				+ ", pendaftaran_jenis=" + pendaftaran_jenis + ", pendaftaran_status_konsul="
				+ pendaftaran_status_konsul + ", m_unit_id_asal=" + m_unit_id_asal + ", pendaftaran_m_pasien_norm="
				+ pendaftaran_m_pasien_norm + ", m_kelas_id_standar=" + m_kelas_id_standar + ", pendaftaran_dokter="
				+ pendaftaran_dokter + ", pendaftaran_pasien_nama=" + pendaftaran_pasien_nama
				+ ", pendaftaran_pasien_alamat=" + pendaftaran_pasien_alamat + ", pendaftaran_pasien_tgllahir="
				+ pendaftaran_pasien_tgllahir + ", pendaftaran_pasien_kelamin=" + pendaftaran_pasien_kelamin
				+ ", pendaftaran_pasien_notelp=" + pendaftaran_pasien_notelp + ", pendaftaran_deleted_date="
				+ pendaftaran_deleted_date + "]";
	}
	
	

}
