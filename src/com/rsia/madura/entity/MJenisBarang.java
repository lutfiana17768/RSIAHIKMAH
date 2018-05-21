package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MBarang_jenis")
public class MJenisBarang {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	@Column(name="barangjenis_id")
	private int IdBarangJenis;
	
	@Column(name="barangjenis_kode")
	private String KodeJB;
	
	@Column(name="barangjenis_nama")
	private String NamaJB;
	
	@Column(name="barangjenis_parent")
	private Integer ParentBJ;
	
	@Column(name="barangjenis_keterangan")
	private String KeteranganBJ;
	
	@Column(name="barangjenis_aktif")
	private String AktifBJ;
	
	@Column(name="barangjenis_created_by")
	private String CreateByBJ;
	
	@Column(name="barangjenis_created_date")
	private Timestamp CreatedDateBJ;
	
	@Column(name="barangjenis_updated_by")
	private String UpdateByBJ;
	
	@Column(name="barangjenis_updated_date")
	private Timestamp UpdatedateBJ;
	
	@Column(name="barangjenis_revised")
	private int revisedBJ;
	
	@Column(name="barangjenis_group")
	private String groupBJ;
	
	@Column(name="barang_jenis_deleted_date")
	private Timestamp DeleteDateBJ;

	public int getIdBarangJenis() {
		return IdBarangJenis;
	}

	public void setIdBarangJenis(int idBarangJenis) {
		IdBarangJenis = idBarangJenis;
	}

	public String getKodeJB() {
		return KodeJB;
	}

	public void setKodeJB(String kodeJB) {
		KodeJB = kodeJB;
	}

	public String getNamaJB() {
		return NamaJB;
	}

	public void setNamaJB(String namaJB) {
		NamaJB = namaJB;
	}

	public int getParentBJ() {
		return ParentBJ;
	}

	public void setParentBJ(int parentBJ) {
		ParentBJ = parentBJ;
	}

	public String getKeteranganBJ() {
		return KeteranganBJ;
	}

	public void setKeteranganBJ(String keteranganBJ) {
		KeteranganBJ = keteranganBJ;
	}

	public String getAktifBJ() {
		return AktifBJ;
	}

	public void setAktifBJ(String aktifBJ) {
		AktifBJ = aktifBJ;
	}

	public String getCreateByBJ() {
		return CreateByBJ;
	}

	public void setCreateByBJ(String createByBJ) {
		CreateByBJ = createByBJ;
	}

	public Timestamp getCreatedDateBJ() {
		return CreatedDateBJ;
	}

	public void setCreatedDateBJ(Timestamp createdDateBJ) {
		CreatedDateBJ = createdDateBJ;
	}

	public String getUpdateByBJ() {
		return UpdateByBJ;
	}

	public void setUpdateByBJ(String updateByBJ) {
		UpdateByBJ = updateByBJ;
	}

	public Timestamp getUpdatedateBJ() {
		return UpdatedateBJ;
	}

	public void setUpdatedateBJ(Timestamp updatedateBJ) {
		UpdatedateBJ = updatedateBJ;
	}

	public int getRevisedBJ() {
		return revisedBJ;
	}

	public void setRevisedBJ(int revisedBJ) {
		this.revisedBJ = revisedBJ;
	}

	public String getGroupBJ() {
		return groupBJ;
	}

	public void setGroupBJ(String groupBJ) {
		this.groupBJ = groupBJ;
	}

	public Timestamp getDeleteDateBJ() {
		return DeleteDateBJ;
	}

	public void setDeleteDateBJ(Timestamp deleteDateBJ) {
		DeleteDateBJ = deleteDateBJ;
	}

	@Override
	public String toString() {
		return "MJenisBarang [IdBarangJenis=" + IdBarangJenis + ", KodeJB=" + KodeJB + ", NamaJB=" + NamaJB
				+ ", ParentBJ=" + ParentBJ + ", KeteranganBJ=" + KeteranganBJ + ", AktifBJ=" + AktifBJ + ", CreateByBJ="
				+ CreateByBJ + ", CreatedDateBJ=" + CreatedDateBJ + ", UpdateByBJ=" + UpdateByBJ + ", UpdatedateBJ="
				+ UpdatedateBJ + ", revisedBJ=" + revisedBJ + ", groupBJ=" + groupBJ + ", DeleteDateBJ=" + DeleteDateBJ
				+ "]";
	}

}

