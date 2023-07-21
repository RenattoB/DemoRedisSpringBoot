package com.lovecoding.demoredis.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Client")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Client extends BaseAudit{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="client_name")
    private String client_name;

    @Column(name="client_last_name")
    private String client_last_name;

    @Column(name="client_number")
    private String client_number;

}
