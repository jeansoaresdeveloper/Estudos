package voll.med.api.doctor;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("doctor")
public class DoctorController {
    @Autowired
    private DoctorRepository repository;
    @Transactional
    @PostMapping
    public ResponseEntity create(@RequestBody @Valid DoctorDto doctor, UriComponentsBuilder uriBuilder) {
        Doctor newDoctor = new Doctor(doctor);
        repository.save(newDoctor);
        URI uri = uriBuilder.path("/doctor/{id}").buildAndExpand(newDoctor.getId()).toUri();
        return ResponseEntity.created(uri).body(new DoctorDetailingDto(newDoctor));
    }
    @GetMapping
    public ResponseEntity<Page<DataListingDoctorDto>> get(Pageable pagination) {
        Page<DataListingDoctorDto> page =  repository.findAllByActiveTrue(pagination).map(DataListingDoctorDto::new);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DoctorDetailingDto> getById(@PathVariable Long id) {
        Doctor doctor = repository.getReferenceById(id);
        return ResponseEntity.ok(new DoctorDetailingDto(doctor));
    }

    @Transactional
    @PutMapping
    public ResponseEntity<DoctorDetailingDto> update(@RequestBody @Valid DataUpdateDoctorDto newDoctor) {
        Doctor doctor = repository.getReferenceById(newDoctor.id());
        doctor.updateInfo(newDoctor);
        return ResponseEntity.ok(new DoctorDetailingDto(doctor));
    }

    @Transactional
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        Doctor doctor = repository.getReferenceById(id);
        doctor.inactiveDoctor();
        return ResponseEntity.noContent().build();
    }

}
