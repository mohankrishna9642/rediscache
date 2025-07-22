package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	private Service ss;
	@PostMapping("/add")
	public ResponseEntity<Userdata>save( @RequestBody Userdata data)
	{
		return new ResponseEntity<>(ss.dd(data),HttpStatus.OK);
	}
	@GetMapping("/retrive/{id}")
	public ResponseEntity<Userdata> retrive(@PathVariable("id")Integer id)
	{
		return new ResponseEntity<Userdata>(ss.retrive(id),HttpStatus.OK);
	}
	@PutMapping("/modify")
	@ResponseStatus(value=HttpStatus.ACCEPTED)
	public Userdata modify(@RequestBody Userdata dd)
	{
		return ss.dd(dd);
	}
	@DeleteMapping("/delete/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public String delete( @PathVariable("id") Integer id)
	{
		return ss.delete(id);
	}

}
