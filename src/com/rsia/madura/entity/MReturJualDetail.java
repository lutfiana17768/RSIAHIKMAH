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
@Table(name="t_retur_jualdetail")
public class MReturJualDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="returjualdetail_id")
	private int returJualDetailId;

	@Column(name="returjualdetail_returjual_id")
	private int returJualDetailReturId;
	
	@Column(name="returjualdetail_barang_id")
	private int returJualDetailBarangId;
	 
	@Column(name="returjualdetail_barang_nama")
	private String returJualDetailBarangNama;
	 
	@Column(name="returjualdetail_satuan_id")
	private int returJualDetailSatuanId;
	  
	@Column(name="returjualdetail_satuan_nama")
	private String returJualDetailSatuanNama;
	
	@Column(name="returjualdetail_kadaluarsa")
	private Date returJualDetailKadaluarsa;
	  
	@Column(name="returjualdetail_jumlah")
	private int returJualDetailJumlah;
	
	@Column(name="returjualdetail_harga")
	private int returJualDetailHarga;
	
	@Column(name="returjualdetail_diskon")
	private int returJualDetailDiskon;
	
	@Column(name="returjualdetail_subtotal")
	private int returJualDetailSubTotal;
	  
	@Column(name="returjualdetail_terima_id")
	private int returJualDetailTerimaId;
	
	@Column(name="returjualdetail_terima_no")
	private String returJualDetailTerimaNo;
	
	@Column(name="returjualdetail_depo_id")
	private int returJualDepoId;
	
	@Column(name="returjualdetail_depo_nama")
	private String returJualDepoNama;
	 
	@Column(name="returjualdetail_status")
	private int returJualDetailStatus;
	
	@Column(name="returjualdetail_created_by")
	private String returJualDetailCreatedBy;

	@Column(name="returjualdetail_created_date")
	private Timestamp returJualDetailCreatedDate;
	
	@Column(name="returjualdetail_updated_by")
	private String returJualDetailUpdatedBy;

	@Column(name="returjualdetail_updated_date")
	private Timestamp returJualDetailUpdatedDate;
	
	@Column(name="returjualdetail_revised")
	private int returJualDetailRevised;
	
	@Column(name="reg_company_id")
	private int regCompanyId;
	
	@Column(name="reg_apps_id")
	private int regAppsId;
	
	@Column(name="returjualdetail_deleted_date")
	private Timestamp returJualDetaiDeletedDate;
	
	@ManyToOne
	private MReturJual returJual;

	public int getReturJualDetailId() {
		return returJualDetailId;
	}

	public void setReturJualDetailId(int returJualDetailId) {
		this.returJualDetailId = returJualDetailId;
	}

	public int getReturJualDetailReturId() {
		return returJualDetailReturId;
	}

	public void setReturJualDetailReturId(int returJualDetailReturId) {
		this.returJualDetailReturId = returJualDetailReturId;
	}

	public int getReturJualDetailBarangId() {
		return returJualDetailBarangId;
	}

	public void setReturJualDetailBarangId(int returJualDetailBarangId) {
		this.returJualDetailBarangId = returJualDetailBarangId;
	}

	public String getReturJualDetailBarangNama() {
		return returJualDetailBarangNama;
	}

	public void setReturJualDetailBarangNama(String returJualDetailBarangNama) {
		this.returJualDetailBarangNama = returJualDetailBarangNama;
	}

	public int getReturJualDetailSatuanId() {
		return returJualDetailSatuanId;
	}

	public void setReturJualDetailSatuanId(int returJualDetailSatuanId) {
		this.returJualDetailSatuanId = returJualDetailSatuanId;
	}

	public String getReturJualDetailSatuanNama() {
		return returJualDetailSatuanNama;
	}

	public void setReturJualDetailSatuanNama(String returJualDetailSatuanNama) {
		this.returJualDetailSatuanNama = returJualDetailSatuanNama;
	}

	public Date getReturJualDetailKadaluarsa() {
		return returJualDetailKadaluarsa;
	}

	public void setReturJualDetailKadaluarsa(Date returJualDetailKadaluarsa) {
		this.returJualDetailKadaluarsa = returJualDetailKadaluarsa;
	}

	public int getReturJualDetailJumlah() {
		return returJualDetailJumlah;
	}

	public void setReturJualDetailJumlah(int returJualDetailJumlah) {
		this.returJualDetailJumlah = returJualDetailJumlah;
	}

	public int getReturJualDetailHarga() {
		return returJualDetailHarga;
	}

	public void setReturJualDetailHarga(int returJualDetailHarga) {
		this.returJualDetailHarga = returJualDetailHarga;
	}

	public int getReturJualDetailDiskon() {
		return returJualDetailDiskon;
	}

	public void setReturJualDetailDiskon(int returJualDetailDiskon) {
		this.returJualDetailDiskon = returJualDetailDiskon;
	}

	public int getReturJualDetailSubTotal() {
		return returJualDetailSubTotal;
	}

	public void setReturJualDetailSubTotal(int returJualDetailSubTotal) {
		this.returJualDetailSubTotal = returJualDetailSubTotal;
	}

	public int getReturJualDetailTerimaId() {
		return returJualDetailTerimaId;
	}

	public void setReturJualDetailTerimaId(int returJualDetailTerimaId) {
		this.returJualDetailTerimaId = returJualDetailTerimaId;
	}

	public String getReturJualDetailTerimaNo() {
		return returJualDetailTerimaNo;
	}

	public void setReturJualDetailTerimaNo(String returJualDetailTerimaNo) {
		this.returJualDetailTerimaNo = returJualDetailTerimaNo;
	}

	public int getReturJualDepoId() {
		return returJualDepoId;
	}

	public void setReturJualDepoId(int returJualDepoId) {
		this.returJualDepoId = returJualDepoId;
	}

	public String getReturJualDepoNama() {
		return returJualDepoNama;
	}

	public void setReturJualDepoNama(String returJualDepoNama) {
		this.returJualDepoNama = returJualDepoNama;
	}

	public int getReturJualDetailStatus() {
		return returJualDetailStatus;
	}

	public void setReturJualDetailStatus(int returJualDetailStatus) {
		this.returJualDetailStatus = returJualDetailStatus;
	}

	public String getReturJualDetailCreatedBy() {
		return returJualDetailCreatedBy;
	}

	public void setReturJualDetailCreatedBy(String returJualDetailCreatedBy) {
		this.returJualDetailCreatedBy = returJualDetailCreatedBy;
	}

	public Timestamp getReturJualDetailCreatedDate() {
		return returJualDetailCreatedDate;
	}

	public void setReturJualDetailCreatedDate(Timestamp returJualDetailCreatedDate) {
		this.returJualDetailCreatedDate = returJualDetailCreatedDate;
	}

	public String getReturJualDetailUpdatedBy() {
		return returJualDetailUpdatedBy;
	}

	public void setReturJualDetailUpdatedBy(String returJualDetailUpdatedBy) {
		this.returJualDetailUpdatedBy = returJualDetailUpdatedBy;
	}

	public Timestamp getReturJualDetailUpdatedDate() {
		return returJualDetailUpdatedDate;
	}

	public void setReturJualDetailUpdatedDate(Timestamp returJualDetailUpdatedDate) {
		returJualDetailUpdatedDate = returJualDetailUpdatedDate;
	}

	public int getReturJualDetailRevised() {
		return returJualDetailRevised;
	}

	public void setReturJualDetailRevised(int returJualDetailRevised) {
		returJualDetailRevised = returJualDetailRevised;
	}

	public int getRegCompanyId() {
		return regCompanyId;
	}

	public void setRegCompanyId(int regCompanyId) {
		regCompanyId = regCompanyId;
	}

	public int getRegAppsId() {
		return regAppsId;
	}

	public void setRegAppsId(int regAppsId) {
		regAppsId = regAppsId;
	}

	public Timestamp getReturJualDetaiDeletedDate() {
		return returJualDetaiDeletedDate;
	}

	public void setReturJualDetaiDeletedDate(Timestamp returJualDetaiDeletedDate) {
		this.returJualDetaiDeletedDate = returJualDetaiDeletedDate;
	}

	public MReturJual getReturJual() {
		return returJual;
	}

	public void setReturJual(MReturJual returJual) {
		this.returJual = returJual;
	}

	@Override
	public String toString() {
		return "MReturJualDetail [returJualDetailId=" + returJualDetailId + ", returJualDetailReturId="
				+ returJualDetailReturId + ", returJualDetailBarangId=" + returJualDetailBarangId
				+ ", returJualDetailBarangNama=" + returJualDetailBarangNama + ", returJualDetailSatuanId="
				+ returJualDetailSatuanId + ", returJualDetailSatuanNama=" + returJualDetailSatuanNama
				+ ", returJualDetailKadaluarsa=" + returJualDetailKadaluarsa + ", returJualDetailJumlah="
				+ returJualDetailJumlah + ", returJualDetailHarga=" + returJualDetailHarga + ", returJualDetailDiskon="
				+ returJualDetailDiskon + ", returJualDetailSubTotal=" + returJualDetailSubTotal
				+ ", returJualDetailTerimaId=" + returJualDetailTerimaId + ", returJualDetailTerimaNo="
				+ returJualDetailTerimaNo + ", returJualDepoId=" + returJualDepoId + ", returJualDepoNama="
				+ returJualDepoNama + ", returJualDetailStatus=" + returJualDetailStatus + ", returJualDetailCreatedBy="
				+ returJualDetailCreatedBy + ", returJualDetailCreatedDate=" + returJualDetailCreatedDate
				+ ", returJualDetailUpdatedBy=" + returJualDetailUpdatedBy + ", returJualDetailUpdatedDate="
				+ returJualDetailUpdatedDate + ", returJualDetailRevised=" + returJualDetailRevised + ", regCompanyId="
				+ regCompanyId + ", regAppsId=" + regAppsId + ", returJualDetaiDeletedDate=" + returJualDetaiDeletedDate
				+  "]";
	}

	
}
