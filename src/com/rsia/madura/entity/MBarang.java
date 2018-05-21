package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_barang")
public class MBarang {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="barang_id")
	private int IdBarang;
	
	@Column(name="barang_jenis_id")
	private int IdJenisBarang;

	@Column(name="barang_kode")
	private String KodeBarang;
	
	@Column(name="barang_nama")
	private String NamaBarang;
	
	@Column(name="barang_satuan_id")
	private int IdSatuanBarang;

	@Column(name="barang_volume")
	private int VolumeBarang;
	
	@Column(name="barang_keterangan")
	private String KeteranganBarang;
	  
	@Column(name="barang_kategori_id")
	private int IdKategoriBarang;
	
	@Column(name="barang_profit")
	private int ProfitBarang;
	
	@Column(name="barang_jenis")
	private String JenisBarang;
	
	@Column(name="barang_aktif")
	private String AktifBarang;
	
	@Column(name="barang_created_by")
	private String CreatBarang;
	
	@Column(name="barang_created_date")
	private Timestamp CreateDateBarang;
	
	@Column(name="barang_updated_by")
	private String UpdateBarang;
	
	@Column(name="barang_updated_date")
	private Timestamp DateUpdateBarang;
	
	@Column(name="barang_revised")
	private int RevisedBarang;
	
	@Column(name="barang_stokmin")
	private int StokMinBarang;
	 
	@Column(name="barang_het")
	private int HetBarang;
	 
	@Column(name="barang_deleted_date")
	private Timestamp DeleteDateBarang;

	public int getIdBarang() {
		return IdBarang;
	}

	public void setIdBarang(int idBarang) {
		IdBarang = idBarang;
	}

	public int getIdJenisBarang() {
		return IdJenisBarang;
	}

	public void setIdJenisBarang(int idJenisBarang) {
		IdJenisBarang = idJenisBarang;
	}

	public String getKodeBarang() {
		return KodeBarang;
	}

	public void setKodeBarang(String kodeBarang) {
		KodeBarang = kodeBarang;
	}

	public String getNamaBarang() {
		return NamaBarang;
	}

	public void setNamaBarang(String namaBarang) {
		NamaBarang = namaBarang;
	}

	public int getIdSatuanBarang() {
		return IdSatuanBarang;
	}

	public void setIdSatuanBarang(int idSatuanBarang) {
		IdSatuanBarang = idSatuanBarang;
	}

	public int getVolumeBarang() {
		return VolumeBarang;
	}

	public void setVolumeBarang(int volumeBarang) {
		VolumeBarang = volumeBarang;
	}

	public String getKeteranganBarang() {
		return KeteranganBarang;
	}

	public void setKeteranganBarang(String keteranganBarang) {
		KeteranganBarang = keteranganBarang;
	}

	public int getIdKategoriBarang() {
		return IdKategoriBarang;
	}

	public void setIdKategoriBarang(int idKategoriBarang) {
		IdKategoriBarang = idKategoriBarang;
	}

	public int getProfitBarang() {
		return ProfitBarang;
	}

	public void setProfitBarang(int profitBarang) {
		ProfitBarang = profitBarang;
	}

	public String getJenisBarang() {
		return JenisBarang;
	}

	public void setJenisBarang(String jenisBarang) {
		JenisBarang = jenisBarang;
	}

	public String getAktifBarang() {
		return AktifBarang;
	}

	public void setAktifBarang(String aktifBarang) {
		AktifBarang = aktifBarang;
	}

	public String getCreatBarang() {
		return CreatBarang;
	}

	public void setCreatBarang(String creatBarang) {
		CreatBarang = creatBarang;
	}

	public Timestamp getCreateDateBarang() {
		return CreateDateBarang;
	}

	public void setCreateDateBarang(Timestamp createDateBarang) {
		CreateDateBarang = createDateBarang;
	}

	public String getUpdateBarang() {
		return UpdateBarang;
	}

	public void setUpdateBarang(String updateBarang) {
		UpdateBarang = updateBarang;
	}

	public Timestamp getDateUpdateBarang() {
		return DateUpdateBarang;
	}

	public void setDateUpdateBarang(Timestamp dateUpdateBarang) {
		DateUpdateBarang = dateUpdateBarang;
	}

	public int getRevisedBarang() {
		return RevisedBarang;
	}

	public void setRevisedBarang(int revisedBarang) {
		RevisedBarang = revisedBarang;
	}

	public int getStokMinBarang() {
		return StokMinBarang;
	}

	public void setStokMinBarang(int stokMinBarang) {
		StokMinBarang = stokMinBarang;
	}

	public int getHetBarang() {
		return HetBarang;
	}

	public void setHetBarang(int hetBarang) {
		HetBarang = hetBarang;
	}

	public Timestamp getDeleteDateBarang() {
		return DeleteDateBarang;
	}

	public void setDeleteDateBarang(Timestamp deleteDateBarang) {
		DeleteDateBarang = deleteDateBarang;
	}

	@Override
	public String toString() {
		return "MBarang [IdBarang=" + IdBarang + ", IdJenisBarang=" + IdJenisBarang + ", KodeBarang=" + KodeBarang
				+ ", NamaBarang=" + NamaBarang + ", IdSatuanBarang=" + IdSatuanBarang + ", VolumeBarang=" + VolumeBarang
				+ ", KeteranganBarang=" + KeteranganBarang + ", IdKategoriBarang=" + IdKategoriBarang
				+ ", ProfitBarang=" + ProfitBarang + ", JenisBarang=" + JenisBarang + ", AktifBarang=" + AktifBarang
				+ ", CreatBarang=" + CreatBarang + ", CreateDateBarang=" + CreateDateBarang + ", UpdateBarang="
				+ UpdateBarang + ", DateUpdateBarang=" + DateUpdateBarang + ", RevisedBarang=" + RevisedBarang
				+ ", StokMinBarang=" + StokMinBarang + ", HetBarang=" + HetBarang
				+ ", DeleteDateBarang=" + DeleteDateBarang + "]";
	}
}
