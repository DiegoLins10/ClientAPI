package com.github.diegolins10.clientapi.domain.repositories;

import java.util.List;
import java.util.Optional;
import com.github.diegolins10.clientapi.domain.entities.Client;

public interface ClientRepository {

    Client save(Client client);

    Optional<Client> findById(Long id);

    List<Client> findAll();

    void deleteById(Long id);
}
