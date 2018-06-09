/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-22 16:38:01
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-30 12:40:56
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
import javax.persistence.Transient;

@Entity
@Table(name="t_diagnosa_pasien")
public class MDiagnosaPasien {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "diagnosapasien_id")
	private Integer diagnosapasienID;

    @Transient
    private Integer remove;
	
	// ganti relasi
	@Column(name = "m_icd_id")
	private Integer mIcdID;
	
	// ganti relasi
	@Column(name = "m_pasien_id")
	private Integer mPasienID;
	
	// ganti relasi || di pelayanan ndak ada inputan pilih kamar
	@Column(name = "m_kamar_id")
	private Integer mKamarID;
	
	// jenis apa ?
	@Column(name = "diagnosapasien_jenis")
	private String diagnosapasienJenis;

	// ganti relasi dokter ambil dari pegawai ??
	@Column(name = "diagnosapasien_dokter")
	private Integer diagnosapasienDokter;

	@Column(name = "diagnosapasien_keterangan")
	private String diagnosapasienKeterangan;

	@Column(name = "diagnosapasien_aktif")
	private String diagnosapasienAktif;

	@Column(name = "diagnosapasien_created_by")
	private String diagnosapasienCreatedBy;

	@Column(name = "diagnosapasien_created_date")
	private Timestamp diagnosapasienCreatedDate;

	@Column(name = "diagnosapasien_updated_by")
	private String diagnosapasienUpdatedBy;

	@Column(name = "diagnosapasien_updated_date")
	private Timestamp diagnosapasienUpdatedDate;

	@Column(name = "diagnosapasien_revised")
	private Integer diagnosapasienRevised;

	@Column(name = "diagnosapasien_tanggal")
	private Timestamp diagnosapasienTanggal;

	@Column(name = "diagnosapasien_m_pasien_norm")
	private String diagnosapasienMPasienNorm;

	@Column(name = "diagnosapasien_kamarpasien_id")
	private Integer diagnosapasienKamarpasienID;

	// ganti relasi || di tab diagnosa tidak ada isian mUnit
	@Column(name = "m_unit_id")
	private Integer mUnitID;

	@Column(name = "diagnosapasien_kasus")
	private String diagnosapasienKasus;

	@Column(name = "reg_company_id")
	private Integer regCompanyID;

	@Column(name = "reg_apps_id")
	private Integer regAppsID;

	@ManyToOne
	private MPendaftaran pendaftaran;

	@ManyToOne
	private MIcd icd;
	
	public Integer getDiagnosapasienID() {
		return diagnosapasienID;
	}

	public void setDiagnosapasienID(Integer diagnosapasienID) {
		this.diagnosapasienID = diagnosapasienID;
	}

	public Integer getRemove(){
		return remove;
	}

	public void setRemove(Integer remove) {
		this.remove = remove;
	}


	public Integer getMIcdID() {
		return mIcdID;
	}

	public void setMIcdID(Integer mIcdID) {
		this.mIcdID = mIcdID;
	}

	public Integer getMPasienID() {
		return mPasienID;
	}

	public void setMPasienID(Integer mPasienID) {
		this.mPasienID = mPasienID;
	}

	public Integer getMKamarID() {
		return mKamarID;
	}

	public void setMKamarID(Integer mKamarID) {
		this.mKamarID = mKamarID;
	}

	public String getDiagnosapasienJenis() {
		return diagnosapasienJenis;
	}

	public void setDiagnosapasienJenis(String diagnosapasienJenis) {
		this.diagnosapasienJenis = diagnosapasienJenis;
	}

	public Integer getDiagnosapasienDokter() {
		return diagnosapasienDokter;
	}

	public void setDiagnosapasienDokter(Integer diagnosapasienDokter) {
		this.diagnosapasienDokter = diagnosapasienDokter;
	}

	public String getDiagnosapasienKeterangan() {
		return diagnosapasienKeterangan;
	}

	public void setDiagnosapasienKeterangan(String diagnosapasienKeterangan) {
		this.diagnosapasienKeterangan = diagnosapasienKeterangan;
	}

	public String getDiagnosapasienAktif() {
		return diagnosapasienAktif;
	}

	public void setDiagnosapasienAktif(String diagnosapasienAktif) {
		this.diagnosapasienAktif = diagnosapasienAktif;
	}

	public String getDiagnosapasienCreatedBy() {
		return diagnosapasienCreatedBy;
	}

	public void setDiagnosapasienCreatedBy(String diagnosapasienCreatedBy) {
		this.diagnosapasienCreatedBy = diagnosapasienCreatedBy;
	}

	public Timestamp getDiagnosapasienCreatedDate() {
		return diagnosapasienCreatedDate;
	}

	public void setDiagnosapasienCreatedDate(Timestamp diagnosapasienCreatedDate) {
		this.diagnosapasienCreatedDate = diagnosapasienCreatedDate;
	}

	public String getDiagnosapasienUpdatedBy() {
		return diagnosapasienUpdatedBy;
	}

	public void setDiagnosapasienUpdatedBy(String diagnosapasienUpdatedBy) {
		this.diagnosapasienUpdatedBy = diagnosapasienUpdatedBy;
	}

	public Timestamp getDiagnosapasienUpdatedDate() {
		return diagnosapasienUpdatedDate;
	}

	public void setDiagnosapasienUpdatedDate(Timestamp diagnosapasienUpdatedDate) {
		this.diagnosapasienUpdatedDate = diagnosapasienUpdatedDate;
	}

	public Integer getDiagnosapasienRevised() {
		return diagnosapasienRevised;
	}

	public void setDiagnosapasienRevised(Integer diagnosapasienRevised) {
		this.diagnosapasienRevised = diagnosapasienRevised;
	}

	public Timestamp getDiagnosapasienTanggal() {
		return diagnosapasienTanggal;
	}

	public void setDiagnosapasienTanggal(Timestamp diagnosapasienTanggal) {
		this.diagnosapasienTanggal = diagnosapasienTanggal;
	}

	public String getDiagnosapasienMPasienNorm() {
		return diagnosapasienMPasienNorm;
	}

	public void setDiagnosapasienMPasienNorm(String diagnosapasienMPasienNorm) {
		this.diagnosapasienMPasienNorm = diagnosapasienMPasienNorm;
	}

	public Integer getDiagnosapasienKamarpasienID() {
		return diagnosapasienKamarpasienID;
	}

	public void setDiagnosapasienKamarpasienID(Integer diagnosapasienKamarpasienID) {
		this.diagnosapasienKamarpasienID = diagnosapasienKamarpasienID;
	}

	public Integer getMUnitID() {
		return mUnitID;
	}

	public void setMUnitID(Integer mUnitID) {
		this.mUnitID = mUnitID;
	}

	public String getDiagnosapasienKasus() {
		return diagnosapasienKasus;
	}

	public void setDiagnosapasienKasus(String diagnosapasienKasus) {
		this.diagnosapasienKasus = diagnosapasienKasus;
	}

	public Integer getRegCompanyID() {
		return regCompanyID;
	}

	public void setRegCompanyID(Integer regCompanyID) {
		this.regCompanyID = regCompanyID;
	}

	public Integer getRegAppsID() {
		return regAppsID;
	}

	public void setRegAppsID(Integer regAppsID) {
		this.regAppsID = regAppsID;
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