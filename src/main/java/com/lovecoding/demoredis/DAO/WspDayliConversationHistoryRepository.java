package com.lovecoding.demoredis.DAO;

import com.lovecoding.demoredis.Entity.WspDayliConversationHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WspDayliConversationHistoryRepository extends JpaRepository<WspDayliConversationHistory, UUID> {
}
