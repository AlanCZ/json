package com.mall.bean;

public class SecondMallClass {

	private Integer id;
	private String flmch2;
	private String flmch1;

	public SecondMallClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SecondMallClass(Integer id, String flmch2, String flmch1) {
		super();
		this.id = id;
		this.flmch2 = flmch2;
		this.flmch1 = flmch1;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFlmch2() {
		return flmch2;
	}

	public void setFlmch2(String flmch2) {
		this.flmch2 = flmch2;
	}

	public String getFlmch1() {
		return flmch1;
	}

	public void setFlmch1(String flmch1) {
		this.flmch1 = flmch1;
	}

	@Override
	public String toString() {
		return "SecondMallClass [id=" + id + ", flmch2=" + flmch2 + ", flmch1=" + flmch1 + "]";
	}

}
