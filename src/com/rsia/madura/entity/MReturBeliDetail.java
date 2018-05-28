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
@Table(name="t_retur_beliDetail")
public class MReturBeliDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="returbelidetail_id")
	private int ReturBeli_id;
	
	@Column(name="returbelidetail_returbeli_id")
	private int ReturBeliReturId;
	
	@Column(name="returbelidetail_barang_id")
	private int ReturBeliBarangId;
	
	@Column(name="returbelidetail_barang_nama")
	private String ReturbeliBarangNama;
	
	@Column(name="returbelidetail_satuan_id")
	private int ReturBeliSatuanId;
	
	@Column(name="returbelidetail_satuan_nama")
	private String ReturbeliSatuanNama;
	  
	@Column(name="returbelidetail_kadaluarsa")
	private Date ReturBeliKadaluarsa;
	
	@Column(name="returbelidetail_jumlah")
	private int ReturBeliJumlah;
	
	@Column(name="returbelidetail_harga")
	private int ReturBeliHarga;
	
	@Column(name="returbelidetail_diskon")
	private int ReturBeliDiskon;
	
	@Column(name="returbelidetail_subtotal")
	private int ReturBeliSubTotal;
	
	@Column(name="returbelidetail_created_by")
	private String ReturBeliCreatedBy;
	
	@Column(name="returbelidetail_created_date")
	private Timestamp ReturBeliCreatedDate;
	
	@Column(name="returbelidetail_updated_by")
	private String ReturBeliUpdatedBy;
	
	@Column(name="returbelidetail_updated_date")
	private Timestamp ReturBeliUpdatedDate;
	
	@Column(name="returbelidetail_revised")
	private int ReturBeliRevised;
	
	@Column(name="reg_company_id")
	private int RegCompanyId;
	  
	@Column(name="returbelidetail_deleted_date")
	private Timestamp ReturBeliDeletedDate;
	
	@ManyToOne
	private MReturBeli returBeli;

	public int getReturBeli_id() {
		return ReturBeli_id;
	}

	public void setReturBeli_id(int returBeli_id) {
		ReturBeli_id = returBeli_id;
	}

	public int getReturBeliReturId() {
		return ReturBeliReturId;
	}

	public void setReturBeliReturId(int returBeliReturId) {
		ReturBeliReturId = returBeliReturId;
	}

	public int getReturBeliBarangId() {
		return ReturBeliBarangId;
	}

	public void setReturBeliBarangId(int returBeliBarangId) {
		ReturBeliBarangId = returBeliBarangId;
	}

	public String getReturbeliBarangNama() {
		return ReturbeliBarangNama;
	}

	public void setReturbeliBarangNama(String returbeliBarangNama) {
		ReturbeliBarangNama = returbeliBarangNama;
	}

	public int getReturBeliSatuanId() {
		return ReturBeliSatuanId;
	}

	public void setReturBeliSatuanId(int returBeliSatuanId) {
		ReturBeliSatuanId = returBeliSatuanId;
	}

	public String getReturbeliSatuanNama() {
		return ReturbeliSatuanNama;
	}

	public void setReturbeliSatuanNama(String returbeliSatuanNama) {
		ReturbeliSatuanNama = returbeliSatuanNama;
	}

	public Date getReturBeliKadaluarsa() {
		return ReturBeliKadaluarsa;
	}

	public void setReturBeliKadaluarsa(Date returBeliKadaluarsa) {
		ReturBeliKadaluarsa = returBeliKadaluarsa;
	}

	public int getReturBeliJumlah() {
		return ReturBeliJumlah;
	}

	public void setReturBeliJumlah(int returBeliJumlah) {
		ReturBeliJumlah = returBeliJumlah;
	}

	public int getReturBeliHarga() {
		return ReturBeliHarga;
	}

	public void setReturBeliHarga(int returBeliHarga) {
		ReturBeliHarga = returBeliHarga;
	}

	public int getReturBeliDiskon() {
		return ReturBeliDiskon;
	}

	public void setReturBeliDiskon(int returBeliDiskon) {
		ReturBeliDiskon = returBeliDiskon;
	}

	public int getReturBeliSubTotal() {
		return ReturBeliSubTotal;
	}

	public void setReturBeliSubTotal(int returBeliSubTotal) {
		ReturBeliSubTotal = returBeliSubTotal;
	}

	public String getReturBeliCreatedBy() {
		return ReturBeliCreatedBy;
	}

	public void setReturBeliCreatedBy(String returBeliCreatedBy) {
		ReturBeliCreatedBy = returBeliCreatedBy;
	}

	public Timestamp getReturBeliCreatedDate() {
		return ReturBeliCreatedDate;
	}

	public void setReturBeliCreatedDate(Timestamp returBeliCreatedDate) {
		ReturBeliCreatedDate = returBeliCreatedDate;
	}

	public String getReturBeliUpdatedBy() {
		return ReturBeliUpdatedBy;
	}

	public void setReturBeliUpdatedBy(String returBeliUpdatedBy) {
		ReturBeliUpdatedBy = returBeliUpdatedBy;
	}

	public Timestamp getReturBeliUpdatedDate() {
		return ReturBeliUpdatedDate;
	}

	public void setReturBeliUpdatedDate(Timestamp returBeliUpdatedDate) {
		ReturBeliUpdatedDate = returBeliUpdatedDate;
	}

	public int getReturBeliRevised() {
		return ReturBeliRevised;
	}

	public void setReturBeliRevised(int returBeliRevised) {
		ReturBeliRevised = returBeliRevised;
	}

	public int getRegCompanyId() {
		return RegCompanyId;
	}

	public void setRegCompanyId(int regCompanyId) {
		RegCompanyId = regCompanyId;
	}

	public Timestamp getReturBeliDeletedDate() {
		return ReturBeliDeletedDate;
	}

	public void setReturBeliDeletedDate(Timestamp returBeliDeletedDate) {
		ReturBeliDeletedDate = returBeliDeletedDate;
	}

	public MReturBeli getReturBeli() {
		return returBeli;
	}

	public void setReturBeli(MReturBeli returBeli) {
		this.returBeli = returBeli;
	}

	@Override
	public String toString() {
		return "MReturBeliDetail [ReturBeli_id=" + ReturBeli_id + ", ReturBeliReturId=" + ReturBeliReturId
				+ ", ReturBeliBarangId=" + ReturBeliBarangId + ", ReturbeliBarangNama=" + ReturbeliBarangNama
				+ ", ReturBeliSatuanId=" + ReturBeliSatuanId + ", ReturbeliSatuanNama=" + ReturbeliSatuanNama
				+ ", ReturBeliKadaluarsa=" + ReturBeliKadaluarsa + ", ReturBeliJumlah=" + ReturBeliJumlah
				+ ", ReturBeliHarga=" + ReturBeliHarga + ", ReturBeliDiskon=" + ReturBeliDiskon + ", ReturBeliSubTotal="
				+ ReturBeliSubTotal + ", ReturBeliCreatedBy=" + ReturBeliCreatedBy + ", ReturBeliCreatedDate="
				+ ReturBeliCreatedDate + ", ReturBeliUpdatedBy=" + ReturBeliUpdatedBy + ", ReturBeliUpdatedDate="
				+ ReturBeliUpdatedDate + ", ReturBeliRevised=" + ReturBeliRevised + ", RegCompanyId=" + RegCompanyId
				+ ", ReturBeliDeletedDate=" + ReturBeliDeletedDate + ", returBeli=" + returBeli + "]";
	}
	
	
}

