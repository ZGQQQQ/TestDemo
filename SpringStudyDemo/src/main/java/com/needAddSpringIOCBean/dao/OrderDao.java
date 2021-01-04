package com.needAddSpringIOCBean.dao;


public class OrderDao {
	private String label;
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "OrderDao{" +
				"label='" + label + '\'' +
				'}';
	}
}

