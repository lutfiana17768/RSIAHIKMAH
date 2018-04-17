package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.m_Rujukan;

@Repository
public class RujukanAction implements RujukanDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public int total;

	@Override
	public List<m_Rujukan> getRujukans() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		Query<m_Rujukan> query = current.createQuery("from m_Rujukan", m_Rujukan.class);

		List<m_Rujukan> rujukan = query.getResultList();

		return rujukan;
	}

	@Override
	public List<m_Rujukan> getRujukans(int page, int limit) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<m_Rujukan> query = current.createQuery("from m_Rujukan", m_Rujukan.class);
		List<m_Rujukan> rujukan = query.getResultList();
		this.total = rujukan.size();
		rujukan = this.getData(page, limit);

		return rujukan;
	}

	public List<m_Rujukan> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<m_Rujukan> query = current.createQuery("from m_Rujukan", m_Rujukan.class)
				.setFirstResult((page - 1) * limit).setMaxResults(limit);
		List<m_Rujukan> Result = query.getResultList();

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
	public m_Rujukan getRujukan(int rujukanId) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		m_Rujukan result = current.get(m_Rujukan.class, rujukanId);

		return result;
	}

	@Override
	public void Store(m_Rujukan data) {
		Session current = sessionFactory.getCurrentSession();

		current.save(data);

	}

	@Override
	public void Update(m_Rujukan data) {
		Session current = sessionFactory.getCurrentSession();

		current.saveOrUpdate(data);
	}

	@Override
	public void Delete(m_Rujukan data) {
		Session current = sessionFactory.getCurrentSession();

		current.saveOrUpdate(data);

	}

}
