package com.augustojbe.lojaVirtual.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pessoa_fisica")
@SequenceGenerator(name = "seq_pessoa_fisica", sequenceName = "seq_pessoa_fisica", allocationSize = 1, initialValue = 1)
@PrimaryKeyJoinColumn(name = "id")
public class PessoaFisica extends Pessoa{

    private static final long serialVersionUID = 1L;

    @Column(nullable = false)
    private String cpf;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_nascimento")
    private Date dataNascimento;


}
