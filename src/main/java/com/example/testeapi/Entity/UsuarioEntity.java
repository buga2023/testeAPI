package com.example.testeapi.Entity;

import com.example.testeapi.Dto.UsuarioDTO;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.BeanUtils;

@Entity
@Table(name="Usuario__")
@Getter
@Setter
@EqualsAndHashCode(of="id")
@AllArgsConstructor
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false,unique = true)
    private String login;
    @Column(nullable = false,unique = true)
    private String senha;
    public UsuarioEntity(UsuarioDTO usuario){
        BeanUtils.copyProperties(usuario,this);
    }

    public UsuarioEntity() {

    }

}
