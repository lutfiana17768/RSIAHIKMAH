package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MPenunjangTrans;

public interface PenunjangTransService {
    public List<MPenunjangTrans> findAll();

    public List<MPenunjangTrans> findAll(int page, int limit);

    public String createLinks(int page, int limit);

    public MPenunjangTrans getById(int id);

    public void store(MPenunjangTrans data);

    public void update(MPenunjangTrans data);

    public void delete(MPenunjangTrans data);
}