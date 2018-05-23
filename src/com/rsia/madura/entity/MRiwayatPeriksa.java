/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-22 07:50:08
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-23 14:38:27
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
@Table(name="t_riwayat_periksa")
public class MRiwayatPeriksa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "periksa_id")
	private int periksa_id;

	@Column(name = "periksa_pendaftaran_id")
	private Integer periksa_pendaftaran_id;

	@Column(name = "periksa_tanggal")
	private Timestamp periksa_tanggal;

	@Column(name = "periksa_tb")
	private Double periksa_tb;

	@Column(name = "periksa_bb")
	private Double periksa_bb;

	@Column(name = "periksa_jantung")
	private Integer periksa_jantung;

	@Column(name = "periksa_tensi")
	private String periksa_tensi;

	@Column(name = "periksa_suhu")
	private Integer periksa_suhu;

	@Column(name = "periksa_nafas")
	private Integer periksa_nafas;

	@Column(name = "periksa_pemeriksa")
	private Integer periksa_pemeriksa;

	@Column(name = "periksa_aktif")
	private String periksa_aktif;

	@Column(name = "periksa_created_date")
	private Timestamp periksa_created_date;

	@Column(name = "periksa_created_by")
	private String periksa_created_by;

	@Column(name = "periksa_updated_date")
	private Timestamp periksa_updated_date;

	@Column(name = "periksa_updated_by")
	private String periksa_updated_by;

	@Column(name = "periksa_revised")
	private Integer periksa_revised;

	@Column(name = "periksa_pasien_id")
	private Integer periksa_pasien_id;

	@Column(name = "periksa_pasien_norm")
	private String periksa_pasien_norm;

	@Column(name = "periksa_unit_id")
	private Integer periksa_unit_id;

	@Column(name = "periksa_keluhan")
	private String periksa_keluhan;

	@Column(name = "periksa_keterangan")
	private String periksa_keterangan;

	@ManyToOne
	private MPendaftaran pendaftaran;
	
	public int getPeriksa_id(){
		return periksa_id;
	}

	public void setPeriksa_id(int periksa_id) {
		this.periksa_id = periksa_id;
	}

	public Integer getPeriksa_pendaftaran_id(){
		return periksa_pendaftaran_id;
	}

	public void setPeriksa_pendaftaran_id(Integer periksa_pendaftaran_id) {
		this.periksa_pendaftaran_id = periksa_pendaftaran_id;
	}

	public Timestamp getPeriksa_tanggal(){
		return periksa_tanggal;
	}

	public void setPeriksa_tanggal(Timestamp periksa_tanggal) {
		this.periksa_tanggal = periksa_tanggal;
	}

	public Double getPeriksa_tb(){
		return periksa_tb;
	}

	public void setPeriksa_tb(Double periksa_tb) {
		this.periksa_tb = periksa_tb;
	}

	public Double getPeriksa_bb(){
		return periksa_bb;
	}

	public void setPeriksa_bb(Double periksa_bb) {
		this.periksa_bb = periksa_bb;
	}

	public Integer getPeriksa_jantung(){
		return periksa_jantung;
	}

	public void setPeriksa_jantung(Integer periksa_jantung) {
		this.periksa_jantung = periksa_jantung;
	}

	public String getPeriksa_tensi(){
		return periksa_tensi;
	}

	public void setPeriksa_tensi(String periksa_tensi) {
		this.periksa_tensi = periksa_tensi;
	}

	public Integer getPeriksa_suhu(){
		return periksa_suhu;
	}

	public void setPeriksa_suhu(Integer periksa_suhu) {
		this.periksa_suhu = periksa_suhu;
	}

	public Integer getPeriksa_nafas(){
		return periksa_nafas;
	}

	public void setPeriksa_nafas(Integer periksa_nafas) {
		this.periksa_nafas = periksa_nafas;
	}

	public Integer getPeriksa_pemeriksa(){
		return periksa_pemeriksa;
	}

	public void setPeriksa_pemeriksa(Integer periksa_pemeriksa) {
		this.periksa_pemeriksa = periksa_pemeriksa;
	}

	public String getPeriksa_aktif(){
		return periksa_aktif;
	}

	public void setPeriksa_aktif(String periksa_aktif) {
		this.periksa_aktif = periksa_aktif;
	}

	public Timestamp getPeriksa_created_date(){
		return periksa_created_date;
	}

	public void setPeriksa_created_date(Timestamp periksa_created_date) {
		this.periksa_created_date = periksa_created_date;
	}

	public String getPeriksa_created_by(){
		return periksa_created_by;
	}

	public void setPeriksa_created_by(String periksa_created_by) {
		this.periksa_created_by = periksa_created_by;
	}

	public Timestamp getPeriksa_updated_date(){
		return periksa_updated_date;
	}

	public void setPeriksa_updated_date(Timestamp periksa_updated_date) {
		this.periksa_updated_date = periksa_updated_date;
	}

	public String getPeriksa_updated_by(){
		return periksa_updated_by;
	}

	public void setPeriksa_updated_by(String periksa_updated_by) {
		this.periksa_updated_by = periksa_updated_by;
	}

	public Integer getPeriksa_revised(){
		return periksa_revised;
	}

	public void setPeriksa_revised(Integer periksa_revised) {
		this.periksa_revised = periksa_revised;
	}

	public Integer getPeriksa_pasien_id(){
		return periksa_pasien_id;
	}

	public void setPeriksa_pasien_id(Integer periksa_pasien_id) {
		this.periksa_pasien_id = periksa_pasien_id;
	}

	public String getPeriksa_pasien_norm(){
		return periksa_pasien_norm;
	}

	public void setPeriksa_pasien_norm(String periksa_pasien_norm) {
		this.periksa_pasien_norm = periksa_pasien_norm;
	}

	public Integer getPeriksa_unit_id(){
		return periksa_unit_id;
	}

	public void setPeriksa_unit_id(Integer periksa_unit_id) {
		this.periksa_unit_id = periksa_unit_id;
	}

	public String getPeriksa_keluhan(){
		return periksa_keluhan;
	}

	public void setPeriksa_keluhan(String periksa_keluhan) {
		this.periksa_keluhan = periksa_keluhan;
	}

	public String getPeriksa_keterangan(){
		return periksa_keterangan;
	}

	public void setPeriksa_keterangan(String periksa_keterangan) {
		this.periksa_keterangan = periksa_keterangan;
	}

	public MPendaftaran getPendaftaran() {
		return pendaftaran;
	}

	public void setPendaftaran(MPendaftaran pendaftaran) {
		this.pendaftaran = pendaftaran;
	}

}