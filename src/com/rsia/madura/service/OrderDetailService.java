package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MOrderDetail;

public interface OrderDetailService {
	public List<MOrderDetail> getOrderDetails();
	public List<MOrderDetail> getOrderDetails(int page, int limit);
	public String createLinks(int page, int limit);
	public MOrderDetail getOrderDetail(int orderDetailId);
	
	public int store(MOrderDetail orderDetailModel);
	public int update(MOrderDetail orderDetailModel);
	public int delete(MOrderDetail orderDetailModel);
}
