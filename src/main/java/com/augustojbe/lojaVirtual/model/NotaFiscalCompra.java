package com.augustojbe.lojaVirtual.model;

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
@Table(name = "nota_fiscal_compra")
@SequenceGenerator(name = "seq_nota_fiscal_compra", sequenceName = "seq_nota_fiscal_compra", allocationSize = 1, initialValue = 1)
@Entity
public class NotaFiscalCompra implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_nota_fiscal_compra" )
    private Long id;

    @Column(name = "numero_nota", nullable = false)
    private String numeroNota;

    @Column(name = "serie_nota", nullable = false )
    private String serieNota;

    private String descricao;

    @Column(name = "valor_total", nullable = false )
    private BigDecimal valorTotal;

    @Column(name = "valor_desconto", nullable = false )
    private BigDecimal valorDesconto;

    @Column(name = "valor_icms", nullable = false )
    private BigDecimal valorIcms;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_compra", nullable = false )
    private Date dataCompra;

    @ManyToOne(targetEntity = Pessoa.class)
    @JoinColumn(name = "pessoa_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fk"))
    private Pessoa pessoa;

    @ManyToOne(targetEntity = ContaPagar.class)
    @JoinColumn(name = "conta_pagar_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "conta_pagar_id"))
    private ContaPagar contaPagar;











}
