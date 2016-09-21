package com.nalashaa.ts.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="nsrole")
public class Role extends EntityBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column
	protected String name;
	
	@Column
	protected String shortName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
}
