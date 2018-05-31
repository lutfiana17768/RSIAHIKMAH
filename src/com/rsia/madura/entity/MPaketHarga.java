/*
* @Author: PRADESGA
* @Date:   2018-04-07 01:44:50
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-16 11:56:02
*/
package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.*;
@Entity
@Table(name="m_paket_harga")
public class MPaketHarga {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "paketharga_id")
	private Integer paketHargaID;

	@Column(name = "paketharga_harga")
	private int paketHargaHarga;

	@Column(name = "paketharga_nama")
	private String paketHargaNama;

	@Column(name = "paketharga_type")
	private String paketHargaType;

	@Column(name = "paketharga_jumlah")
	private int paketHargaJumlah;

	@Column(name = "paketharga_total")
	private int paketHargaTotal;

	@Column(name="paketharga_created_by")
	private String paketHargaCreatedBy;

	@Column(name = "paketharga_created_date")
	private Timestamp paketHargaCreatedDate;
	
	@Column(name = "paketharga_updated_by")
	private String paketHargaUpdatedBy;
	  
	@Column(name = "paketharga_updated_date")
	private Timestamp paketHargaUpdatedDate;

	@Column(name="paketharga_deleted_date")
	private Timestamp paketHargaDeletedDate;

	@Column(name="paketharga_deleted_by")
	private String paketHargaDeletedBy;

	@ManyToOne
	private MPaket paket;

	@ManyToOne
	private MRuang ruangs;

	@ManyToOne
	private MTindakan tindakans;

	@ManyToOne
	private MPenunjang penunjangs;
	
	@ManyToOne
	private MObat obats;

	public MPaketHarga() {

	}

	public Integer getPaketHargaID() {
		return paketHargaID;
	}

	public void setPaketHargaID(Integer paketHargaID) {
		this.paketHargaID = paketHargaID;
	}

	public int getPaketHargaHarga() {
		return paketHargaHarga;
	}

	public void setPaketHargaHarga(int paketHargaHarga) {
		this.paketHargaHarga = paketHargaHarga;
	}

	public String getPaketHargaNama() {
		return paketHargaNama;
	}

	public void setPaketHargaNama(String paketHargaNama) {
		this.paketHargaNama = paketHargaNama;
	}

	public String getPaketHargaType() {
		return paketHargaType;
	}

	public void setPaketHargaType(String paketHargaType) {
		this.paketHargaType = paketHargaType;
	}

	public int getPaketHargaJumlah() {
		return paketHargaJumlah;
	}

	public void setPaketHargaJumlah(int paketHargaJumlah) {
		this.paketHargaJumlah = paketHargaJumlah;
	}

	public int getPaketHargaTotal() {
		return paketHargaTotal;
	}

	public void setPaketHargaTotal(int paketHargaTotal) {
		this.paketHargaTotal = paketHargaTotal;
	}

	public String getPaketHargaCreatedBy() {
		return paketHargaCreatedBy;
	}

	public void setPaketHargaCreatedBy(String paketHargaCreatedBy) {
		this.paketHargaCreatedBy = paketHargaCreatedBy;
	}

	public Timestamp getPaketHargaCreatedDate() {
		return paketHargaCreatedDate;
	}

	public void setPaketHargaCreatedDate(Timestamp paketHargaCreatedDate) {
		this.paketHargaCreatedDate = paketHargaCreatedDate;
	}

	public String getPaketHargaUpdatedBy() {
		return paketHargaUpdatedBy;
	}

	public void setPaketHargaUpdatedBy(String paketHargaUpdatedBy) {
		this.paketHargaUpdatedBy = paketHargaUpdatedBy;
	}

	public Timestamp getPaketHargaUpdatedDate() {
		return paketHargaUpdatedDate;
	}

	public void setPaketHargaUpdatedDate(Timestamp paketHargaUpdatedDate) {
		this.paketHargaUpdatedDate = paketHargaUpdatedDate;
	}

	public String getPaketHargaDeletedBy() {
		return paketHargaDeletedBy;
	}

	public void setPaketHargaDeletedBy(String paketHargaDeletedBy) {
		this.paketHargaDeletedBy = paketHargaDeletedBy;
	}

	public Timestamp getPaketHargaDeletedDate() {
		return paketHargaDeletedDate;
	}

	public void setPaketHargaDeletedDate(Timestamp paketHargaDeletedDate) {
		this.paketHargaDeletedDate = paketHargaDeletedDate;
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

	public MPenunjang getPenunjangs() {
		return this.penunjangs;
	}

	public void setPenunjangs(MPenunjang penunjangs) {
		this.penunjangs = penunjangs;
	}

	@Override
	public String toString() {
		return "mPaketHarga [paketHargaID=" + paketHargaID + ", paketHargaHarga=" + paketHargaHarga +", paketHargaTotal=" + paketHargaTotal + "]";
	}
}