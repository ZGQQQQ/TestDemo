package com.needAddSpringIOCBean.service;

import com.needAddSpringIOCBean.dao.OrderDao;
import javax.annotation.Resource;


public class OrderService {
	@Resource(name = "orderDao02")
	private OrderDao orderDao01;
	@Override
	public String toString() {
		return "OrderService{" +
				"orderDao=" + orderDao01 +
				'}';
	}
}
