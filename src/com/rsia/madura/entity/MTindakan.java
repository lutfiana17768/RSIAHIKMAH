/*
* @Author: PRADESGA
* @Date:   2018-04-07 01:44:50
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-08 19:57:50
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
@Table(name="m_tindakan")
public class MTindakan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tindakan_id")
	private int tindakan_id;

	@Column(name="tindakan_jenis")
	private String tindakan_jenis;
	
	@Column(name="tindakan_kategori")
	private String tindakan_kategori;
	
	@Column(name="tindakan_kode")
	private String tindakan_kode;
	
	@Column(name="tindakan_nama")
	private String tindakan_nama;
	
	@Column(name="tindakan_keterangan")
	private String tindakan_keterangan;

	@ManyToOne
	private MKelas kelas;
	
	@ManyToOne
	private MPaketTindakan paketTindakan;
	
	@Column(name="harga_tindakan")
	private float harga_tindakan;
	
	@Column(name="tindakan_aktif")
	private String tindakan_aktif;
	
	@Column(name="tindakan_created_by")
	private String tindakan_created_by;
	
	@Column(name="tindakan_created_date")
	private Timestamp tindakan_created_date;
	
	@Column(name="tindakan_updated_by")
	private String tindakan_updated_by;
	
	@Column(name="tindakan_updated_date")
	private Timestamp tindakan_updated_date;
	
	@Column(name="tindakan_revised")
	private int tindakan_revised;
	
	@Column(name="tindakan_deleted_by")
	private String tindakan_deleted_by;
	
	@Column(name="tindakan_deleted_date")
	private Timestamp tindakan_deleted_date;
	
	public int getTindakan_id() {
		return tindakan_id;
	}

	public void setTindakan_id(int tindakan_id) {
		this.tindakan_id = tindakan_id;
	}

	public String getTindakan_jenis() {
		return tindakan_jenis;
	}

	public void setTindakan_jenis(String tindakan_jenis) {
		this.tindakan_jenis = tindakan_jenis;
	}

	public String getTindakan_kategori() {
		return tindakan_kategori;
	}

	public void setTindakan_kategori(String tindakan_kategori) {
		this.tindakan_kategori = tindakan_kategori;
	}

	public String getTindakan_kode() {
		return tindakan_kode;
	}

	public void setTindakan_kode(String tindakan_kode) {
		this.tindakan_kode = tindakan_kode;
	}

	public String getTindakan_nama() {
		return tindakan_nama;
	}

	public void setTindakan_nama(String tindakan_nama) {
		this.tindakan_nama = tindakan_nama;
	}

	public String getTindakan_keterangan() {
		return tindakan_keterangan;
	}

	public MKelas getKelas() {
		return this.kelas;
	}

	public void setKelas(MKelas kelas) {
		this.kelas = kelas;
	}

	public float getHarga_tindakan() {
		return harga_tindakan;
	}

	public void setHarga_tindakan(float harga_tindakan) {
		this.harga_tindakan = harga_tindakan;
	}

	public void setTindakan_keterangan(String tindakan_keterangan) {
		this.tindakan_keterangan = tindakan_keterangan;
	}

	public String getTindakan_aktif() {
		return tindakan_aktif;
	}

	public void setTindakan_aktif(String tindakan_aktif) {
		this.tindakan_aktif = tindakan_aktif;
	}

	public String getTindakan_created_by() {
		return tindakan_created_by;
	}

	public void setTindakan_created_by(String tindakan_created_by) {
		this.tindakan_created_by = tindakan_created_by;
	}

	public Timestamp getTindakan_created_date() {
		return tindakan_created_date;
	}

	public void setTindakan_created_date(Timestamp tindakan_created_date) {
		this.tindakan_created_date = tindakan_created_date;
	}

	public String getTindakan_updated_by() {
		return tindakan_updated_by;
	}

	public void setTindakan_updated_by(String tindakan_updated_by) {
		this.tindakan_updated_by = tindakan_updated_by;
	}

	public Timestamp getTindakan_updated_date() {
		return tindakan_updated_date;
	}

	public void setTindakan_updated_date(Timestamp tindakan_updated_date) {
		this.tindakan_updated_date = tindakan_updated_date;
	}

	public int getTindakan_revised() {
		return tindakan_revised;
	}

	public void setTindakan_revised(int tindakan_revised) {
		this.tindakan_revised = tindakan_revised;
	}

	public Timestamp getTindakan_deleted_date() {
		return tindakan_deleted_date;
	}

	public void setTindakan_deleted_date(Timestamp tindakan_deleted_date) {
		this.tindakan_deleted_date = tindakan_deleted_date;
	}

	public String getTindakan_deleted_by() {
		return tindakan_deleted_by;
	}

	public void setTindakan_deleted_by(String tindakan_deleted_by) {
		this.tindakan_deleted_by = tindakan_deleted_by;
	}
}