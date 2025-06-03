package com.ellsy.pumafalcon.AWII_T1_PUMA_FALCON_ELLSY_CONSUMER.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class DragonBall {
    @Id
    private String name;
    private String ki;
    private String maxKi;
    private String race;
    private String gender;
    private String description;
}