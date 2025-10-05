package com.github.diegolins10.clientapi.api.controllers;

import com.github.diegolins10.clientapi.application.usecases.CreateClientUseCase;
import com.github.diegolins10.clientapi.application.usecases.GetAllClientsUseCase;
import com.github.diegolins10.clientapi.domain.entities.Client;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/clients")
@RequiredArgsConstructor
public class ClientController {

    private final CreateClientUseCase createClientUseCase;
    private final GetAllClientsUseCase getAllClientsUseCase;

    @PostMapping
    public ResponseEntity<Client> createClient(@RequestBody Client client) {
        Client savedClient = createClientUseCase.execute(client);
        return ResponseEntity.ok(savedClient);
    }

    @GetMapping
    public ResponseEntity<List<Client>> getAllClients() {
        return ResponseEntity.ok(getAllClientsUseCase.execute());
    }
}
