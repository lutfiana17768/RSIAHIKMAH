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
@Table(name="t_pendaftaran")
public class MPendaftaran {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pendaftaran_id")
	private int pendaftaranID;
	
	@Column(name="pendaftaran_no")
	private String pendaftaranNo;
	
	@Column(name="pendaftaran_nourut")
	private int pendaftaranNourut;
	
	// @Column(name="m_unit_id")
	// private int mUnitID;
	
	@Column(name="pendaftaran_mrs")
	private Timestamp pendaftaranMrs;
	
	@Column(name="pendaftaran_krs")
	private Timestamp pendaftaranKrs;
	
	// @Column(name="m_status_id")
	// private int mStatusID;
	
	@Column(name="m_rujuk_id_keluar")
	private int mRujukIDKeluar;
	
	@Column(name="pendaftaran_aktif")
	private String pendaftaranAktif;
	
	@Column(name="pendaftaran_created_by")
	private String pendaftaranCreatedBy;
	
	@Column(name="pendaftaran_created_date")
	private Timestamp pendaftaranCreatedDate;
	
	@Column(name="pendaftaran_updated_by")
	private String pendaftaranUpdatedBy;
	
	@Column(name="pendaftaran_updated_date")
	private Timestamp pendaftaranUpdatedDate;
	
	@Column(name="pendaftaran_revised")
	private int pendaftaranRevised;
	
	// @Column(name="m_kondisi_id_keluar")
	// private int mKondisiIDKeluar;
	
	@Column(name="pendaftaran_keterangan")
	private String pendaftaranKeterangan;
	
	@Column(name="pendaftaran_tarif")
	private int pendaftaranTarif;
	
	// @Column(name="m_status_id_masuk")
	// private int mStatusIDMasuk;
	
	// @Column(name="m_status_id_pelayanan")
	// private String mStatusIDPelayanan;
	
	@Column(name="pendaftaran_status_kunjungan")
	private String pendaftaranStatusKunjungan;
	
	// @Column(name="m_kondisi_id_masuk")
	// private int mKondisiIDMasuk;
	
	// @Column(name="m_rujukan_id")
	// private int mRujukanID;
	
	@Column(name="pendaftaran_jenis")
	private String pendaftaranJenis;
	
	@Column(name="pendaftaran_status_konsul")
	private String pendaftaranStatusKonsul;
	
	@Column(name="m_unit_id_asal")
	private int mUnitIDAsal;
	
	@Column(name="m_kelas_id_standar")
	private int mKelasIDStandar;
	
	@Column(name="pendaftaran_deleted_date")
	private Timestamp pendaftaranDeletedDate;

	// Tab fisik 
	@OneToMany(mappedBy = "pendaftaran", cascade = CascadeType.ALL, orphanRemoval=true)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<MRiwayatPeriksa> riwayatperiksa;

	// Tab pemeriksaan -> tPeriksaPasien
	@OneToMany(mappedBy = "pendaftaran", cascade = CascadeType.ALL, orphanRemoval=true)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<MPeriksaPasien> periksapasien;

	// // Tab diagnosa -> tDiagnosaPasien ???
	@OneToMany(mappedBy = "pendaftaran", cascade = CascadeType.ALL, orphanRemoval=true)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<MDiagnosaPasien> diagnosapasien;

	// // Tab prosedur -> ???
	@OneToMany(mappedBy = "pendaftaran", cascade = CascadeType.ALL, orphanRemoval=true)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<MDiagnosa9> diagnosa9;
	
	// // Tab tindakan -> tTindakanPasien
	@OneToMany(mappedBy = "pendaftaran", cascade = CascadeType.ALL, orphanRemoval=true)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<MTindakanPasien> tindakanpasien;

	// Tab bph -> tPakai ???
	@OneToMany(mappedBy = "pendaftaran", cascade = CascadeType.ALL, orphanRemoval=true)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<MPakai> pakai;
	
	// Tab resep -> tResep 
	@OneToMany(mappedBy = "pendaftaran", cascade = CascadeType.ALL, orphanRemoval=true)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<MResep> resep;

	// Tab file -> penunjang
	@OneToMany(mappedBy = "pendaftaran", cascade = CascadeType.ALL, orphanRemoval=true)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<MPenunjangTrans> penunjangtrans;

	// tab soap
	@OneToMany(mappedBy = "pendaftaran", cascade = CascadeType.ALL, orphanRemoval=true)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<MSoap> soap;

	@ManyToOne
	private MPasien pasien;

	@ManyToOne
	private MKondisi kondisi;

	@ManyToOne
	private MRujukan rujukan;

	@ManyToOne
	private MPegawai pegawai;

	@ManyToOne
	private MTindakan tindakan;

	// @ManyToOne
	// private MPaket paket;

