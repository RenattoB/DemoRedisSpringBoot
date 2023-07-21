package com.lovecoding.demoredis.DAO;

import com.lovecoding.demoredis.Entity.Session;
import org.springframework.data.repository.CrudRepository;

public interface SessionRepository  extends CrudRepository<Session, String> {

}
