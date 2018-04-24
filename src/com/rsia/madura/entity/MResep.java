package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_resep")
public class MResep {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="resep_id")
	private int resep_id;
	
	@Column(name="resep_pasien_id")
	private int resepPasienId;
	  
	@Column(name="resep_pasien_norm")
	private String resepPasienNorm;
	  
	@Column(name="resep_tanggal")
	private Timestamp resepTanggal;

	@Column(name="resep_dokter_id")
	private int resepDokter;
	  
	@Column(name="resep_keterangan")
	private String resepKeterangan;
	  
	@Column(name="resep_aktif")
	private char resepAktif;
	  
	@Column(name="resep_status")
	private String resep_status;
	  
	@Column(name="resep_created_by")
	private String resepCreatedBy;
	  
	@Column(name="resep_created_date")
	private Timestamp resepCreatedDate;
	
	@Column(name="resep_updated_by")
	private String resepUpdatedBy;
	  
	@Column(name="resep_updated_date")
	private Timestamp resepUpdatedDate;
	
	@Column(name="resep_revised")
	private int resepRevised;
	  
	@Column(name="resep_deleted_date")
	private Timestamp resepDeletedDate;
	  
	@Column(name="resep_pasien_nama")
	private String resepPasienNama;
	
	@Column(name="resep_pasien_alamat")
	private String resepPasienAlamat;
	
	@Column(name="resep_dokter_nama")
	private String resepDokterNama;
	
	@Column(name="resep_no")
	private String resepNo;
	
	@Column(name="resep_data")
	private String resepData;
	  
	@Column(name="resep_unit_nama")
	private String resepUnitNama;
	  
	@Column(name="resep_dimension")
	private String resepDimension;
	  
	@Column(name="resep_pendaftaran_id")
	private int resepPendaftaranId;
	
	@Column(name="resep_ruang_nama")
	private String resepRuangNama;
	  
	@Column(name="reg_company_id")
	private int reg_company_id;
	  
	@Column(name="resep_apps_id")
	private int regAppsId;
	  
	@Column(name="resep_kamarpasien_id")
	private int resepKamarPasienId;

	public int getResep_id() {
		return resep_id;
	}

	public void setResep_id(int resep_id) {
		this.resep_id = resep_id;
	}

	public int getResepPasienId() {
		return resepPasienId;
	}

	public void setResepPasienId(int resepPasienId) {
		this.resepPasienId = resepPasienId;
	}

	public String getResepPasienNorm() {
		return resepPasienNorm;
	}

	public void setResepPasienNorm(String resepPasienNorm) {
		this.resepPasienNorm = resepPasienNorm;
	}

	public Timestamp getResepTanggal() {
		return resepTanggal;
	}

	public void setResepTanggal(Timestamp resepTanggal) {
		this.resepTanggal = resepTanggal;
	}

	public int getResepDokter() {
		return resepDokter;
	}

	public void setResepDokter(int resepDokter) {
		this.resepDokter = resepDokter;
	}

	public String getResepKeterangan() {
		return resepKeterangan;
	}

	public void setResepKeterangan(String resepKeterangan) {
		this.resepKeterangan = resepKeterangan;
	}

	public char getResepAktif() {
		return resepAktif;
	}

	public void setResepAktif(char resepAktif) {
		this.resepAktif = resepAktif;
	}

	public String getResep_status() {
		return resep_status;
	}

	public void setResep_status(String resep_status) {
		this.resep_status = resep_status;
	}

	public String getResepCreatedBy() {
		return resepCreatedBy;
	}

	public void setResepCreatedBy(String resepCreatedBy) {
		this.resepCreatedBy = resepCreatedBy;
	}

	public Timestamp getResepCreatedDate() {
		return resepCreatedDate;
	}

	public void setResepCreatedDate(Timestamp resepCreatedDate) {
		this.resepCreatedDate = resepCreatedDate;
	}

	public String getResepUpdatedBy() {
		return resepUpdatedBy;
	}

	public void setResepUpdatedBy(String resepUpdatedBy) {
		this.resepUpdatedBy = resepUpdatedBy;
	}

	public Timestamp getResepUpdatedDate() {
		return resepUpdatedDate;
	}

	public void setResepUpdatedDate(Timestamp resepUpdatedDate) {
		this.resepUpdatedDate = resepUpdatedDate;
	}

	public int getResepRevised() {
		return resepRevised;
	}

	public void setResepRevised(int resepRevised) {
		this.resepRevised = resepRevised;
	}

	public Timestamp getResepDeletedDate() {
		return resepDeletedDate;
	}

	public void setResepDeletedDate(Timestamp resepDeletedDate) {
		this.resepDeletedDate = resepDeletedDate;
	}

	public String getResepPasienNama() {
		return resepPasienNama;
	}

	public void setResepPasienNama(String resepPasienNama) {
		this.resepPasienNama = resepPasienNama;
	}

	public String getResepPasienAlamat() {
		return resepPasienAlamat;
	}

	public void setResepPasienAlamat(String resepPasienAlamat) {
		this.resepPasienAlamat = resepPasienAlamat;
	}

	public String getResepDokterNama() {
		return resepDokterNama;
	}

	public void setResepDokterNama(String resepDokterNama) {
		this.resepDokterNama = resepDokterNama;
	}

	public String getResepNo() {
		return resepNo;
	}

	public void setResepNo(String resepNo) {
		this.resepNo = resepNo;
	}

	public String getResepData() {
		return resepData;
	}

	public void setResepData(String resepData) {
		this.resepData = resepData;
	}

	public String getResepUnitNama() {
		return resepUnitNama;
	}

	public void setResepUnitNama(String resepUnitNama) {
		this.resepUnitNama = resepUnitNama;
	}

	public String getResepDimension() {
		return resepDimension;
	}

	public void setResepDimension(String resepDimension) {
		this.resepDimension = resepDimension;
	}

	public int getResepPendaftaranId() {
		return resepPendaftaranId;
	}

	public void setResepPendaftaranId(int resepPendaftaranId) {
		this.resepPendaftaranId = resepPendaftaranId;
	}

	public String getResepRuangNama() {
		return resepRuangNama;
	}

	public void setResepRuangNama(String resepRuangNama) {
		this.resepRuangNama = resepRuangNama;
	}

	public int getReg_company_id() {
		return reg_company_id;
	}

	public void setReg_company_id(int reg_company_id) {
		this.reg_company_id = reg_company_id;
	}

	public int getRegAppsId() {
		return regAppsId;
	}

	public void setRegAppsId(int regAppsId) {
		this.regAppsId = regAppsId;
	}

	public int getResepKamarPasienId() {
		return resepKamarPasienId;
	}

	public void setResepKamarPasienId(int resepKamarPasienId) {
		this.resepKamarPasienId = resepKamarPasienId;
	}

	@Override
	public String toString() {
		return "t_Resep [resep_id=" + resep_id + ", resepPasienId=" + resepPasienId + ", resepPasienNorm="
				+ resepPasienNorm + ", resepTanggal=" + resepTanggal + ", resepDokter=" + resepDokter
				+ ", resepKeterangan=" + resepKeterangan + ", resepAktif=" + resepAktif + ", resep_status="
				+ resep_status + ", resepCreatedBy=" + resepCreatedBy + ", resepCreatedDate=" + resepCreatedDate
				+ ", resepUpdatedBy=" + resepUpdatedBy + ", resepUpdatedDate=" + resepUpdatedDate + ", resepRevised="
				+ resepRevised + ", resepDeletedDate=" + resepDeletedDate + ", resepPasienNama=" + resepPasienNama
				+ ", resepPasienAlamat=" + resepPasienAlamat + ", resepDokterNama=" + resepDokterNama + ", resepNo="
				+ resepNo + ", resepData=" + resepData + ", resepUnitNama=" + resepUnitNama + ", resepDimension="
				+ resepDimension + ", resepPendaftaranId=" + resepPendaftaranId + ", resepRuangNama=" + resepRuangNama
				+ ", reg_company_id=" + reg_company_id + ", regAppsId=" + regAppsId + ", resepKamarPasienId="
				+ resepKamarPasienId + "]";
	}
	
	
}
