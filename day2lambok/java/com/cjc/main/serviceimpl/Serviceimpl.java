package com.cjc.main.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.ProductAll;
import com.cjc.main.repository.Repositoryi;
import com.cjc.main.servicei.Servicei;

@Service
public class Serviceimpl implements Servicei 
{
	@Autowired
	Repositoryi ri;

	@Override
	public ProductAll saveproduct(ProductAll p) 
	{
		ProductAll pa=ri.save(p);
		return pa;
	}

	@Override
	public ProductAll updateproduct(Integer pid, ProductAll p) 
	{
		Optional<ProductAll> op=ri.findById(pid);
		if(op.isPresent())
		{
			ProductAll productall=op.get();
			if(p.getPname()!=null)
			{
				productall.setPname(p.getPname());
			}
			if(p.getPprice()!=null)
			{
				productall.setPprice(p.getPprice());
			}
			return ri.save(productall);
		}
		else {
			return null;
		}
	}
	
	
//........................................................................................................................................................
	
  
	@Override
	public Iterable<ProductAll> getproduct() 
	{
		return ri.findAll();
	}
	
	
	
//........................................................................................................................................................
	

	@Override
	public void deleteproduct(Integer pid) 
	{
		ri.deleteById(pid);
		
	}
	
	
//........................................................................................................................................................

	
//	@Override
//	public ProductAll searchproduct(String pname) 
//	{
//		return ri.findByPname(pname);
//	}
	
	
	
//........................................................................................................................................................

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
