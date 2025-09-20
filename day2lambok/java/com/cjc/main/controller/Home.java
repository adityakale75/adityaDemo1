package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.baseresponse.BaseResponse;
import com.cjc.main.model.ProductAll;
import com.cjc.main.servicei.Servicei;
@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class Home
{
	@Autowired
	Servicei si;
	
	@PostMapping("/product")
	public ResponseEntity<BaseResponse<ProductAll>> saveproduct(@RequestBody ProductAll p)
	{
		System.out.println("in product");
		ProductAll pr=si.saveproduct(p);
		BaseResponse<ProductAll> baseresponse=new BaseResponse<ProductAll>(201, "Product Details Added Succesfully ....!!", pr);
		ResponseEntity<BaseResponse<ProductAll>> responseentity=new ResponseEntity<BaseResponse<ProductAll>> (baseresponse, HttpStatus.OK);
		return responseentity;
	}
	
	
//........................................................................................................................................................	
	
	
	@PutMapping("/product/{pid}")
	public ResponseEntity<BaseResponse<ProductAll>> updateproduct(@RequestBody ProductAll p, @PathVariable Integer pid)
	{
		ProductAll pr=si.updateproduct(pid,p);
		BaseResponse<ProductAll> baseresponse=new BaseResponse<ProductAll>(203, "Product Updated Succesfully", pr);
		ResponseEntity<BaseResponse<ProductAll>> responseentity=new ResponseEntity<BaseResponse<ProductAll>> (baseresponse, HttpStatus.OK);
		return responseentity;
	}
	
	
//........................................................................................................................................................	
	
	
	@GetMapping("/getproduct")
	public ResponseEntity<BaseResponse<ProductAll>> getproduct()
	{
		Iterable<ProductAll> list=si.getproduct();
		BaseResponse<Iterable<ProductAll>> baseresponse=new BaseResponse<Iterable<ProductAll>>(202, "All Product", list);
		ResponseEntity<BaseResponse<ProductAll>> responseentity=new ResponseEntity(baseresponse, HttpStatus.OK);
		return responseentity;
	}
	
	
//........................................................................................................................................................	
	
	@DeleteMapping("/product/{pid}")
	public ResponseEntity<BaseResponse<ProductAll>> deleteproduct(@PathVariable Integer pid)
	{
		si.deleteproduct(pid);
		BaseResponse<ProductAll> baseresponse=new BaseResponse<ProductAll>(204, "Product Deleted Succesfully ...!!", null);
		ResponseEntity<BaseResponse<ProductAll>> responseentity=new ResponseEntity<BaseResponse<ProductAll>> (baseresponse, HttpStatus.NO_CONTENT);
		return responseentity;
	}
	
	
//........................................................................................................................................................
	
	
//	@GetMapping("/getproduct/{pname}")
//	public ProductAll searchproduct(@PathVariable String pname)
//	{
//		ProductAll p=si.searchproduct(pname);
//		return p;
//	}
	
	
//........................................................................................................................................................
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
