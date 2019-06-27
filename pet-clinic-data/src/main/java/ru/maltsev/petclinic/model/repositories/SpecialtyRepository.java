package ru.maltsev.petclinic.model.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.maltsev.petclinic.model.Speciality;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
