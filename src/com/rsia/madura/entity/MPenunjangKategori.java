/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-23 13:33:39
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-23 13:40:51
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
@Table(name="m_penunjang_kategori")
public class MPenunjangKategori {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="penunjangkategori_id")
	private int penunjangkategori_id;

	@ManyToOne
	private MPenunjang penunjang;

	@ManyToOne
	private MJenisLayanan jenislayanan;

	public int getPenunjangkategori_id() {
		return penunjangkategori_id;
	}

	public void setPenunjangkategori_id(int penunjangkategori_id) {
		this.penunjangkategori_id = penunjangkategori_id;
	}

	public MPenunjang getPenunjang() {
		return penunjang;
	}
	public void setPenunjang(MPenunjang penunjang) {
		this.penunjang = penunjang;
	}

	public MJenisLayanan getJenislayanan() {
		return jenislayanan;
	}
	public void setJenislayanan(MJenisLayanan jenislayanan) {
		this.jenislayanan = jenislayanan;
	}

}