/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-27 13:31:50
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-28 09:08:38
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

// disamakan aja dengan file dump m_icd
@Entity
@Table(name="m_icd")
public class MIcd {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "icd_id")
	private int icd_id;

	@Column(name = "icd_parent_id")
	private Integer icd_parent_id;

	@Column(name = "icd_parent_kode")
	private String icd_parent_kode;

	@Column(name = "icd_nama")
	private String icd_nama;

	@Column(name = "icd_keterangan")
	private String icd_keterangan;

	@Column(name = "icd_aktif")
	private String icd_aktif;

	@Column(name = "icd_created_by")
	private String icd_created_by;

	@Column(name = "icd_created_date")
	private Timestamp icd_created_date;

	@Column(name = "icd_updated_by")
	private String icd_updated_by;

	@Column(name = "icd_updated_date")
	private Timestamp icd_updated_date;

	@Column(name = "icd_revised")
	private Integer icd_revised;

	@Column(name = "m_unit_id")
	private Integer m_unit_id;

	@Column(name = "icd_kode")
	private String icd_kode;

	@Column(name = "icd_alias")
	private String icd_alias;

	@Column(name = "icd_dtd_kode")
	private String icd_dtd_kode;

	@Column(name = "icd_dtd_nama")
	private String icd_dtd_nama;

	@Column(name = "icd_unit_id")
	private String icd_unit_id;

	@Column(name = "icd_dtd_id")
	private Integer icd_dtd_id;

	public int getIcd_id() {
		return icd_id;
	}

	public void setIcd_id(int icd_id) {
		this.icd_id = icd_id;
	}

	public Integer getIcd_parent_id() {
		return icd_parent_id;
	}

	public void setIcd_parent_id(Integer icd_parent_id) {
		this.icd_parent_id = icd_parent_id;
	}

	public String getIcd_parent_kode() {
		return icd_parent_kode;
	}

	public void setIcd_parent_kode(String icd_parent_kode) {
		this.icd_parent_kode = icd_parent_kode;
	}

	public String getIcd_nama() {
		return icd_nama;
	}

	public void setIcd_nama(String icd_nama) {
		this.icd_nama = icd_nama;
	}

	public String getIcd_keterangan() {
		return icd_keterangan;
	}

	public void setIcd_keterangan(String icd_keterangan) {
		this.icd_keterangan = icd_keterangan;
	}

	public String getIcd_aktif() {
		return icd_aktif;
	}

	public void setIcd_aktif(String icd_aktif) {
		this.icd_aktif = icd_aktif;
	}

	public String getIcd_created_by() {
		return icd_created_by;
	}

	public void setIcd_created_by(String icd_created_by) {
		this.icd_created_by = icd_created_by;
	}

	public Timestamp getIcd_created_date() {
		return icd_created_date;
	}

	public void setIcd_created_date(Timestamp icd_created_date) {
		this.icd_created_date = icd_created_date;
	}

	public String getIcd_updated_by() {
		return icd_updated_by;
	}

	public void setIcd_updated_by(String icd_updated_by) {
		this.icd_updated_by = icd_updated_by;
	}

	public Timestamp getIcd_updated_date() {
		return icd_updated_date;
	}

	public void setIcd_updated_date(Timestamp icd_updated_date) {
		this.icd_updated_date = icd_updated_date;
	}

	public Integer getIcd_revised() {
		return icd_revised;
	}

	public void setIcd_revised(Integer icd_revised) {
		this.icd_revised = icd_revised;
	}

	public Integer getM_unit_id() {
		return m_unit_id;
	}

	public void setI_unit_id(Integer m_unit_id) {
		this.m_unit_id = m_unit_id;
	}

	public String getIcd_kode() {
		return icd_kode;
	}

	public void setIcd_kode(String icd_kode) {
		this.icd_kode = icd_kode;
	}

	public String getIcd_alias() {
		return icd_alias;
	}

	public void setIcd_alias(String icd_alias) {
		this.icd_alias = icd_alias;
	}

	public String getIcd_dtd_kode() {
		return icd_dtd_kode;
	}

	public void setIcd_dtd_kode(String icd_dtd_kode) {
		this.icd_dtd_kode = icd_dtd_kode;
	}

	public String getIcd_dtd_nama() {
		return icd_dtd_nama;
	}

	public void setIcd_dtd_nama(String icd_dtd_nama) {
		this.icd_dtd_nama = icd_dtd_nama;
	}

	public String getIcd_unit_id() {
		return icd_unit_id;
	}

	public void setIcd_unit_id(String icd_unit_id) {
		this.icd_unit_id = icd_unit_id;
	}

	public Integer getIcd_dtd_id() {
		return icd_dtd_id;
	}

	public void setIcd_dtd_id(Integer icd_dtd_id) {
		this.icd_dtd_id = icd_dtd_id;
	}
}