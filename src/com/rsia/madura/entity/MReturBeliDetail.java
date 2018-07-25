package com.rsia.madura.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_retur_belidetail")
public class MReturBeliDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="returBelidetail_id")
	private int returBeliDetailId;
	
	@Column(name="returbelidetail_returbeli_id")
	private int returBeliDetailReturId;
	
	@Column(name="returbelidetail_barang_id")
	private int returBeliDetailBarangId;
	
	@Column(name="returbelidetail_barang_nama")
	private String returBeliBarangNama;
	
	@Column(name="returbelidetail_satuan_id")
	private int returBeliDetailSatuanId;
	
	@Column(name="returbelidetail_satuan_nama")
	private String returBeliSatuanNama;
	  
	@Column(name="returbelidetail_kadaluarsa")
	private Date returBeliDetailKadaluarsa;
	
	@Column(name="returbelidetail_jumlah")
	private int returBeliDetailJumlah;
	
	@Column(name="returbelidetail_harga")
	private int returBeliDetailHarga;
	
	@Column(name="returbelidetail_diskon")
	private int returBeliDetailDiskon;
	
	@Column(name="returbelidetail_subtotal")
	private int returBeliDetailSubTotal;
	
	@Column(name="returbelidetail_created_by")
	private String returBeliDetailCreatedBy;
	
	@Column(name="returbelidetail_created_date")
	private Timestamp returBeliDetailCreatedDate;
	
	@Column(name="returbelidetail_updated_by")
	private String returBeliDetailUpdatedBy;
	
	@Column(name="returbelidetail_updated_date")
	private Timestamp returBeliDetailUpdatedDate;
	
	@Column(name="returbelidetail_revised")
	private int returBeliDetailRevised;
	
	@Column(name="reg_company_id")
	private int RegCompanyId;
	  
	@Column(name="returbelidetail_deleted_date")
	private Timestamp returBeliDetailDeletedDate;
	
	@ManyToOne
	private MReturBeli returBeli;

	public int getReturBeliDetailId() {
		return returBeliDetailId;
	}

	public void setReturBeliDetailId(int returBeliId) {
		this.returBeliDetailId = returBeliId;
	}

	public int getReturBeliDetailReturId() {
		return returBeliDetailReturId;
	}

	public void setReturBeliDetailReturId(int returBeliReturId) {
		this.returBeliDetailReturId = returBeliReturId;
	}

	public int getReturBeliDetailBarangId() {
		return returBeliDetailBarangId;
	}

	public void setReturBeliDetailBarangId(int returBeliBarangId) {
		this.returBeliDetailBarangId = returBeliBarangId;
	}

	public String getReturbeliBarangNama() {
		return returBeliBarangNama;
	}

	public void setReturbeliBarangNama(String returbeliBarangNama) {
		this.returBeliBarangNama = returbeliBarangNama;
	}

	public int getReturBeliDetailSatuanId() {
		return returBeliDetailSatuanId;
	}

	public void setReturBeliDetailSatuanId(int returBeliSatuanId) {
		this.returBeliDetailSatuanId = returBeliSatuanId;
	}

	public String getReturbeliSatuanNama() {
		return returBeliSatuanNama;
	}

	public void setReturbeliSatuanNama(String returbeliSatuanNama) {
		this.returBeliSatuanNama = returbeliSatuanNama;
	}

	public Date getReturBeliDetailKadaluarsa() {
		return returBeliDetailKadaluarsa;
	}

	public void setReturBeliDetailKadaluarsa(Date returBeliKadaluarsa) {
		this.returBeliDetailKadaluarsa = returBeliKadaluarsa;
	}

	public int getReturBeliDetailJumlah() {
		return returBeliDetailJumlah;
	}

	public void setReturBeliDetailJumlah(int returBeliJumlah) {
		this.returBeliDetailJumlah = returBeliJumlah;
	}

	public int getReturBeliDetailHarga() {
		return returBeliDetailHarga;
	}

	public void setReturBeliDetailHarga(int returBeliHarga) {
		this.returBeliDetailHarga = returBeliHarga;
	}

	public int getReturBeliDetailDiskon() {
		return returBeliDetailDiskon;
	}

	public void setReturBeliDetailDiskon(int returBeliDiskon) {
		this.returBeliDetailDiskon = returBeliDiskon;
	}

	public int getReturBeliDetailSubTotal() {
		return returBeliDetailSubTotal;
	}

	public void setReturBeliDetailSubTotal(int returBeliSubTotal) {
		this.returBeliDetailSubTotal = returBeliSubTotal;
	}

	public String getReturBeliDetailCreatedBy() {
		return returBeliDetailCreatedBy;
	}

	public void setReturBeliDetailCreatedBy(String returBeliCreatedBy) {
		this.returBeliDetailCreatedBy = returBeliCreatedBy;
	}

	public Timestamp getReturBeliDetailCreatedDate() {
		return returBeliDetailCreatedDate;
	}

	public void setReturBeliDetailCreatedDate(Timestamp returBeliCreatedDate) {
		this.returBeliDetailCreatedDate = returBeliCreatedDate;
	}

	public String getReturBeliDetailUpdatedBy() {
		return returBeliDetailUpdatedBy;
	}

	public void setReturBeliDetailUpdatedBy(String returBeliUpdatedBy) {
		this.returBeliDetailUpdatedBy = returBeliUpdatedBy;
	}

	public Timestamp getReturBeliDetailUpdatedDate() {
		return returBeliDetailUpdatedDate;
	}

	public void setReturBeliDetailUpdatedDate(Timestamp returBeliUpdatedDate) {
		this.returBeliDetailUpdatedDate = returBeliUpdatedDate;
	}

	public int getReturBeliDetailRevised() {
		return returBeliDetailRevised;
	}

	public void setReturBeliDetailRevised(int returBeliRevised) {
		this.returBeliDetailRevised = returBeliRevised;
	}

	public int getRegCompanyId() {
		return RegCompanyId;
	}

	public void setRegCompanyId(int regCompanyId) {
		this.RegCompanyId = regCompanyId;
	}

	public Timestamp getReturBeliDetailDeletedDate() {
		return returBeliDetailDeletedDate;
	}

	public void setReturBeliDetailDeletedDate(Timestamp returBeliDeletedDate) {
		this.returBeliDetailDeletedDate = returBeliDeletedDate;
	}

	public MReturBeli getReturBeli() {
		return returBeli;
	}

	public void setReturBeli(MReturBeli returBeli) {
		this.returBeli = returBeli;
	}

	@Override
	public String toString() {
		return "MReturBeliDetail [returBeliDetailId=" + returBeliDetailId + ", returBeliDetailReturId=" + returBeliDetailReturId
				+ ", returBeliDetailBarangId=" + returBeliDetailBarangId + ", returBeliBarangNama=" + returBeliBarangNama
				+ ", returBeliDetailSatuanId=" + returBeliDetailSatuanId + ", returBeliSatuanNama=" + returBeliSatuanNama
				+ ", returBeliDetailKadaluarsa=" + returBeliDetailKadaluarsa + ", returBeliDetailJumlah=" + returBeliDetailJumlah
				+ ", returBeliDetailHarga=" + returBeliDetailHarga + ", returBeliDetailDiskon=" + returBeliDetailDiskon + ", returBeliDetailSubTotal="
				+ returBeliDetailSubTotal + ", returBeliDetailCreatedBy=" + returBeliDetailCreatedBy + ", returBeliDetailCreatedDate="
				+ returBeliDetailCreatedDate + ", returBeliDetailUpdatedBy=" + returBeliDetailUpdatedBy + ", returBeliDetailUpdatedDate="
				+ returBeliDetailUpdatedDate + ", returBeliDetailRevised=" + returBeliDetailRevised + ", RegCompanyId=" + RegCompanyId
				+ ", returBeliDetailDeletedDate=" + returBeliDetailDeletedDate  + "]";
	}
	
	
}

