package com.ellsy.pumafalcon.AWII_T1_PUMA_FALCON_ELLSY_CONSUMER.service;

import com.ellsy.pumafalcon.AWII_T1_PUMA_FALCON_ELLSY_CONSUMER.entity.DragonBall;
import com.ellsy.pumafalcon.AWII_T1_PUMA_FALCON_ELLSY_CONSUMER.repository.DragonBallRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService {

    private static final Logger logger = LoggerFactory.getLogger(CharacterService.class);

    @Autowired
    private DragonBallRepository repository;

    @Autowired
    private ObjectMapper objectMapper;

    @KafkaListener(topics = "${spring.kafka.topic.dragonball}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(String message) {
        try {
            DragonBall character = objectMapper.readValue(message, DragonBall.class);
            repository.save(character);
            logger.info("Character {} saved successfully to database", character.getName());
        } catch (Exception e) {
            logger.error("Error processing Kafka message: {}", e.getMessage());
        }
    }

    public DragonBall saveCharacter(DragonBall character) {
        DragonBall saved = repository.save(character);
        logger.info("Character {} manually saved to database", character.getName());
        return saved;
    }

    public List<DragonBall> getAllCharacters() {
        return repository.findAll();
    }
}
