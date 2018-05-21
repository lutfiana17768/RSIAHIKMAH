package com.rsia.madura.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_baranghj")
public class MBarangHJ {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="baranghj_id")
	private int IdBarangHJ;
	
	@Column(name="baranghj_jenisharga_id")
	private int IdJenisHargaHJ;

	@Column(name="baranghj_barang_id")
	private int IdBarangBarangHJ;
	
	@Column(name="baranghj_satuan_id")
	private int SatuanBarangHJ;
	
	@Column(name="baranghj_satuankonversi_id")
	private int IdSatuanKonversiHJ;

	@Column(name="baranghj_tanggal")
	private Date TanggalBarangHJ;
	
	@Column(name="baranghj_validfrom")
	private Date ValidFromHJ;
	  
	@Column(name="baranghj_validto")
	private Date ValidToHJ;
	
	@Column(name="baranghj_hj")
	private int BarangHJHJ;
	
	@Column(name=" baranghj_default")
	private String DefaultBarangHJ;
	
	@Column(name="baranghj_created_by")
	private String CreatedByHJ;
	
	@Column(name="baranghj_created_date")
	private Timestamp CreateDateBarangHJ;
	
	@Column(name=" baranghj_updated_by")
	private String UpdateBarangHJ;
	
	@Column(name="baranghj_updated_date ")
	private Timestamp DateUpdateBarangHJ;
	
	@Column(name="baranghj_revised")
	private int RevisedBarangHJ;
	
	@Column(name="baranghj_terima_id")
	private int IdTerimaBarangHJ;
	 
	@Column(name="baranghj_opname_id")
	private int IdOpnameBarangHJ;
	 
	@Column(name="baranghj_deleted_date")
	private Timestamp DeleteDateBarangHJ;

	public int getIdBarangHJ() {
		return IdBarangHJ;
	}

	public void setIdBarangHJ(int idBarangHJ) {
		IdBarangHJ = idBarangHJ;
	}

	public int getIdJenisHargaHJ() {
		return IdJenisHargaHJ;
	}

	public void setIdJenisHargaHJ(int idJenisHargaHJ) {
		IdJenisHargaHJ = idJenisHargaHJ;
	}

	public int getIdBarangBarangHJ() {
		return IdBarangBarangHJ;
	}

	public void setIdBarangBarangHJ(int idBarangBarangHJ) {
		IdBarangBarangHJ = idBarangBarangHJ;
	}

	public int getSatuanBarangHJ() {
		return SatuanBarangHJ;
	}

	public void setSatuanBarangHJ(int satuanBarangHJ) {
		SatuanBarangHJ = satuanBarangHJ;
	}

	public int getIdSatuanKonversiHJ() {
		return IdSatuanKonversiHJ;
	}

	public void setIdSatuanKonversiHJ(int idSatuanKonversiHJ) {
		IdSatuanKonversiHJ = idSatuanKonversiHJ;
	}

	public Date getTanggalBarangHJ() {
		return TanggalBarangHJ;
	}

	public void setTanggalBarangHJ(Date tanggalBarangHJ) {
		TanggalBarangHJ = tanggalBarangHJ;
	}

	public Date getValidFromHJ() {
		return ValidFromHJ;
	}

	public void setValidFromHJ(Date validFromHJ) {
		ValidFromHJ = validFromHJ;
	}

	public Date getValidToHJ() {
		return ValidToHJ;
	}

	public void setValidToHJ(Date validToHJ) {
		ValidToHJ = validToHJ;
	}

	public int getBarangHJHJ() {
		return BarangHJHJ;
	}

	public void setBarangHJHJ(int barangHJHJ) {
		BarangHJHJ = barangHJHJ;
	}

	public String getDefaultBarangHJ() {
		return DefaultBarangHJ;
	}

	public void setDefaultBarangHJ(String defaultBarangHJ) {
		DefaultBarangHJ = defaultBarangHJ;
	}

	public String getCreatedByHJ() {
		return CreatedByHJ;
	}

	public void setCreatedByHJ(String createdByHJ) {
		CreatedByHJ = createdByHJ;
	}

	public Timestamp getCreateDateBarangHJ() {
		return CreateDateBarangHJ;
	}

	public void setCreateDateBarangHJ(Timestamp createDateBarangHJ) {
		CreateDateBarangHJ = createDateBarangHJ;
	}

	public String getUpdateBarangHJ() {
		return UpdateBarangHJ;
	}

	public void setUpdateBarangHJ(String updateBarangHJ) {
		UpdateBarangHJ = updateBarangHJ;
	}

	public Timestamp getDateUpdateBarangHJ() {
		return DateUpdateBarangHJ;
	}

	public void setDateUpdateBarangHJ(Timestamp dateUpdateBarangHJ) {
		DateUpdateBarangHJ = dateUpdateBarangHJ;
	}

	public int getRevisedBarangHJ() {
		return RevisedBarangHJ;
	}

	public void setRevisedBarangHJ(int revisedBarangHJ) {
		RevisedBarangHJ = revisedBarangHJ;
	}

	public int getIdTerimaBarangHJ() {
		return IdTerimaBarangHJ;
	}

	public void setIdTerimaBarangHJ(int idTerimaBarangHJ) {
		IdTerimaBarangHJ = idTerimaBarangHJ;
	}

	public int getIdOpnameBarangHJ() {
		return IdOpnameBarangHJ;
	}

	public void setIdOpnameBarangHJ(int idOpnameBarangHJ) {
		IdOpnameBarangHJ = idOpnameBarangHJ;
	}

	public Timestamp getDeleteDateBarangHJ() {
		return DeleteDateBarangHJ;
	}

	public void setDeleteDateBarangHJ(Timestamp deleteDateBarangHJ) {
		DeleteDateBarangHJ = deleteDateBarangHJ;
	}

	@Override
	public String toString() {
		return "MBarangHJ [IdBarangHJ=" + IdBarangHJ + ", IdJenisHargaHJ=" + IdJenisHargaHJ + ", IdBarangBarangHJ="
				+ IdBarangBarangHJ + ", SatuanBarangHJ=" + SatuanBarangHJ + ", IdSatuanKonversiHJ=" + IdSatuanKonversiHJ
				+ ", TanggalBarangHJ=" + TanggalBarangHJ + ", ValidFromHJ=" + ValidFromHJ + ", ValidToHJ=" + ValidToHJ
				+ ", BarangHJHJ=" + BarangHJHJ + ", DefaultBarangHJ=" + DefaultBarangHJ + ", CreatedByHJ=" + CreatedByHJ
				+ ", CreateDateBarangHJ=" + CreateDateBarangHJ + ", UpdateBarangHJ=" + UpdateBarangHJ
				+ ", DateUpdateBarangHJ=" + DateUpdateBarangHJ + ", RevisedBarangHJ=" + RevisedBarangHJ
				+ ", IdTerimaBarangHJ=" + IdTerimaBarangHJ + ", IdOpnameBarangHJ=" + IdOpnameBarangHJ
				+ ", DeleteDateBarangHJ=" + DeleteDateBarangHJ + "]";
	}
}
