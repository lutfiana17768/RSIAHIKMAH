/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-17 12:24:35
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-18 11:03:47
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

@Entity
@Table(name = "t_periksa_pasien")

public class MPeriksaPasien {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "periksapasien_id")
	private int periksapasien_id;

	// change to relation
	@Column(name = "periksapasien_pasien_id")
	private Integer periksapasien_pasien_id;

	@Column(name = "periksapasien_pasien_norm")
	private String periksapasien_pasien_norm;

	@Column(name = "periksapasien_periksa_kode")
	private String periksapasien_periksa_kode;

	@Column(name = "periksapasien_periksa_nama")
	private String periksapasien_periksa_nama;

	@Column(name = "periksapasien_periksa_nilai")
	private String periksapasien_periksa_nilai;

	@Column(name = "periksapasien_periksa_satuan")
	private String periksapasien_periksa_satuan;

	@Column(name = "periksapasien_periksa_standar")
	private String periksapasien_periksa_standar;

	@Column(name = "periksapasien_periksa_label")
	private String periksapasien_periksa_label;

	@Column(name = "periksapasien_periksa_group")
	private String periksapasien_periksa_group;

	@Column(name = "periksapasien_periksa_file")
	private String periksapasien_periksa_file;

	@Column(name = "periksapasien_periksa_keterangan")
	private String periksapasien_periksa_keterangan;

	@Column(name = "periksapasien_dokter_id")
	private Integer periksapasien_dokter_id;

	@Column(name = "periksapasien_unit_id")
	private Integer periksapasien_unit_id;

	@Column(name = "periksapasien_kamarpasien_id")
	private String periksapasien_kamarpasien_id;

	@Column(name = "periksapasien_aktif")
	private String periksapasien_aktif;

	@Column(name = "periksapasien_created_by")
	private String periksapasien_created_by;

	@Column(name = "periksapasien_created_date")
	private Timestamp periksapasien_created_date;

	@Column(name = "periksapasien_updated_by")
	private String periksapasien_updated_by;

	@Column(name = "periksapasien_updated_date")
	private Timestamp periksapasien_updated_date;

	@Column(name = "periksapasien_revised")
	private Integer periksapasien_revised;

	@Column(name = "periksapasien_pendaftaran_id")
	private Integer periksapasien_pendaftaran_id;

	@Column(name = "periksapasien_tanggal")
	private Timestamp periksapasien_tanggal;

	@Column(name = "periksapasien_urut")
	private Integer periksapasien_urut;

	@Column(name = "periksapasien_indent")
	private Integer periksapasien_indent;

	@ManyToOne
	private MPendaftaran pendaftaran;

	public int getPeriksapasien_id() {
		return periksapasien_id;
	}

	public void setPeriksapasien_id(int periksapasien_id) {
		this.periksapasien_id = periksapasien_id;
	}

	public Integer getPeriksapasien_pasien_id() {
		return periksapasien_pasien_id;
	}

	public void setPeriksapasien_pasien_id(Integer periksapasien_pasien_id) {
		this.periksapasien_pasien_id = periksapasien_pasien_id;
	}

	public String getPeriksapasien_pasien_norm() {
		return periksapasien_pasien_norm;
	}

	public void setPeriksapasien_pasien_norm(String periksapasien_pasien_norm) {
		this.periksapasien_pasien_norm = periksapasien_pasien_norm;
	}

	public String getPeriksapasien_periksa_kode() {
		return periksapasien_periksa_kode;
	}

	public void setPeriksapasien_periksa_kode(String periksapasien_periksa_kode) {
		this.periksapasien_periksa_kode = periksapasien_periksa_kode;
	}

	public String getPeriksapasien_periksa_nama() {
		return periksapasien_periksa_nama;
	}

	public void setPeriksapasien_periksa_nama(String periksapasien_periksa_nama) {
		this.periksapasien_periksa_nama = periksapasien_periksa_nama;
	}

	public String getPeriksapasien_periksa_nilai() {
		return periksapasien_periksa_nilai;
	}

	public void setPeriksapasien_periksa_nilai(String periksapasien_periksa_nilai) {
		this.periksapasien_periksa_nilai = periksapasien_periksa_nilai;
	}

	public String getPeriksapasien_periksa_satuan() {
		return periksapasien_periksa_satuan;
	}

	public void setPeriksapasien_periksa_satuan(String periksapasien_periksa_satuan) {
		this.periksapasien_periksa_satuan = periksapasien_periksa_satuan;
	}

	public String getPeriksapasien_periksa_standar() {
		return periksapasien_periksa_standar;
	}

	public void setPeriksapasien_periksa_standar(String periksapasien_periksa_standar) {
		this.periksapasien_periksa_standar = periksapasien_periksa_standar;
	}

	public String getPeriksapasien_periksa_label() {
		return periksapasien_periksa_label;
	}

	public void setPeriksapasien_periksa_label(String periksapasien_periksa_label) {
		this.periksapasien_periksa_label = periksapasien_periksa_label;
	}

	public String getPeriksapasien_periksa_group() {
		return periksapasien_periksa_group;
	}

	public void setPeriksapasien_periksa_group(String periksapasien_periksa_group) {
		this.periksapasien_periksa_group = periksapasien_periksa_group;
	}

	public String getPeriksapasien_periksa_file() {
		return periksapasien_periksa_file;
	}

	public void setPeriksapasien_periksa_file(String periksapasien_periksa_file) {
		this.periksapasien_periksa_file = periksapasien_periksa_file;
	}

	public String getPeriksapasien_periksa_keterangan() {
		return periksapasien_periksa_keterangan;
	}

	public void setPeriksapasien_periksa_keterangan(String periksapasien_periksa_keterangan) {
		this.periksapasien_periksa_keterangan = periksapasien_periksa_keterangan;
	}

	public Integer getPeriksapasien_dokter_id() {
		return periksapasien_dokter_id;
	}

	public void setPeriksapasien_dokter_id(Integer periksapasien_dokter_id) {
		this.periksapasien_dokter_id = periksapasien_dokter_id;
	}

	public Integer getPeriksapasien_unit_id() {
		return periksapasien_unit_id;
	}

	public void setPeriksapasien_unit_id(Integer periksapasien_unit_id) {
		this.periksapasien_unit_id = periksapasien_unit_id;
	}

	public String getPeriksapasien_kamarpasien_id() {
		return periksapasien_kamarpasien_id;
	}

	public void setPeriksapasien_kamarpasien_id(String periksapasien_kamarpasien_id) {
		this.periksapasien_kamarpasien_id = periksapasien_kamarpasien_id;
	}

	public String getPeriksapasien_aktif() {
		return periksapasien_aktif;
	}

	public void setPeriksapasien_aktif(String periksapasien_aktif) {
		this.periksapasien_aktif = periksapasien_aktif;
	}

	public String getPeriksapasien_created_by() {
		return periksapasien_created_by;
	}

	public void setPeriksapasien_created_by(String periksapasien_created_by) {
		this.periksapasien_created_by = periksapasien_created_by;
	}

	public Timestamp getPeriksapasien_created_date() {
		return periksapasien_created_date;
	}

	public void setPeriksapasien_created_date(Timestamp periksapasien_created_date) {
		this.periksapasien_created_date = periksapasien_created_date;
	}

	public String getPeriksapasien_updated_by() {
		return periksapasien_updated_by;
	}

	public void setPeriksapasien_updated_by(String periksapasien_updated_by) {
		this.periksapasien_updated_by = periksapasien_updated_by;
	}

	public Timestamp getPeriksapasien_updated_date() {
		return periksapasien_updated_date;
	}

	public void setPeriksapasien_updated_date(Timestamp periksapasien_updated_date) {
		this.periksapasien_updated_date = periksapasien_updated_date;
	}

	public Integer getPeriksapasien_revised() {
		return periksapasien_revised;
	}

	public void setPeriksapasien_revised(Integer periksapasien_revised) {
		this.periksapasien_revised = periksapasien_revised;
	}

	public Integer getPeriksapasien_pendaftaran_id() {
		return periksapasien_pendaftaran_id;
	}

	public void setPeriksapasien_pendaftaran_id(Integer periksapasien_pendaftaran_id) {
		this.periksapasien_pendaftaran_id = periksapasien_pendaftaran_id;
	}

	public Timestamp getPeriksapasien_tanggal() {
		return periksapasien_tanggal;
	}

	public void setPeriksapasien_tanggal(Timestamp periksapasien_tanggal) {
		this.periksapasien_tanggal = periksapasien_tanggal;
	}

	public Integer getPeriksapasien_urut() {
		return periksapasien_urut;
	}

	public void setPeriksapasien_urut(Integer periksapasien_urut) {
		this.periksapasien_urut = periksapasien_urut;
	}

	public Integer getPeriksapasien_indent() {
		return periksapasien_indent;
	}

	public void setPeriksapasien_indent(Integer periksapasien_indent) {
		this.periksapasien_indent = periksapasien_indent;
	}

	public void setPendaftaran(MPendaftaran pendaftaran) {
		this.pendaftaran = pendaftaran;
	}
	
	public MPendaftaran getPendaftaran() {
		return pendaftaran;
	}
}