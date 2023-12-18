package com.pluralsight.simplespring;

import org.springframework.stereotype.Component;

@Component
public class PetDAOImpl implements PetDAO {
    @Override
    public Pet getPetById() {
        return new Pet();
    }
}
