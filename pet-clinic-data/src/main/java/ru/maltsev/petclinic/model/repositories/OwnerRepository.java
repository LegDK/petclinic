package ru.maltsev.petclinic.model.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.maltsev.petclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
