package com.JPASPRING.ejemploJPA.accessingdatajpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DDRRepository extends CrudRepository<DDR, Long> {

  List<DDR> findByDenominacion(String denominacion);

  DDR findByCodigo(Long codigo);
}