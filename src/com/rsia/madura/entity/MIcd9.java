/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-28 15:50:53
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-29 08:36:49
*/
package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

// disamakan aja dengan file dump m_icd9
@Entity
@Table(name="m_icd9")
public class MIcd9 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "icd9_id")
	private int icd9_id;

	@Column(name = "icd9_kode")
	private String icd9_kode;

	@Column(name = "icd9_nama")
	private String icd9_nama;

	@Column(name = "icd9_alias")
	private String icd9_alias;

	@Column(name = "icd9_keterangan")
	private String icd9_keterangan;

	@Column(name = "icd9_aktif")
	private String icd9_aktif;

	@Column(name = "icd9_created_by")
	private String icd9_created_by;

	@Column(name = "icd9_created_date")
	private Timestamp icd9_created_date;

	@Column(name = "icd9_updated_by")
	private String icd9_updated_by;

	@Column(name = "icd9_updated_date")
	private Timestamp icd9_updated_date;

	@Column(name = "icd9_revised")
	private Integer icd9_revised;

	@Column(name = "reg_company_id")
	private Integer reg_company_id;

	@Column(name = "reg_apps_id")
	private Integer reg_apps_id;

	@Column(name = "icd9_unit_id")
	private Integer icd9_unit_id;

	public int getIcd9_id() {
		return icd9_id;
	}

	public void setIcd9_id(int icd9_id) {
		icd9_id = icd9_id;
	}

	public String getIcd9_kode() {
		return icd9_kode;
	}

	public void setIcd9_kode(String icd9_kode) {
		icd9_kode = icd9_kode;
	}

	public String getIcd9_nama() {
		return icd9_nama;
	}

	public void setIcd9_nama(String icd9_nama) {
		icd9_nama = icd9_nama;
	}

	public String getIcd9_alias() {
		return icd9_alias;
	}

	public void setIcd9_alias(String icd9_alias) {
		icd9_alias = icd9_alias;
	}

	public String getIcd9_keterangan() {
		return icd9_keterangan;
	}

	public void setIcd9_keterangan(String icd9_keterangan) {
		icd9_keterangan = icd9_keterangan;
	}

	public String getIcd9_aktif() {
		return icd9_aktif;
	}

	public void setIcd9_aktif(String icd9_aktif) {
		icd9_aktif = icd9_aktif;
	}

	public String getIcd9_created_by() {
		return icd9_created_by;
	}

	public void setIcd9_created_by(String icd9_created_by) {
		icd9_created_by = icd9_created_by;
	}

	public Timestamp getIcd9_created_date() {
		return icd9_created_date;
	}

	public void setIcd9_created_date(Timestamp icd9_created_date) {
		icd9_created_date = icd9_created_date;
	}

	public String getIcd9_updated_by() {
		return icd9_updated_by;
	}

	public void setIcd9_updated_by(String icd9_updated_by) {
		icd9_updated_by = icd9_updated_by;
	}

	public Timestamp getIcd9_updated_date() {
		return icd9_updated_date;
	}

	public void setIcd9_updated_date(Timestamp icd9_updated_date) {
		icd9_updated_date = icd9_updated_date;
	}

	public Integer getIcd9_revised() {
		return icd9_revised;
	}

	public void setIcd9_revised(Integer icd9_revised) {
		icd9_revised = icd9_revised;
	}

	public Integer getReg_company_id() {
		return reg_company_id;
	}

	public void setReg_company_id(Integer reg_company_id) {
		reg_company_id = reg_company_id;
	}

	public Integer getReg_apps_id() {
		return reg_apps_id;
	}

	public void setReg_apps_id(Integer reg_apps_id) {
		reg_apps_id = reg_apps_id;
	}

	public Integer getIcd9_unit_id() {
		return icd9_unit_id;
	}

	public void setIcd9_unit_id(Integer icd9_unit_id) {
		icd9_unit_id = icd9_unit_id;
	}

	@Override
	public String toString() {
		return "m_icd9 [icd9_id=" + icd9_id + "]";
	}  

}