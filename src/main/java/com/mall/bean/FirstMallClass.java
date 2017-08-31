package com.mall.bean;

public class FirstMallClass {

	private Integer id;
	//分类名称
	private String flmch1;

	public FirstMallClass(Integer id, String flmch1) {
		super();
		this.id = id;
		this.flmch1 = flmch1;
	}

	public FirstMallClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFlmch1() {
		return flmch1;
	}

	public void setFlmch1(String flmch1) {
		this.flmch1 = flmch1;
	}

	@Override
	public String toString() {
		return "MallClassOne [id=" + id + ", flmch1=" + flmch1 + "]";
	}

}
