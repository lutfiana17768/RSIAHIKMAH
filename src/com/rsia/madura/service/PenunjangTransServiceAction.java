/*
* @Author: PRADESGA
* @Date:   2018-04-07 04:02:55
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-25 13:27:33
*/
package com.rsia.madura.service;

import java.util.List;
import java.sql.Timestamp;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.PenunjangTransDAO;
import com.rsia.madura.entity.MPenunjangTrans;

@Service
public class PenunjangTransServiceAction implements PenunjangTransService {
    @Autowired
    private PenunjangTransDAO penunjangTransDAO;

    @Override
    @Transactional
    public List<MPenunjangTrans> findAll() {
        return this.penunjangTransDAO.getPenunjangTranss();
    }

    @Override
    @Transactional
    public List<MPenunjangTrans> findAll(int page, int limit) {
        return penunjangTransDAO.getPenunjangTranss(page, limit);
    }

    @Override
    @Transactional
    public String createLinks(int page, int limit) {
        return penunjangTransDAO.createLinks(page, limit);
    }

    @Override
    @Transactional
    public MPenunjangTrans getById(int id) {
        return penunjangTransDAO.getPenunjangTrans(id);
    }

    @Override
    @Transactional
    public void store(MPenunjangTrans data) {
    }

    @Override
    @Transactional
    public void update(MPenunjangTrans data) {
    }

    @Override
    @Transactional
    public void delete(MPenunjangTrans data) {
    }
}