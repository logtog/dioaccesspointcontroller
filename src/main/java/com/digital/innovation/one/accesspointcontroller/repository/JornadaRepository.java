package com.digital.innovation.one.accesspointcontroller.repository;

import com.digital.innovation.one.accesspointcontroller.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
}
