package voll.med.api.user;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import voll.med.api.security.TokenDto;
import voll.med.api.security.TokenService;

@RestController
@RequestMapping("login")
public class UserController {

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity login(@RequestBody @Valid UserAutenticateDto user) {
        var token = new UsernamePasswordAuthenticationToken(user.login(), user.password());
        Authentication authentication = manager.authenticate(token);
        String tokenJwt = tokenService.generateToken((User) authentication.getPrincipal());
        return ResponseEntity.ok(new TokenDto(tokenJwt));
    }

}
