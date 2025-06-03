package com.ellsy.pumafalcon.DAWII_T1_PUMA_FALCON_ELLSY_PRODUCER.controller;

import com.ellsy.pumafalcon.DAWII_T1_PUMA_FALCON_ELLSY_PRODUCER.model.Character;
import com.ellsy.pumafalcon.DAWII_T1_PUMA_FALCON_ELLSY_PRODUCER.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharacterController {

    @Autowired
    private CharacterService characterService;

    @GetMapping("/consume/character/{id}")
    public Character fetchAndSendCharacter(@PathVariable Long id) {
        return characterService.fetchAndSendCharacter(id);
    }
}