package com.cjc.main.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.ProductAll;

@Repository
public interface Repositoryi extends JpaRepository<ProductAll, Integer> {
	
	public Optional<ProductAll> findById(Integer pid);
	
	public void deleteById (Integer pid);
	
	public ProductAll findByPname (String pname);

}
