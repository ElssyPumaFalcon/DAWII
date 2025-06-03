package com.ellsy.pumafalcon.DAWII_T1_PUMA_FALCON_ELLSY_PRODUCER.service;

import com.ellsy.pumafalcon.DAWII_T1_PUMA_FALCON_ELLSY_PRODUCER.client.DragonBallClient;
import com.ellsy.pumafalcon.DAWII_T1_PUMA_FALCON_ELLSY_PRODUCER.model.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {
    @Autowired
    private DragonBallClient dragonBallClient;

    @Autowired
    private KafkaTemplate<String, Character> kafkaTemplate;

    public Character fetchAndSendCharacter(Long id) {
        Character character = dragonBallClient.getCharacterById(id);
        kafkaTemplate.send("DragonBall", character.getName(), character);
        return character;
    }
}