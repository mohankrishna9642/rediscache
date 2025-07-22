package com.example.demo;

import java.nio.file.attribute.UserPrincipalNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

@org.springframework.stereotype.Service
public class Service {
	@Autowired
	private Userepo repo;
	
	public Userdata dd(Userdata data)
	{
		return repo.save(data);
	}
	@Cacheable(value = "user",key = "#id")
	public Userdata  retrive(Integer id)
	{
		return repo.findById(id).orElseThrow(()->new Usernotfound("invalid user"));
	}
	@CachePut(value = "user" ,key="#data.getId()")
	public Userdata modify(Userdata data)
	{
		return  repo.save(data);
	}
	@CacheEvict(value = "user",key="#id")
	public String delete(Integer id)
	{
		repo.deleteById(id);
		return "the data is deleted sucessfully";
	}

}
