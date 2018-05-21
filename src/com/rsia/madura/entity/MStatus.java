/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-17 11:51:04
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-17 12:07:12
*/

package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_status")
public class MStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "status_id")
	private int status_id;

	@Column(name = "status_kode")
	private String status_kode;

	@Column(name = "status_nama")
	private String status_nama;

	@Column(name = "status_aktif")
	private String status_aktif;

	@Column(name = "status_created_by")
	private String status_created_by;

	@Column(name = "status_created_date")
	private Timestamp status_created_date;

	@Column(name = "status_updated_by")
	private String status_updated_by;

	@Column(name = "status_updated_date")
	private Timestamp status_updated_date;

	@Column(name = "status_revised")
	private Integer status_revised;

	@Column(name = "status_urut")
	private Integer status_urut;

	@Column(name = "status_filter")
	private String status_filter;

	@Column(name = "reg_company_id")
	private Integer reg_company_id;

	@Column(name = "reg_apps_id")
	private Integer reg_apps_id;

	@Column(name = "status_keterangan")
	private String status_keterangan;

	public int getStatus_id(int status_id) {
		return status_id;
	}

	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}


	public String getStatus_kode(String status_kode) {
		return status_kode;
	}

	public void setStatus_kode(String status_kode) {
		this.status_kode = status_kode;
	}


	public String getStatus_nama(String status_nama) {
		return status_nama;
	}

	public void setStatus_nama(String status_nama) {
		this.status_nama = status_nama;
	}


	public String getStatus_aktif(String status_aktif) {
		return status_aktif;
	}

	public void setStatus_aktif(String status_aktif) {
		this.status_aktif = status_aktif;
	}


	public String getStatus_created_by(String status_created_by) {
		return status_created_by;
	}

	public void setStatus_created_by(String status_created_by) {
		this.status_created_by = status_created_by;
	}


	public Timestamp getStatus_created_date(Timestamp status_created_date) {
		return status_created_date;
	}

	public void setStatus_created_date(Timestamp status_created_date) {
		this.status_created_date = status_created_date;
	}


	public String getStatus_updated_by(String status_updated_by) {
		return status_updated_by;
	}

	public void setStatus_updated_by(String status_updated_by) {
		this.status_updated_by = status_updated_by;
	}


	public Timestamp getStatus_updated_date(Timestamp status_updated_date) {
		return status_updated_date;
	}

	public void setStatus_updated_date(Timestamp status_updated_date) {
		this.status_updated_date = status_updated_date;
	}


	public Integer getStatus_revised(Integer status_revised) {
		return status_revised;
	}

	public void setStatus_revised(Integer status_revised) {
		this.status_revised = status_revised;
	}


	public Integer getStatus_urut(Integer status_urut) {
		return status_urut;
	}

	public void setStatus_urut(Integer status_urut) {
		this.status_urut = status_urut;
	}


	public String getStatus_filter(String status_filter) {
		return status_filter;
	}

	public void setStatus_filter(String status_filter) {
		this.status_filter = status_filter;
	}


	public Integer getReg_company_id(Integer reg_company_id) {
		return reg_company_id;
	}

	public void setReg_company_id(Integer reg_company_id) {
		this.reg_company_id = reg_company_id;
	}


	public Integer getReg_apps_id(Integer reg_apps_id) {
		return reg_apps_id;
	}

	public void setReg_apps_id(Integer reg_apps_id) {
		this.reg_apps_id = reg_apps_id;
	}


	public String getStatus_keterangan(String status_keterangan) {
		return status_keterangan;
	}

	public void setStatus_keterangan(String status_keterangan) {
		this.status_keterangan = status_keterangan;
	}

}