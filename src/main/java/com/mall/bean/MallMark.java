package com.mall.bean;

public class MallMark {

	private Integer id;
	private String ppmch;
	private String url;

	public MallMark() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MallMark(Integer id, String ppmch, String url) {
		super();
		this.id = id;
		this.ppmch = ppmch;
		this.url = url;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPpmch() {
		return ppmch;
	}

	public void setPpmch(String ppmch) {
		this.ppmch = ppmch;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "MallMark [id=" + id + ", ppmch=" + ppmch + ", url=" + url + "]";
	}

}
