package com.entornos.proyecto.repositories;

import com.entornos.proyecto.models.GatitoModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GatitoRepository extends CrudRepository<GatitoModel, Long> {
}