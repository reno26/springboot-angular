package com.reno.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Skate {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
	public Skate() {
	}

	public Skate(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Skate [id=" + id + ", name=" + name + "]";
	}

}
