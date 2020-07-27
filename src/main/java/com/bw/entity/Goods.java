package com.bw.entity;

public class Goods {
	private Integer id;//编号
	
	private String name;//名称
	
	private Integer jia;//价格
	
	private String bai;//百分比

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getJia() {
		return jia;
	}

	public void setJia(Integer jia) {
		this.jia = jia;
	}

	public String getBai() {
		return bai;
	}

	public void setBai(String bai) {
		this.bai = bai;
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", jia=" + jia + ", bai=" + bai + "]";
	}

	public Goods(Integer id, String name, Integer jia, String bai) {
		super();
		this.id = id;
		this.name = name;
		this.jia = jia;
		this.bai = bai;
	}

	public Goods() {
		super();
	}
	
	
}
