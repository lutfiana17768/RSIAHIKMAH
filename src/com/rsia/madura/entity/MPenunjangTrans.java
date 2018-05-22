/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-22 16:01:27
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-22 16:16:00
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
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.LazyCollection;

@Entity
@Table(name="t_penunjang")
public class MPenunjangTrans {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="penunjangtrans_id")
	private int penunjangtrans_id;

	@Column(name="penunjangtrans_hasil")
	private Integer penunjangtrans_hasil;

	@Column(name="penunjangtrans_jumlah")
	private Integer penunjangtrans_jumlah;
	
	@ManyToOne
	private MPenunjang penunjang;	

	@ManyToOne
	private MPendaftaran pendaftaran;

	public int getPenunjangtrans_id() {
		return penunjangtrans_id;
	}

	public void setPenunjangtrans_id(int penunjangtrans_id) {
		this.penunjangtrans_id = penunjangtrans_id;
	}

	public Integer getPenunjangtrans_hasil() {
		return penunjangtrans_hasil;
	}

	public void setPenunjangtrans_hasil(Integer penunjangtrans_hasil) {
		this.penunjangtrans_hasil = penunjangtrans_hasil;
	}

	public Integer getPenunjangtrans_jumlah() {
		return penunjangtrans_jumlah;
	}

	public void setPenunjangtrans_jumlah(Integer penunjangtrans_jumlah) {
		this.penunjangtrans_jumlah = penunjangtrans_jumlah;
	}

	public MPenunjang getPenunjang() {
		return penunjang;
	}

	public void setPenunjang(MPenunjang penunjang) {
		this.penunjang = penunjang;
	}

	public MPendaftaran getPendaftaran() {
		return pendaftaran;
	}

	public void setPendaftaran(MPendaftaran pendaftaran) {
		this.pendaftaran = pendaftaran;
	}
}