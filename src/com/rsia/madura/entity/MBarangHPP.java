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
@Table(name="ms_baranghpp")
public class MBarangHPP {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="baranghpp_id")
	private int IdBarangHPP;
	
	@Column(name="baranghpp_barang_id")
	private int IdBarangBarangHPP;

	@Column(name="baranghpp_satuan_id")
	private int IdSatuanBarangHPP;
	
	@Column(name="baranghpp_satuankonversi_id")
	private int IdSatuanKonversiHPP;

	@Column(name="baranghpp_tanggal")
	private Date TanggalBarangHPP;
	
	@Column(name="baranghpp_validfrom")
	private Date ValidFromHPP;
	  
	@Column(name="baranghpp_validto")
	private Date ValidToHPP;
	
	@Column(name="baranghpp_harga")
	private float BarangHargaHPP;
	
	@Column(name="baranghpp_diskon")
	private float DiskonBarangHPP;
	
	@Column(name="baranghpp_hpp")
	private float BarangHPPhpp;
	
	@Column(name="baranghpp_terima_id")
	private int BarangTerimaHPP;
	
	@Column(name="baranghpp_opname_id")
	private int BarangOpnameHPP;
	
	@Column(name="baranghpp_created_by")
	private String BarangCreatedHPP;
	
	@Column(name="baranghpp_created_date")
	private Timestamp CreateDateBarangHPP;
	
	@Column(name="baranghpp_updated_by")
	private String UpdateBarangHPP;
	
	@Column(name="baranghpp_updated_date")
	private Timestamp DateUpdateBarangHPP;
	
	@Column(name=" baranghpp_revised")
	private int RevisedBarangHPP;
	 
	@Column(name="baranghpp_deleted_date")
	private Timestamp DeleteDateBarangHPP;

	public int getIdBarangHPP() {
		return IdBarangHPP;
	}

	public void setIdBarangHPP(int idBarangHPP) {
		IdBarangHPP = idBarangHPP;
	}

	public int getIdBarangBarangHPP() {
		return IdBarangBarangHPP;
	}

	public void setIdBarangBarangHPP(int idBarangBarangHPP) {
		IdBarangBarangHPP = idBarangBarangHPP;
	}

	public int getIdSatuanBarangHPP() {
		return IdSatuanBarangHPP;
	}

	public void setIdSatuanBarangHPP(int idSatuanBarangHPP) {
		IdSatuanBarangHPP = idSatuanBarangHPP;
	}

	public int getIdSatuanKonversiHPP() {
		return IdSatuanKonversiHPP;
	}

	public void setIdSatuanKonversiHPP(int idSatuanKonversiHPP) {
		IdSatuanKonversiHPP = idSatuanKonversiHPP;
	}

	public Date getTanggalBarangHPP() {
		return TanggalBarangHPP;
	}

	public void setTanggalBarangHPP(Date tanggalBarangHPP) {
		TanggalBarangHPP = tanggalBarangHPP;
	}

	public Date getValidFromHPP() {
		return ValidFromHPP;
	}

	public void setValidFromHPP(Date validFromHPP) {
		ValidFromHPP = validFromHPP;
	}

	public Date getValidToHPP() {
		return ValidToHPP;
	}

	public void setValidToHPP(Date validToHPP) {
		ValidToHPP = validToHPP;
	}

	public float getBarangHargaHPP() {
		return BarangHargaHPP;
	}

	public void setBarangHargaHPP(float barangHargaHPP) {
		BarangHargaHPP = barangHargaHPP;
	}

	public float getDiskonBarangHPP() {
		return DiskonBarangHPP;
	}

	public void setDiskonBarangHPP(float diskonBarangHPP) {
		DiskonBarangHPP = diskonBarangHPP;
	}

	public float getBarangHPPhpp() {
		return BarangHPPhpp;
	}

	public void setBarangHPPhpp(float barangHPPhpp) {
		BarangHPPhpp = barangHPPhpp;
	}

	public int getBarangTerimaHPP() {
		return BarangTerimaHPP;
	}

	public void setBarangTerimaHPP(int barangTerimaHPP) {
		BarangTerimaHPP = barangTerimaHPP;
	}

	public int getBarangOpnameHPP() {
		return BarangOpnameHPP;
	}

	public void setBarangOpnameHPP(int barangOpnameHPP) {
		BarangOpnameHPP = barangOpnameHPP;
	}

	public String getBarangCreatedHPP() {
		return BarangCreatedHPP;
	}

	public void setBarangCreatedHPP(String barangCreatedHPP) {
		BarangCreatedHPP = barangCreatedHPP;
	}

	public Timestamp getCreateDateBarangHPP() {
		return CreateDateBarangHPP;
	}

	public void setCreateDateBarangHPP(Timestamp createDateBarangHPP) {
		CreateDateBarangHPP = createDateBarangHPP;
	}

	public String getUpdateBarangHPP() {
		return UpdateBarangHPP;
	}

	public void setUpdateBarangHPP(String updateBarangHPP) {
		UpdateBarangHPP = updateBarangHPP;
	}

	public Timestamp getDateUpdateBarangHPP() {
		return DateUpdateBarangHPP;
	}

	public void setDateUpdateBarangHPP(Timestamp dateUpdateBarangHPP) {
		DateUpdateBarangHPP = dateUpdateBarangHPP;
	}

	public int getRevisedBarangHPP() {
		return RevisedBarangHPP;
	}

	public void setRevisedBarangHPP(int revisedBarangHPP) {
		RevisedBarangHPP = revisedBarangHPP;
	}

	public Timestamp getDeleteDateBarangHPP() {
		return DeleteDateBarangHPP;
	}

	public void setDeleteDateBarangHPP(Timestamp deleteDateBarangHPP) {
		DeleteDateBarangHPP = deleteDateBarangHPP;
	}

	@Override
	public String toString() {
		return "MBarangHPP [IdBarangHPP=" + IdBarangHPP + ", IdBarangBarangHPP=" + IdBarangBarangHPP
				+ ", IdSatuanBarangHPP=" + IdSatuanBarangHPP + ", IdSatuanKonversiHPP=" + IdSatuanKonversiHPP
				+ ", TanggalBarangHPP=" + TanggalBarangHPP + ", ValidFromHPP=" + ValidFromHPP + ", ValidToHPP="
				+ ValidToHPP + ", BarangHargaHPP=" + BarangHargaHPP + ", DiskonBarangHPP=" + DiskonBarangHPP
				+ ", BarangHPPhpp=" + BarangHPPhpp + ", BarangTerimaHPP=" + BarangTerimaHPP + ", BarangOpnameHPP="
				+ BarangOpnameHPP + ", BarangCreatedHPP=" + BarangCreatedHPP + ", CreateDateBarangHPP="
				+ CreateDateBarangHPP + ", UpdateBarangHPP=" + UpdateBarangHPP + ", DateUpdateBarangHPP="
				+ DateUpdateBarangHPP + ", RevisedBarangHPP=" + RevisedBarangHPP + ", DeleteDateBarangHPP="
				+ DeleteDateBarangHPP + "]";
	}
	
}
