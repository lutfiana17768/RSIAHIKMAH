/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-17 12:24:35
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-30 12:41:08
*/

package com.rsia.madura.entity;

import java.sql.Timestamp;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
@Table(name = "t_periksa_pasien")

public class MPeriksaPasien {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "periksapasien_id")
	private int periksapasienID;
	
    @Transient // means "not a DB field"
    private Integer remove; // boolean flag

	// change to relation
	@Column(name = "periksapasien_pasien_id")
	private Integer periksapasienPasienID;

	@Column(name = "periksapasien_pasien_norm")
	private String periksapasienPasienNorm;

	@Column(name = "periksapasien_periksa_kode")
	private String periksapasienPeriksaKode;

	@Column(name = "periksapasien_periksa_nama")
	private String periksapasienPeriksaNama;

	@Column(name = "periksapasien_periksa_nilai")
	private String periksapasienPeriksaNilai;

	@Column(name = "periksapasien_periksa_satuan")
	private String periksapasienPeriksaSatuan;

	@Column(name = "periksapasien_periksa_standar")
	private String periksapasienPeriksaStandar;

	@Column(name = "periksapasien_periksa_label")
	private String periksapasienPeriksaLabel;

	@Column(name = "periksapasien_periksa_group")
	private String periksapasienPeriksaGroup;

	@Column(name = "periksapasien_periksa_file")
	private String periksapasienPeriksaFile;

	@Column(name = "periksapasien_periksa_keterangan")
	private String periksapasienPeriksaKeterangan;

	@Column(name = "periksapasien_dokter_id")
	private Integer periksapasienDokterID;

	@Column(name = "periksapasien_unit_id")
	private Integer periksapasienUnitID;

	@Column(name = "periksapasien_kamarpasien_id")
	private String periksapasienKamarpasienID;

	@Column(name = "periksapasien_aktif")
	private String periksapasienAktif;

	@Column(name = "periksapasien_created_by")
	private String periksapasienCreatedBy;

	@Column(name = "periksapasien_created_date")
	private Timestamp periksapasienCreatedDate;

	@Column(name = "periksapasien_updated_by")
	private String periksapasienUpdatedBy;

	@Column(name = "periksapasien_updated_date")
	private Timestamp periksapasienUpdatedDate;

	@Column(name = "periksapasien_revised")
	private Integer periksapasienRevised;

	@Column(name = "periksapasien_pendaftaran_id")
	private Integer periksapasienPendaftaranID;

	@Column(name = "periksapasien_tanggal")
	private Date periksapasienTanggal;

	@Column(name = "periksapasien_urut")
	private Integer periksapasienUrut;

	@Column(name = "periksapasien_indent")
	private Integer periksapasienIndent;

	@ManyToOne
	private MPendaftaran pendaftaran;

	public int getPeriksapasienID() {
		return periksapasienID;
	}

	public void setPeriksapasienID(int periksapasienID) {
		this.periksapasienID = periksapasienID;
	}

	public Integer getRemove(){
		return remove;
	}

	public void setRemove(Integer remove) {
		this.remove = remove;
	}


	public Integer getPeriksapasienPasienID() {
		return periksapasienPasienID;
	}

	public void setPeriksapasienPasienID(Integer periksapasienPasienID) {
		this.periksapasienPasienID = periksapasienPasienID;
	}

	public String getPeriksapasienPasienNorm() {
		return periksapasienPasienNorm;
	}

	public void setPeriksapasienPasienNorm(String periksapasienPasienNorm) {
		this.periksapasienPasienNorm = periksapasienPasienNorm;
	}

	public String getPeriksapasienPeriksaKode() {
		return periksapasienPeriksaKode;
	}

	public void setPeriksapasienPeriksaKode(String periksapasienPeriksaKode) {
		this.periksapasienPeriksaKode = periksapasienPeriksaKode;
	}

	public String getPeriksapasienPeriksaNama() {
		return periksapasienPeriksaNama;
	}

	public void setPeriksapasienPeriksaNama(String periksapasienPeriksaNama) {
		this.periksapasienPeriksaNama = periksapasienPeriksaNama;
	}

	public String getPeriksapasienPeriksaNilai() {
		return periksapasienPeriksaNilai;
	}

	public void setPeriksapasienPeriksaNilai(String periksapasienPeriksaNilai) {
		this.periksapasienPeriksaNilai = periksapasienPeriksaNilai;
	}

	public String getPeriksapasienPeriksaSatuan() {
		return periksapasienPeriksaSatuan;
	}

	public void setPeriksapasienPeriksaSatuan(String periksapasienPeriksaSatuan) {
		this.periksapasienPeriksaSatuan = periksapasienPeriksaSatuan;
	}

	public String getPeriksapasienPeriksaStandar() {
		return periksapasienPeriksaStandar;
	}

	public void setPeriksapasienPeriksaStandar(String periksapasienPeriksaStandar) {
		this.periksapasienPeriksaStandar = periksapasienPeriksaStandar;
	}

	public String getPeriksapasienPeriksaLabel() {
		return periksapasienPeriksaLabel;
	}

	public void setPeriksapasienPeriksaLabel(String periksapasienPeriksaLabel) {
		this.periksapasienPeriksaLabel = periksapasienPeriksaLabel;
	}

	public String getPeriksapasienPeriksaGroup() {
		return periksapasienPeriksaGroup;
	}

	public void setPeriksapasienPeriksaGroup(String periksapasienPeriksaGroup) {
		this.periksapasienPeriksaGroup = periksapasienPeriksaGroup;
	}

	public String getPeriksapasienPeriksaFile() {
		return periksapasienPeriksaFile;
	}

	public void setPeriksapasienPeriksaFile(String periksapasienPeriksaFile) {
		this.periksapasienPeriksaFile = periksapasienPeriksaFile;
	}

	public String getPeriksapasienPeriksaKeterangan() {
		return periksapasienPeriksaKeterangan;
	}

	public void setPeriksapasienPeriksaKeterangan(String periksapasienPeriksaKeterangan) {
		this.periksapasienPeriksaKeterangan = periksapasienPeriksaKeterangan;
	}

	public Integer getPeriksapasienDokterID() {
		return periksapasienDokterID;
	}

	public void setPeriksapasienDokterID(Integer periksapasienDokterID) {
		this.periksapasienDokterID = periksapasienDokterID;
	}

	public Integer getPeriksapasienUnitID() {
		return periksapasienUnitID;
	}

	public void setPeriksapasienUnitID(Integer periksapasienUnitID) {
		this.periksapasienUnitID = periksapasienUnitID;
	}

	public String getPeriksapasienKamarpasienID() {
		return periksapasienKamarpasienID;
	}

	public void setPeriksapasienKamarpasienID(String periksapasienKamarpasienID) {
		this.periksapasienKamarpasienID = periksapasienKamarpasienID;
	}

	public String getPeriksapasienAktif() {
		return periksapasienAktif;
	}

	public void setPeriksapasienAktif(String periksapasienAktif) {
		this.periksapasienAktif = periksapasienAktif;
	}

	public String getPeriksapasienCreatedBy() {
		return periksapasienCreatedBy;
	}

	public void setPeriksapasienCreatedBy(String periksapasienCreatedBy) {
		this.periksapasienCreatedBy = periksapasienCreatedBy;
	}

	public Timestamp getPeriksapasienCreatedDate() {
		return periksapasienCreatedDate;
	}

	public void setPeriksapasienCreatedDate(Timestamp periksapasienCreatedDate) {
		this.periksapasienCreatedDate = periksapasienCreatedDate;
	}

	public String getPeriksapasienUpdatedBy() {
		return periksapasienUpdatedBy;
	}

	public void setPeriksapasienUpdatedBy(String periksapasienUpdatedBy) {
		this.periksapasienUpdatedBy = periksapasienUpdatedBy;
	}

	public Timestamp getPeriksapasienUpdatedDate() {
		return periksapasienUpdatedDate;
	}

	public void setPeriksapasienUpdatedDate(Timestamp periksapasienUpdatedDate) {
		this.periksapasienUpdatedDate = periksapasienUpdatedDate;
	}

	public Integer getPeriksapasienRevised() {
		return periksapasienRevised;
	}

	public void setPeriksapasienRevised(Integer periksapasienRevised) {
		this.periksapasienRevised = periksapasienRevised;
	}

	public Integer getPeriksapasienPendaftaranID() {
		return periksapasienPendaftaranID;
	}

	public void setPeriksapasienPendaftaranID(Integer periksapasienPendaftaranID) {
		this.periksapasienPendaftaranID = periksapasienPendaftaranID;
	}

	public Date getPeriksapasienTanggal() {
		return periksapasienTanggal;
	}

	public void setPeriksapasienTanggal(Date periksapasienTanggal) {
		this.periksapasienTanggal = periksapasienTanggal;
	}

	public Integer getPeriksapasienUrut() {
		return periksapasienUrut;
	}

	public void setPeriksapasienUrut(Integer periksapasienUrut) {
		this.periksapasienUrut = periksapasienUrut;
	}

	public Integer getPeriksapasienIndent() {
		return periksapasienIndent;
	}

	public void setPeriksapasienIndent(Integer periksapasienIndent) {
		this.periksapasienIndent = periksapasienIndent;
	}

	public void setPendaftaran(MPendaftaran pendaftaran) {
		this.pendaftaran = pendaftaran;
	}
	
	public MPendaftaran getPendaftaran() {
		return pendaftaran;
	}
}