package com.lovecoding.demoredis.Controller;

import com.lovecoding.demoredis.DAO.ClientRepository;
import com.lovecoding.demoredis.Entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/client")
public class ClientController {

    private ClientRepository clientRepository;

    @Autowired
    public ClientController(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    @PostMapping
    public Client saveClient(@RequestBody Client client){
        return clientRepository.save(client);
    }

    @PostMapping("/{id}")
    public Client saveClient(@PathVariable int id, @RequestBody Client client){
        Optional<Client> clientToUpdate = clientRepository.findById(id);
        if (clientToUpdate.isPresent()) {
            clientToUpdate.get().setClient_name(client.getClient_name());
            clientToUpdate.get().setClient_last_name(client.getClient_last_name());
            clientToUpdate.get().setClient_number(client.getClient_number());
            clientRepository.save(clientToUpdate.get());
        } else {
            return null;
        }
        return clientToUpdate.get();
    }

}
