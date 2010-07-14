/**
 * 
 */
package net.familyyu.jeff.cms.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jeffyu
 *
 */
@Entity
@Table(name="CMS_LOCATION")
public class Location {
	
	@Id @Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long _id;
	
	@Basic @Column(name="STREETNAME")
	private String streetName;
	
	@Basic @Column(name="SURBURB")
	private String surburb;
	
	@Basic @Column(name="COUNTRY")
	private String country;
	
	@Basic @Column(name="ZIPCODE")
	private String zipcode;

	public Long getId() {
		return _id;
	}

	public void setId(Long id) {
		this._id = id;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getSurburb() {
		return surburb;
	}

	public void setSurburb(String surburb) {
		this.surburb = surburb;
	}

}
