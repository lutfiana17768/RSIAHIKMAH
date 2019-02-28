package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.hibernate.SQLQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MKartuStok;

@Repository
public class KartuStokAction implements KartuStokDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<MKartuStok> getKartuStok(String month, String year, int barang_id) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		// Query<MKartuStok> query = current.createQuery("select sum(kartuStokMasuk), sum(kartuStokKeluar), kartuStokTanggal::date, barang.BarangId from kartustok " +
		// 											  "where kartustok_tanggal::date >= '2018-12-01' and kartustok_tanggal::date <= '2018-12-31' " +
		// 											  "group by kartustok_tanggal::date, barang_barang_id", MKartuStok.class);

		// List<MKartuStok> kartuStok = query.getResultList();

		String sql = "select COALESCE(kartustok_id, abs(nomer)) as kartustok_id, tbl.tanggal as kartustok_tanggal, COALESCE(kartustok_masuk, 0) as kartustok_masuk, " +
					 " COALESCE(kartustok_keluar, 0) as kartustok_keluar, "+ barang_id +" as barang_barang_id " +
					 "from (select CURRENT_DATE + i as tanggal, CASE WHEN i > 0 THEN (i + 31) ELSE (abs(i) + 50) END as nomer " +
					 "from generate_series(date '"+ year +"-"+ month +"-01' - CURRENT_DATE, " +
     				 "date '"+ year +"-"+ month +"-15' - CURRENT_DATE ) i ) tbl " +
					 "left join " +
					  "(select sum(kartustok_id) as kartustok_id, kartustok_tanggal, " +
					  "sum(kartustok_masuk) as kartustok_masuk, sum(kartustok_keluar) as kartustok_keluar,  barang_barang_id from kartustok " +
					  "where kartustok_tanggal >= '"+ year +"-"+ month +"-01' and kartustok_tanggal <= '"+ year +"-"+ month +"-15' " +
					  "and barang_barang_id = " + barang_id + " " +
					  "group by kartustok_tanggal, barang_barang_id) stok on (stok.kartustok_tanggal = tbl.tanggal) ";

		SQLQuery query = current.createSQLQuery(sql);
		query.addEntity(MKartuStok.class);
		List<MKartuStok> kartuStok = query.getResultList();

		return kartuStok;
	}

	@Override
	public List<MKartuStok> getKartuStokLast(String month, String year, int barang_id){
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		// Query<MKartuStok> query = current.createQuery("select sum(kartuStokMasuk), sum(kartuStokKeluar), kartuStokTanggal::date, barang.BarangId from kartustok " +
		// 											  "where kartustok_tanggal::date >= '2018-12-01' and kartustok_tanggal::date <= '2018-12-31' " +
		// 											  "group by kartustok_tanggal::date, barang_barang_id", MKartuStok.class);

		// List<MKartuStok> kartuStok = query.getResultList();

		String sql = "select COALESCE(kartustok_id, abs(nomer)) as kartustok_id, tbl.tanggal as kartustok_tanggal, COALESCE(kartustok_masuk, 0) as kartustok_masuk, "+
					 "COALESCE(kartustok_keluar, 0) as kartustok_keluar, "+ barang_id +" as barang_barang_id " +
					 "from (select CURRENT_DATE + i as tanggal, CASE WHEN i > 0 THEN (i + 31) ELSE (abs(i) + 50) END as nomer " +
					 "from generate_series(date '"+ year +"-"+ month +"-16'- CURRENT_DATE, " +
     				 "last_day(to_date('"+ year +"-"+ month +"-01','YYYY-MM-DD')) - CURRENT_DATE ) i ) tbl " +
					 "left join " +
					  "(select sum(kartustok_id) as kartustok_id, kartustok_tanggal, " +
					  "sum(kartustok_masuk) as kartustok_masuk, sum(kartustok_keluar) as kartustok_keluar,  barang_barang_id from kartustok " +
					  "where kartustok_tanggal > '"+ year +"-"+ month +"-15' and kartustok_tanggal <= last_day(to_date('"+ year +"-"+ month +"-01','YYYY-MM-DD')) " +
					  "and barang_barang_id = " + barang_id + " " +
					  "group by kartustok_tanggal, barang_barang_id) stok on (stok.kartustok_tanggal = tbl.tanggal) ";

		SQLQuery query = current.createSQLQuery(sql);
		query.addEntity(MKartuStok.class);
		List<MKartuStok> kartuStok = query.getResultList();

		return kartuStok;	
	}
}
