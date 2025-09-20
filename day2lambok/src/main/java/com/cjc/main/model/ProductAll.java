package com.cjc.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class ProductAll 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pid;
	private String pname;
	private String pprice;
	@ManyToOne
	private SupplierAll s;

}
