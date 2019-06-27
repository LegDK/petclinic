package ru.maltsev.petclinic.model.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.maltsev.petclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
