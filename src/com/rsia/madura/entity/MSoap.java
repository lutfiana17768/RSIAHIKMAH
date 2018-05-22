/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-22 07:08:49
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-22 14:19:41
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
@Table(name="t_soap")
public class MSoap {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "soap_id")
	private int soap_id;
	
	@Column(name = "m_pasien_id")
	private Integer m_pasien_id;
	
	@Column(name = "soap_tanggal")
	private Date soap_tanggal;
	
	@Column(name = "soap_dokter")
	private Integer soap_dokter;
	
	@Column(name = "soap_subject")
	private String soap_subject;
	
	@Column(name = "soap_object")
	private String soap_object;
	
	@Column(name = "soap_assesment")
	private String soap_assesment;
	
	@Column(name = "soap_plan")
	private String soap_plan;
	
	@Column(name = "soap_created_by")
	private String soap_created_by;
	
	@Column(name = "soap_created_date")
	private Timestamp soap_created_date;
	
	@Column(name = "soap_updated_by")
	private String soap_updated_by;
	
	@Column(name = "soap_updated_date")
	private Timestamp soap_updated_date;
	
	@Column(name = "soap_revised")
	private Integer soap_revised;
	
	@Column(name = "t_pendaftaran_id")
	private Integer t_pendaftaran_id;
	
	@Column(name = "m_bed_id")
	private Integer m_bed_id;
	
	@Column(name = "soap_m_pasien_norm")
	private String soap_m_pasien_norm;
	
	@Column(name = "soap_kamarpasien_id")
	private Integer soap_kamarpasien_id;
	
	@Column(name = "soap_aktif")
	private String soap_aktif;
	
	@Column(name = "reg_company_id")
	private Integer reg_company_id;
	
	@Column(name = "reg_apps_id")
	private Integer reg_apps_id;

	@ManyToOne
	private MPendaftaran pendaftaran;

	public int getSoap_id() {
		return soap_id;
	}

	public void setSoap_id(int soap_id){
		this.soap_id = soap_id;
	}

	public Integer getM_pasien_id() {
		return m_pasien_id;
	}

	public void setM_pasien_id(Integer m_pasien_id){
		this.m_pasien_id = m_pasien_id;
	}

	public Date getSoap_tanggal() {
		return soap_tanggal;
	}

	public void setSoap_tanggal(Date soap_tanggal){
		this.soap_tanggal = soap_tanggal;
	}

	public Integer getSoap_dokter() {
		return soap_dokter;
	}

	public void setSoap_dokter(Integer soap_dokter){
		this.soap_dokter = soap_dokter;
	}

	public String getSoap_subject() {
		return soap_subject;
	}

	public void setSoap_subject(String soap_subject){
		this.soap_subject = soap_subject;
	}

	public String getSoap_object() {
		return soap_object;
	}

	public void setSoap_object(String soap_object){
		this.soap_object = soap_object;
	}

	public String getSoap_assesment() {
		return soap_assesment;
	}

	public void setSoap_assesment(String soap_assesment){
		this.soap_assesment = soap_assesment;
	}

	public String getSoap_plan() {
		return soap_plan;
	}

	public void setSoap_plan(String soap_plan){
		this.soap_plan = soap_plan;
	}

	public String getSoap_created_by() {
		return soap_created_by;
	}

	public void setSoap_created_by(String soap_created_by){
		this.soap_created_by = soap_created_by;
	}

	public Timestamp getSoap_created_date() {
		return soap_created_date;
	}

	public void setSoap_created_date(Timestamp soap_created_date){
		this.soap_created_date = soap_created_date;
	}

	public String getSoap_updated_by() {
		return soap_updated_by;
	}

	public void setSoap_updated_by(String soap_updated_by){
		this.soap_updated_by = soap_updated_by;
	}

	public Timestamp getSoap_updated_date() {
		return soap_updated_date;
	}

	public void setSoap_updated_date(Timestamp soap_updated_date){
		this.soap_updated_date = soap_updated_date;
	}

	public Integer getSoap_revised() {
		return soap_revised;
	}

	public void setSoap_revised(Integer soap_revised){
		this.soap_revised = soap_revised;
	}

	public Integer getT_pendaftaran_id() {
		return t_pendaftaran_id;
	}

	public void setT_pendaftaran_id(Integer t_pendaftaran_id){
		this.t_pendaftaran_id = t_pendaftaran_id;
	}

	public Integer getM_bed_id() {
		return m_bed_id;
	}

	public void setM_bed_id(Integer m_bed_id){
		this.m_bed_id = m_bed_id;
	}

	public String getSoap_m_pasien_norm() {
		return soap_m_pasien_norm;
	}

	public void setSoap_m_pasien_norm(String soap_m_pasien_norm){
		this.soap_m_pasien_norm = soap_m_pasien_norm;
	}

	public Integer getSoap_kamarpasien_id() {
		return soap_kamarpasien_id;
	}

	public void setSoap_kamarpasien_id(Integer soap_kamarpasien_id){
		this.soap_kamarpasien_id = soap_kamarpasien_id;
	}

	public String getSoap_aktif() {
		return soap_aktif;
	}

	public void setSoap_aktif(String soap_aktif){
		this.soap_aktif = soap_aktif;
	}

	public Integer getReg_company_id() {
		return reg_company_id;
	}

	public void setReg_company_id(Integer reg_company_id){
		this.reg_company_id = reg_company_id;
	}

	public Integer getReg_apps_id() {
		return reg_apps_id;
	}

	public void setReg_apps_id(Integer reg_apps_id){
		this.reg_apps_id = reg_apps_id;
	}

	public MPendaftaran getPendaftaran() {
		return pendaftaran;
	}

	public void setPendaftaran(MPendaftaran pendaftaran) {
		this.pendaftaran = pendaftaran;
	}

}