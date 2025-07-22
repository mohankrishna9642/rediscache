package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class Usernotfound extends RuntimeException {
	public Usernotfound( String msg) {
		super(msg);
		
	}

}
