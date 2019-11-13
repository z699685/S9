package com.example.demo.pojo;

import java.sql.Date;

public class Result {
	private Integer id;
	private String name;
	private Integer t_match;
	private Date played_time;
	private String result;

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

	public Date getPlayed_time() {
		return played_time;
	}

	public void setPlayed_time(Date played_time) {
		this.played_time = played_time;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Integer getT_match() {
		return t_match;
	}

	public void setT_match(Integer t_match) {
		this.t_match = t_match;
	}

}
