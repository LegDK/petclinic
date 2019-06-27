package ru.maltsev.petclinic.model.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.maltsev.petclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
