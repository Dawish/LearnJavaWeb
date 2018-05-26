package com.xrom.ssh.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by XRom
 * On 11/16/2017.11:50 PM
 */
@Data
@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "created")
    private Long created = System.currentTimeMillis();

    @Column(name = "username")
    private String username;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "remark")
    private String remark;

	public void setId(Long id) {
		this.id = id;
	}

	public void setCreated(Long created) {
		this.created = created;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getId() {
		return id;
	}

	public Long getCreated() {
		return created;
	}

	public String getUsername() {
		return username;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public String getRemark() {
		return remark;
	}
    
    
    
}
