package com.lovecoding.demoredis.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="WspDayliConversationHistory")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class WspDayliConversationHistory extends BaseAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String conversationId;

    @Column(name="reciever")
    private String reciever;

    @Column(name="Sender")
    private String sender;

    @Column(name="sender_type")
    private String sender_type;

    @Column(name="content_type")
    private String content_type;

    @Column(name="content")
    private String content;

}
