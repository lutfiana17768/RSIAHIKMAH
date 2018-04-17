package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.m_Ruang;

@Repository
public class RuanganAction implements RuanganDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public int total;

	@Override
	public List<m_Ruang> getRuangs() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		Query<m_Ruang> query = current.createQuery("from m_Ruang", m_Ruang.class);

		List<m_Ruang> ruang = query.getResultList();

		return ruang;
	}

	@Override
	public List<m_Ruang> getRuangs(int page, int limit) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<m_Ruang> query = current.createQuery("from m_Ruang", m_Ruang.class);
		List<m_Ruang> ruang = query.getResultList();
		this.total = ruang.size();
		ruang = this.getData(page, limit);

		return ruang;
	}

	public List<m_Ruang> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<m_Ruang> query = current.createQuery("from m_Ruang", m_Ruang.class).setFirstResult((page - 1) * limit)
				.setMaxResults(limit);
		List<m_Ruang> Result = query.getResultList();

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
	public m_Ruang getRuang(int ruangId) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		m_Ruang result = current.get(m_Ruang.class, ruangId);

		return result;
	}

	@Override
	public int Store(m_Ruang data) {
		Session current = sessionFactory.getCurrentSession();

		return (int) current.save(data);
	}

	@Override
	public void Update(m_Ruang data) {
		Session current = sessionFactory.getCurrentSession();

		current.saveOrUpdate(data);
	}

	@Override
	public void Delete(m_Ruang data) {
		Session current = sessionFactory.getCurrentSession();

		current.saveOrUpdate(data);

	}

}
