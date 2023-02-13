package com.web.stringweb;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Productcontroller {
	@PostMapping("pro")
	public void save(@RequestBody prodct p) {
		
		System.out.println(p);
	}

	@PostMapping("prolist")
	public void savelist(@RequestBody List<prodct> pl) {
		System.out.println(pl);
		for(prodct j:pl) {
			System.out.println(j);
		}
	}
}
