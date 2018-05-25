/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-24 16:59:51
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-25 07:57:16
*/
package com.rsia.madura.entity;

import java.sql.Timestamp;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;

@Entity
@Table(name="t_diagnosa9")
public class MDiagnosa9 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "diagnosa9_id")
	private int diagnosa9_id;

	@Column(name = "diagnosa9_kamarpasien_id")
	private Integer diagnosa9_kamarpasien_id;

	@Column(name = "diagnosa9_icd9_id")
	private Integer diagnosa9_icd9_id;

	@Column(name = "diagnosa9_pasien_id")
	private Integer diagnosa9_pasien_id;

	@Column(name = "diagnosa9_pasien_norm")
	private String diagnosa9_pasien_norm;

	@Column(name = "diagnosa9_dokter")
	private Integer diagnosa9_dokter;

	@Column(name = "diagnosa9_tanggal")
	private Date diagnosa9_tanggal;

	@Column(name = "diagnosa9_jenis")
	private String diagnosa9_jenis;

	@Column(name = "diagnosa9_kasus")
	private String diagnosa9_kasus;

	@Column(name = "diagnosa9_keterangan")
	private String diagnosa9_keterangan;

	@Column(name = "diagnosa9_aktif")
	private String diagnosa9_aktif;

	@Column(name = "diagnosa9_created_by")
	private String diagnosa9_created_by;

	@Column(name = "diagnosa9_created_date")
	private Timestamp diagnosa9_created_date;

	@Column(name = "diagnosa9_update_by")
	private String diagnosa9_update_by;

	@Column(name = "diagnosa9_update_date")
	private Timestamp diagnosa9_update_date;

	@Column(name = "reg_company_id")
	private Integer reg_company_id;

	@Column(name = "reg_apps_id")
	private Integer reg_apps_id;

	@ManyToOne
	private MPendaftaran pendaftaran;

	public int getDiagnosa9_id() {
		return diagnosa9_id;
	}

	public void setDiagnosa9_id(int diagnosa9_id) {
		this.diagnosa9_id = diagnosa9_id;
	}

	public Integer getDiagnosa9_kamarpasien_id() {
		return diagnosa9_kamarpasien_id;
	}

	public void setDiagnosa9_kamarpasien_id(Integer diagnosa9_kamarpasien_id) {
		this.diagnosa9_kamarpasien_id = diagnosa9_kamarpasien_id;
	}

	public Integer getDiagnosa9_icd9_id() {
		return diagnosa9_icd9_id;
	}

	public void setDiagnosa9_icd9_id(Integer diagnosa9_icd9_id) {
		this.diagnosa9_icd9_id = diagnosa9_icd9_id;
	}

	public Integer getDiagnosa9_pasien_id() {
		return diagnosa9_pasien_id;
	}

	public void setDiagnosa9_pasien_id(Integer diagnosa9_pasien_id) {
		this.diagnosa9_pasien_id = diagnosa9_pasien_id;
	}

	public String getDiagnosa9_pasien_norm() {
		return diagnosa9_pasien_norm;
	}

	public void setDiagnosa9_pasien_norm(String diagnosa9_pasien_norm) {
		this.diagnosa9_pasien_norm = diagnosa9_pasien_norm;
	}

	public Integer getDiagnosa9_dokter() {
		return diagnosa9_dokter;
	}

	public void setDiagnosa9_dokter(Integer diagnosa9_dokter) {
		this.diagnosa9_dokter = diagnosa9_dokter;
	}

	public Date getDiagnosa9_tanggal() {
		return diagnosa9_tanggal;
	}

	public void setDiagnosa9_tanggal(Date diagnosa9_tanggal) {
		this.diagnosa9_tanggal = diagnosa9_tanggal;
	}

	public String getDiagnosa9_jenis() {
		return diagnosa9_jenis;
	}

	public void setDiagnosa9_jenis(String diagnosa9_jenis) {
		this.diagnosa9_jenis = diagnosa9_jenis;
	}

	public String getDiagnosa9_kasus() {
		return diagnosa9_kasus;
	}

	public void setDiagnosa9_kasus(String diagnosa9_kasus) {
		this.diagnosa9_kasus = diagnosa9_kasus;
	}

	public String getDiagnosa9_keterangan() {
		return diagnosa9_keterangan;
	}

	public void setDiagnosa9_keterangan(String diagnosa9_keterangan) {
		this.diagnosa9_keterangan = diagnosa9_keterangan;
	}

	public String getDiagnosa9_aktif() {
		return diagnosa9_aktif;
	}

	public void setDiagnosa9_aktif(String diagnosa9_aktif) {
		this.diagnosa9_aktif = diagnosa9_aktif;
	}

	public String getDiagnosa9_created_by() {
		return diagnosa9_created_by;
	}

	public void setDiagnosa9_created_by(String diagnosa9_created_by) {
		this.diagnosa9_created_by = diagnosa9_created_by;
	}

	public Timestamp getDiagnosa9_created_date() {
		return diagnosa9_created_date;
	}

	public void setDiagnosa9_created_date(Timestamp diagnosa9_created_date) {
		this.diagnosa9_created_date = diagnosa9_created_date;
	}

	public String getDiagnosa9_update_by() {
		return diagnosa9_update_by;
	}

	public void setDiagnosa9_update_by(String diagnosa9_update_by) {
		this.diagnosa9_update_by = diagnosa9_update_by;
	}

	public Timestamp getDiagnosa9_update_date() {
		return diagnosa9_update_date;
	}

	public void setDiagnosa9_update_date(Timestamp diagnosa9_update_date) {
		this.diagnosa9_update_date = diagnosa9_update_date;
	}

	public Integer getReg_company_id() {
		return reg_company_id;
	}

	public void setReg_company_id(Integer reg_company_id) {
		this.reg_company_id = reg_company_id;
	}

	public Integer getReg_apps_id() {
		return reg_apps_id;
	}

	public void setReg_apps_id(Integer reg_apps_id) {
		this.reg_apps_id = reg_apps_id;
	}

	public MPendaftaran getPendaftaran() {
		return pendaftaran;
	}

	public void setPendaftaran(MPendaftaran pendaftaran) {
		this.pendaftaran = pendaftaran;
	}

}
