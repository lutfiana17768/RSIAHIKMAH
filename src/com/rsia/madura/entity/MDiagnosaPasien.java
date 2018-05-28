/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-22 16:38:01
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-28 09:07:58
*/

package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
@Table(name="t_diagnosa_pasien")
public class MDiagnosaPasien {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "diagnosapasien_id")
	private int diagnosapasien_id;
	
	// ganti relasi
	@Column(name = "m_icd_id")
	private Integer m_icd_id;
	
	// ganti relasi
	@Column(name = "m_pasien_id")
	private Integer m_pasien_id;
	
	// ganti relasi || di pelayanan ndak ada inputan pilih kamar
	@Column(name = "m_kamar_id")
	private Integer m_kamar_id;
	
	// jenis apa ?
	@Column(name = "diagnosapasien_jenis")
	private String diagnosapasien_jenis;

	// ganti relasi dokter ambil dari pegawai ??
	@Column(name = "diagnosapasien_dokter")
	private Integer diagnosapasien_dokter;

	@Column(name = "diagnosapasien_keterangan")
	private String diagnosapasien_keterangan;

	@Column(name = "diagnosapasien_aktif")
	private String diagnosapasien_aktif;

	@Column(name = "diagnosapasien_created_by")
	private String diagnosapasien_created_by;

	@Column(name = "diagnosapasien_created_date")
	private Timestamp diagnosapasien_created_date;

	@Column(name = "diagnosapasien_updated_by")
	private String diagnosapasien_updated_by;

	@Column(name = "diagnosapasien_updated_date")
	private Timestamp diagnosapasien_updated_date;

	@Column(name = "diagnosapasien_revised")
	private Integer diagnosapasien_revised;

	@Column(name = "diagnosapasien_tanggal")
	private Timestamp diagnosapasien_tanggal;

	@Column(name = "diagnosapasien_m_pasien_norm")
	private String diagnosapasien_m_pasien_norm;

	@Column(name = "diagnosapasien_kamarpasien_id")
	private Integer diagnosapasien_kamarpasien_id;

	// ganti relasi || di tab diagnosa tidak ada isian m_unit
	@Column(name = "m_unit_id")
	private Integer m_unit_id;

	@Column(name = "diagnosapasien_kasus")
	private String diagnosapasien_kasus;

	@Column(name = "reg_company_id")
	private Integer reg_company_id;

	@Column(name = "reg_apps_id")
	private Integer reg_apps_id;

	@ManyToOne
	private MPendaftaran pendaftaran;

	@ManyToOne
	private MIcd icd;
	
	public int getDiagnosapasien_id() {
		return diagnosapasien_id;
	}

	public void setDiagnosapasien_id(int diagnosapasien_id) {
		this.diagnosapasien_id = diagnosapasien_id;
	}

	public Integer getM_icd_id() {
		return m_icd_id;
	}

	public void setM_icd_id(Integer m_icd_id) {
		this.m_icd_id = m_icd_id;
	}

	public Integer getM_pasien_id() {
		return m_pasien_id;
	}

	public void setM_pasien_id(Integer m_pasien_id) {
		this.m_pasien_id = m_pasien_id;
	}

	public Integer getM_kamar_id() {
		return m_kamar_id;
	}

	public void setM_kamar_id(Integer m_kamar_id) {
		this.m_kamar_id = m_kamar_id;
	}

	public String getDiagnosapasien_jenis() {
		return diagnosapasien_jenis;
	}

	public void SetDiagnosapasien_jenis(String diagnosapasien_jenis) {
		this.diagnosapasien_jenis = diagnosapasien_jenis;
	}

	public Integer getDiagnosapasien_dokter() {
		return diagnosapasien_dokter;
	}

	public void SetDiagnosapasien_dokter(Integer diagnosapasien_dokter) {
		this.diagnosapasien_dokter = diagnosapasien_dokter;
	}

	public String getDiagnosapasien_keterangan() {
		return diagnosapasien_keterangan;
	}

	public void SetDiagnosapasien_keterangan(String diagnosapasien_keterangan) {
		this.diagnosapasien_keterangan = diagnosapasien_keterangan;
	}

	public String getDiagnosapasien_aktif() {
		return diagnosapasien_aktif;
	}

	public void SetDiagnosapasien_aktif(String diagnosapasien_aktif) {
		this.diagnosapasien_aktif = diagnosapasien_aktif;
	}

	public String getDiagnosapasien_created_by() {
		return diagnosapasien_created_by;
	}

	public void SetDiagnosapasien_created_by(String diagnosapasien_created_by) {
		this.diagnosapasien_created_by = diagnosapasien_created_by;
	}

	public Timestamp getDiagnosapasien_created_date() {
		return diagnosapasien_created_date;
	}

	public void SetDiagnosapasien_created_date(Timestamp diagnosapasien_created_date) {
		this.diagnosapasien_created_date = diagnosapasien_created_date;
	}

	public String getDiagnosapasien_updated_by() {
		return diagnosapasien_updated_by;
	}

	public void SetDiagnosapasien_updated_by(String diagnosapasien_updated_by) {
		this.diagnosapasien_updated_by = diagnosapasien_updated_by;
	}

	public Timestamp getDiagnosapasien_updated_date() {
		return diagnosapasien_updated_date;
	}

	public void SetDiagnosapasien_updated_date(Timestamp diagnosapasien_updated_date) {
		this.diagnosapasien_updated_date = diagnosapasien_updated_date;
	}

	public Integer getDiagnosapasien_revised() {
		return diagnosapasien_revised;
	}

	public void SetDiagnosapasien_revised(Integer diagnosapasien_revised) {
		this.diagnosapasien_revised = diagnosapasien_revised;
	}

	public Timestamp getDiagnosapasien_tanggal() {
		return diagnosapasien_tanggal;
	}

	public void SetDiagnosapasien_tanggal(Timestamp diagnosapasien_tanggal) {
		this.diagnosapasien_tanggal = diagnosapasien_tanggal;
	}

	public String getDiagnosapasien_m_pasien_norm() {
		return diagnosapasien_m_pasien_norm;
	}

	public void SetDiagnosapasien_m_pasien_norm(String diagnosapasien_m_pasien_norm) {
		this.diagnosapasien_m_pasien_norm = diagnosapasien_m_pasien_norm;
	}

	public Integer getDiagnosapasien_kamarpasien_id() {
		return diagnosapasien_kamarpasien_id;
	}

	public void SetDiagnosapasien_kamarpasien_id(Integer diagnosapasien_kamarpasien_id) {
		this.diagnosapasien_kamarpasien_id = diagnosapasien_kamarpasien_id;
	}

	public Integer getM_unit_id() {
		return m_unit_id;
	}

	public void SetM_unit_id(Integer m_unit_id) {
		this.m_unit_id = m_unit_id;
	}

	public String getDiagnosapasien_kasus() {
		return diagnosapasien_kasus;
	}

	public void SetDiagnosapasien_kasus(String diagnosapasien_kasus) {
		this.diagnosapasien_kasus = diagnosapasien_kasus;
	}

	public Integer getReg_company_id() {
		return reg_company_id;
	}

	public void SetReg_company_id(Integer reg_company_id) {
		this.reg_company_id = reg_company_id;
	}

	public Integer getReg_apps_id() {
		return reg_apps_id;
	}

	public void SetReg_apps_id(Integer reg_apps_id) {
		this.reg_apps_id = reg_apps_id;
	}

	public MPendaftaran getPendaftaran() {
		return pendaftaran;
	}

	public void setPendaftaran(MPendaftaran pendaftaran) {
		this.pendaftaran = pendaftaran;
	}

	public MIcd getIcd() {
		return icd;
	}

	public void setIcd(MIcd icd) {
		this.icd = icd;
	}
}