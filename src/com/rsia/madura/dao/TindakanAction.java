/*
* @Author: PRADESGA
* @Date:   2018-04-07 01:54:17
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-08 08:38:17
*/
package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MTindakan;

@Repository
public class TindakanAction implements TindakanDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public int total;
	

	@Override
	public List<MTindakan> getTindakans() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<MTindakan> query = current.createQuery("FROM MTindakan k WHERE k.tindakan_aktif = :tindakan_aktif", MTindakan.class);
		query.setParameter("tindakan_aktif", "Y");
		List<MTindakan> result = query.getResultList();
		return result;
	}

	@Override
	public List<MTindakan> getTindakans(int page, int limit) {
		// TODO Auto-generated method stub
		List<MTindakan> result = this.getData(page, limit);
		this.total = this.getTindakans().size();
		return result;
	}

	public List<MTindakan> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MTindakan> query = current.createQuery("FROM MTindakan k WHERE k.tindakan_aktif = :tindakan_aktif", MTindakan.class).setMaxResults(limit);
		query.setParameter("tindakan_aktif", "Y");
		List<MTindakan> result = query.getResultList();
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
	public MTindakan getTindakan(int Id) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		MTindakan result = current.get(MTindakan.class, Id);
		return result;
	}

	@Override
	public void TindakanStore(MTindakan TindakanModel) {
		Session current = sessionFactory.getCurrentSession();
		current.save(TindakanModel);
	}

	@Override
	public void TindakanUpdate(MTindakan TindakanModel) {
		Session current = sessionFactory.getCurrentSession();
		current.saveOrUpdate(TindakanModel);
	}

	@Override
	public void TindakanDelete(MTindakan TindakanModel) {
		Session current = sessionFactory.getCurrentSession();
		current.saveOrUpdate(TindakanModel);
	}
}