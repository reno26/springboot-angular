package com.reno.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.reno.entity.Skate;

@RepositoryRestResource
public interface SkateRepository  extends JpaRepository<Skate,Long>{

}