	public int getPendaftaranID() {
		return pendaftaranID;
	}

	public void setPendaftaranID(int pendaftaranID) {
		this.pendaftaranID = pendaftaranID;
	}

	public String getPendaftaranNo() {
		return pendaftaranNo;
	}

	public void setPendaftaranNo(String pendaftaranNo) {
		this.pendaftaranNo = pendaftaranNo;
	}

	public int getPendaftaranNourut() {
		return pendaftaranNourut;
	}

	public void setPendaftaranNourut(int pendaftaranNourut) {
		this.pendaftaranNourut = pendaftaranNourut;
	}

	// public int getMUnitID() {
	// 	return mUnitID;
	// }

	// public void setMUnitID(int mUnitID) {
	// 	this.mUnitID = mUnitID;
	// }

	public Timestamp getPendaftaranMrs() {
		return pendaftaranMrs;
	}

	public void setPendaftaranMrs(Timestamp pendaftaranMrs) {
		this.pendaftaranMrs = pendaftaranMrs;
	}

	public Timestamp getPendaftaranKrs() {
		return pendaftaranKrs;
	}

	public void setPendaftaranKrs(Timestamp pendaftaranKrs) {
		this.pendaftaranKrs = pendaftaranKrs;
	}

	// public int getMStatusID() {
	// 	return mStatusID;
	// }

	// public void setMStatusID(int mStatusID) {
	// 	this.mStatusID = mStatusID;
	// }

	// public int getMRujukIDKeluar() {
	// 	return mRujukIDKeluar;
	// }

	// public void setMRujukIDKeluar(int mRujukIDKeluar) {
	// 	this.mRujukIDKeluar = mRujukIDKeluar;
	// }

	public String getPendaftaranAktif() {
		return pendaftaranAktif;
	}

	public void setPendaftaranAktif(String pendaftaranAktif) {
		this.pendaftaranAktif = pendaftaranAktif;
	}

	public String getPendaftaranCreatedBy() {
		return pendaftaranCreatedBy;
	}

	public void setPendaftaranCreatedBy(String pendaftaranCreatedBy) {
		this.pendaftaranCreatedBy = pendaftaranCreatedBy;
	}

	public Timestamp getPendaftaranCreatedDate() {
		return pendaftaranCreatedDate;
	}

	public void setPendaftaranCreatedDate(Timestamp pendaftaranCreatedDate) {
		this.pendaftaranCreatedDate = pendaftaranCreatedDate;
	}

	public String getPendaftaranUpdatedBy() {
		return pendaftaranUpdatedBy;
	}

	public void setPendaftaranUpdatedBy(String pendaftaranUpdatedBy) {
		this.pendaftaranUpdatedBy = pendaftaranUpdatedBy;
	}

	public Timestamp getPendaftaranUpdatedDate() {
		return pendaftaranUpdatedDate;
	}

	public void setPendaftaranUpdatedDate(Timestamp pendaftaranUpdatedDate) {
		this.pendaftaranUpdatedDate = pendaftaranUpdatedDate;
	}

	public int getPendaftaranRevised() {
		return pendaftaranRevised;
	}

	public void setPendaftaranRevised(int pendaftaranRevised) {
		this.pendaftaranRevised = pendaftaranRevised;
	}

	// public int getMKondisiIDKeluar() {
	// 	return mKondisiIDKeluar;
	// }

	// public void setMKondisiIDKeluar(int mKondisiIDKeluar) {
	// 	this.mKondisiIDKeluar = mKondisiIDKeluar;
	// }

	public String getPendaftaranKeterangan() {
		return pendaftaranKeterangan;
	}

	public void setPendaftaranKeterangan(String pendaftaranKeterangan) {
		this.pendaftaranKeterangan = pendaftaranKeterangan;
	}

	public int getPendaftaranTarif() {
		return pendaftaranTarif;
	}

	public void setPendaftaranTarif(int pendaftaranTarif) {
		this.pendaftaranTarif = pendaftaranTarif;
	}

	// public int getMStatusIDMasuk() {
	// 	return mStatusIDMasuk;
	// }

	// public void setMStatusIDMasuk(int mStatusIDMasuk) {
	// 	this.mStatusIDMasuk = mStatusIDMasuk;
	// }

	// public String getMStatusIDPelayanan() {
	// 	return mStatusIDPelayanan;
	// }

	// public void setMStatusIDPelayanan(String mStatusIDPelayanan) {
	// 	this.mStatusIDPelayanan = mStatusIDPelayanan;
	// }

	public String getPendaftaranStatusKunjungan() {
		return pendaftaranStatusKunjungan;
	}

	public void setPendaftaranStatusKunjungan(String pendaftaranStatusKunjungan) {
		this.pendaftaranStatusKunjungan = pendaftaranStatusKunjungan;
	}

