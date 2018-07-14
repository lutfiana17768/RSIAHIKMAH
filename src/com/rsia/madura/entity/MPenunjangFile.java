package com.rsia.madura.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "t_penunjang_file")
public class MPenunjangFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pmedisfile_id")
    private Integer pmedisfileID;

    @Transient
    private Integer remove;

    @Column(name = "pmedisfile_berkas")
    private String pmedisfileBerkas;

    @Column(name = "pmedisfile_pemeriksaan")
    private String pmedisfilePemeriksaan;

    @Column(name = "pmedisfile_hasil")
    private String pmedisfileHasil;

    @Column(name = "pmedisfile_jumlah")
    private Integer pmedisfileJumlah;

    @Column(name = "pmedisfile_harga")
    private Integer pmedisfileHarga;

    @Transient
    private String pmedisfileOriginal;


    @ManyToOne
    private MPendaftaran pendaftaran;
    
    public Integer getPmedisfileID() {
        return this.pmedisfileID;
    }

    public Integer getRemove() {
        return this.remove;
    }

    public void setRemove(Integer remove) {
        this.remove = remove;
    }
    
    public void setPmedisfileID(Integer pmedisfileID) {
        this.pmedisfileID = pmedisfileID;
    }

    public String getPmedisfileBerkas() {
        return this.pmedisfileBerkas;
    }

    public void setPmedisfileBerkas(String pmedisfileBerkas) {
        this.pmedisfileBerkas = pmedisfileBerkas;
    }

    public String getPmedisfilePemeriksaan() {
        return this.pmedisfilePemeriksaan;
    }

    public void setPmedisfilePemeriksaan(String pmedisfilePemeriksaan) {
        this.pmedisfilePemeriksaan = pmedisfilePemeriksaan;
    }
    
    public String getPmedisfileHasil() {
        return this.pmedisfileHasil;
    }

    public void setPmedisfileHasil(String pmedisfileHasil) {
        this.pmedisfileHasil = pmedisfileHasil;
    }

    public Integer getPmedisfileJumlah() {
        return this.pmedisfileJumlah;
    }

    public void setPmedisfileJumlah(Integer pmedisfileJumlah) {
        this.pmedisfileJumlah = pmedisfileJumlah;
    }
    
    public Integer getPmedisfileHarga() {
        return this.pmedisfileHarga;
    }

    public void setPmedisfileHarga(Integer pmedisfileHarga) {
        this.pmedisfileHarga = pmedisfileHarga;
    }
    
    public MPendaftaran getPendaftaran() {
        return this.pendaftaran;
    }

    public void setPendaftaran(MPendaftaran pendaftaran) {
        this.pendaftaran = pendaftaran;
    }

	public String getPmedisfileOriginal()
	{
		return this.pmedisfileOriginal;
	}

	public void setPmedisfileOriginal(String pmedisfileOriginal)
	{
		this.pmedisfileOriginal = pmedisfileOriginal;
	}
}