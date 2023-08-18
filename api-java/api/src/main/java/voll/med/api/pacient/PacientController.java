package voll.med.api.pacient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("pacient")
public class PacientController {
    @GetMapping
    public String getPacient() {
        return "true";
    }
}
