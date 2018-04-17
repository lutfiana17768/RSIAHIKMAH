package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.m_Pasien;

@Repository
public class PasienAction implements PasienDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public int total;

	@Override
	public List<m_Pasien> getPasien() {
		Session current = sessionFactory.getCurrentSession();

		Query<m_Pasien> query = current.createQuery("from m_Pasien", m_Pasien.class);

		List<m_Pasien> Pasien = query.getResultList();

		return Pasien;
	}

	@Override
	public List<m_Pasien> getPasiens() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		Query<m_Pasien> query = current.createQuery("from m_Pasien", m_Pasien.class);

		List<m_Pasien> pasien = query.getResultList();

		return pasien;
	}

	@Override
	public List<m_Pasien> getPasiens(int page, int limit) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<m_Pasien> query = current.createQuery("from m_Pasien", m_Pasien.class);
		List<m_Pasien> pasien = query.getResultList();
		this.total = pasien.size();
		pasien = this.getData(page, limit);

		return pasien;
	}

	public List<m_Pasien> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<m_Pasien> query = current.createQuery("from m_Pasien", m_Pasien.class).setFirstResult((page - 1) * limit)
				.setMaxResults(limit);
		List<m_Pasien> Result = query.getResultList();

		return Result;
	}

	@Override
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		double last = Math.ceil((double) this.total / (double) limit);

		int start = ((page - 5) > 0) ? page - 5 : 1;
		int end = (int) (((page + 5) < last) ? page + 5 : last);

		String html = "<ul class='pagination'>";

		String first = (page == 1) ? "disabled" : "";
		html = html + "<li class='page-first' " + first + "><a href='?limit=" + limit + "&page=" + (page - 1)
				+ "'>&laquo;</a></li>";

		if (start > 1) {
			html = html + "<li class='page-number'><a href='?limit=" + limit + "&page=1'>1</a></li>";
			html = html + "<li class='page-number disabled'><span>...</span></li>";
		}

		for (int i = start; i <= end; i++) {
			String position = (page == i) ? "active" : "";
			html = html + "<li class='page-number ' " + position + "'><a href='?limit=" + limit + "&page=" + i + "'> "
					+ i + "</a></li>";
		}

		if (end < last) {
			html = html + "<li class='page-number disabled'><span>...</span></li>";
			html = html + "<li class='page-number'><a href='?limit=" + limit + "&page=" + (int) last + "'>" + (int) last
					+ "</a></li>";
		}

		String status = (page == (int) last) ? "disabled" : "";
		html = html + "<li class='page-number " + status + "'><a href='?limit=" + limit + "&page=" + (page + 1)
				+ "'>&raquo;</a></li>";

		html = html + "</ul>";

		return html;
	}

	@Override
	public m_Pasien getPasien(int pasienId) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		m_Pasien result = current.get(m_Pasien.class, pasienId);

		return result;
	}

	@Override
	public void PasienStore(m_Pasien PasienModel) {
		Session current = sessionFactory.getCurrentSession();
		current.save(PasienModel);
	}

	@Override
	public void PasienUpdate(m_Pasien PasienModel) {
		Session current = sessionFactory.getCurrentSession();
		current.saveOrUpdate(PasienModel);

	}

	@Override
	public void PasienDelete(m_Pasien PasienModel) {
		Session current = sessionFactory.getCurrentSession();
		current.saveOrUpdate(PasienModel);
	}

}
