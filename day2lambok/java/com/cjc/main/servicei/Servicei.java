package com.cjc.main.servicei;

import java.util.List;

import com.cjc.main.model.ProductAll;

public interface Servicei {

	ProductAll saveproduct(ProductAll p);

	ProductAll updateproduct(Integer pid, ProductAll p);

	void deleteproduct(Integer pid);

	Iterable<ProductAll> getproduct();

//	ProductAll searchproduct(String pname);

}
