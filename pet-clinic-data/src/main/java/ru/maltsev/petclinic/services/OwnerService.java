package ru.maltsev.petclinic.services;

import ru.maltsev.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
