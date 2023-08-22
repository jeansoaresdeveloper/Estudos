package voll.med.api.pacient;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import voll.med.api.doctor.*;

import java.net.URI;


@RestController
@RequestMapping("pacient")
public class PacientController {
    @Autowired
    private PacientRepository repository;
    @PostMapping
    @Transactional
    public ResponseEntity<PacientDetailingDto> create(@RequestBody @Valid PacientDto pacient, UriComponentsBuilder uriBuilder) {
        Pacient newPacient = new Pacient(pacient);
        repository.save(newPacient);
        URI uri = uriBuilder.path("/pacient/{id}").buildAndExpand(newPacient.getId()).toUri();
        return ResponseEntity.created(uri).body(new PacientDetailingDto(newPacient));
    }

    @GetMapping
    public ResponseEntity<Page<DataListingPacientDto>> get(Pageable pagination) {
        Page<DataListingPacientDto> page = repository.findAllByActiveTrue(pagination).map(DataListingPacientDto::new);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PacientDetailingDto> getById(@PathVariable Long id) {
        Pacient pacient = repository.getReferenceById(id);
        return ResponseEntity.ok(new PacientDetailingDto(pacient));
    }

    @PutMapping
    @Transactional
    public ResponseEntity<PacientDetailingDto> update(@RequestBody @Valid DataUpdatePacientDto newPacient) {
        Pacient pacient = repository.getReferenceById(newPacient.id());
        pacient.updateInfo(newPacient);
        return ResponseEntity.ok(new PacientDetailingDto(pacient));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity delete(@PathVariable Long id) {
        Pacient pacient = repository.getReferenceById(id);
        pacient.inactivePacient();
        return ResponseEntity.noContent().build();
    }
}
