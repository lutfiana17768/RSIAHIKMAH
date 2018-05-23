/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-23 14:23:55
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-23 14:50:57
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

@Entity
@Table(name="t_tindakan_pasein")
public class MTindakanPasien {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tindakanpasienpasien_id")
	private int tindakanpasien_id;

	@Column(name="tindakanpasien_harga")
	private Integer tindakanpasien_harga;

	@Column(name="tindakanpasien_created_by")
	private String tindakanpasien_created_by;
	
	@Column(name="tindakanpasien_created_date")
	private Timestamp tindakanpasien_created_date;
	
	@Column(name="tindakanpasien_updated_by")
	private String tindakanpasien_updated_by;
	
	@Column(name="tindakanpasien_updated_date")
	private Timestamp tindakanpasien_updated_date;

	@Column(name="tindakanpasien_deleted_by")
	private String tindakanpasien_deleted_by;

	@Column(name="tindakanpasien_deleted_date")
	private Timestamp tindakanpasien_deleted_date;

	@Column(name="tindakanpasien_revised")
	private int tindakanpasien_revised;

	@ManyToOne
	private MTindakan tindakan;

	// pelaksana -> table pegawai status medis
	// @ManyToOne
	// private MPegawai pegawai;

	@ManyToOne
	private MPendaftaran pendaftaran;
	
	public int getTindakanpasien_id() {
		return tindakanpasien_id;
	}

	public void setTindakanpasien_id(int tindakanpasien_id) {
		this.tindakanpasien_id = tindakanpasien_id;
	}
	
	public Integer getTindakanpasien_harga() {
		return tindakanpasien_harga;
	}

	public void setTindakanpasien_harga(Integer tindakanpasien_harga) {
		this.tindakanpasien_harga = tindakanpasien_harga;
	}

	public String getTindakanpasien_created_by() {
		return tindakanpasien_created_by;
	}

	public void setTindakanpasien_created_by(String tindakanpasien_created_by) {
		this.tindakanpasien_created_by = tindakanpasien_created_by;
	}

	public Timestamp getTindakanpasien_created_date() {
		return tindakanpasien_created_date;
	}

	public void setTindakanpasien_created_date(Timestamp tindakanpasien_created_date) {
		this.tindakanpasien_created_date = tindakanpasien_created_date;
	}

	public String getTindakanpasien_updated_by() {
		return tindakanpasien_updated_by;
	}

	public void setTindakanpasien_updated_by(String tindakanpasien_updated_by) {
		this.tindakanpasien_updated_by = tindakanpasien_updated_by;
	}

	public Timestamp getTindakanpasien_updated_date() {
		return tindakanpasien_updated_date;
	}

	public void setTindakanpasien_updated_date(Timestamp tindakanpasien_updated_date) {
		this.tindakanpasien_updated_date = tindakanpasien_updated_date;
	}

	public int getTindakanpasien_revised() {
		return tindakanpasien_revised;
	}

	public void setTindakanpasien_revised(int tindakanpasien_revised) {
		this.tindakanpasien_revised = tindakanpasien_revised;
	}

	public Timestamp getTindakanpasien_deleted_date() {
		return tindakanpasien_deleted_date;
	}

	public void setTindakanpasien_deleted_date(Timestamp tindakanpasien_deleted_date) {
		this.tindakanpasien_deleted_date = tindakanpasien_deleted_date;
	}

	public String getTindakanpasien_deleted_by() {
		return tindakanpasien_deleted_by;
	}

	public void setTindakanpasien_deleted_by(String tindakanpasien_deleted_by) {
		this.tindakanpasien_deleted_by = tindakanpasien_deleted_by;
	}

	public MTindakan getTindakan() {
		return tindakan;
	}

	public void setTindakan(MTindakan tindakan) {
		this.tindakan = tindakan;
	}

	// public MPegawai getPegawai() {
	// 	return pegawai;
	// }

	// public void setPegawai(MPegawai pegawai) {
	// 	this.pegawai = pegawai;
	// }

	public MPendaftaran getPendaftaran() {
		return pendaftaran;
	}

	public void setPendaftaran(MPendaftaran pendaftaran) {
		this.pendaftaran = pendaftaran;
	}
}