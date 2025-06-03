package com.ellsy.pumafalcon.DAWII_T1_PUMA_FALCON_ELLSY_PRODUCER.client;

import com.ellsy.pumafalcon.DAWII_T1_PUMA_FALCON_ELLSY_PRODUCER.model.Character;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "dragonball", url = "${dragonball.api.url}")
public interface DragonBallClient {
    @GetMapping("/characters/{id}")
    Character getCharacterById(@PathVariable("id") Long id);
}