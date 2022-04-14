package com.company.service;

import com.company.model.Client;

import java.util.List;

public class ClientServiceImpl implements ClientService{

    @Override
    public void create(Client client) {

    }

    @Override
    public List<Client> readAll() {
        return null;
    }

    @Override
    public Client read(int id) {
        return new Client(id, "Mikhail", "Babaev", "+7-967-97-69-62");
    }

    @Override
    public boolean update(Client client, int id) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
