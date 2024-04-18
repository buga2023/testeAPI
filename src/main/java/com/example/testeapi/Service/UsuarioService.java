package com.example.testeapi.Service;

import com.example.testeapi.Dto.UsuarioDTO;
import com.example.testeapi.Entity.UsuarioEntity;
import com.example.testeapi.Repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Arrays.stream;

@Service
public class UsuarioService {
    private UsuarioRepository repository;

    public List<UsuarioDTO> ListarTodos(){
        List<UsuarioEntity> usuario= repository.findAll();
       return usuario.stream().map(UsuarioDTO::new).toList();
    }
    public UsuarioDTO cadastrar( UsuarioDTO usuario){
        UsuarioEntity usuarioEntity=new UsuarioEntity(usuario);
        repository.save(usuarioEntity);
       return usuario;
    }
    public UsuarioDTO alterar(UsuarioDTO usuario){
        UsuarioEntity usuarioEntity=new UsuarioEntity(usuario);
        repository.save(usuarioEntity);
        return new UsuarioDTO(repository.save(usuarioEntity));
    }
    public void deletar(Long id){
        UsuarioEntity usuario= repository.findById(id).get();
        repository.delete(usuario);
    }

}
