/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:20:28 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:20:28 
 */
package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MPaketTindakan;

@Repository
public class NPaketTindakanAction implements NPaketTindakanDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public int total;

	@Override
	public List<MPaketTindakan> getPaketTindakans() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		Query<MPaketTindakan> query = current.createQuery("from MPaketTindakan", MPaketTindakan.class);

		List<MPaketTindakan> paketobat = query.getResultList();

		return paketobat;
	}

	@Override
	public List<MPaketTindakan> getPaketTindakans(int page, int limit) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<MPaketTindakan> query = current.createQuery("from MPaketTindakan", MPaketTindakan.class);
		List<MPaketTindakan> paketobat = query.getResultList();
		this.total = paketobat.size();
		paketobat = this.getData(page, limit);

		return paketobat;
	}

	public List<MPaketTindakan> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MPaketTindakan> query = current.createQuery("from MPaketTindakan", MPaketTindakan.class)
				.setFirstResult((page - 1) * limit).setMaxResults(limit);
		List<MPaketTindakan> Result = query.getResultList();

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
	public MPaketTindakan getPaketTindakan(int pakettindakanId) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		MPaketTindakan result = current.get(MPaketTindakan.class, pakettindakanId);

		return result;
	}

	@Override
	public int Store(MPaketTindakan PaketTindakanModel) {
		Session current = sessionFactory.getCurrentSession();

		return (int) current.save(PaketTindakanModel);

	}

	@Override
	public void Update(MPaketTindakan PaketTindakanModel) {
		Session current = sessionFactory.getCurrentSession();

		current.saveOrUpdate(PaketTindakanModel);
	}

	@Override
	public void Delete(MPaketTindakan PaketTindakanModel) {
		Session current = sessionFactory.getCurrentSession();

		current.saveOrUpdate(PaketTindakanModel);
	}
}
