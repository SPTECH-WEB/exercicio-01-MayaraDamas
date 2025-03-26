package com.exercicioFixacao.repository;

import com.exercicioFixacao.model.Fatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaturaRepository extends JpaRepository<Fatura, Long> {
    Long id(Long id);
}
