/**
 * 
 */
package net.familyyu.jeff.cms.model;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author jeffyu
 *
 */
@Entity
@Table(name="CMS_VENDOR")
@NamedQueries({@NamedQuery(name=Vendor.FIND_BY_NAME, query="select v from Vendor v where v.name = :name")})
public class Vendor {
	
	public static final String FIND_BY_NAME = "FIND_BY_NAME";
	
	@Id @Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long _id;
	
	@Basic @Column(name="NAME")
	private String name;
	
	@Basic @Column(name="TELEPHONE")
	private String telephone;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	private Location location;

	public Long getId() {
		return _id;
	}

	public void setId(Long id) {
		this._id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	

}
