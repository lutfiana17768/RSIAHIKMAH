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

		String sql = "select sum(kartustok_id) as kartustok_id, kartustok_tanggal, " +
					  "sum(kartustok_masuk) as kartustok_masuk, sum(kartustok_keluar) as kartustok_keluar,  barang_barang_id from kartustok " +
					  "where kartustok_tanggal >= '"+ year +"-"+ month +"-01' and kartustok_tanggal <= last_day(to_date('"+ year +"-"+ month +"-01','YYYY-MM-DD')) " +
					  "and barang_barang_id = " + barang_id + " " +
					  "group by kartustok_tanggal, barang_barang_id";

		SQLQuery query = current.createSQLQuery(sql);
		query.addEntity(MKartuStok.class);
		List<MKartuStok> kartuStok = query.getResultList();

		return kartuStok;
	}
}
