package com.oshchadbank.oshchad24.repository;

import com.oshchadbank.oshchad24.model.Clients;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryClientsDAO {
    private final List<Clients> CLIENTS = new ArrayList<>();


    public List<Clients> findAllClients() {
        return CLIENTS;
    }


    public Clients saveClients(Clients clients) {
        CLIENTS.add(clients);
        return clients;
    }


    public Clients updateClients(Clients clients) {
        var clientsIndex = IntStream.range(0,CLIENTS.size())
                .filter(index -> CLIENTS.get(index).getTelephone().equals(clients.getTelephone()))
                .findFirst()
                .orElse(-1);
        if (clientsIndex > -1){
            CLIENTS.set(clientsIndex,clients);
            return clients;
        }


        return null;
    }


    public Clients findByTelephone(String telephone) {
        return CLIENTS.stream().filter(element -> element.getTelephone().equals(telephone))
                .findFirst()
                .orElse(null);

    }


    public void deleteClients(String telephone) {
        var clients = findByTelephone(telephone);
        if (clients != null){
            CLIENTS.remove(clients);
        }

    }
}
