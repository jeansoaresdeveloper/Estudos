package voll.med.api.doctor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("doctor")
public class DoctorController {
    @PostMapping
    public String create(@RequestBody Doctor doctor) {
        return doctor.toString();
    }
}
