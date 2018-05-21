/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-15 15:38:19
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-15 16:50:27
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
@Table(name="m_parameter_periksa")
public class MParamPeriksa {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="paramperiksa_id")
	private Integer paramperiksa_id;
	
	@Column(name="paramperiksa_kode")
	private String paramperiksa_kode ;
	
	@Column(name="paramperiksa_nama")
	private String paramperiksa_nama;
	
	@Column(name="paramperiksa_satuan")
	private String paramperiksa_satuan;
	
	@Column(name="paramperiksa_standar")
	private String paramperiksa_standar;
	
	@Column(name="paramperiksa_label")
	private String paramperiksa_label;

	@Column(name="paramperiksa_group")
	private String paramperiksa_group;

	@Column(name="paramperiksa_keterangan")
	private String paramperiksa_keterangan;

	@Column(name="paramperiksa_unit_id")
	private Integer paramperiksa_unit_id;

	@Column(name="paramperiksa_aktif")
	private String paramperiksa_aktif;

	@Column(name="paramperiksa_created_by")
	private String paramperiksa_created_by;

	@Column(name="paramperiksa_created_date")
	private Timestamp paramperiksa_created_date;

	@Column(name="paramperiksa_updated_by")
	private String paramperiksa_updated_by;

	@Column(name="paramperiksa_updated_date")
	private Timestamp paramperiksa_updated_date;

	@Column(name="paramperiksa_revised")
	private int paramperiksa_revised;

	@Column(name="paramperiksa_metode")
	private String paramperiksa_metode;

	@Column(name="paramperiksa_urut")
	private int paramperiksa_urut;

	@Column(name="paramperiksa_indent")
	private int paramperiksa_indent;

	@ManyToOne
	private MPenunjang penunjang;

	public Integer getParamperiksa_id() {
		return paramperiksa_id;
	}

	public void setParamperiksa_id(Integer paramperiksa_id) {
		this.paramperiksa_id = paramperiksa_id;
	}

	public String getParamperiksa_kode() {
		return paramperiksa_kode;
	}

	public void setParamperiksa_kode(String paramperiksa_kode) {
		this.paramperiksa_kode = paramperiksa_kode;
	}

	public String getParamperiksa_nama() {
		return paramperiksa_nama;
	}

	public void setParamperiksa_nama(String paramperiksa_nama) {
		this.paramperiksa_nama = paramperiksa_nama;
	}

	public String getParamperiksa_satuan() {
		return paramperiksa_satuan;
	}

	public void setParamperiksa_satuan(String paramperiksa_satuan) {
		this.paramperiksa_satuan = paramperiksa_satuan;
	}

	public String getParamperiksa_standar() {
		return paramperiksa_standar;
	}

	public void setParamperiksa_standar(String paramperiksa_standar) {
		this.paramperiksa_standar = paramperiksa_standar;
	}

	public String getParamperiksa_label() {
		return paramperiksa_label;
	}

	public void setParamperiksa_label(String paramperiksa_label) {
		this.paramperiksa_label = paramperiksa_label;
	}

	public String getParamperiksa_group() {
		return paramperiksa_group;
	}

	public void setParamperiksa_group(String paramperiksa_group) {
		this.paramperiksa_group = paramperiksa_group;
	}

	public String getParamperiksa_keterangan() {
		return paramperiksa_keterangan;
	}

	public void setParamperiksa_keterangan(String paramperiksa_keterangan) {
		this.paramperiksa_keterangan = paramperiksa_keterangan;
	}

	public Integer getParamperiksa_unit_id() {
		return paramperiksa_unit_id;
	}

	public void setParamperiksa_unit_id(Integer paramperiksa_unit_id) {
		this.paramperiksa_unit_id = paramperiksa_unit_id;
	}

	public String getParamperiksa_aktif() {
		return paramperiksa_aktif;
	}

	public void setParamperiksa_aktif(String paramperiksa_aktif) {
		this.paramperiksa_aktif = paramperiksa_aktif;
	}

	public String getParamperiksa_created_by() {
		return paramperiksa_created_by;
	}

	public void setParamperiksa_created_by(String paramperiksa_created_by) {
		this.paramperiksa_created_by = paramperiksa_created_by;
	}

	public Timestamp getParamperiksa_created_date() {
		return paramperiksa_created_date;
	}

	public void setParamperiksa_created_date(Timestamp paramperiksa_created_date) {
		this.paramperiksa_created_date = paramperiksa_created_date;
	}

	public String getParamperiksa_updated_by() {
		return paramperiksa_updated_by;
	}

	public void setParamperiksa_updated_by(String paramperiksa_updated_by) {
		this.paramperiksa_updated_by = paramperiksa_updated_by;
	}

	public Timestamp getParamperiksa_updated_date() {
		return paramperiksa_updated_date;
	}

	public void setParamperiksa_updated_date(Timestamp paramperiksa_updated_date) {
		this.paramperiksa_updated_date = paramperiksa_updated_date;
	}

	public int getParamperiksa_revised() {
		return paramperiksa_revised;
	}

	public void setParamperiksa_revised(int paramperiksa_revised) {
		this.paramperiksa_revised = paramperiksa_revised;
	}

	public String getParamperiksa_metode() {
		return paramperiksa_metode;
	}

	public void setParamperiksa_metode(String paramperiksa_metode) {
		this.paramperiksa_metode = paramperiksa_metode;
	}

	public int getParamperiksa_urut() {
		return paramperiksa_urut;
	}

	public void setParamperiksa_urut(int paramperiksa_urut) {
		this.paramperiksa_urut = paramperiksa_urut;
	}

	public int getParamperiksa_indent() {
		return paramperiksa_indent;
	}

	public void setParamperiksa_indent(int paramperiksa_indent) {
		this.paramperiksa_indent = paramperiksa_indent;
	}

	public MPenunjang getPenunjang() {
		return penunjang;
	}

	public void setPenunjang(MPenunjang penunjang) {
		this.penunjang = penunjang;
	}

}