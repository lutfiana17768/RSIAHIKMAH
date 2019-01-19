package com.rsia.madura.entity;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.*;

@Entity
@Table(name="t_terima")
public class MTerima {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="terima_id")
	private Integer terimaId;
	
	@Column(name="terima_no")
	private String terimaNo;
	 
	@Column(name="terima_tanggal")
	private Date terimaTanggal;
	
	@Column(name="terima_order_id")
	private Integer terimaOrderId;
	
	@Column(name="terima_perusahaan_id")
	private Integer terimaPerusahaanId;
	
	@Column(name="terima_nosuratjalan")
	private String terimaNoSuratJalan;
	
	@Column(name="terima_pengirim")
	private String terimaPengirim;
	
	@Column(name="terima_keterangan")
	private String terimaKeterangan;
	  
	@Column(name="terima_status")
	private String terimaStatus;
	  
	@Column(name="terima_aktif")
	private char terimaAktif;
	
	@Column(name="terima_total")
	private Integer terimaTotal;
	
	@Column(name="terima_totalppn")
	private Integer terimaTotalPPN;
	
	@Column(name="terima_order_no")
	private String terimaOrderNo;
	
	@Column(name="terima_barang_jenis")
	private String terimaBarangJenis;
	
	@Column(name="terima_depo_id")
	private Integer terimaDepoId;
	
	@Column(name="terima_depo_nama")
	private String terimaDepoNama;
	  
	// @Column(name="terima_ppn")
	// private char terimaPPN;
	
	@Column(name="terima_group")
	private String terimaGroup;
	
	@Column(name="terima_biayalain")
	private Integer terimaBiayaLain;
	
	@Column(name="terima_barangjenis_id")
	private Integer terimaBarangJenisId;
	  
	@Column(name="terima_cashback")
	private Integer terimaCashback;
	 
	@Column(name="terima_pph")
	private Integer terimaPPH;
	  
	@Column(name="terima_totalpph")
	private Integer terimaTotalPPH;
	
	@Column(name="terima_created_by")
	private String terimaCreatedBy;
	
	@Column(name="terima_created_date")
	private Timestamp terimaCreatedDate;
	
	@Column(name="terima_updated_by")
	private String terimaUpdatedBy;
	
	@Column(name="terima_updated_date")
	private Timestamp terimaUpdatedDate;
	
	@Column(name="terima_revised")
	private Integer terimaRevised;
	
	@Column(name="terima_deleted_date")
	private Timestamp terimaDeletedDate;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "terima", cascade = CascadeType.ALL, orphanRemoval=true)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<MTerimaDetail> detail;

	@ManyToOne
	private MOrder order;

	@ManyToOne
	private MPerusahaan perusahaan;

	@Column(name="pbf")
	private Integer terimaPBF;
	
	public MTerima(){
		
	}
	
	public Integer getTerimaId() {
		return terimaId;
	}

	public void setTerimaId(Integer terimaId) {
		this.terimaId = terimaId;
	}

	public String getTerimaNo() {
		return terimaNo;
	}

	public void setTerimaNo(String terimaNo) {
		this.terimaNo = terimaNo;
	}

	public Date getTerimaTanggal() {
		return terimaTanggal;
	}

	public void setTerimaTanggal(Date terimaTanggal) {
		this.terimaTanggal = terimaTanggal;
	}

	public Integer getTerimaOrderId() {
		return terimaOrderId;
	}

	public void setTerimaOrderId(Integer terimaOrderId) {
		this.terimaOrderId = terimaOrderId;
	}

	public Integer getTerimaPerusahaanId() {
		return terimaPerusahaanId;
	}

	public void setTerimaPerusahaanId(Integer terimaPerusahaanId) {
		this.terimaPerusahaanId = terimaPerusahaanId;
	}

	public String getTerimaNoSuratJalan() {
		return terimaNoSuratJalan;
	}

	public void setTerimaNoSuratJalan(String terimaNoSuratJalan) {
		this.terimaNoSuratJalan = terimaNoSuratJalan;
	}

	public String getTerimaPengirim() {
		return terimaPengirim;
	}

	public void setTerimaPengirim(String terimaPengirim) {
		this.terimaPengirim = terimaPengirim;
	}

	public String getTerimaKeterangan() {
		return terimaKeterangan;
	}

	public void setTerimaKeterangan(String terimaKeterangan) {
		this.terimaKeterangan = terimaKeterangan;
	}

	public String getTerimaStatus() {
		return terimaStatus;
	}

	public void setTerimaStatus(String terimaStatus) {
		this.terimaStatus = terimaStatus;
	}

	public char getTerimaAktif() {
		return terimaAktif;
	}

	public void setTerimaAktif(char terimaAktif) {
		this.terimaAktif = terimaAktif;
	}

	public Integer getTerimaTotal() {
		return terimaTotal;
	}

	public void setTerimaTotal(Integer terimaTotal) {
		this.terimaTotal = terimaTotal;
	}

	public Integer getTerimaTotalPPN() {
		return terimaTotalPPN;
	}

	public void setTerimaTotalPPN(Integer terimaTotalPPN) {
		this.terimaTotalPPN = terimaTotalPPN;
	}

	public String getTerimaOrderNo() {
		return terimaOrderNo;
	}

	public void setTerimaOrderNo(String terimaOrderNo) {
		this.terimaOrderNo = terimaOrderNo;
	}

	public String getTerimaBarangJenis() {
		return terimaBarangJenis;
	}

	public void setTerimaBarangJenis(String terimaBarangJenis) {
		this.terimaBarangJenis = terimaBarangJenis;
	}

	public Integer getTerimaDepoId() {
		return terimaDepoId;
	}

	public void setTerimaDepoId(Integer terimaDepoId) {
		this.terimaDepoId = terimaDepoId;
	}

	public String getTerimaDepoNama() {
		return terimaDepoNama;
	}

	public void setTerimaDepoNama(String terimaDepoNama) {
		this.terimaDepoNama = terimaDepoNama;
	}

	// public char getTerimaPPN() {
	// 	return terimaPPN;
	// }

	// public void setTerimaPPN(char terimaPPN) {
	// 	this.terimaPPN = terimaPPN;
	// }

	public String getTerimaGroup() {
		return terimaGroup;
	}

	public void setTerimaGroup(String terimaGroup) {
		this.terimaGroup = terimaGroup;
	}

	public Integer getTerimaBiayaLain() {
		return terimaBiayaLain;
	}

	public void setTerimaBiayaLain(Integer terimaBiayaLain) {
		this.terimaBiayaLain = terimaBiayaLain;
	}

	public Integer getTerimaBarangJenisId() {
		return terimaBarangJenisId;
	}

	public void setTerimaBarangJenisId(Integer terimaBarangJenisId) {
		this.terimaBarangJenisId = terimaBarangJenisId;
	}

	public Integer getTerimaCashback() {
		return terimaCashback;
	}

	public void setTerimaCashback(Integer terimaCashback) {
		this.terimaCashback = terimaCashback;
	}

	public Integer getTerimaPPH() {
		return terimaPPH;
	}

	public void setTerimaPPH(Integer terimaPPH) {
		this.terimaPPH = terimaPPH;
	}

	public Integer getTerimaTotalPPH() {
		return terimaTotalPPH;
	}

	public void setTerimaTotalPPH(Integer terimaTotalPPH) {
		this.terimaTotalPPH = terimaTotalPPH;
	}

	public String getTerimaCreatedBy() {
		return terimaCreatedBy;
	}

	public void setTerimaCreatedBy(String terimaCreatedBy) {
		this.terimaCreatedBy = terimaCreatedBy;
	}

	public Timestamp getTerimaCreatedDate() {
		return terimaCreatedDate;
	}

	public void setTerimaCreatedDate(Timestamp terimaCreatedDate) {
		this.terimaCreatedDate = terimaCreatedDate;
	}

	public String getTerimaUpdatedBy() {
		return terimaUpdatedBy;
	}

	public void setTerimaUpdatedBy(String terimaUpdatedBy) {
		this.terimaUpdatedBy = terimaUpdatedBy;
	}

	public Timestamp getTerimaUpdatedDate() {
		return terimaUpdatedDate;
	}

	public void setTerimaUpdatedDate(Timestamp terimaUpdatedDate) {
		this.terimaUpdatedDate = terimaUpdatedDate;
	}

	public Integer getTerimaRevised() {
		return terimaRevised;
	}

	public void setTerimaRevised(Integer terimaRevised) {
		this.terimaRevised = terimaRevised;
	}

	public Timestamp getTerimaDeletedDate() {
		return terimaDeletedDate;
	}

	public void setTerimaDeletedDate(Timestamp terimaDeletedDate) {
		this.terimaDeletedDate = terimaDeletedDate;
	}

	public List<MTerimaDetail> getDetail() {
		return detail;
	}

	public void setDetail(List<MTerimaDetail> detail) {
		this.detail = detail;
	}

	public MOrder getOrder(){
		return order;
	}

	public void setOrder(MOrder order){
		this.order = order;
	}

	public MPerusahaan getPerusahaan(){
		return perusahaan;
	}

	public void setPerusahaan(MPerusahaan perusahaan){
		this.perusahaan = perusahaan;
	}

	public Integer getTerimaPBF(){
		return terimaPBF;
	}

	public void setTerimaPBF(Integer terimaPBF){
		this.terimaPBF = terimaPBF;
	}

	@Override
	public String toString() {
		return "MTerima [terimaId=" + terimaId + ", terimaNo=" + terimaNo + ", terimaTanggal=" + terimaTanggal
				+ ", terimaOrderId=" + terimaOrderId + ", terimaPerusahaanId=" + terimaPerusahaanId
				+ ", terimaNoSuratJalan=" + terimaNoSuratJalan + ", terimaPengirim=" + terimaPengirim
				+ ", terimaKeterangan=" + terimaKeterangan + ", terimaStatus=" + terimaStatus + ", terimaAktif="
				+ terimaAktif + ", terimaTotal=" + terimaTotal + ", terimaTotalPPN=" + terimaTotalPPN
				+ ", terimaOrderNo=" + terimaOrderNo + ", terimaBarangJenis=" + terimaBarangJenis + ", terimaDepoId="
				+ terimaDepoId + ", terimaDepoNama=" + terimaDepoNama + ", terimaGroup="
				+ terimaGroup + ", terimaBiayaLain=" + terimaBiayaLain + ", terimaBarangJenisId=" + terimaBarangJenisId
				+ ", terimaCashback=" + terimaCashback + ", terimaPPH=" + terimaPPH + ", terimaTotalPPH="
				+ terimaTotalPPH + ", terimaCreatedBy=" + terimaCreatedBy + ", terimaCreatedDate=" + terimaCreatedDate
				+ ", terimaUpdatedBy=" + terimaUpdatedBy + ", terimaUpdatedDate=" + terimaUpdatedDate
				+ ", terimaRevised=" + terimaRevised + ", terimaDeletedDate=" + terimaDeletedDate + ", detail=" + detail
				+ ", order = " + order + ", perusahaan = " + perusahaan + ", terimaPBF=" + terimaPBF + "]";
	}

	
	
	
}
