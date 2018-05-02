/*
* @Author: PRADESGA
* @Date:   2018-04-07 01:44:50
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-07 05:12:01
*/
package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.*;
@Entity
@Table(name="m_paketHarga")
public class MPaketHarga {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "paketharga_id")
	private Integer paketHarga_id;

	@Column(name = "paketharga_harga")
	private int paketHarga_harga;

	@Column(name = "paketharga_nama")
	private String paketHarga_nama;

	@Column(name = "paketharga_type")
	private String paketHarga_type;

	@Column(name = "paketharga_jumlah")
	private int paketHarga_jumlah;

	@Column(name = "paketharga_total")
	private int paketHarga_total;

	@Column(name="paketharga_created_by")
	private String paketHarga_created_by;

	@Column(name = "paketharga_created_date")
	private Timestamp paketHarga_created_date;
	
	@Column(name = "paketharga_updated_by")
	private String paketHarga_updated_by;
	  
	@Column(name = "paketharga_updated_date")
	private Timestamp paketHarga_updated_date;

	@Column(name="paketharga_deleted_date")
	private Timestamp paketHarga_deleted_date;

	@Column(name="paketharga_deleted_by")
	private String paketHarga_deleted_by;

	@ManyToOne
	private MPaket paket;

	@ManyToOne
	private MRuang ruangs;

	@ManyToOne
	private MTindakan tindakans;

	// penunjang belum ada
	// @ManyToOne
	// private MPenunjang penunjangs;
	
	@ManyToOne
	private MObat obats;

	public MPaketHarga() {

	}

	public Integer getPaketHarga_id() {
		return paketHarga_id;
	}

	public void setPaketHarga_id(Integer paketHarga_id) {
		this.paketHarga_id = paketHarga_id;
	}

	public int getPaketHarga_harga() {
		return paketHarga_harga;
	}

	public void setPaketHarga_harga(int paketHarga_harga) {
		this.paketHarga_harga = paketHarga_harga;
	}

	public String getPaketHarga_nama() {
		return paketHarga_nama;
	}

	public void setPaketHarga_nama(String paketHarga_nama) {
		this.paketHarga_nama = paketHarga_nama;
	}

	public String getPaketHarga_type() {
		return paketHarga_type;
	}

	public void setPaketHarga_type(String paketHarga_type) {
		this.paketHarga_type = paketHarga_type;
	}

	public int getPaketHarga_jumlah() {
		return paketHarga_jumlah;
	}

	public void setPaketHarga_jumlah(int paketHarga_jumlah) {
		this.paketHarga_jumlah = paketHarga_jumlah;
	}

	public int getPaketHarga_total() {
		return paketHarga_total;
	}

	public void setPaketHarga_total(int paketHarga_total) {
		this.paketHarga_total = paketHarga_total;
	}

	public String getPaketHarga_created_by() {
		return paketHarga_created_by;
	}

	public void setPaketHarga_created_by(String paketHarga_created_by) {
		this.paketHarga_created_by = paketHarga_created_by;
	}

	public Timestamp getPaketHarga_created_date() {
		return paketHarga_created_date;
	}

	public void setPaketHarga_created_date(Timestamp paketHarga_created_date) {
		this.paketHarga_created_date = paketHarga_created_date;
	}

	public String getPaketHarga_updated_by() {
		return paketHarga_updated_by;
	}

	public void setPaketHarga_updated_by(String paketHarga_updated_by) {
		this.paketHarga_updated_by = paketHarga_updated_by;
	}

	public Timestamp getPaketHarga_updated_date() {
		return paketHarga_updated_date;
	}

	public void setPaketHarga_updated_date(Timestamp paketHarga_updated_date) {
		this.paketHarga_updated_date = paketHarga_updated_date;
	}

	public String getPaketHarga_deleted_by() {
		return paketHarga_deleted_by;
	}

	public void setPaketHarga_deleted_by(String paketHarga_deleted_by) {
		this.paketHarga_deleted_by = paketHarga_deleted_by;
	}

	public Timestamp getPaketHarga_deleted_date() {
		return paketHarga_deleted_date;
	}

	public void setPaketHarga_deleted_date(Timestamp paketHarga_deleted_date) {
		this.paketHarga_deleted_date = paketHarga_deleted_date;
	}

	public MRuang getRuangs() {
		return this.ruangs;
	}

	public void setRuangs(MRuang ruangs) {
		this.ruangs = ruangs;
	}

	public MTindakan getTindakans() {
		return this.tindakans;
	}

	public void setTindakans(MTindakan tindakans) {
		this.tindakans = tindakans;
	}
	
	public MPaket getPaket() {
		return paket;
	}

	public void setPaket(MPaket paket) {
		this.paket = paket;
	}

	public MObat getObats() {
		return this.obats;
	}

	public void setObats(MObat obats) {
		this.obats = obats;
	}

	// public MPenunjang getPenunjang() {
	// 	return this.penunjangs;
	// }

	// public void setPenunjang(MPenunjang penunjangs) {
	// 	this.penunjangs = penunjangs;
	// }

	@Override
	public String toString() {
		return "m_paketHarga [paketHarga_id=" + paketHarga_id + ", paketHarga_harga=" + paketHarga_harga +", paketHarga_total=" + paketHarga_total + "]";
	}
}