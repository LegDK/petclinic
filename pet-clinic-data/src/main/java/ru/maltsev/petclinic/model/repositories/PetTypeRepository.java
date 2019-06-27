package ru.maltsev.petclinic.model.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.maltsev.petclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
