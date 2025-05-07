package com.augustojbe.lojaVirtual.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pessoa_juridica")
@Entity
@SequenceGenerator(name = "seq_pessoa_juridica", sequenceName = "seq_pessoa_juridica", allocationSize = 1, initialValue = 1)
@PrimaryKeyJoinColumn(name = "id")
public class PessoaJuridica extends Pessoa{

    private static final long serialVersionUID = 1L;

    @Column(nullable = false)
    private String cnpj;

    @Column(name = "insc_estadual", nullable = false)
    private String inscEstadual;

    @Column(name = "insc_municipal")
    private String inscMunicipal;

    @Column(name = "nome_fantasia")
    private String nomeFantasia;

    @Column(nullable = false)
    private String razaoSocial;

    private String categoria;

}
