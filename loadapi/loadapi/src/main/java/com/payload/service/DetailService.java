package com.payload.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payload.entity.Detail;
import com.payload.repository.DetailRepository;

@Service
public class DetailService {
	
	@Autowired
	private DetailRepository detailRepository;
	
	public Detail createDetail(Detail detail) {
		return detailRepository.save(detail);
	}
	
	public List<Detail> getAlDetails(){
		return detailRepository.findAll();
	}
	
	public Detail getDetailById(Long id) {
		return detailRepository.findById(id).orElse(null);
	}
	
	public Detail updateDetail(Long id, Detail detail) {
		
		detail.setId(id);
		return detailRepository.save(detail);
	}
	
	public void deleteDetail(Long id) {
		detailRepository.deleteById(id);
	}
	
	

}
