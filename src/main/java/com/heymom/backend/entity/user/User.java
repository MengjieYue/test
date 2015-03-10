package com.heymom.backend.entity.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.heymom.backend.entity.BaseEntity;

@Entity
@Table(name = "user")
public class User extends BaseEntity {
	private String email;
	private Long id;
	private String mobile;
	private String name;
	private String password;
	private UserInfo userInfo;

	@Column(name = "email", unique = true, length = 50)
	public String getEmail() {
		return email;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false, precision = 20, scale = 0)
	public Long getId() {
		return id;
	}

	@Column(name = "mobile", unique = true, length = 50)
	public String getMobile() {
		return mobile;
	}

	@Column(name = "name", unique = true, length = 50)
	public String getName() {
		return name;
	}

	@Column(name = "password", length = 50)
	public String getPassword() {
		return password;
	}

	@OneToOne
	@PrimaryKeyJoinColumn
	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

}
