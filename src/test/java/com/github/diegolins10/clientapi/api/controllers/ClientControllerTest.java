package com.github.diegolins10.clientapi.api.controllers;

import com.github.diegolins10.clientapi.application.usecases.CreateClientUseCase;
import com.github.diegolins10.clientapi.application.usecases.GetAllClientsUseCase;
import com.github.diegolins10.clientapi.domain.entities.Client;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class ClientControllerTest {

    private CreateClientUseCase createClientUseCase;
    private GetAllClientsUseCase getAllClientsUseCase;
    private ClientController clientController;

    @BeforeEach
    void setUp() {
        createClientUseCase = Mockito.mock(CreateClientUseCase.class);
        getAllClientsUseCase = Mockito.mock(GetAllClientsUseCase.class);
        clientController = new ClientController(createClientUseCase, getAllClientsUseCase);
    }

    @Test
    void shouldCreateClient() {
        Client client = new Client(1L, "Diego", "Lins", "diego@email.com", "123456789");
        Client savedClient = new Client(1L, "Diego", "Lins", "diego@email.com", "123456789");

        when(createClientUseCase.execute(client)).thenReturn(savedClient);

        ResponseEntity<Client> response = clientController.createClient(client);

        assertEquals(1L, response.getBody().getId());
        verify(createClientUseCase, times(1)).execute(client);
    }

    @Test
    void shouldGetAllClients() {
        List<Client> clients = List.of(
                new Client(1L, "Diego", "Lins", "diego@teste.com", "1234567"),
                new Client(2L, "Anna", "Senna", "anna@email.com", "987654321")
        );

        when(getAllClientsUseCase.execute()).thenReturn(clients);

        ResponseEntity<List<Client>> response = clientController.getAllClients();

        assertEquals(2, response.getBody().size());
        verify(getAllClientsUseCase, times(1)).execute();
    }
}
