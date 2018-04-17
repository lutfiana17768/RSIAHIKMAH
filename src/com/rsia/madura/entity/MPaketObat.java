/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:07:50 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:07:50 
 */
package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "m_paket_obat")
public class MPaketObat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "paket_barang_id")
	private int paket_barang_id;

	@Column(name = "paket_nama")
	private int paket_nama;

	@Column(name = "m_paket_id")
	private int m_paket_id;

	@Column(name = "m_obat_id")
	private int m_obat_id;

	@Column(name = "m_kelas_id")
	private int m_kelas_id;

	@Column(name = "paket_barang_jumlah")
	private int paket_barang_jumlah;

	@Column(name = "paket_barang_created_by")
	private String paket_barang_created_by;

	@Column(name = "paket_barang_created_date")
	private Timestamp paket_barang_created_date;

	@Column(name = "paket_barang_updated_by")
	private String paket_barang_updated_by;

	@Column(name = "paket_barang_updated_date")
	private Timestamp paket_barang_updated_date;

	@Column(name = "paket_barang_revised")
	private int paket_barang_revised;

	@Column(name = "paket_barang_harga")
	private int paket_barang_harga;

	@Column(name = "paket_barang_aktif")
	private String paket_barang_aktif;

	@Column(name = "paket_satuan_id")
	private int paket_satuan_id;

	@Column(name = "pakeobat_deleted_date")
	private Timestamp pakeobat_deleted_date;

	public int getPaket_nama() {
		return paket_nama;
	}

	public void setPaket_nama(int paket_nama) {
		this.paket_nama = paket_nama;
	}

	public int getPaket_barang_id() {
		return paket_barang_id;
	}

	public void setPaket_barang_id(int paket_barang_id) {
		this.paket_barang_id = paket_barang_id;
	}

	public int getM_paket_id() {
		return m_paket_id;
	}

	public void setM_paket_id(int m_paket_id) {
		this.m_paket_id = m_paket_id;
	}

	public int getM_kelas_id() {
		return m_kelas_id;
	}

	public void setM_kelas_id(int m_kelas_id) {
		this.m_kelas_id = m_kelas_id;
	}

	public int getM_obat_id() {
		return m_obat_id;
	}

	public void setM_obat_id(int m_obat_id) {
		this.m_obat_id = m_obat_id;
	}

	public int getPaket_barang_jumlah() {
		return paket_barang_jumlah;
	}

	public void setPaket_barang_jumlah(int paket_barang_jumlah) {
		this.paket_barang_jumlah = paket_barang_jumlah;
	}

	public String getPaket_barang_created_by() {
		return paket_barang_created_by;
	}

	public void setPaket_barang_created_by(String paket_barang_created_by) {
		this.paket_barang_created_by = paket_barang_created_by;
	}

	public Timestamp getPaket_barang_created_date() {
		return paket_barang_created_date;
	}

	public void setPaket_barang_created_date(Timestamp paket_barang_created_date) {
		this.paket_barang_created_date = paket_barang_created_date;
	}

	public String getPaket_barang_updated_by() {
		return paket_barang_updated_by;
	}

	public void setPaket_barang_updated_by(String paket_barang_updated_by) {
		this.paket_barang_updated_by = paket_barang_updated_by;
	}

	public Timestamp getPaket_barang_updated_date() {
		return paket_barang_updated_date;
	}

	public void setPaket_barang_updated_date(Timestamp paket_barang_updated_date) {
		this.paket_barang_updated_date = paket_barang_updated_date;
	}

	public int getPaket_barang_revised() {
		return paket_barang_revised;
	}

	public void setPaket_barang_revised(int paket_barang_revised) {
		this.paket_barang_revised = paket_barang_revised;
	}

	public int getPaket_barang_harga() {
		return paket_barang_harga;
	}

	public void setPaket_barang_harga(int paket_barang_harga) {
		this.paket_barang_harga = paket_barang_harga;
	}

	public String getPaket_barang_aktif() {
		return paket_barang_aktif;
	}

	public void setPaket_barang_aktif(String paket_barang_aktif) {
		this.paket_barang_aktif = paket_barang_aktif;
	}

	public int getPaket_satuan_id() {
		return paket_satuan_id;
	}

	public void setPaket_satuan_id(int paket_satuan_id) {
		this.paket_satuan_id = paket_satuan_id;
	}

	public Timestamp getPakeobat_deleted_date() {
		return pakeobat_deleted_date;
	}

	public void setPakeobat_deleted_date(Timestamp pakeobat_deleted_date) {
		this.pakeobat_deleted_date = pakeobat_deleted_date;
	}

	@Override
	public String toString() {
		return "m_PaketObat [paket_barang_id=" + paket_barang_id + ", m_paket_id=" + m_paket_id + ", m_obat_id="
				+ m_obat_id + ", m_kelas_id=" + m_kelas_id + ", paket_barang_jumlah=" + paket_barang_jumlah
				+ ", paket_barang_created_by=" + paket_barang_created_by + ", paket_barang_created_date="
				+ paket_barang_created_date + ", paket_barang_updated_by=" + paket_barang_updated_by
				+ ", paket_barang_updated_date=" + paket_barang_updated_date + ", paket_barang_revised="
				+ paket_barang_revised + ", paket_barang_harga=" + paket_barang_harga + ", paket_barang_aktif="
				+ paket_barang_aktif + ", paket_satuan_id=" + paket_satuan_id + ", pakeobat_deleted_date="
				+ pakeobat_deleted_date + "]";
	}

}
