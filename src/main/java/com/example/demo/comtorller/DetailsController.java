package com.example.demo.comtorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DetailsService;
import com.example.demomodel.Details;


@RestController
public class DetailsController {
	
	
	@Autowired
	private DetailsService ds;
	
	@RequestMapping("/create")
	public String create(@RequestParam String name,@RequestParam Double creditLimit,@RequestParam Double creditAvailable, @RequestParam Double balance) {
		Details D = ds.create(name, creditLimit, creditAvailable,balance);
		return D.toString();
	}
	
	@RequestMapping("/get")
	public Details getDetail(@RequestParam String name) {
		return ds.getByName(name);
	}
	@RequestMapping("/getInfo")
	public List<Details> getAll(){
		return ds.getAll();
	}
	@RequestMapping("/update")
	public String update(@RequestParam String name,@RequestParam Double amnt) {
		Details D = ds.update(name, amnt);
		return D.toString();
	}
	

}
