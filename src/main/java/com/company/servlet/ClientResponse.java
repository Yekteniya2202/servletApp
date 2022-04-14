package com.company.servlet;

import com.company.model.Client;

import java.io.Serializable;

public class ClientResponse implements Serializable {
    Client client;
    Integer statusCode;
    String description;
    ClientResponse(){

    }
    ClientResponse(Client client, Integer statusCode, String description){
        this.client = client;
        this.statusCode = statusCode;
        this.description = description;
    }
}
