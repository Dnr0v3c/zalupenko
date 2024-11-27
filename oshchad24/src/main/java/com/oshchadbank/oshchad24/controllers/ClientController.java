package com.oshchadbank.oshchad24.controllers;

import com.oshchadbank.oshchad24.model.Clients;
import com.oshchadbank.oshchad24.model.User;
import com.oshchadbank.oshchad24.service.ClientService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store/user")
@Transactional
@AllArgsConstructor
public class ClientController {

    private ClientService clientService;


    @PostMapping("")
    public User saveClients(@RequestBody  User user){
        return clientService.saveClients(user);
    }

    @GetMapping("/{id}")
    public User findByTelephone(@PathVariable int id){
        return  clientService.findById(id);
    }

    @PutMapping("")
    public User updateClients(@RequestBody User user){
        return  clientService.saveClients(user);
    }

    @DeleteMapping("/{id}")
    public void deleteClients(@PathVariable int id){
        clientService.deleteClients(id);
    }

}
