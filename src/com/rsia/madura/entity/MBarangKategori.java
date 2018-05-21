package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_barang_kategori")
public class MBarangKategori {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="barangkategori_id")
	private int IdBarangKategori;
	
	@Column(name="barangkategori_kode")
	private String KodeBarangKategori;
	
	@Column(name="barangkategori_nama")
	private String NamaBarangKategori;
	
	@Column(name="barangkategori_parent")
	private int ParentBarangKategori;
	
	@Column(name="barangkategori_keterangan")
	private String KeteranganBarangKategori;
	
	@Column(name="barangkategori_aktif")
	private String AktifBarangKategori;

	@Column(name=" barangkategori_created_by")
	private String CreatBarangKategori;
	
	@Column(name="barangkategori_created_date")
	private Timestamp CreateDateBarangKategori;
	
	@Column(name="barangkategori_updated_by")
	private String UpdateBarangKategori;
	
	@Column(name="barangkategori_updated_date")
	private Timestamp DateUpdateBarangKategori;
	
	@Column(name="barangkategori_revised")
	private int RevisedBarangKategori;
	
	@Column(name="barang_kategori_deleted_date")
	private Timestamp DeleteDateBarangKategori;

	public int getIdBarangKategori() {
		return IdBarangKategori;
	}

	public void setIdBarangKategori(int idBarangKategori) {
		IdBarangKategori = idBarangKategori;
	}

	public String getKodeBarangKategori() {
		return KodeBarangKategori;
	}

	public void setKodeBarangKategori(String kodeBarangKategori) {
		KodeBarangKategori = kodeBarangKategori;
	}

	public String getNamaBarangKategori() {
		return NamaBarangKategori;
	}

	public void setNamaBarangKategori(String namaBarangKategori) {
		NamaBarangKategori = namaBarangKategori;
	}

	public int getParentBarangKategori() {
		return ParentBarangKategori;
	}

	public void setParentBarangKategori(int parentBarangKategori) {
		ParentBarangKategori = parentBarangKategori;
	}

	public String getKeteranganBarangKategori() {
		return KeteranganBarangKategori;
	}

	public void setKeteranganBarangKategori(String keteranganBarangKategori) {
		KeteranganBarangKategori = keteranganBarangKategori;
	}

	public String getAktifBarangKategori() {
		return AktifBarangKategori;
	}

	public void setAktifBarangKategori(String aktifBarangKategori) {
		AktifBarangKategori = aktifBarangKategori;
	}

	public String getCreatBarangKategori() {
		return CreatBarangKategori;
	}

	public void setCreatBarangKategori(String creatBarangKategori) {
		CreatBarangKategori = creatBarangKategori;
	}

	public Timestamp getCreateDateBarangKategori() {
		return CreateDateBarangKategori;
	}

	public void setCreateDateBarangKategori(Timestamp createDateBarangKategori) {
		CreateDateBarangKategori = createDateBarangKategori;
	}

	public String getUpdateBarangKategori() {
		return UpdateBarangKategori;
	}

	public void setUpdateBarangKategori(String updateBarangKategori) {
		UpdateBarangKategori = updateBarangKategori;
	}

	public Timestamp getDateUpdateBarangKategori() {
		return DateUpdateBarangKategori;
	}

	public void setDateUpdateBarangKategori(Timestamp dateUpdateBarangKategori) {
		DateUpdateBarangKategori = dateUpdateBarangKategori;
	}

	public int getRevisedBarangKategori() {
		return RevisedBarangKategori;
	}

	public void setRevisedBarangKategori(int revisedBarangKategori) {
		RevisedBarangKategori = revisedBarangKategori;
	}

	public Timestamp getDeleteDateBarangKategori() {
		return DeleteDateBarangKategori;
	}

	public void setDeleteDateBarangKategori(Timestamp deleteDateBarangKategori) {
		DeleteDateBarangKategori = deleteDateBarangKategori;
	}

	@Override
	public String toString() {
		return "MBarangKategori [IdBarangKategori=" + IdBarangKategori + ", KodeBarangKategori=" + KodeBarangKategori
				+ ", NamaBarangKategori=" + NamaBarangKategori + ", ParentBarangKategori=" + ParentBarangKategori
				+ ", KeteranganBarangKategori=" + KeteranganBarangKategori + ", AktifBarangKategori="
				+ AktifBarangKategori + ", CreatBarangKategori=" + CreatBarangKategori + ", CreateDateBarangKategori="
				+ CreateDateBarangKategori + ", UpdateBarangKategori=" + UpdateBarangKategori
				+ ", DateUpdateBarangKategori=" + DateUpdateBarangKategori + ", RevisedBarangKategori="
				+ RevisedBarangKategori + ", DeleteDateBarangKategori=" + DeleteDateBarangKategori + "]";
	}
	
}

