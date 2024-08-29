package com.payload.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.payload.entity.Detail;
import com.payload.service.DetailService;

@RestController
public class DetailController {
	
	@Autowired
	private DetailService detailService;
	
	@PostMapping("/load")
	public Detail createDetail(@RequestBody Detail detail) {
		return detailService.createDetail(detail);
	}
	
	@GetMapping("/load")
	public List<Detail> getAllDetails(){
		return detailService.getAlDetails();
	}
	
	@GetMapping("/load/{id}")
	public Detail getDetailById(@PathVariable Long id) {
			return detailService.getDetailById(id);
		}
	
	@PutMapping("/load/{id}")
	public Detail updateDetail(@PathVariable Long id, @RequestBody Detail detail) {
		return detailService.updateDetail(id, detail);
	}
	
	@DeleteMapping("/load/{id}")
	public void deleteDetail(@PathVariable Long id) {
		detailService.deleteDetail(id);
	}
	
	
	}


