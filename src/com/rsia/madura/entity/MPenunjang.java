/*
* @Author: PRADESGA
* @Date:   2018-04-07 01:44:50
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-23 13:43:19
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
@Table(name="m_penunjang")
public class MPenunjang {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="penunjangmedis_id")
	private Integer penunjangmedis_id;
	
	@Column(name="penunjangmedis_kode")
	private String penunjangmedis_kode;
	
	@Column(name="penunjangmedis_nama")
	private String penunjangmedis_nama;
	
	@Column(name="penunjangmedis_keterangan")
	private String penunjangmedis_keterangan;
	
	@Column(name="penunjangmedis_aktif")
	private String penunjangmedis_aktif;

	@Column(name="penunjangmedis_template")
	private String penunjangmedis_template;

	@Column(name="penunjangmedis_urut")
	private String penunjangmedis_urut;
	
	@Column(name="penunjangmedis_group")
	private String penunjangmedis_group;
	
	@Column(name="penunjangmedis_parent_id")
	private Integer penunjangmedis_parent_id;
	
	@Column(name="penunjangmedis_parent_kode")
	private Integer penunjangmedis_parent_kode;
	
	@Column(name="penunjangmedis_template_pr")
	private String penunjangmedis_template_pr;
	
	@Column(name="penunjangmedis_label")
	private String penunjangmedis_label;
	
	@Column(name="penunjangmedis_kegiatan")
	private Integer penunjangmedis_kegiatan;
	
	@Column(name="penunjangmedis_created_by")
	private String penunjangmedis_created_by;
	
	@Column(name="penunjangmedis_created_date")
	private Timestamp penunjangmedis_created_date;
	
	@Column(name="penunjangmedis_updated_by")
	private String penunjangmedis_updated_by;
	
	@Column(name="penunjangmedis_updated_date")
	private Timestamp penunjangmedis_updated_date;
	
	@Column(name="penunjangmedis_revised")
	private int penunjangmedis_revised;
	
	@Column(name="penunjangmedis_deleted_by")
	private String penunjangmedis_deleted_by;
	
	@Column(name="penunjangmedis_deleted_date")
	private Timestamp penunjangmedis_deleted_date;

	@ManyToOne
	private MPenunjangGroup penunjangGroup;

	@OneToMany(mappedBy = "penunjang", cascade = CascadeType.ALL, orphanRemoval=true)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<MParamPeriksa> paramperiksa;

	@OneToMany(mappedBy = "penunjang", cascade = CascadeType.ALL, orphanRemoval=true)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<MPenunjangKelas> penunjangkelas;

	@OneToMany(mappedBy = "penunjang", cascade = CascadeType.ALL, orphanRemoval=true)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<MPenunjangKategori> penunjangkategori;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        joinColumns = { @JoinColumn(name = "penunjangmedis_id") }, 
        inverseJoinColumns = { @JoinColumn(name = "jenislayanan_id") }
    )
    Set<MJenisLayanan> jenislayanans = new HashSet<MJenisLayanan>();
    // List<MJenisLayanan> jenislayanans;

	public Integer getPenunjangmedis_id() {
		return penunjangmedis_id;
	}

	public void setPenunjangmedis_id(Integer penunjangmedis_id) {
		this.penunjangmedis_id = penunjangmedis_id;
	}

	public String getPenunjangmedis_nama() {
		return penunjangmedis_nama;
	}

	public void setPenunjangmedis_nama(String penunjangmedis_nama) {
		this.penunjangmedis_nama = penunjangmedis_nama;
	}

	public String getPenunjangmedis_keterangan() {
		return penunjangmedis_keterangan;
	}

	public void setPenunjangmedis_keterangan(String penunjangmedis_keterangan) {
		this.penunjangmedis_keterangan = penunjangmedis_keterangan;
	}

	public String getPenunjangmedis_aktif() {
		return penunjangmedis_aktif;
	}

	public void setPenunjangmedis_aktif(String penunjangmedis_aktif) {
		this.penunjangmedis_aktif = penunjangmedis_aktif;
	}

	public String getPenunjangmedis_template() {
		return penunjangmedis_template;
	}

	public void setPenunjangmedis_template(String penunjangmedis_template) {
		this.penunjangmedis_template = penunjangmedis_template;
	}

	public String getPenunjangmedis_urut() {
		return penunjangmedis_urut;
	}

	public void setPenunjangmedis_urut(String penunjangmedis_urut) {
		this.penunjangmedis_urut = penunjangmedis_urut;
	}

	public String getPenunjangmedis_group() {
		return penunjangmedis_group;
	}

	public void setPenunjangmedis_group(String penunjangmedis_group) {
		this.penunjangmedis_group = penunjangmedis_group;
	}

	public Integer getPenunjangmedis_parent_id() {
		return penunjangmedis_parent_id;
	}

	public void setPenunjangmedis_parent_id(Integer penunjangmedis_parent_id) {
		this.penunjangmedis_parent_id = penunjangmedis_parent_id;
	}

	public String getPenunjangmedis_kode() {
		return penunjangmedis_kode;
	}

	public void setPenunjangmedis_kode(String penunjangmedis_kode) {
		this.penunjangmedis_kode = penunjangmedis_kode;
	}

	public String getPenunjangmedis_template_pr() {
		return penunjangmedis_template_pr;
	}

	public void setPenunjangmedis_template_pr(String penunjangmedis_template_pr) {
		this.penunjangmedis_template_pr = penunjangmedis_template_pr;
	}

	public String getPenunjangmedis_label() {
		return penunjangmedis_label;
	}

	public void setPenunjangmedis_label(String penunjangmedis_label) {
		this.penunjangmedis_label = penunjangmedis_label;
	}

	public Integer getPenunjangmedis_kegiatan() {
		return penunjangmedis_kegiatan;
	}

	public void setPenunjangmedis_kegiatan(Integer penunjangmedis_kegiatan) {
		this.penunjangmedis_kegiatan = penunjangmedis_kegiatan;
	}

	public String getPenunjangmedis_created_by() {
		return penunjangmedis_created_by;
	}

	public void setPenunjangmedis_created_by(String penunjangmedis_created_by) {
		this.penunjangmedis_created_by = penunjangmedis_created_by;
	}

	public Timestamp getPenunjangmedis_created_date() {
		return penunjangmedis_created_date;
	}

	public void setPenunjangmedis_created_date(Timestamp penunjangmedis_created_date) {
		this.penunjangmedis_created_date = penunjangmedis_created_date;
	}

	public String getPenunjangmedis_updated_by() {
		return penunjangmedis_updated_by;
	}

	public void setPenunjangmedis_updated_by(String penunjangmedis_updated_by) {
		this.penunjangmedis_updated_by = penunjangmedis_updated_by;
	}

	public Timestamp getPenunjangmedis_updated_date() {
		return penunjangmedis_updated_date;
	}

	public void setPenunjangmedis_updated_date(Timestamp penunjangmedis_updated_date) {
		this.penunjangmedis_updated_date = penunjangmedis_updated_date;
	}

	public int getPenunjangmedis_revised() {
		return penunjangmedis_revised;
	}

	public void setPenunjangmedis_revised(int penunjangmedis_revised) {
		this.penunjangmedis_revised = penunjangmedis_revised;
	}

	public Timestamp getPenunjangmedis_deleted_date() {
		return penunjangmedis_deleted_date;
	}

	public void setPenunjangmedis_deleted_date(Timestamp penunjangmedis_deleted_date) {
		this.penunjangmedis_deleted_date = penunjangmedis_deleted_date;
	}

	public String getPenunjangmedis_deleted_by() {
		return penunjangmedis_deleted_by;
	}

	public void setPenunjangmedis_deleted_by(String penunjangmedis_deleted_by) {
		this.penunjangmedis_deleted_by = penunjangmedis_deleted_by;
	}

	public MPenunjangGroup getPenunjangGroup() {
		return penunjangGroup;
	}

	public void setPenunjangGroup(MPenunjangGroup penunjangGroup) {
		this.penunjangGroup = penunjangGroup;
	}

	public List<MParamPeriksa> getParamperiksa() {
		return paramperiksa;
	}

	public void setParamperiksa(List<MParamPeriksa> paramperiksa) {
		this.paramperiksa = paramperiksa;
	}

	public List<MPenunjangKelas> getPenunjangkelas() {
		return penunjangkelas;
	}

	public void setPenunjangkelas(List<MPenunjangKelas> penunjangkelas) {
		this.penunjangkelas = penunjangkelas;
	}

	public List<MPenunjangKategori> getPenunjangkategori() {
		return penunjangkategori;
	}

	public void setPenunjangkategori(List<MPenunjangKategori> penunjangkategori) {
		this.penunjangkategori = penunjangkategori;
	}

	@Override
	public String toString() {
		return "MPenunjang [penunjangmedis_id=" + penunjangmedis_id + ", penunjangmedis_kode=" + penunjangmedis_kode + ", penunjangmedis_nama="
				+ penunjangmedis_nama + ", penunjangmedis_created_by=" + penunjangmedis_created_by + ", jenislayanans=" + jenislayanans
				+ ", penunjangkelas=" + penunjangkelas + "]";
	}

}