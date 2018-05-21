/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-18 13:31:14
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-19 13:13:41
*/
package com.rsia.madura.entity;

import java.sql.Timestamp;
import java.util.List;

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

@Entity
@Table(name="m_penunjang_kelas")
public class MPenunjangKelas {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="penunjangkelas_id")
	private int penunjangkelas_id;

	@ManyToOne
	private MPenunjang penunjang;

	@ManyToOne
	private MKelas kelases;

	@Column(name="penunjangkelas_harga")
	private Double penunjangkelas_harga;

	public int getPenunjangkelas_id() {
		return penunjangkelas_id;
	}

	public void setPenunjangkelas_id(int penunjangkelas_id) {
		this.penunjangkelas_id = penunjangkelas_id;
	}
	public MPenunjang getPenunjang() {
		return penunjang;
	}

	public void setPenunjang(MPenunjang penunjang) {
		this.penunjang = penunjang;
	}

	public MKelas getKelases() {
		return kelases;
	}

	public void setKelases(MKelas kelases) {
		this.kelases = kelases;
	}

	public Double getPenunjangkelas_harga() {
		return penunjangkelas_harga;
	}

	public void setPenunjangkelas_harga(Double penunjangkelas_harga) {
		this.penunjangkelas_harga = penunjangkelas_harga;
	}

}