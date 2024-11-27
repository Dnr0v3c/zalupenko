package com.oshchadbank.oshchad24.service;

import com.oshchadbank.oshchad24.model.Clients;
import com.oshchadbank.oshchad24.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {
    public List<User> findAllClients();

    User saveClients(User user);
    User updateClients(User user);

    void deleteClients(int id);

    User findById(int id);
}
