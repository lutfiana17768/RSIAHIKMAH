/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-12 15:40:22
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-12 17:14:43
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
@Table(name="m_penunjangmedis_group")
public class MPenunjangGroup {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pmedisgroup_id")
	private int pmedisgroup_id;
	
	@Column(name="pmedisgroup_master")
	private String pmedisgroup_master;
	
	@Column(name="pmedisgroup_detail")
	private String pmedisgroup_detail;
	
	@Column(name="pmedisgroup_urut")
	private Integer pmedisgroup_urut;
	
	@Column(name="reg_company_id ")
	private Integer reg_company_id ;
	
	@Column(name="reg_apps_id ")
	private Integer reg_apps_id ;
	
	public int getPmedisgroup_id() {
		return this.pmedisgroup_id;
	}

	public void setPmedisgroup_id(int pmedisgroup_id) {
		this.pmedisgroup_id = pmedisgroup_id;
	}

	public String getPmedisgroup_master() {
		return this.pmedisgroup_master;
	}

	public void setPmedisgroup_master(String pmedisgroup_master) {
		this.pmedisgroup_master = pmedisgroup_master;
	}

	public String getPmedisgroup_detail() {
		return this.pmedisgroup_detail;
	}

	public void setPmedisgroup_detail(String pmedisgroup_detail) {
		this.pmedisgroup_detail = pmedisgroup_detail;
	}

	public Integer getPmedisgroup_urut() {
		return this.pmedisgroup_urut;
	}

	public void setPmedisgroup_urut(Integer pmedisgroup_urut) {
		this.pmedisgroup_urut = pmedisgroup_urut;
	}

	public Integer getRegCompany_id() {
		return this.reg_company_id;
	}

	public void setRegCompany_id(Integer reg_company_id) {
		this.reg_company_id = reg_company_id;
	}

	public Integer getRegApps_id() {
		return this.reg_apps_id;
	}

	public void setRegApps_id(Integer reg_apps_id) {
		this.reg_apps_id = reg_apps_id;
	}
}