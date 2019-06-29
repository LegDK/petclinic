package ru.maltsev.petclinic.services.map;

import org.springframework.stereotype.Service;
import ru.maltsev.petclinic.model.Speciality;
import ru.maltsev.petclinic.model.Vet;
import ru.maltsev.petclinic.services.SpecialitesService;
import ru.maltsev.petclinic.services.VetService;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialitesService specialitesService;

    public VetMapService(SpecialitesService specialitesService) {
        this.specialitesService = specialitesService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        if (object.getSpecialities().size() > 0 ) {
            object.getSpecialities().forEach(
                    speciality -> {
                        if (speciality.getId() == null) {
                            Speciality savedSpeciality = specialitesService.save(speciality);
                            speciality.setId(savedSpeciality.getId());
                        }
                    }
            );
        }
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
