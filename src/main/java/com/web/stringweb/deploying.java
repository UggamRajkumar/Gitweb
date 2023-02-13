package com.web.stringweb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class deploying {

	@GetMapping("hi")
	public String getString() {
		return "Rajkumar";
	}
	@GetMapping("hiii")
	public Integer getint() {
		return 123;
	}
	@GetMapping("intarr")
	public Integer[] getarray() {
		return new Integer[] {1,2,3,4,5,6};
	}
	@GetMapping("liststr")
	public List<String> liststr(){
		List<String> ls=new ArrayList<>();
		String s1=new String("dharma");
		String s2=new String("arjuna");
		String s3=new String("bheema");
		String s4=new String("nakula");
		String s5=new String("sahadev");
		ls.add(s1);ls.add(s2);ls.add(s3);ls.add(s4);ls.add(s5);
		
		return ls;
	}
	@GetMapping("mapstr")
	public Map<Integer, String> mapstr(){
		String s1=new String("dharma");
		String s2=new String("arjuna");
		String s3=new String("bheema");
		String s4=new String("nakula");
		String s5=new String("sahadev");
		Map<Integer, String> mp=new HashMap<Integer, String>();
		mp.put(1, s1);mp.put(2, s2);mp.put(3, s3);mp.put(4, s4);mp.put(5, s5);
		
		return mp;
	}
	@GetMapping("product")
	public prodct getproduct() {
		prodct p=new prodct(1, "lapy", "skyblue", 1000.00);
		return p;
	}
	@GetMapping("productlist")
	public List<prodct> listproduct(){
		
		prodct p1=new prodct(1, "lapy", "skyblue", 1000.00);
		prodct p2=new prodct(2, "tv", "black", 2000.00);
		prodct p3=new prodct(3, "bike", "orange", 3000.00);
		prodct p4=new prodct(4, "car", "grey", 4000.00);
		prodct p5=new prodct(5, "radio", "green", 5000.00);		List<prodct> lp=new ArrayList<prodct>();
		lp.add(p1);lp.add(p2);lp.add(p3);lp.add(p4);lp.add(p5);
		return lp;
	}
	@GetMapping("maplistproduct")
	public Map<String,prodct> mapproduct(){		
		prodct p1=new prodct(1, "lapy", "skyblue", 1000.00);
		prodct p2=new prodct(2, "tv", "black", 2000.00);
		prodct p3=new prodct(3, "bike", "orange", 3000.00);
		prodct p4=new prodct(4, "car", "grey", 4000.00);
		prodct p5=new prodct(5, "radio", "green", 5000.00);
		Map<String, prodct> mp=new HashMap<String, prodct>();
		mp.put("one", p1);mp.put("two", p2);mp.put("three", p3);
		mp.put("four", p4);mp.put("five", p5);
		return mp;
	}
	
	
}
