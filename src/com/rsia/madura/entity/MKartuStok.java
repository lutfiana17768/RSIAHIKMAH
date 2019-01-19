package com.rsia.madura.entity;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.lang.Number;
import java.math.BigInteger;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.*;

@Entity
@Table(name="kartustok")
public class MKartuStok {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="kartustok_id")
	private Integer kartuStokId;
	 
	@Column(name="kartustok_tanggal")
	private Date kartuStokTanggal;
	
	@Column(name="kartustok_masuk")
	private BigInteger kartuStokMasuk;

	@Column(name="kartustok_keluar")
	private BigInteger kartuStokKeluar;

	@ManyToOne
	private MBarang barang;
	
	
	public MKartuStok(){
		
	}
	
	public Integer getKartuStokId() {
		return kartuStokId;
	}

	public void setKartuStokId(Integer kartuStokId) {
		this.kartuStokId = kartuStokId;
	}

	public Date getKartuStokTanggal() {
		return kartuStokTanggal;
	}

	public void setKartuStokTanggal(Date kartuStokTanggal) {
		this.kartuStokTanggal = kartuStokTanggal;
	}

	public BigInteger getKartuStokMasuk() {
		return kartuStokMasuk;
	}

	public void setKartuStokMasuk(BigInteger kartuStokKeluar) {
		this.kartuStokMasuk = kartuStokMasuk;
	}

	public BigInteger getKartuStokKeluar() {
		return kartuStokKeluar;
	}

	public void setKartuStokKeluar(BigInteger kartuStokKeluar) {
		this.kartuStokKeluar = kartuStokKeluar;
	}

	public MBarang getBarang(){
		return barang;
	}

	public void setBarang(MBarang barang){
		this.barang = barang;
	}

	@Override
	public String toString() {
		return "MkartuStok [kartuStokId=" + kartuStokId + ", kartuStokTanggal = " + kartuStokTanggal + 
				", kartuStokMasuk = " + kartuStokMasuk + ", kartuStokKeluar = "+ kartuStokKeluar + ", barang = " + barang + "]";
	}

	
	
	
}
