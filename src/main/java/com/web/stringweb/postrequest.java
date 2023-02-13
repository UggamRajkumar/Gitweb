package com.web.stringweb;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class postrequest {
	@GetMapping("id")
	public String getstrpost(Integer id, String name) {
		System.out.println(id);
		System.out.println(name);
		
		return "Uggam";
	}
	@GetMapping("id2")
	public String getstrpost2(@RequestParam(name="pid") Integer id,
			@RequestParam(name="pname")	String name) {
		System.out.println(id);
		System.out.println(name);
		
		return "Rajkumar";
	}
	@GetMapping("id3/{pid}/{pname}" )
	public String getstrpost3(@PathVariable(name="pid") Integer id,
			@PathVariable(name="pname")	String name) {
		System.out.println(id);
		System.out.println(name);
		
		return "Uggam Rajkumar";
	}
	
	

}
