package voll.med.api.pacient;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import voll.med.api.doctor.*;


@RestController
@RequestMapping("pacient")
public class PacientController {
    @Autowired
    private PacientRepository repository;
    @PostMapping
    @Transactional
    public void create(@RequestBody @Valid PacientDto pacient) {
        repository.save(new Pacient(pacient));
    }
    @GetMapping
    public Page<DataListingPacientDto> get(Pageable pagination) {
        return repository.findAll(pagination).map(DataListingPacientDto::new);
    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid DataUpdatePacientDto newPacient) {
        Pacient pacient = repository.getReferenceById(newPacient.id());
        pacient.updateInfo(newPacient);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable Long id) {
        Pacient pacient = repository.getReferenceById(id);
        pacient.inactivePacient();
    }
}
