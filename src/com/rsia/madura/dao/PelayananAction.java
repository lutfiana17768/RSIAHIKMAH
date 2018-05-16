package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.t_Pelayanan;

@Repository
public class PelayananAction implements PelayananDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public int total;

	@Override
	public List<t_Pelayanan> getPelayanans() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		Query<t_Pelayanan> query = current.createQuery("from t_pendaftaran", t_Pelayanan.class);

		List<t_Pelayanan> Pelayanan = query.getResultList();

		return Pelayanan;
	}

	@Override
	public List<t_Pelayanan> getPelayanans(int page, int limit) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<t_Pelayanan> query = current.createQuery("from t_pendaftaran", t_Pelayanan.class);
		List<t_Pelayanan> Pelayanan = query.getResultList();
		this.total = Pelayanan.size();
		Pelayanan = this.getData(page, limit);

		return Pelayanan;
	}

	public List<t_Pelayanan> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<t_Pelayanan> query = current.createQuery("from t_pendaftaran", t_Pelayanan.class)
				.setFirstResult((page - 1) * limit).setMaxResults(limit);
		List<t_Pelayanan> Result = query.getResultList();

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
	public t_Pelayanan getPelayanan(int PelayananId) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		t_Pelayanan result = current.get(t_Pelayanan.class, PelayananId);

		return result;
	}

	@Override
	public int PelayananStore(t_Pelayanan PelayananModel) {
		Session current = sessionFactory.getCurrentSession();

		return (int) current.save(PelayananModel);

	}

	@Override
	public void PelayananUpdate(t_Pelayanan PelayananModel) {
		Session current = sessionFactory.getCurrentSession();

		current.saveOrUpdate(PelayananModel);
	}

	@Override
	public void PelayananDelete(t_Pelayanan PelayananModel) {
		Session current = sessionFactory.getCurrentSession();

		current.saveOrUpdate(PelayananModel);
	}
}
