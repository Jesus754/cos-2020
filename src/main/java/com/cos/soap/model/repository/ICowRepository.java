package com.cos.soap.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cos.soap.model.entity.CowEntity;

@Repository
public interface ICowRepository extends JpaRepository<CowEntity, Integer>{

}
