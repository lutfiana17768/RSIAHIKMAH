package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.m_Obat;

@Repository
public class ObatAction implements ObatDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public int total;

	@Override
	public List<m_Obat> getObats() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		Query<m_Obat> query = current.createQuery("from m_Obat", m_Obat.class);

		List<m_Obat> obat = query.getResultList();

		return obat;
	}

	@Override
	public List<m_Obat> getObats(int page, int limit) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<m_Obat> query = current.createQuery("from m_Obat", m_Obat.class);
		List<m_Obat> obat = query.getResultList();
		this.total = obat.size();
		obat = this.getData(page, limit);

		return obat;
	}

	public List<m_Obat> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<m_Obat> query = current.createQuery("from m_Obat", m_Obat.class).setFirstResult((page - 1) * limit)
				.setMaxResults(limit);
		List<m_Obat> Result = query.getResultList();

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
	public m_Obat getObat(int obatId) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		m_Obat result = current.get(m_Obat.class, obatId);

		return result;
	}

	@Override
	public int Store(m_Obat ObatModel) {
		Session current = sessionFactory.getCurrentSession();

		return (int) current.save(ObatModel);

	}

	@Override
	public void Update(m_Obat ObatModel) {
		Session current = sessionFactory.getCurrentSession();

		current.saveOrUpdate(ObatModel);
	}

	@Override
	public void Delete(m_Obat ObatModel) {
		Session current = sessionFactory.getCurrentSession();

		current.saveOrUpdate(ObatModel);
	}
}
