// /*
// * @Author: Pradesga Indonesia
// * @Date:   2018-05-22 10:27:21
// * @Last Modified by:   Pradesga Indonesia
// * @Last Modified time: 2018-05-22 14:22:02
// */
// package com.rsia.madura.entity;

// import java.sql.Timestamp;

// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.Table;

// @Entity
// @Table(name="m_kelas")
// public class MTerapiPasien {
// 	@Id
// 	@GeneratedValue(strategy = GenerationType.IDENTITY)
// 	@Column(name = "terapipasien_id")
// 	private int terapipasien_id;

// 	@Column(name = "t_pendaftaran_id")
// 	private Integer t_pendaftaran_id;

// 	@Column(name = "m_obat_id")
// 	private Integer m_obat_id;

// 	@Column(name = "m_kamar_id")
// 	private Integer m_kamar_id;

// 	@Column(name = "terapipasien_jumlah")
// 	private Integer terapipasien_jumlah;

// 	@Column(name = "terapipasien_dosis")
// 	private String terapipasien_dosis;

// 	@Column(name = "terapipasien_keterangan")
// 	private String terapipasien_keterangan;

// 	@Column(name = "terapipasien_aktif")
// 	private String terapipasien_aktif;

// 	@Column(name = "terapipasien_created_by")
// 	private String terapipasien_created_by;

// 	@Column(name = "terapipasien_created_date")
// 	private Timestamp terapipasien_created_date;

// 	@Column(name = "terapipasien_updated_by")
// 	private String terapipasien_updated_by;

// 	@Column(name = "terapipasien_updated_date")
// 	private Timestamp terapipasien_updated_date;

// 	@Column(name = "terapipasien_revised")
// 	private Integer terapipasien_revised;

// 	@Column(name = "terapipasien_biaya")
// 	private Integer terapipasien_biaya;

// 	@Column(name = "terapipasien_m_pasien_norm")
// 	private String terapipasien_m_pasien_norm;

// 	@Column(name = "terapipasien_biaya_cover")
// 	private Integer terapipasien_biaya_cover;

// 	@Column(name = "terapipasien_kamarpasien_id")
// 	private Integer terapipasien_kamarpasien_id;

// 	@Column(name = "reg_company_id")
// 	private Integer reg_company_id;

// 	@Column(name = "reg_apps_id")
// 	private Integer reg_apps_id;



// }