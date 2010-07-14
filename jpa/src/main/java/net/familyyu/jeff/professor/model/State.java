/**
 * 
 */
package net.familyyu.jeff.professor.model;

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
@Table(name="O_STATE")
public class State {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long _id;
	
	@Basic @Column(name="name")
	private String name;
	
	@Basic @Column(name="zip")
	private String zip;
	
	public State() {
		
	}
	
	public State(String name, String zip) {
		this.name = name;
		this.zip = zip;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Long getId() {
		return _id;
	}

	public void setId(Long id) {
		this._id = id;
	}


}
