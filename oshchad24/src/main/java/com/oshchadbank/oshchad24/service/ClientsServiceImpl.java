package com.oshchadbank.oshchad24.service;

import com.oshchadbank.oshchad24.model.Clients;
import com.oshchadbank.oshchad24.model.User;
import com.oshchadbank.oshchad24.repository.ClientsRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
@Primary
public class ClientsServiceImpl implements ClientService{

    private final ClientsRepository repository;
    @Override
    public List<User> findAllClients() {
        return repository.findAll();
    }

    @Override
    public User saveClients(User user) {
        return repository.save(user);
    }

    @Override
    public User updateClients(User user) {
        return repository.save(user);
    }

    @Override
    public User findById(int id) {
        return repository.findById(id);
    }

    @Override
    public void deleteClients(int id) {
       repository.deleteById(id);
    }
}
