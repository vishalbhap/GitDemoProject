package com.cybage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="address")
@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Address {
	@Id
	@GeneratedValue
	private int addressId;
	private String area;
	private String street;
	private String pincode;
//	@OneToOne(mappedBy = "address")
//	private User user;

}
