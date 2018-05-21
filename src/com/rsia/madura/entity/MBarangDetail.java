package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_barangdet")
public class MBarangDetail {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="barangdet_id")
	private int IdBarangDet;
	
	@Column(name="barangdet_master_id")
	private int MasterIdBD;
	
	@Column(name="barangdet_barang_id")
	private int BarangIdBD;
	
	@Column(name="barangdet_barang_nama")
	private String BarangNamaBD;
	
	@Column(name="barangdet_satuan_id")
	private int SatuanIdBD;
	
	@Column(name="barangdet_satuan_nama")
	private String SatuanNamaBD;
	
	@Column(name=" barangdet_keterangan")
	private String KeteranganBD;
	
	@Column(name="barangdet_jumlah")
	private int JumlahBD;
	
	@Column(name="barangdet_created_by")
	private String CreatedByBD;
	
	@Column(name=" barangdet_created_date")
	private Timestamp CreatedDateBD;
	
	@Column(name="barangdet_updated_by")
	private String UpdateByBD;
	
	@Column(name=" barangdet_updated_date")
	private Timestamp UpdateDateBD;
	
	@Column(name="barangdet_revised")
	private int RevisedBD;
	
	@Column(name="barangdet_deleted_date")
	private Timestamp DeletedDateBD;

	public int getIdBarangDet() {
		return IdBarangDet;
	}

	public void setIdBarangDet(int idBarangDet) {
		IdBarangDet = idBarangDet;
	}

	public int getMasterIdBD() {
		return MasterIdBD;
	}

	public void setMasterIdBD(int masterIdBD) {
		MasterIdBD = masterIdBD;
	}

	public int getBarangIdBD() {
		return BarangIdBD;
	}

	public void setBarangIdBD(int barangIdBD) {
		BarangIdBD = barangIdBD;
	}

	public String getBarangNamaBD() {
		return BarangNamaBD;
	}

	public void setBarangNamaBD(String barangNamaBD) {
		BarangNamaBD = barangNamaBD;
	}

	public int getSatuanIdBD() {
		return SatuanIdBD;
	}

	public void setSatuanIdBD(int satuanIdBD) {
		SatuanIdBD = satuanIdBD;
	}

	public String getSatuanNamaBD() {
		return SatuanNamaBD;
	}

	public void setSatuanNamaBD(String satuanNamaBD) {
		SatuanNamaBD = satuanNamaBD;
	}

	public String getKeteranganBD() {
		return KeteranganBD;
	}

	public void setKeteranganBD(String keteranganBD) {
		KeteranganBD = keteranganBD;
	}

	public int getJumlahBD() {
		return JumlahBD;
	}

	public void setJumlahBD(int jumlahBD) {
		JumlahBD = jumlahBD;
	}

	public String getCreatedByBD() {
		return CreatedByBD;
	}

	public void setCreatedByBD(String createdByBD) {
		CreatedByBD = createdByBD;
	}

	public Timestamp getCreatedDateBD() {
		return CreatedDateBD;
	}

	public void setCreatedDateBD(Timestamp createdDateBD) {
		CreatedDateBD = createdDateBD;
	}

	public String getUpdateByBD() {
		return UpdateByBD;
	}

	public void setUpdateByBD(String updateByBD) {
		UpdateByBD = updateByBD;
	}

	public Timestamp getUpdateDateBD() {
		return UpdateDateBD;
	}

	public void setUpdateDateBD(Timestamp updateDateBD) {
		UpdateDateBD = updateDateBD;
	}

	public int getRevisedBD() {
		return RevisedBD;
	}

	public void setRevisedBD(int revisedBD) {
		RevisedBD = revisedBD;
	}

	public Timestamp getDeletedDateBD() {
		return DeletedDateBD;
	}

	public void setDeletedDateBD(Timestamp deletedDateBD) {
		DeletedDateBD = deletedDateBD;
	}

	@Override
	public String toString() {
		return "MBarangDetail [IdBarangDet=" + IdBarangDet + ", MasterIdBD=" + MasterIdBD + ", BarangIdBD="
				+ BarangIdBD + ", BarangNamaBD=" + BarangNamaBD + ", SatuanIdBD=" + SatuanIdBD + ", SatuanNamaBD="
				+ SatuanNamaBD + ", KeteranganBD=" + KeteranganBD + ", JumlahBD=" + JumlahBD + ", CreatedByBD="
				+ CreatedByBD + ", CreatedDateBD=" + CreatedDateBD + ", UpdateByBD=" + UpdateByBD + ", UpdateDateBD="
				+ UpdateDateBD + ", RevisedBD=" + RevisedBD + ", DeletedDateBD=" + DeletedDateBD + "]";
	}
}
