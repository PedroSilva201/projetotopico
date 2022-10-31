package br.gov.sp.fatec.projetotopicos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.gov.sp.fatec.projetotopicos.entity.Usuario;
import br.gov.sp.fatec.projetotopicos.repository.UsuarioRepository;

@RestController
@RequestMapping(value = "/teste")
@CrossOrigin
public class TesteController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping(value = "/teste")
    public List<Usuario> buscarTodos(@RequestBody String Nome) {
        return usuarioRepository.findByNomeContains(Nome);
    }

}
