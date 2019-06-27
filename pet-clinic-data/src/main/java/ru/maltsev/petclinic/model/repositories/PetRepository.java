package ru.maltsev.petclinic.model.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.maltsev.petclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
