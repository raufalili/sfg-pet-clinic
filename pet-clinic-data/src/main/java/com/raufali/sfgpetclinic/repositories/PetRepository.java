package com.raufali.sfgpetclinic.repositories;

import com.raufali.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
