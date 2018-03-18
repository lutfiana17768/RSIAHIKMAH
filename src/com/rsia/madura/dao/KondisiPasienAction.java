package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.m_Kondisi;
import com.rsia.madura.entity.m_Provinsi;

@Repository
public class KondisiPasienAction implements KondisiPasienDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public int total;

	@Override
	public List<m_Kondisi> getKondisis() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		
		Query<m_Kondisi> query = current.createQuery("from m_kondisi", m_Kondisi.class);
		
		List<m_Kondisi> kondisi = query.getResultList();
		
		return kondisi;
	}

	@Override
	public List<m_Kondisi> getKondisis(int page, int limit) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<m_Kondisi> query = current.createQuery("from m_Kondisi", m_Kondisi.class);
		List<m_Kondisi> kondisi = query.getResultList();
		this.total = kondisi.size();
		kondisi = this.getData(page, limit);
		
		return kondisi;
	}

	public List<m_Kondisi> getData( int page, int limit) {
    	Session current = sessionFactory.getCurrentSession();
    	Query<m_Kondisi> query = current.createQuery("from m_Kondisi", m_Kondisi.class).setFirstResult((page-1)*limit).setMaxResults(limit);
        List<m_Kondisi> Result = query.getResultList();

        return Result;
    }

	@Override
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		double last       = Math.ceil( (double)this.total / (double)limit );

        int start      = ( ( page - 5 ) > 0 ) ? page - 5 : 1;
        int end        = (int) (( ( page + 5 ) < last ) ? page + 5 : last);

        String html       = "<ul class='pagination'>";

        String first     = ( page == 1 ) ? "disabled" : "";
        html = html + "<li class='page-first' "+ first + "><a href='?limit=" + limit + "&page=" + ( page - 1 ) + "'>&laquo;</a></li>";

        if ( start > 1 ) {
            html   = html + "<li class='page-number'><a href='?limit="+ limit + "&page=1'>1</a></li>";
            html   = html + "<li class='page-number disabled'><span>...</span></li>";
        }

        for ( int i = start ; i <= end; i++ ) {
            String position  = ( page == i ) ? "active" : "";
            html   = html + "<li class='page-number ' " + position + "'><a href='?limit=" + limit + "&page=" + i + "'> "+ i + "</a></li>";
        }

        if ( end < last ) {
            html   = html + "<li class='page-number disabled'><span>...</span></li>";
            html   = html + "<li class='page-number'><a href='?limit=" + limit + "&page=" + (int)last + "'>" + (int)last + "</a></li>";
        }

        String status      = ( page == (int)last ) ? "disabled" : "";
        html       = html + "<li class='page-number " + status + "'><a href='?limit=" + limit + "&page=" + ( page + 1 ) + "'>&raquo;</a></li>";

        html       = html + "</ul>";

        return html;
	}

	@Override
	public m_Kondisi getKondisi(int kondisiId) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		
		m_Kondisi result = current.get(m_Kondisi.class, kondisiId);
		
		return result;
	}

	@Override
	public void kondisiStore(m_Kondisi kondisiModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(kondisiModel);
	}

	@Override
	public void kondisiUpdate(m_Kondisi kondisiModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(kondisiModel);
		
	}

	@Override
	public void kondisiDelete(m_Kondisi kondisiModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(kondisiModel);
		
	}
	

}
