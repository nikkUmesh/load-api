package com.payload.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payload.entity.Detail;

public interface DetailRepository extends JpaRepository<Detail, Long> {

}
