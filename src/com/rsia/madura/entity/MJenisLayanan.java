/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-19 14:06:32
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-19 15:30:45
*/
package com.rsia.madura.entity;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
@Table(name="m_jenislayanan")
public class MJenisLayanan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name= "jenislayanan_id")
	private int jenislayanan_id;
	
	@Column(name= "jenislayanan_nomor")
	private String jenislayanan_nomor;
	
	@Column(name= "jenislayanan_nama")
	private String jenislayanan_nama;
	
	@Column(name= "jenislayanan_kategori")
	private String jenislayanan_kategori;
	
	@Column(name= "jenislayanan_aktif")
	private String jenislayanan_aktif;
	
	@Column(name= "jenislayanan_created_by")
	private String jenislayanan_created_by;
	
	@Column(name= "jenislayanan_created_date")
	private Timestamp jenislayanan_created_date;
	
	@Column(name= "jenislayanan_updated_by")
	private String jenislayanan_updated_by;
	
	@Column(name= "jenislayanan_updated_date")
	private Timestamp jenislayanan_updated_date;
	
	@Column(name= "jenislayanan_revised")
	private Integer jenislayanan_revised;
	
	@Column(name= "reg_company_id")
	private Integer reg_company_id;
	
	@Column(name= "reg_apps_id")
	private Integer reg_apps_id;

    @ManyToMany(mappedBy = "jenislayanans")
    private Set<MPenunjang> penunjangs = new HashSet<>();

	public int getJenislayanan_id() {
		return jenislayanan_id;
	}

	public void setJenislayanan_id(int jenislayanan_id) {
		this.jenislayanan_id = jenislayanan_id;
	}

	public String getJenislayanan_nomor() {
		return jenislayanan_nomor;
	}

	public void setJenislayanan_nomor(String jenislayanan_nomor) {
		this.jenislayanan_nomor = jenislayanan_nomor;
	}

	public String getJenislayanan_nama() {
		return jenislayanan_nama;
	}

	public void setJenislayanan_nama(String jenislayanan_nama) {
		this.jenislayanan_nama = jenislayanan_nama;
	}

	public String getJenislayanan_kategori() {
		return jenislayanan_kategori;
	}

	public void setJenislayanan_kategori(String jenislayanan_kategori) {
		this.jenislayanan_kategori = jenislayanan_kategori;
	}

	public String getJenislayanan_aktif() {
		return jenislayanan_aktif;
	}

	public void setJenislayanan_aktif(String jenislayanan_aktif) {
		this.jenislayanan_aktif = jenislayanan_aktif;
	}

	public String getJenislayanan_created_by() {
		return jenislayanan_created_by;
	}

	public void setJenislayanan_created_by(String jenislayanan_created_by) {
		this.jenislayanan_created_by = jenislayanan_created_by;
	}

	public Timestamp getJenislayanan_created_date() {
		return jenislayanan_created_date;
	}

	public void setJenislayanan_created_date(Timestamp jenislayanan_created_date) {
		this.jenislayanan_created_date = jenislayanan_created_date;
	}

	public String getJenislayanan_updated_by() {
		return jenislayanan_updated_by;
	}

	public void setJenislayanan_updated_by(String jenislayanan_updated_by) {
		this.jenislayanan_updated_by = jenislayanan_updated_by;
	}

	public Timestamp getJenislayanan_updated_date() {
		return jenislayanan_updated_date;
	}

	public void setJenislayanan_updated_date(Timestamp jenislayanan_updated_date) {
		this.jenislayanan_updated_date = jenislayanan_updated_date;
	}

	public Integer getJenislayanan_revised() {
		return jenislayanan_revised;
	}

	public void setJenislayanan_revised(Integer jenislayanan_revised) {
		this.jenislayanan_revised = jenislayanan_revised;
	}

	public Integer getReg_company_id() {
		return reg_company_id;
	}

	public void setReg_company_id(Integer reg_company_id) {
		this.reg_company_id = reg_company_id;
	}

	public Integer geRJeg_apps_id() {
		return reg_apps_id;
	}

	public void setReg_apps_id(Integer reg_apps_id) {
		this.reg_apps_id = reg_apps_id;
	}

	public Set<MPenunjang> getPenunjangs() {
		return penunjangs;
	}

	public void setPenunjangs(Set<MPenunjang> penunjangs) {
		this.penunjangs = penunjangs;
	}
}