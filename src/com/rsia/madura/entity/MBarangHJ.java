package com.rsia.madura.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="m_baranghj")
public class MBarangHJ {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="baranghj_id")
	private Integer barangHJId;
	
	// @Column(name="baranghj_jenisharga_id")
	// private Integer barangHJJenisHargaId;

	// @Column(name="baranghj_barang_id")
	// private Integer barangHJBarangId;
	
	@Column(name="baranghj_satuan_id")
	private Integer barangHJSatuanId;
	
	// @Column(name="baranghj_satuankonversi_id")
	// private Integer barangHJSatuanKonversiId;

	@Column(name="baranghj_tanggal")
	private Date barangHJTanggal;
	
	@Column(name="baranghj_validfrom")
	private Date barangHJValidFrom;
	  
	@Column(name="baranghj_validto")
	private Date barangHJValidTo;
	
	@Column(name="baranghj_hj")
	private Integer barangHJHJ;
	
	@Column(name=" baranghj_default")
	private String barangHJDefault;
	
	@Column(name="baranghj_created_by")
	private String barangHJCreatedBy;
	
	@Column(name="baranghj_created_date")
	private Timestamp barangHJCreatedDate;
	
	@Column(name=" baranghj_updated_by")
	private String barangHJUpdatedBy;
	
	@Column(name="baranghj_updated_date ")
	private Timestamp barangHJUpdatedDate;
	
	@Column(name="baranghj_revised")
	private Integer barangHJRevised;
	
	// @Column(name="baranghj_terima_id")
	// private Integer barangHJTerimaId;
	 
	// @Column(name="baranghj_opname_id")
	// private Integer barangHJOpnameId;
	 
	@Column(name="baranghj_deleted_date")
	private Timestamp barangHJDeletedDate;

	@ManyToOne
	private MBarang barang;

	public Integer getBarangHJId() {
		return barangHJId;
	}

	public void setBarangHJId(Integer barangHJId) {
		barangHJId = barangHJId;
	}

	// public Integer getBarangHJJenisHargaId() {
	// 	return barangHJJenisHargaId;
	// }

	// public void setBarangHJJenisHargaId(Integer barangHJJenisHargaId) {
	// 	barangHJJenisHargaId = barangHJJenisHargaId;
	// }

	// public Integer getBarangHJBarangId() {
	// 	return barangHJBarangId;
	// }

	// public void setBarangHJBarangId(Integer barangHJBarangId) {
	// 	barangHJBarangId = barangHJBarangId;
	// }

	public Integer getBarangHJSatuanId() {
		return barangHJSatuanId;
	}

	public void setBarangHJSatuanId(Integer barangHJSatuanId) {
		barangHJSatuanId = barangHJSatuanId;
	}

	// public Integer getBarangHJSatuanKonversiId() {
	// 	return barangHJSatuanKonversiId;
	// }

	// public void setBarangHJSatuanKonversiId(Integer barangHJSatuanKonversiId) {
	// 	barangHJSatuanKonversiId = barangHJSatuanKonversiId;
	// }

	public Date getBarangHJTanggal() {
		return barangHJTanggal;
	}

	public void setBarangHJTanggal(Date barangHJTanggal) {
		barangHJTanggal = barangHJTanggal;
	}

	public Date getBarangHJValidFrom() {
		return barangHJValidFrom;
	}

	public void setBarangHJValidFrom(Date barangHJValidFrom) {
		barangHJValidFrom = barangHJValidFrom;
	}

	public Date getBarangHJValidTo() {
		return barangHJValidTo;
	}

	public void setBarangHJValidTo(Date barangHJValidTo) {
		barangHJValidTo = barangHJValidTo;
	}

	public Integer getBarangHJHJ() {
		return barangHJHJ;
	}

	public void setBarangHJHJ(Integer barangHJHJ) {
		barangHJHJ = barangHJHJ;
	}

	public String getBarangHJDefault() {
		return barangHJDefault;
	}

	public void setBarangHJDefault(String barangHJDefault) {
		barangHJDefault = barangHJDefault;
	}

	public String getBarangHJCreatedBy() {
		return barangHJCreatedBy;
	}

	public void setBarangHJCreatedBy(String barangHJCreatedBy) {
		barangHJCreatedBy = barangHJCreatedBy;
	}

	public Timestamp getBarangHJCreatedDate() {
		return barangHJCreatedDate;
	}

	public void setBarangHJCreatedDate(Timestamp barangHJCreatedDate) {
		barangHJCreatedDate = barangHJCreatedDate;
	}

	public String getBarangHJUpdatedBy() {
		return barangHJUpdatedBy;
	}

	public void setBarangHJUpdatedBy(String barangHJUpdatedBy) {
		barangHJUpdatedBy = barangHJUpdatedBy;
	}

	public Timestamp getBarangHJUpdatedDate() {
		return barangHJUpdatedDate;
	}

	public void setBarangHJUpdatedDate(Timestamp barangHJUpdatedDate) {
		barangHJUpdatedDate = barangHJUpdatedDate;
	}

	public Integer getBarangHJRevised() {
		return barangHJRevised;
	}

	public void setBarangHJRevised(Integer barangHJRevised) {
		barangHJRevised = barangHJRevised;
	}

	// public Integer getBarangHJTerimaId() {
	// 	return barangHJTerimaId;
	// }

	// public void setBarangHJTerimaId(Integer barangHJTerimaId) {
	// 	barangHJTerimaId = barangHJTerimaId;
	// }

	// public Integer getBarangHJOpnameId() {
	// 	return barangHJOpnameId;
	// }

	// public void setBarangHJOpnameId(Integer barangHJOpnameId) {
	// 	barangHJOpnameId = barangHJOpnameId;
	// }

	public Timestamp getBarangHJDeletedDate() {
		return barangHJDeletedDate;
	}

	public void setBarangHJDeletedDate(Timestamp barangHJDeletedDate) {
		barangHJDeletedDate = barangHJDeletedDate;
	}

	public MBarang getBarang(){
		return barang;
	}

	public void setBarang(MBarang barang){
		this.barang = barang;
	}

	@Override
	public String toString() {
		return "MBarangHJ [barangHJId=" + barangHJId + ", barangHJSatuanId=" + barangHJSatuanId 
				+ ", barangHJTanggal=" + barangHJTanggal + ", barangHJValidFrom=" + barangHJValidFrom + ", barangHJValidTo=" + barangHJValidTo
				+ ", barangHJHJ=" + barangHJHJ + ", barangHJDefault=" + barangHJDefault + ", barangHJCreatedBy=" + barangHJCreatedBy
				+ ", barangHJCreatedDate=" + barangHJCreatedDate + ", barangHJUpdatedBy=" + barangHJUpdatedBy
				+ ", barangHJUpdatedDate=" + barangHJUpdatedDate + ", barangHJRevised=" + barangHJRevised
				+ ", barangHJDeletedDate=" + barangHJDeletedDate + "barang" + barang + "]";
	}
}
