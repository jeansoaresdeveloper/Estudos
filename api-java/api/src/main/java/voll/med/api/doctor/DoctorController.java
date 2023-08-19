package voll.med.api.doctor;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("doctor")
public class DoctorController {
    @Autowired
    private DoctorRepository repository;
    @PostMapping
    @Transactional
    public void create(@RequestBody @Valid DoctorDto doctor) {
        repository.save(new Doctor(doctor));
    }
    @GetMapping
    public Page<DataListingDoctorDto> get(Pageable pagination) {
        return repository.findAllByActiveTrue(pagination).map(DataListingDoctorDto::new);
    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid DataUpdateDoctorDto newDoctor) {
        Doctor doctor = repository.getReferenceById(newDoctor.id());
        doctor.updateInfo(newDoctor);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable Long id) {
        Doctor doctor = repository.getReferenceById(id);
        doctor.inactiveDoctor();
    }

}
