package com.lovecoding.demoredis.DAO;

import com.lovecoding.demoredis.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
