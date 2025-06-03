package com.ellsy.pumafalcon.AWII_T1_PUMA_FALCON_ELLSY_CONSUMER.controller;

import com.ellsy.pumafalcon.AWII_T1_PUMA_FALCON_ELLSY_CONSUMER.entity.DragonBall;
import com.ellsy.pumafalcon.AWII_T1_PUMA_FALCON_ELLSY_CONSUMER.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personajes")
public class CharacterController {

    @Autowired
    private CharacterService service;

    @GetMapping
    public ResponseEntity<List<DragonBall>> getAllCharacters() {
        return ResponseEntity.ok(service.getAllCharacters());
    }

    @PostMapping
    public ResponseEntity<DragonBall> createCharacter(@RequestBody DragonBall character) {
        return ResponseEntity.ok(service.saveCharacter(character));
    }
}
