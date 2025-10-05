package com.github.diegolins10.clientapi.application.usecases;

import com.github.diegolins10.clientapi.domain.entities.Client;
import com.github.diegolins10.clientapi.domain.repositories.ClientRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class CreateClientUseCaseTest {

    private ClientRepository clientRepository;
    private CreateClientUseCase createClientUseCase;

    @BeforeEach
    void setUp() {
        clientRepository = Mockito.mock(ClientRepository.class);
        createClientUseCase = new CreateClientUseCase(clientRepository);
    }

    @Test
    void shouldCreateClientSuccessfully() {
        Client client = new Client(null, "Diego", "Lins", "diego@email.com", "123456789");
        Client savedClient = new Client(1L, "Diego", "Lins", "diego@email.com", "123456789");

        when(clientRepository.save(any(Client.class))).thenReturn(savedClient);

        Client result = createClientUseCase.execute(client);

        assertEquals(1L, result.getId());
        assertEquals("Diego", result.getFirstName());
        verify(clientRepository, times(1)).save(client);
    }
}
