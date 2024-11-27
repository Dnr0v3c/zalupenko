package com.oshchadbank.oshchad24.repository;

import com.oshchadbank.oshchad24.model.Clients;
import com.oshchadbank.oshchad24.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ClientsRepository extends JpaRepository<User,Long> {
    void deleteById(int id);
    User findById(int id);


}
