package com.example.testeapi.Dto;

import com.example.testeapi.Entity.UsuarioEntity;
import org.springframework.beans.BeanUtils;

public class UsuarioDTO {
    private long id;
    private String nome;
    private String senha;
    private String login;
    public UsuarioDTO(UsuarioEntity usuario){
        BeanUtils.copyProperties(usuario,this);
    }


}
