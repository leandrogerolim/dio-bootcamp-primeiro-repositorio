package dio.primeiro.web.api.controller;


import dio.primeiro.web.api.model.Usuario;
import dio.primeiro.web.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    @GetMapping("/usuarios")

    public List<Usuario>getUsuarios() {
        return repository.listAll();

    }
}
