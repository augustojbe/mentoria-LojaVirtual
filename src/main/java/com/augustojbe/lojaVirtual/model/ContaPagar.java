package com.augustojbe.lojaVirtual.model;

import com.augustojbe.lojaVirtual.enums.StatusContaPagar;
import com.augustojbe.lojaVirtual.enums.StatusContaReceber;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "conta_pagar")
@SequenceGenerator(name = "seq_conta_pagar", sequenceName = "seq_conta_pagar", allocationSize = 1, initialValue = 1)
@Entity
public class ContaPagar implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_conta_pagar")
    private Long id;

    @Column(nullable = false)
    private String descricao;

    @Column(name = "valor_total", nullable = false)
    private String valorTotal;

    @Column(name = "valor_desconto")
    private BigDecimal valorDesconto;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusContaPagar status;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_vencimento", nullable = false)
    private Date dtVencimento;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_pagamento")
    private Date dtPagamento;

    @ManyToOne(targetEntity = Pessoa.class)
    @JoinColumn(name = "pessoa_id", nullable = false,
            foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fk"))
    private Pessoa pessoa;


    @ManyToOne(targetEntity = Pessoa.class)
    @JoinColumn(name = "pessoa_forn_id", nullable = false,
            foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_forn_fk"))
    private Pessoa pessoa_fornecedor;


}