	// public int getMKondisiIDMasuk() {
	// 	return mKondisiIDMasuk;
	// }

	// public void setMKondisiIDMasuk(int mKondisiIDMasuk) {
	// 	this.mKondisiIDMasuk = mKondisiIDMasuk;
	// }

	// public int getMRujukanID() {
	// 	return mRujukanID;
	// }

	// public void setMRujukanID(int mRujukanID) {
	// 	this.mRujukanID = mRujukanID;
	// }

	public String getPendaftaranJenis() {
		return pendaftaranJenis;
	}

	public void setPendaftaranJenis(String pendaftaranJenis) {
		this.pendaftaranJenis = pendaftaranJenis;
	}

	public String getPendaftaranStatusKonsul() {
		return pendaftaranStatusKonsul;
	}

	public void setPendaftaranStatusKonsul(String pendaftaranStatusKonsul) {
		this.pendaftaranStatusKonsul = pendaftaranStatusKonsul;
	}

	public int getMUnitIDAsal() {
		return mUnitIDAsal;
	}

	public void setMUnitIDAsal(int mUnitIDAsal) {
		this.mUnitIDAsal = mUnitIDAsal;
	}

	public Timestamp getPendaftaranDeletedDate() {
		return pendaftaranDeletedDate;
	}

	public void setPendaftaranDeletedDate(Timestamp pendaftaranDeletedDate) {
		this.pendaftaranDeletedDate = pendaftaranDeletedDate;
	}

	// Tab fisik -> tRiwayatPeriksa
	public List<MRiwayatPeriksa> getRiwayatperiksa() {
		return riwayatperiksa;
	}

	public void setRiwayatperiksa(List<MRiwayatPeriksa> riwayatperiksa) {
		this.riwayatperiksa = riwayatperiksa;
	}
	// Tab pemeriksaan -> tPeriksaPasien
	public List<MPeriksaPasien> getPeriksapasien() {
		return periksapasien;
	}

	public void setPeriksapasien(List<MPeriksaPasien> periksapasien) {
		this.periksapasien = periksapasien;
	}

	// Tab diagnosa -> tDiagnosaPasien ???
	public List<MDiagnosaPasien> getDiagnosapasien() {
		return diagnosapasien;
	}

	public void setDiagnosapasien(List<MDiagnosaPasien> diagnosapasien) {
		this.diagnosapasien = diagnosapasien;
	}

	public List<MDiagnosa9> getDiagnosa9() {
		return diagnosa9;
	}

	public void setDiagnosa9(List<MDiagnosa9> diagnosa9) {
		this.diagnosa9 = diagnosa9;
	}
	
	// // Tab tindakan -> tTindakanPasien
	public List<MTindakanPasien> getTindakanpasien() {
		return tindakanpasien;
	}

	public void setTindakanpasien(List<MTindakanPasien> tindakanpasien) {
		this.tindakanpasien = tindakanpasien;
	}

	// Tab bph -> tPakai ???
	public List<MPakai> getPakai() {
		return pakai;
	}

	public void setPakai(List<MPakai> pakai) {
		this.pakai = pakai;
	}
	
	// Tab resep -> tResep 
	public List<MResep> getResep() {
		return resep;
	}

	public void setResep(List<MResep> resep) {
		this.resep = resep;
	}

	// Tab file -> penunjang
	public List<MPenunjangTrans> getPenunjangtrans() {
		return penunjangtrans;
	}

	public void setPenunjangtrans(List<MPenunjangTrans> penunjangtrans) {
		this.penunjangtrans = penunjangtrans;
	}

	// tab soap
	public List<MSoap> getSoap() {
		return soap;
	}

	public void setSoap(List<MSoap> soap) {
		this.soap = soap;
	}

	public MPasien getPasien() {
		return pasien;
	}

	public void setPasien(MPasien pasien) {
		this.pasien = pasien;
	}

	public MKondisi getKondisi() {
		return kondisi;
	}

	public void setKondisi(MKondisi kondisi) {
		this.kondisi = kondisi;
	}

	public MTindakan getTindakan() {
		return tindakan;
	}

	public void setTindakan(MTindakan tindakan) {
		this.tindakan = tindakan;
	}

	public MRujukan getRujukan() {
		return rujukan;
	}

	public void setRujukan(MRujukan rujukan) {
		this.rujukan = rujukan;
	}

	public MPegawai getPegawai() {
		return pegawai;
	}

	public void setPegawai(MPegawai pegawai) {
		this.pegawai = pegawai;
	}

	// public MPaket getPaket() {
	// 	return paket;
	// }

	// public void setPaket(MPaket paket) {
	// 	this.paket = paket;
	// }
}
