package ru.maltsev.petclinic.services;

import ru.maltsev.petclinic.model.Owner;
import ru.maltsev.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Owner owner);

    Set<Vet> findAll();
}
