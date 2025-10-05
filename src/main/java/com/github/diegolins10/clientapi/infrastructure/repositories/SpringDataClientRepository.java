package com.github.diegolins10.clientapi.infrastructure.repositories;

import com.github.diegolins10.clientapi.domain.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataClientRepository extends JpaRepository<Client, Long> {}
