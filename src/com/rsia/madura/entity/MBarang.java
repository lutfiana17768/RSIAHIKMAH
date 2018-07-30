package com.rsia.madura.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="m_barang")
public class MBarang {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="barang_id")
	private int barangId;
	
	@Column(name="barang_jenis_id")
	private int barangJenisId;

	@Column(name="barang_kode")
	private String barangKode;
	
	@Column(name="barang_nama")
	private String barangNama;
	
	@Column(name="barang_satuan_id")
	private int barangSatuanId;

	@Column(name="barang_volume")
	private int barangVolume;
	
	@Column(name="barang_keterangan")
	private String barangKeterangan;
	  
	@Column(name="barang_kategori_id")
	private int barangKategoriId;
	
	@Column(name="barang_profit")
	private int barangProfit;
	
	@Column(name="barang_jenis")
	private String barangJenis;
	
	@Column(name="barang_aktif")
	private String barangAktif;
	
	@Column(name="barang_created_by")
	private String barangCreatedBy;
	
	@Column(name="barang_created_date")
	private Timestamp barangCreatedDate;
	
	@Column(name="barang_updated_by")
	private String barangUpdatedBy;
	
	@Column(name="barang_updated_date")
	private Timestamp barangUpdatedDate;
	
	@Column(name="barang_revised")
	private int barangRevised;
	
	@Column(name="barang_stokmin")
	private int barangStokMin;
	 
	@Column(name="barang_het")
	private int barangHet;
	 
	@Column(name="barang_deleted_date")
	private Timestamp barangDeletedDate;

	public int getBarangId() {
		return barangId;
	}

	public void setBarangId(int barangId) {
		this.barangId = barangId;
	}

	public int getBarangJenisId() {
		return barangJenisId;
	}

	public void setBarangJenisId(int barangJenisId) {
		this.barangJenisId = barangJenisId;
	}

	public String getBarangKode() {
		return barangKode;
	}

	public void setBarangKode(String barangKode) {
		this.barangKode = barangKode;
	}

	public String getBarangNama() {
		return barangNama;
	}

	public void setBarangNama(String barangNama) {
		this.barangNama = barangNama;
	}

	public int getBarangSatuanId() {
		return barangSatuanId;
	}

	public void setBarangSatuanId(int barangSatuanId) {
		this.barangSatuanId = barangSatuanId;
	}

	public int getBarangVolume() {
		return barangVolume;
	}

	public void setBarangVolume(int barangVolume) {
		this.barangVolume = barangVolume;
	}

	public String getBarangKeterangan() {
		return barangKeterangan;
	}

	public void setBarangKeterangan(String barangKeterangan) {
		this.barangKeterangan = barangKeterangan;
	}

	public int getBarangKategoriId() {
		return barangKategoriId;
	}

	public void setBarangKategoriId(int barangKategoriId) {
		this.barangKategoriId = barangKategoriId;
	}

	public int getBarangProfit() {
		return barangProfit;
	}

	public void setBarangProfit(int barangProfit) {
		this.barangProfit = barangProfit;
	}

	public String getBarangJenis() {
		return barangJenis;
	}

	public void setBarangJenis(String barangJenis) {
		this.barangJenis = barangJenis;
	}

	public String getBarangAktif() {
		return barangAktif;
	}

	public void setBarangAktif(String barangAktif) {
		this.barangAktif = barangAktif;
	}

	public String getBarangCreatedBy() {
		return barangCreatedBy;
	}

	public void setBarangCreatedBy(String barangCreatedBy) {
		this.barangCreatedBy = barangCreatedBy;
	}

	public Timestamp getBarangCreatedDate() {
		return barangCreatedDate;
	}

	public void setBarangCreatedDate(Timestamp barangCreatedDate) {
		this.barangCreatedDate = barangCreatedDate;
	}

	public String getBarangUpdatedBy() {
		return barangUpdatedBy;
	}

	public void setBarangUpdatedBy(String barangUpdatedBy) {
		this.barangUpdatedBy = barangUpdatedBy;
	}

	public Timestamp getBarangUpdatedDate() {
		return barangUpdatedDate;
	}

	public void setBarangUpdatedDate(Timestamp barangUpdatedDate) {
		this.barangUpdatedDate = barangUpdatedDate;
	}

	public int getBarangRevised() {
		return barangRevised;
	}

	public void setBarangRevised(int barangRevised) {
		this.barangRevised = barangRevised;
	}

	public int getBarangStokMin() {
		return barangStokMin;
	}

	public void setBarangStokMin(int barangStokMin) {
		this.barangStokMin = barangStokMin;
	}

	public int getBarangHet() {
		return barangHet;
	}

	public void setBarangHet(int barangHet) {
		this.barangHet = barangHet;
	}

	public Timestamp getBarangDeletedDate() {
		return barangDeletedDate;
	}

	public void setBarangDeletedDate(Timestamp barangDeletedDate) {
		this.barangDeletedDate = barangDeletedDate;
	}

	@Override
	public String toString() {
		return "MBarang [barangId=" + barangId + ", barangJenisId=" + barangJenisId + ", barangKode=" + barangKode
				+ ", barangNama=" + barangNama + ", barangSatuanId=" + barangSatuanId + ", barangVolume=" + barangVolume
				+ ", barangKeterangan=" + barangKeterangan + ", barangKategoriId=" + barangKategoriId
				+ ", barangProfit=" + barangProfit + ", barangJenis=" + barangJenis + ", barangAktif=" + barangAktif
				+ ", barangCreatedBy=" + barangCreatedBy + ", barangCreatedDate=" + barangCreatedDate + ", barangUpdatedBy="
				+ barangUpdatedBy + ", barangUpdatedDate=" + barangUpdatedDate + ", barangRevised=" + barangRevised
				+ ", barangStokMin=" + barangStokMin + ", barangHet=" + barangHet + ", barangDeletedDate="
				+ barangDeletedDate +  "]";
	}
}
