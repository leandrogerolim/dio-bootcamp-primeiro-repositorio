package dio.primeiro.web.api.controller;


import dio.primeiro.web.api.model.Usuario;
import dio.primeiro.web.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    @GetMapping("/usuarios")

    public List<Usuario>getUsuarios() {
        return repository.listAll();

    }
    @GetMapping("/usuarios/{username}")
    public Usuario getOne(@PathVariable("username") String username) {
        return repository.findByUsername(username);
    }
    @DeleteMapping("/usuarios/{id}")
    public void delete(@PathVariable("id") Integer id) {
        repository.remove(id);
    }
    @PostMapping("/usuarios")
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);

    }
    @PutMapping()
    public void putUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
}
