package com.cjc.main.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.ProductAll;
import com.cjc.main.model.SupplierAll;
import com.cjc.main.repository.SRepositoryi;
import com.cjc.main.servicei.SServicei;

@Service
public class SServiceImpl implements SServicei {
	@Autowired
	SRepositoryi sri;

	@Override
	public SupplierAll savesupplier(SupplierAll s) {
		return sri.save(s);
	}
	

	@Override
	public Iterable<SupplierAll> getproduct() {
		return sri.findAll();
	}


}
