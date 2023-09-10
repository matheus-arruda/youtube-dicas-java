package com.matheus.dicasjava.entity;

import jakarta.persistence.*;

@Entity
@Table(name="usuario")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String senha;

}
