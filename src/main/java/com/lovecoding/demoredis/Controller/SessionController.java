package com.lovecoding.demoredis.Controller;

import com.lovecoding.demoredis.DAO.SessionRepository;
import com.lovecoding.demoredis.Entity.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/session")
public class SessionController {

    private SessionRepository sessionRepository;

    @Autowired
    public SessionController (SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    @PostMapping
    public Session save(@RequestBody Session session){
        return sessionRepository.save(session);
    }

    @GetMapping
    public List<Session> findAllSessions(){
        return (List<Session>) sessionRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Session> findSessionById(@PathVariable String id){
        return sessionRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteSessionById(@PathVariable String id){
        sessionRepository.deleteById(id);
        return "Session deleted successfully";
    }
}
