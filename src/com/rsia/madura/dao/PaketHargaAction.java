/*
* @Author: PRADESGA
* @Date:   2018-04-07 01:54:17
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-10 11:27:12
*/
package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MPaketHarga;

@Repository
public class PaketHargaAction implements PaketHargaDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public int total;
	

	@Override
	public List<MPaketHarga> getPaketHargas() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<MPaketHarga> query = current.createQuery("FROM MPaketHarga k WHERE k.paket_aktif = :paket_aktif", MPaketHarga.class);
		query.setParameter("paket_aktif", "Y");
		List<MPaketHarga> result = query.getResultList();
		return result;
	}

	@Override
	public List<MPaketHarga> getPaketHargas(int page, int limit) {
		// TODO Auto-generated method stub
		List<MPaketHarga> result = this.getData(page, limit);
		this.total = this.getPaketHargas().size();

		return result;
	}

	public List<MPaketHarga> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MPaketHarga> query = current.createQuery("FROM MPaketHarga k WHERE k.paket_aktif = :paket_aktif", MPaketHarga.class).setMaxResults(limit);
		query.setParameter("paket_aktif", "Y");
		List<MPaketHarga> result = query.getResultList();

		return result;
	}

	@Override
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		double last = Math.ceil((double) this.total / (double) limit);

		int start = ((page - 5) > 0) ? page - 5 : 1;
		int end = (int) (((page + 5) < last) ? page + 5 : last);

		String html = "<ul class='pagination'>";

		String first = (page == 1) ? "disabled" : "";
		html = html + "<li class='page-first' " + first + "><a href='?limit=" + limit + "&page=" + (page - 1) + "'>&laquo;</a></li>";

		if (start > 1) {
			html = html + "<li class='page-number'><a href='?limit=" + limit + "&page=1'>1</a></li>";
			html = html + "<li class='page-number disabled'><span>...</span></li>";
		}

		for (int i = start; i <= end; i++) {
			String position = (page == i) ? "active" : "";
			html = html + "<li class='page-number ' " + position + "'><a href='?limit=" + limit + "&page=" + i + "'> " + i + "</a></li>";
		}

		if (end < last) {
			html = html + "<li class='page-number disabled'><span>...</span></li>";
			html = html + "<li class='page-number'><a href='?limit=" + limit + "&page=" + (int) last + "'>" + (int) last + "</a></li>";
		}

		String status = (page == (int) last) ? "disabled" : "";
		html = html + "<li class='page-number " + status + "'><a href='?limit=" + limit + "&page=" + (page + 1) + "'>&raquo;</a></li>";
		html = html + "</ul>";

		return html;
	}

	@Override
	public MPaketHarga getPaketHarga(int Id) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		MPaketHarga result = current.get(MPaketHarga.class, Id);
		return result;
	}

	@Override
	public void PaketHargaStore(MPaketHarga PaketHargaModel) {
		Session current = sessionFactory.getCurrentSession();
		current.save(PaketHargaModel);
	}

	@Override
	public void PaketHargaUpdate(MPaketHarga PaketHargaModel) {
		Session current = sessionFactory.getCurrentSession();
		current.saveOrUpdate(PaketHargaModel);
	}

	@Override
	public void PaketHargaDelete(MPaketHarga PaketHargaModel) {
		Session current = sessionFactory.getCurrentSession();
		current.saveOrUpdate(PaketHargaModel);
	}
}