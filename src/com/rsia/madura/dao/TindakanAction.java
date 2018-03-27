package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.m_Tindakan;


@Repository
public class TindakanAction implements TindakanDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public int total;
	
	@Override
	public List<m_Tindakan> getTindakans() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		Query<m_Tindakan> query = current.createQuery("from m_tindakan", m_Tindakan.class);

		List<m_Tindakan> tindakan = query.getResultList();

		return tindakan;
	}

	@Override
	public List<m_Tindakan> getTindakans(int page, int limit) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<m_Tindakan> query = current.createQuery("from m_Tindakan", m_Tindakan.class);
		List<m_Tindakan> tindakan = query.getResultList();
		this.total = tindakan.size();
		tindakan = this.getData(page, limit);

		return tindakan;
	}

	public List<m_Tindakan> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<m_Tindakan> query = current.createQuery("from m_Tindakan", m_Tindakan.class).setFirstResult((page - 1) * limit)
				.setMaxResults(limit);
		List<m_Tindakan> Result = query.getResultList();

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
	public m_Tindakan getTindakan(int tindakanId) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		m_Tindakan result = current.get(m_Tindakan.class, tindakanId);

		return result;
	}

	@Override
	public int TindakanStore(m_Tindakan TindakanModel) {
		Session current = sessionFactory.getCurrentSession();

		return (int)current.save(TindakanModel);

	}

	@Override
	public void TindakanUpdate(m_Tindakan TindakanModel) {
		Session current = sessionFactory.getCurrentSession();

		current.saveOrUpdate(TindakanModel);
	}

	@Override
	public void TindakanDelete(m_Tindakan TindakanModel) {
		Session current = sessionFactory.getCurrentSession();

		current.saveOrUpdate(TindakanModel);
	}
}
