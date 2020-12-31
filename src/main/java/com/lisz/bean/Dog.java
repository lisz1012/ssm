package com.lisz.bean;

import java.io.Serializable;

public class Dog implements Serializable {
	private Integer id;
	private String name;
	private Integer age;
	private String gender;
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Dog{" +
				"id=" + id +
				", name='" + name + '\'' +
				", age=" + age +
				", gender='" + gender + '\'' +
				", user=" + user +
				'}';
	}
}
