package com.cjc.main.controller;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cjc.main.baseresponse.BaseResponse;
import com.cjc.main.model.ProductAll;
import com.cjc.main.model.SupplierAll;
import com.cjc.main.servicei.SServicei;

@CrossOrigin("*")
@RestController
public class SHome 
{
	@Autowired
	SServicei ssi;
	
	@PostMapping("/supplier")
	public ResponseEntity<BaseResponse<SupplierAll>> savesupplier(@RequestBody SupplierAll s)
	{
		SupplierAll sr=ssi.savesupplier(s);
		BaseResponse<SupplierAll> baseresponse=new BaseResponse<SupplierAll>(201, new Date(), "Supplier Details Added Succesfully ....!!", sr);
		ResponseEntity<BaseResponse<SupplierAll>> responseentity=new ResponseEntity<BaseResponse<SupplierAll>> (baseresponse, HttpStatus.OK);
		return responseentity;
	}
	
//........................................................................................................................................................
	
	@GetMapping("/getsupplier")
	public ResponseEntity<BaseResponse<SupplierAll>> getsupplier()
	{
		Iterable<SupplierAll> list=ssi.getproduct();
		BaseResponse<Iterable<SupplierAll>> baseresponse=new BaseResponse<Iterable<SupplierAll>>(202, "All Supplier data", list);
		ResponseEntity<BaseResponse<SupplierAll>> responseentity=new ResponseEntity(baseresponse, HttpStatus.OK);
		return responseentity;
	}
	
//........................................................................................................................................................


}
