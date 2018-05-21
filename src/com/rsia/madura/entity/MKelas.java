/*
* @Author: PRADESGA
* @Date:   2018-04-07 01:44:50
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-07 05:12:01
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
@Table(name="m_kelas")
public class MKelas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "kelas_id")
	private int kelas_id;

	@Column(name = "kelas_kode")
	private String kelas_kode;

	@Column(name = "kelas_nama")
	private String kelas_nama;

	@Column(name = "kelas_keterangan")
	private String kelas_keterangan;

	@Column(name = "kelas_aktif")
	private String kelas_aktif;

	@Column(name = "kelas_created_by")
	private String kelas_created_by;

	@Column(name = "kelas_created_date")
	private Timestamp kelas_created_date;

	@Column(name = "kelas_updated_by")
	private String kelas_updated_by;

	@Column(name = "kelas_updated_date")
	private Timestamp kelas_updated_date;

	@Column(name = "kelas_revised")
	private int kelas_revised;

	@Column(name = "kelas_deleted_date")
	private Timestamp kelas_deleted_date;

	@Column(name = "kelas_deleted_by")
	private String kelas_deleted_by;

	public int getKelas_id() {
		return this.kelas_id;
	}

	public void setKelas_id(int kelas_id) {
		this.kelas_id = kelas_id;
	}

	public String getKelas_kode() {
		return this.kelas_kode;
	}

	public void setKelas_kode(String kelas_kode) {
		this.kelas_kode = kelas_kode;
	}

	public String getKelas_nama() {
		return this.kelas_nama;
	}

	public void setKelas_nama(String kelas_nama) {
		this.kelas_nama = kelas_nama;
	}

	public String getKelas_keterangan() {
		return this.kelas_keterangan;
	}

	public void setKelas_keterangan(String kelas_keterangan) {
		this.kelas_keterangan = kelas_keterangan;
	}

	public String getKelas_aktif() {
		return this.kelas_aktif;
	}

	public void setKelas_aktif(String kelas_aktif) {
		this.kelas_aktif = kelas_aktif;
	}

	public String getKelas_created_by() {
		return this.kelas_created_by;
	}

	public void setKelas_created_by(String kelas_created_by) {
		this.kelas_created_by = kelas_created_by;
	}

	public Timestamp getKelas_created_date() {
		return this.kelas_created_date;
	}

	public void setKelas_created_date(Timestamp kelas_created_date) {
		this.kelas_created_date = kelas_created_date;
	}

	public String getKelas_updated_by() {
		return this.kelas_updated_by;
	}

	public void setKelas_updated_by(String kelas_updated_by) {
		this.kelas_updated_by = kelas_updated_by;
	}

	public Timestamp getKelas_updated_date() {
		return this.kelas_updated_date;
	}

	public void setKelas_updated_date(Timestamp kelas_updated_date) {
		this.kelas_updated_date = kelas_updated_date;
	}

	public int getKelas_revised() {
		return this.kelas_revised;
	}

	public void setKelas_revised(int kelas_revised) {
		this.kelas_revised = kelas_revised;
	}

	public Timestamp getKelas_deleted_date() {
		return this.kelas_deleted_date;
	}

	public void setKelas_deleted_date(Timestamp kelas_deleted_date) {
		this.kelas_deleted_date = kelas_deleted_date;
	}

	public String getKelas_deleted_by() {
		return this.kelas_deleted_by;
	}

	public void setKelas_deleted_by(String kelas_deleted_by) {
		this.kelas_deleted_by = kelas_deleted_by;
	}

	@Override
	public String toString() {
		return "m_kelas [kelas_id=" + kelas_id + ", kelas_kode=" + kelas_kode + ", kelas_nama=" + kelas_nama + ", kelas_keterangan=" + kelas_keterangan +"]";
	}
}