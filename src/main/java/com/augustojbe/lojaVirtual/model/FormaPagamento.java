package com.augustojbe.lojaVirtual.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "form_pagamento")
@SequenceGenerator(name = "seq_form_pagamento", sequenceName = "seq_form_pagamento", allocationSize = 1, initialValue = 1)
@Entity
public class FormaPagamento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_form_pagamento" )
    private Long id;

    private String descricao;




}
