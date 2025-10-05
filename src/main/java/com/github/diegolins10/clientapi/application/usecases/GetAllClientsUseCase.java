package com.github.diegolins10.clientapi.application.usecases;

import com.github.diegolins10.clientapi.domain.entities.Client;
import com.github.diegolins10.clientapi.domain.repositories.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GetAllClientsUseCase {

    private final ClientRepository clientRepository;

    public List<Client> execute() {
        return clientRepository.findAll();
    }
}
