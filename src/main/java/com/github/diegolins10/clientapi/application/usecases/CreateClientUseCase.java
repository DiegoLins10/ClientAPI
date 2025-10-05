package com.github.diegolins10.clientapi.application.usecases;

import com.github.diegolins10.clientapi.domain.entities.Client;
import com.github.diegolins10.clientapi.domain.repositories.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateClientUseCase {

    private final ClientRepository clientRepository;

    public Client execute(Client client) {
        return clientRepository.save(client);
    }
}
