/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:19:50 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:19:50 
 */
package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MPaketObat;

@Repository
public class NPaketObatAction implements NPaketObatDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public int total;

	@Override
	public List<MPaketObat> getPaketObats() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		Query<MPaketObat> query = current.createQuery("from MPaketObat", MPaketObat.class);

		List<MPaketObat> paketobat = query.getResultList();

		return paketobat;
	}

	@Override
	public List<MPaketObat> getPaketObats(int page, int limit) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<MPaketObat> query = current.createQuery("from MPaketObat", MPaketObat.class);
		List<MPaketObat> paketobat = query.getResultList();
		this.total = paketobat.size();
		paketobat = this.getData(page, limit);

		return paketobat;
	}

	public List<MPaketObat> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MPaketObat> query = current.createQuery("from MPaketObat", MPaketObat.class)
				.setFirstResult((page - 1) * limit).setMaxResults(limit);
		List<MPaketObat> Result = query.getResultList();

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
	public MPaketObat getPaketObat(int paketobatId) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		MPaketObat result = current.get(MPaketObat.class, paketobatId);

		return result;
	}

	@Override
	public int Store(MPaketObat PaketObatModel) {
		Session current = sessionFactory.getCurrentSession();

		return (int) current.save(PaketObatModel);

	}

	@Override
	public void Update(MPaketObat PaketObatModel) {
		Session current = sessionFactory.getCurrentSession();

		current.saveOrUpdate(PaketObatModel);
	}

	@Override
	public void Delete(MPaketObat PaketObatModel) {
		Session current = sessionFactory.getCurrentSession();

		current.saveOrUpdate(PaketObatModel);
	}
}
