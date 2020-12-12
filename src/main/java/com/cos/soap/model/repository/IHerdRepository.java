package com.cos.soap.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cos.soap.model.entity.HerdEntity;

@Repository
public interface IHerdRepository extends JpaRepository<HerdEntity, Integer>{

	public Optional<HerdEntity> findByLocation(String location);
}
