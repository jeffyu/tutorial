package net.familyyu.jeff.professor.model;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="O_ADDRESS")
@NamedQueries({@NamedQuery(name="ADDRESS_BY_STATE", query="select m._id from Address m where m.state = :state")})
public class Address {
    
	public static final String ADDRESS_BY_STATE = "ADDRESS_BY_STATE";
	
	@Id @Column(name="ID")
	@GeneratedValue(strategy= GenerationType.AUTO)
    private Long _id;
    
	@Basic @Column(name="street")	
    private String street;
	
	@Basic @Column(name="city")
    private String city;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade={CascadeType.ALL}) 
	@JoinColumn(name="state_ID")
    private State state;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Long getId() {
		return _id;
	}

	public void setId(Long id) {
		this._id = id;
	}

	
}
