package com.example.testeapi.Controller;

import com.example.testeapi.Dto.UsuarioDTO;
import com.example.testeapi.Entity.UsuarioEntity;
import com.example.testeapi.Repository.UsuarioRepository;
import com.example.testeapi.Service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Usuario")
public class UsuarioControler {
    private UsuarioService usuarioService;
    private UsuarioRepository repository;
    @GetMapping
    public List<UsuarioDTO>ListarTodos(){
        return usuarioService.ListarTodos();
    }
    @PostMapping
    public void Cadastrar(@RequestBody UsuarioDTO usuario){
        usuarioService.cadastrar(usuario);

    }
    @PutMapping
    public UsuarioDTO atualizar(@RequestBody UsuarioDTO usuario){
        return usuarioService.alterar(usuario);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void>Excluir(@PathVariable("id") Long id){
         usuarioService.deletar(id);
        return ResponseEntity.ok().build();
    }

}
