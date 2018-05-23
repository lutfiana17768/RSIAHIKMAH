/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-22 15:20:14
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-23 14:38:57
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
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.LazyCollection;

@Entity
@Table(name="t_pakai")
public class MPakai {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pakai_id")
	private int pakai_id;

	@Column(name="pakai_satuan")
	private String pakai_satuan;

	@Column(name="pakai_jumlah")
	private Integer pakai_jumlah;
	
	@Column(name="pakai_harga")
	private Integer pakai_harga;
	
	@Column(name="pakai_keterangan")
	private String pakai_keterangan;

	@Column(name="pakai_created_by")
	private String pakai_created_by;
	
	@Column(name="pakai_created_date")
	private Timestamp pakai_created_date;
	
	@Column(name="pakai_updated_by")
	private String pakai_updated_by;
	
	@Column(name="pakai_updated_date")
	private Timestamp pakai_updated_date;
	
	@Column(name="pakai_revised")
	private int pakai_revised;
	
	@Column(name="pakai_deleted_by")
	private String pakai_deleted_by;
	
	@Column(name="pakai_deleted_date")
	private Timestamp pakai_deleted_date;

	@ManyToOne
	private MBarang barang;

	@ManyToOne
	private MPendaftaran pendaftaran;

	public int getPakai_id() {
		return pakai_id;
	}

	public void setPakai_id(int pakai_id) {
		this.pakai_id = pakai_id;
	}

	public String getPakai_satuan() {
		return pakai_satuan;
	}

	public void setPakai_satuan(String pakai_satuan) {
		this.pakai_satuan = pakai_satuan;
	}

	public Integer getPakai_jumlah() {
		return pakai_jumlah;
	}

	public void setPakai_jumlah(Integer pakai_jumlah) {
		this.pakai_jumlah = pakai_jumlah;
	}

	public Integer getPakai_harga() {
		return pakai_harga;
	}

	public void setPakai_harga(Integer pakai_harga) {
		this.pakai_harga = pakai_harga;
	}

	public String getPakai_keterangan() {
		return pakai_keterangan;
	}

	public void setPakai_keterangan(String pakai_keterangan) {
		this.pakai_keterangan = pakai_keterangan;
	}

	public String getPakai_created_by() {
		return pakai_created_by;
	}

	public void setPakai_created_by(String pakai_created_by) {
		this.pakai_created_by = pakai_created_by;
	}

	public Timestamp getPakai_created_date() {
		return pakai_created_date;
	}

	public void setPakai_created_date(Timestamp pakai_created_date) {
		this.pakai_created_date = pakai_created_date;
	}

	public String getPakai_updated_by() {
		return pakai_updated_by;
	}

	public void setPakai_updated_by(String pakai_updated_by) {
		this.pakai_updated_by = pakai_updated_by;
	}

	public Timestamp getPakai_updated_date() {
		return pakai_updated_date;
	}

	public void setPakai_updated_date(Timestamp pakai_updated_date) {
		this.pakai_updated_date = pakai_updated_date;
	}

	public Integer getPakai_revised() {
		return pakai_revised;
	}

	public void setPakai_revised(Integer pakai_revised) {
		this.pakai_revised = pakai_revised;
	}

	public MBarang getBarang() {
		return barang;
	}

	public void setBarang(MBarang barang) {
		this.barang = barang;
	}

	public MPendaftaran getPendaftaran() {
		return pendaftaran;
	}

	public void setPendaftaran(MPendaftaran pendaftaran) {
		this.pendaftaran = pendaftaran;
	}

}