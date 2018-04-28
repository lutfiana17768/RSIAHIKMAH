/*
* @Author: PRADESGA
* @Date:   2018-04-07 01:44:50
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-10 11:31:43
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
@Table(name="m_paket")
public class MPaket {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="paket_id")
	private int paket_id;
	
	@Column(name="paket_nama")
	private String paket_nama;
	
	@Column(name="paket_keterangan")
	private String paket_keterangan;
	
	@Column(name="paket_harga")
	private int paket_harga;
	
	@Column(name="paket_aktif")
	private String paket_aktif;

	@Column(name="paket_created_by")
	private String paket_created_by;
	
	@Column(name="paket_created_date")
	private Timestamp paket_created_date;
	
	@Column(name="paket_updated_by")
	private String paket_updated_by;
	  
	@Column(name="paket_updated_date")
	private Timestamp paket_updated_date;
	
	@Column(name="paket_jenis")
	private String paket_jenis;
	
	@Column(name="paket_revised")
	private int paket_revised;
	  
	@Column(name="paket_deleted_date")
	private Timestamp paket_deleted_date;

	@Column(name="paket_deleted_by")
	private String paket_deleted_by;

	@ManyToOne
	private MKelas kelas;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "paket", cascade = CascadeType.ALL)
	private List<MPaketHarga> paketHarga;

	public MPaket() {

	}

	public int getPaket_id() {
		return paket_id;
	}

	public void setPaket_id(int paket_id) {
		this.paket_id = paket_id;
	}

	public String getPaket_nama() {
		return paket_nama;
	}

	public void setPaket_nama(String paket_nama) {
		this.paket_nama = paket_nama;
	}

	public String getPaket_keterangan() {
		return paket_keterangan;
	}

	public void setPaket_keterangan(String paket_keterangan) {
		this.paket_keterangan = paket_keterangan;
	}

	public int getPaket_harga() {
		return paket_harga;
	}

	public void setPaket_harga(int paket_harga) {
		this.paket_harga = paket_harga;
	}

	public String getPaket_aktif() {
		return paket_aktif;
	}

	public void setPaket_aktif(String paket_aktif) {
		this.paket_aktif = paket_aktif;
	}

	public String getPaket_created_by() {
		return paket_created_by;
	}

	public void setPaket_created_by(String paket_created_by) {
		this.paket_created_by = paket_created_by;
	}

	public Timestamp getPaket_created_date() {
		return paket_created_date;
	}

	public void setPaket_created_date(Timestamp paket_created_date) {
		this.paket_created_date = paket_created_date;
	}

	public String getPaket_updated_by() {
		return paket_updated_by;
	}

	public void setPaket_updated_by(String paket_updated_by) {
		this.paket_updated_by = paket_updated_by;
	}

	public Timestamp getPaket_updated_date() {
		return paket_updated_date;
	}

	public void setPaket_updated_date(Timestamp paket_updated_date) {
		this.paket_updated_date = paket_updated_date;
	}

	public String getPaket_jenis() {
		return paket_jenis;
	}

	public void setPaket_jenis(String paket_jenis) {
		this.paket_jenis = paket_jenis;
	}

	public int getPaket_revised() {
		return paket_revised;
	}

	public void setPaket_revised(int paket_revised) {
		this.paket_revised = paket_revised;
	}

	public Timestamp getPaket_deleted_date() {
		return paket_deleted_date;
	}

	public void setPaket_deleted_date(Timestamp paket_deleted_date) {
		this.paket_deleted_date = paket_deleted_date;
	}

	public String getPaket_deleted_by() {
		return paket_deleted_by;
	}

	public void setPaket_deleted_by(String paket_deleted_by) {
		this.paket_deleted_by = paket_deleted_by;
	}

	public MKelas getKelas() {
		return this.kelas;
	}

	public void setKelas(MKelas kelas) {
		this.kelas = kelas;
	}

	public List<MPaketHarga> getPaketHarga() {
		return paketHarga;
	}

	public void setPaketHarga(List<MPaketHarga> paketHarga) {
		this.paketHarga = paketHarga;
	}

	@Override
	public String toString() {
		return "m_paket [order_id=" + paket_id + ", paket_nama=" + paket_nama + ", paketHarga=" + paketHarga + ", kelases=" + kelas +"]";
	}
}