package com.jcoder.learnspring.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "street")
    private String rua;

    @Column(name = "number")
    private Long numero;

    @Column(name = "complement", length = 10)
    private String complemento;

    @Column(name = "city", length = 150)
    private String cidade;

    @Column(name = "state", length = 2)
    private String estado;

    @Column(name = "cep", length = 9)
    private String cep;

}
