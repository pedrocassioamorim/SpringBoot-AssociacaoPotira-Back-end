package com.example.associacao_potira.infraestructure.repositories.interfaces.clients;

import com.example.associacao_potira.domain.clients.Client;

import java.util.List;

public interface ClientRepository {

    List<Client> findAll();

    Client findById(Long id);

    Client update(Client client, Long Id);

    Client save(Client client);

    void delete(Long Id);
}